package com.klef.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NewFileController {
    @RequestMapping("/NewFile.html")
    public String paymentPage() {
        return "NewFile";
    }
}