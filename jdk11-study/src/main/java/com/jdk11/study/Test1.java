package com.jdk11.study;

import org.junit.Test;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Stream;

/**
 * @author lili
 * @date 2023/9/22 15:37
 */
public class Test1 {
	@Test
	public void testOf() {
		var list = List.of(1, 2, 3);
//		list.add(2);
		var list1 = new java.util.ArrayList<>(List.of(1, 2, 3));
		list1.add(2);
		System.out.println(list);
		System.out.println(list1);
		Set<Integer> integers = Set.of(1, 2, 3);
		Stream<Integer> integerStream = Stream.of(1, 2, 3);
		integerStream.forEach(System.out::print);
		System.out.println("");
		integerStream = Stream.of(1, 5, 3, 4, 5).takeWhile(x -> x<5);
		integerStream.forEach(System.out::print);
		System.out.println("");
		integerStream = Stream.of(1, 5, 3, 4, 5).dropWhile(x -> x<5);
		integerStream.forEach(System.out::println);
		Stream<Object> objectStream = Stream.ofNullable(null);
		objectStream.forEach(System.out::println);

	}
	@Test
	public void testStreamIterate() {
		Stream<Integer> iterate = Stream.iterate(new Integer[]{0,1},t -> new Integer[]{t[1], t[0] + t[1]})
				.map(t -> t[0]);
		iterate.limit(20).forEach(t -> System.out.print(t+","));
		System.out.println("");

		iterate = Stream.iterate(new Integer[]{0,1},t->t[0]<10000,t -> new Integer[]{t[1], t[0] + t[1]})
				.map(t -> t[0]);
		iterate.forEach(t -> System.out.print(t+","));
	}

	@Test
	public void testString() {
		var str = " \t  \r\n　";
		System.out.println(str.isBlank());
		String strip = str.strip(); //去除所有语言中的空白字符
		System.out.println(strip);
		System.out.println(strip.length());

		String trim = str.trim(); //去除所有英文中的空白字符
		System.out.println(trim);
		System.out.println(trim.length());
	}
	@Test
	public void testOptional() {
		Optional<Object> opt = Optional.ofNullable(null);
		Optional<Object> a = opt.or(() -> Optional.of('a'));
		System.out.println(a.get());
	}
	@Test
	public void testStringLines(){
		var str = "agsgsg\n12345\n3t3t45t";
		str.lines().forEach(System.out::println);
	}
}
