package Abstracts;

import Interfaces.Interface1;
import Interfaces.Interface2;
import Interfaces.Interface3;
import Interfaces.Interface4;

public abstract class AbstractFrameWorkDemo implements Interface1,Interface2, Interface3, Interface4 {
	
	
	
	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Method 1");
		
	}@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Method 3");
		
	}@Override
	public void method5() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Method 5");
		
	}@Override
	public void method6() {
		// TODO Auto-generated method stub
		System.out.println("Hello from Method 6");
		
	}
	
	
	
	private static AbstractFrameWorkDemo abstractFrameWorkDemo;
	
	
	public AbstractFrameWorkDemo() {
		// TODO Auto-generated constructor stub
	}
}
