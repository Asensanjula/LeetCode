package com.company;

public class Main {

    static  {
        System.out.println("Print Static block");
    }

    public Main() {
        System.out.println("Constructor!");
    }

    {
        System.out.println("instance block");
    }

    public  static void main(String[] args) {
	// write your code here
        System.out.println("Main Method!");
        Main main = new Main();
    }
}
