package com.produce.produce.service.impl;

import com.alibaba.fastjson.JSON;
import com.produce.produce.pojo.AmountFlow;
import com.produce.produce.service.ElasticSearchService;
import lombok.extern.slf4j.Slf4j;
import org.elasticsearch.ElasticsearchException;
import org.elasticsearch.action.delete.DeleteRequest;
import org.elasticsearch.action.delete.DeleteResponse;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.rest.RestStatus;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
@Slf4j
public class ElasticSearchServiceImpl implements ElasticSearchService {
    @Resource
    private RestHighLevelClient client;

    @Override
    public void insert(AmountFlow amountFlow) {
        Map<String, Object> jsonMap = new HashMap<>();
        jsonMap.put("user", "peak");
        jsonMap.put("postDate", new Date());
        jsonMap.put("message", "trying out Elasticsearch learn");
        IndexRequest request = new IndexRequest("test")
                .id(amountFlow.getId().toString())
                .source(jsonMap);
        try {
            IndexResponse response = client.index(request, RequestOptions.DEFAULT);
            log.info("返回的消息:{}",JSON.toJSONString(response));
        } catch (ElasticsearchException e) {
            if (e.status() == RestStatus.CONFLICT) {
                int a = 1;
            }
        } catch (IOException e) {
            int a = 1;
        }
    }

    @Override
    public String find() {
        GetRequest request = new GetRequest("test","1");
        try {
            GetResponse documentFields = client.get(request, RequestOptions.DEFAULT);
            log.info(JSON.toJSONString(documentFields));
            return JSON.toJSONString(documentFields.getSource());
        } catch (ElasticsearchException e) {
            if (e.status() == RestStatus.CONFLICT) {
                int a = 1;
            }
        } catch (IOException e) {
            int a = 1;
        }
        return "error";
    }

    @Override
    public String delete() {
        DeleteRequest deleteRequest = new DeleteRequest("test","1");
        try {
            DeleteResponse documentFields = client.delete(deleteRequest, RequestOptions.DEFAULT);
            log.info(JSON.toJSONString(documentFields));
            return JSON.toJSONString(documentFields.getResult());
        } catch (ElasticsearchException e) {
            if (e.status() == RestStatus.CONFLICT) {
                int a = 1;
            }
        } catch (IOException e) {
            int a = 1;
        }
        return "error";
    }
}
