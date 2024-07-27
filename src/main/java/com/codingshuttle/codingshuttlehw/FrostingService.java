package com.codingshuttle.codingshuttlehw;

import org.springframework.stereotype.Service;

@Service
public class FrostingService {

    final Frosting frosting;

    public FrostingService(Frosting frosting) {
        this.frosting = frosting;
    }

    public String getFrostingType(){
        return frosting.getFrostingType();
    }
}
