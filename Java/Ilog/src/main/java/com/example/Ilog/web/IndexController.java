package com.example.Ilog.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        // 拡張子は不要
        // .htmlや.jspなどのテンプレートパッケージに非依存にできるSpringの機能
        return "index"; // = index.html
    }
}