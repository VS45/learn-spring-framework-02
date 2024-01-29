package com.vs45tech.learnspringframework.injects;

import org.springframework.stereotype.Component;

@Component
public class MysqlDataService implements DataService{
    @Override
    public int[] retrieveData() {
        return new int[]{1,2,3,4,5};
    }
    
}
