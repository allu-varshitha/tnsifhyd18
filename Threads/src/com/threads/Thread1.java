package com.threads;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(Thread.activeCount());
        System.out.println(Thread.currentThread().getName());
        System.out.println(Thread.currentThread().getId());
        System.out.println(Thread.currentThread().getPriority());
        
        
	}

}
