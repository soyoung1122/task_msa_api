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

    @Value("${config.data3}")
    private String data3;

    @Value("${config.data4}")
    private String data4;

    @GetMapping("/info")
    public ResultData getName() {
        ResultData res = new ResultData(data1, data2, data3, data4);
        return res;
    }
}