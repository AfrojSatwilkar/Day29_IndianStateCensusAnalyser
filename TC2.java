package com.company1.Day29_IndianStateCensusAnalyser;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class customException extends Exception{
    public customException(String string) {
        super(string);
    }
}

class TC2 {

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void sadCase() {
        try {
            throw new customException("wrong CSV file");
        }catch (Exception e) {
            System.out.println("found->"+e);
        }
    }
}