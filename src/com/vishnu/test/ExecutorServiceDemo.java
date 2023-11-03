package com.vishnu.test;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;



public class ExecutorServiceDemo {
public static void main(String[] args) throws InterruptedException, ExecutionException {
	ExecutorService es= Executors.newFixedThreadPool(20);
//	Future<String> future = es.submit(new CallableTask("Vishnu"));
//	System.out.println("Executed");
//	String wlcmMsg= future.get();
//	System.out.println(wlcmMsg);
//	System.out.println("Manin ends...");
	
	Long s1 = System.currentTimeMillis();
	
System.out.println("Main Starts....");
	
	List<CallableTask> taskList = Arrays.asList(new CallableTask("A") ,  new CallableTask("B"), new CallableTask("C") , new CallableTask("D"),
			new CallableTask("E") , new CallableTask("F") , new CallableTask("G"),new CallableTask("A") ,  new CallableTask("B"), new CallableTask("C") , new CallableTask("D"),
			new CallableTask("E") , new CallableTask("F") , new CallableTask("G"));


	
	List<Future<String>> results = es.invokeAll(taskList);
	
	
	for(Future<String> res : results) {
		System.out.println(res.get());
	}
	es.shutdown();
	
	System.out.println("Main Ends....");
	Long s2 = System.currentTimeMillis();
	System.out.println((s2-s1)/1000);
	
	String emails = "abcd";
	List<String> emailList = Arrays.asList(emails.split("\\s*,\\s*"));
	System.out.println(emailList);
	

}




}
class CallableTask implements Callable<String>{
	private String name ;
	
	

	public CallableTask(String name) {
		super();
		this.name = name;
	}



	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		Thread.sleep(1500);
		return ("Hello "+name);
	}
	
}



