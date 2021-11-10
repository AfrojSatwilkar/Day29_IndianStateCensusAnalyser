package com.company1.Day29_IndianStateCensusAnalyser;

import java.io.IOException;

public class AnalyserMain {
    public static void main(String[] args) throws IOException {
        CensusAnalyser censusAnalyser=new CensusAnalyser();
        censusAnalyser.readFile();
    }
}
