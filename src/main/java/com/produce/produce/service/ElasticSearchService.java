package com.produce.produce.service;

import com.produce.produce.pojo.AmountFlow;

public interface ElasticSearchService {
    void insert(AmountFlow amountFlow);
    String find();

    String delete();
}
