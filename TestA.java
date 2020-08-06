package com.capgemini.abstraction;

public class TestA {
public static void main(String[] args) {
	Machine m=new Machine();
	HDFC h=new HDFC();
	m.slot(h);
	System.out.println("***************************");
	
	ICICI icici=new ICICI();
	m.slot(icici);
}
}
