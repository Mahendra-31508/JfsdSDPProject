package com.klef.Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SellingController {
    @RequestMapping("/Selling.html")
    public String paymentPage() {
        return "Selling";
    }
}