package com.xxjz.upload;


import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoadUploadFilePageController {
   
	
	@Value("${application.message:Hello World}")
	private String message ;
	@Value("${aaa:aaa}")
	private String aaa ;
	@Value("${bbb:bbb}")
	private String bbb;

	@GetMapping("/")
	public String home(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		model.put("aaa", this.aaa);
		model.put("bbb", this.bbb);
		return "uploadpic";
	}

}