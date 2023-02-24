package kr.co.rland.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLEncoder;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@PostMapping("upload")
	@ResponseBody
	public String upload(MultipartFile img) {
			System.out.println(img.getOriginalFilename());
		return "완료";
	}
	
	@RequestMapping("index")
	public String index(Model model, HttpServletResponse resp) {
		
//		String data = "eeeeeeeeeeee";
//		model.addAttribute("md", data);
		String data = URLEncoder.encode("쿠키 개 비쌈~");//공백 특수문자 등등 인코딩 필요
		
		Cookie cookie = new Cookie("my", data); //케릭터 문자 ㄴㄴ
		resp.addCookie(cookie);
		
		return "index";
	}
}
