package com.company;

public class Main {

    public static void main(String[] args) {
	int[] input = {3,6,1,23};
    String output = input[0]+ " is first, ";
    for(int i=1; i<input.length-1; i++){
        output = output.concat(input[i] + " is after " + input[i-1] +" and below " + input[i+1]) + ", ";
    }
    output = output.concat(input[input.length-1] + " is last");
        System.out.println(output);
    }
}
