package com.produce.produce.controller.elasticsearch;

import com.produce.produce.service.ElasticSearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class ElasticSearchController {

    @Resource
    private ElasticSearchService elasticSearchService;

    @GetMapping("/insert")
    public String insert(){
        return "SUCCESS";
    }

    @GetMapping("/update")
    public String update(){
        return "SUCCESS";
    }

    @GetMapping("/delete")
    public String delete(){
        return "SUCCESS";
    }

    @GetMapping("/find")
    public String find(){
        return "SUCCESS";
    }

}
