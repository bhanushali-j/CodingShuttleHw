package com.codingshuttle.codingshuttlehw;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "cake.type" , havingValue = "strawberry")
public class Strawberry implements Syrup, Frosting{
    @Override
    public String getFrostingType() {
        return "This is Strawberry Frosting";
    }

    @Override
    public String getSyrupType() {
        return "This is Strawberry Syrup";
    }
}
