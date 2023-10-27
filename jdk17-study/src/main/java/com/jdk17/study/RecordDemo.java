package com.jdk17.study;

/**
 * @author lili
 * @date 2023/9/25 14:47
 */
public class RecordDemo {
	public static void main(String[] args) {
		UserRecord leon1 = new UserRecord(1L, "Leon");
		UserRecord leon2 = new UserRecord(1L, "Leon");
		System.out.println(leon1.equals(leon2));
	}
}
