package com.woniu.action;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.woniu.model.Ststatus;
import com.woniu.service.IStstatusService;

@RestController
@RequestMapping("ststatus")
public class StstatusAction {
	@Resource
	IStstatusService ststatusServiceImpl;

	/** 修改站点的状态
	 * 根据站点的坐标点 调用查询出站点当前信息
	 * @throws IOException 
	 * @throws JsonMappingException 
	 * @throws JsonParseException 
	 */
	@PostMapping
	public void getStationInfo(@RequestBody String ststatus) throws JsonParseException, JsonMappingException, IOException {
		ststatus = ststatus.substring(ststatus.indexOf('['), ststatus.lastIndexOf(']')+1);
		 ObjectMapper om = new ObjectMapper();
		 List<Ststatus> list = om.readValue(ststatus,
				    new TypeReference<Collection<Ststatus>>() {});
		
		 //加了一个小的事务^_^ 当中间某个修改小于0  rollback
		 for (Ststatus ststatus2 : list) {
			try {
				  ststatusServiceImpl.update(ststatus2);
			} catch (Exception e) {
				//给用户提示信息
			}
		}
		 
		/*
		 * try { ststatusServiceImpl.update(list); }catch (Exception e) {
		 * 
		 * }
		 */
	}
}
