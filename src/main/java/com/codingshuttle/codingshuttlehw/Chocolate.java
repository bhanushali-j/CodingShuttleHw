package com.codingshuttle.codingshuttlehw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@ConditionalOnProperty(name = "cake.type" , havingValue = "chocolate")
@Component
public class Chocolate implements Frosting, Syrup{

    @Override
    public String getFrostingType() {
        return "This is Chocolate Frosting";
    }

    @Override
    public String getSyrupType() {
        return "This is Chocolate Syrup";
    }
}
