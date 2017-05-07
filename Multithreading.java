package Threads;

import java.util.Random;
//import java.util.Scanner;

class Even extends Thread {
	int even;
	Even(int even){
		this.even=even;
	}
	public void run(){
		System.out.println("even thread");
		System.out.println("Square value "+Math.pow(even, 2));
		 
	 }
}

class Odd extends Thread {
	int odd;
	Odd(int odd){
		this.odd=odd;
	}
	public void run(){
		System.out.println("odd thread");
		System.out.println("cube of "+Math.pow(odd, 3));
		
	}
	
}

class A extends Thread {
	public void run(){
		for(int i=0;i<5;i++){
		//while(true){
		Random r = new Random();
		//System.out.println("Enter the number");	    
		int num = r.nextInt(100);
		System.out.println("number is "+num);
		if(num%2==0){
			Even e = new Even(num);
			e.start();
		}
		else{
			Odd o = new Odd(num);
			o.start();
		}
		try {
			sleep(2000);
			//A.start();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------------------------");
		
		
	}
	}
	
}
public class Multithreading extends Thread {
 
	public static void main(String[] args) {
		
		A a = new A();
		a.start();
		/*Multi t = new Multi();
		t.start();
		try {
			sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("main thread is running");*/
		

	}
	
}