package com.kpaas.nameservice.controller;

import com.kpaas.nameservice.model.ResultData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @Value("${config.data1}")
    private String data1;

    @Value("${config.data2}")
    private String data2;

    @GetMapping("/info")
    public ResultData getName() {
        ResultData res = new ResultData(data1, data2);
        System.out.println("call to /info");
        return res;
    }
}