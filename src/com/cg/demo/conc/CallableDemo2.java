package com.cg.demo.conc;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.cg.demo.col.Employee;

public class CallableDemo2 implements Callable<Employee> {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CallableDemo2 obj = new CallableDemo2();

		ExecutorService service = Executors.newSingleThreadExecutor();

		Future<Employee> future = service.submit(obj);

		Employee obj1 = future.get();
		System.out.println(obj1);

		service.shutdown();

	}

	@Override
	public Employee call() throws Exception {
		// TODO Auto-generated method stub

		Employee obj1 = new Employee(123, "Batman", 10000.0);

		return obj1;
	}

}