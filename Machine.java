package com.capgemini.abstraction;

public class Machine {
	void slot(ATM a) {
		a.validateCard();
		a.getInfo();
	}

}
