package com.company1.Day29_IndianStateCensusAnalyser;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class TC1 {

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    void happyCase() throws FileNotFoundException {
        CensusAnalyser censusAnalyser=new CensusAnalyser();
        assertEquals(1, censusAnalyser.readFile());
    }

}
