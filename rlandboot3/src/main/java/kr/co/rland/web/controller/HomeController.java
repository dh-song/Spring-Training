package kr.co.rland.web.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URLEncoder;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@PostMapping("upload")
	@ResponseBody
	public String upload(MultipartFile[] imgs, HttpServletRequest req) throws IOException {
		
		
		
		for (MultipartFile img : imgs) { //배열로 여러 파일 받기
			if (img.isEmpty()) {
				continue;
			}
			String orinName = img.getOriginalFilename(); //파일이름
			String urlPath = "/image/menu/"+orinName; 
			String realPath = req.getServletContext().getRealPath(urlPath);//실제 경로에 파일이름 추가
			img.transferTo(new File(realPath));
		}
		
		
		//this.getClass().getResource("").getPath();; 컨트롤러 경로가 나옴
		//파일 스트림 방법
//		InputStream fis = img.getInputStream();
//		OutputStream fos = new FileOutputStream(realPath);
//		byte[] buf = new byte[1024];
//		int size = 1024;
//		while ((size = fis.read(buf)) != -1) {
//			fos.write(buf, 0, size);
//		}
//		fis.close();
//		fos.close();
		
		
			
		return "Done!";
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
