package com.timbuchalka;

public class Main {

    public static void main(String[] args) {
	    String s = new String("Hello");

	    StringBuffer s2 = new StringBuffer("Hello");

	    StringBuilder s3 = new StringBuilder("Hello");

	    s.concat(" World"); // Hello
	    s2.append(" World"); // Hello World
	    s3.append(" World"); // Hello World

        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
    }
}
