package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {
    @GetMapping("/hi") // url 요청 접수
    public String niceToMeetYou(Model model){
        model.addAttribute("username", "홍팍");
        return "greetings"; // 파일 이름만 작성
        // 요약하면 선언하고 반환값인 보여줄 페이지 이름만 따서 적은 후 url 요청을 접수해야 완성.
    }

    @GetMapping("/bye")
    public String seeYouNext(Model model) {
        model.addAttribute("nickname", "홍길동");
        return "goodbye";
    }


}
