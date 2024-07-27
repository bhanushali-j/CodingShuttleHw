package com.codingshuttle.codingshuttlehw;

import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class CakeBaker {

    private final Logger logger = Logger.getLogger(CakeBaker.class.getName());

    FrostingService frostingService;

    SyrupService syrupService;

    CakeBaker(FrostingService frostingService, SyrupService syrupService) {
        this.frostingService = frostingService;
        this.syrupService = syrupService;
    }

    public void bakeCake(){
        logger.info(frostingService.getFrostingType());
        logger.info(syrupService.getSyrupType());
    }
}
