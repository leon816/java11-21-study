package com.jdk17.study;

/**
 * @author lili
 * @date 2023/9/25 13:48
 */
public class Test {
	@org.junit.Test
	public void test1() {
		String name = "xushu";
		String alias = switch (name) {
			case "zhouyu" -> "22";
			case "xushu" -> {
				System.out.println("good");
				yield "哈哈";
			}
			default -> "dd";
		};
		System.out.println(alias);
	}

	@org.junit.Test
	public void test2() {
		String html = """
							<html>
								<body>
									<h1>hello</h1>\s<h1>Leon</h1>
									<h1>word</h1>\
									<text>seewef</text>
								</body>
							</html>
				""";
		System.out.println(html);

	}

	@org.junit.Test
	public void test3() {
		Object o = 1;
		if (o instanceof Integer i) {
			System.out.println(i.intValue());
		}
	}
}
