package com.wg.controller;
//
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping(value = {"/index", "/"})
    public String index(Model model) {
        model.addAttribute("title", "这是一个测试");
        model.addAttribute("atext", "冬天到了");
        return "index";
    }
}