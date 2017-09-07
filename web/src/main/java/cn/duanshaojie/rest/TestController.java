package cn.duanshaojie.rest;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.duanshaojie.service.UserService;

@RequestMapping("/test")
@Controller
public class TestController {
	private static final Logger logger = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/find",method = RequestMethod.GET)
	public @ResponseBody Map<String,Object> findTest(@RequestParam String username){
		logger.info("/test/find begin,username={}",username);
		HashMap<String, Object> result = userService.findUser(username);
		logger.info("result is ={}",result.toString());
		return result;
	}
}
