package com.kh.exception.run;

import java.io.IOException;

import com.kh.exception.controller.B_CheckedException;

public class ExceptionRun {

	public static void main(String[] args) {
		//A_UncheckedException a=new A_UncheckedException();
		//a.method1();
		//a.method2();
		//a.method3();
		B_CheckedException b=new B_CheckedException();
		try {
			b.method1();
		} catch (IOException e) {
			System.out.println("IOException 발생");
		}
	}

}
