/*
 * @author : Oguz Kahraman
 * @since : 6 Oca 2022
 *
 * Copyright - demo
 */
package com.hero.example;

import graphql.kickstart.tools.GraphQLMutationResolver;
import com.hero.example.model.StockAdd;
import com.hero.example.model.StockPrice;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    public StockPrice addStock(StockAdd request) {
        StockPrice stockPrice = new StockPrice(request.getName(), request.getPrice(), LocalDate.now());
        return stockPrice;
    }

}
