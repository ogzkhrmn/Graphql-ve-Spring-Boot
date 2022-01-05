package com.hero.example;

import graphql.kickstart.tools.GraphQLQueryResolver;
import com.hero.example.model.StockDetail;
import org.springframework.stereotype.Component;

@Component
public class QueryResolver implements GraphQLQueryResolver {

    public StockDetail stockDetail(String symbol) {
       return new StockDetail(symbol, "name", 2000l);
    }

    public StockDetail getAnotherStockDetail(String symbol) {
        return new StockDetail(symbol, "name2", 2000l);
    }

}
