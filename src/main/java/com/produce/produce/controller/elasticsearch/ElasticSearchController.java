package com.produce.produce.controller.elasticsearch;

import com.produce.produce.pojo.AmountFlow;
import com.produce.produce.service.ElasticSearchService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/elasticsearch")
public class ElasticSearchController {

    @Resource
    private ElasticSearchService elasticSearchService;

    @PostMapping("/insert")
    public String insert(@RequestBody AmountFlow AmountFlow){
        elasticSearchService.insert(AmountFlow);
        return "SUCCESS";
    }

    @GetMapping("/update")
    public String update(){
        return "SUCCESS";
    }

    @GetMapping("/delete")
    public String delete(){
        return elasticSearchService.delete();
    }

    @GetMapping("/find")
    public String find(){
        return elasticSearchService.find();
    }

}
