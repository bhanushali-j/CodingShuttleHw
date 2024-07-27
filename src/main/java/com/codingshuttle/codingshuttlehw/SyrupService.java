package com.codingshuttle.codingshuttlehw;

import org.springframework.stereotype.Service;

@Service
public class SyrupService {

    final Syrup syrup;

    public SyrupService(Syrup syrup) {
        this.syrup = syrup;
    }

    public String getSyrupType(){
        return syrup.getSyrupType();
    }
}
