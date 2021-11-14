package com.company1.Day29_IndianStateCensusAnalyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CensusAnalyser {
    File file=new File("C:\\Users\\91907\\IdeaProjects\\EmployeeWageComputation\\src\\com\\company1\\Day29_IndianStateCensusAnalyser\\world.csv");
    public byte readFile() throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()) {
            String countryDetails=scanner.nextLine();
            if(countryDetails.contains("India")) {
                System.out.println(countryDetails);
            }
        }
        return 1;
    }
}