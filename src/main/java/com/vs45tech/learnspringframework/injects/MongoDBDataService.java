package com.vs45tech.learnspringframework.injects;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{

    @Override
    public int[] retrieveData() {
        return new int[]{11,12,13,14,15};
    }
    
}
