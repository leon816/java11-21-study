package com.b.study;

import com.a.test.User;

/**
 * @author lili
 * @date 2023/9/26 11:02
 */
public class Main {
	public static void main(String[] args) {
		User leon1 = new User(1, "Leon");
		User leon2 = new User(1, "Leon");
		System.out.println(leon1.equals(leon2));
	}
}
