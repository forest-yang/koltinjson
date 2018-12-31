package com.example.demo;

import lombok.Data;

@Data
public class StatesMessage1 {

    private String command;
    private States1 states = new States1();

    public StatesMessage1(){
    }

    @Data
    public static class States1{
        private Double x;
        private Double y;
    }
}
