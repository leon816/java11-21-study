package com.test;

import lombok.extern.java.Log;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author lili
 * @date 2023/9/27 11:06
 */
@Log
public class Main {
	public static void main(String[] args) {
		// 设置全局日志级别为FINE
		log.setLevel(Level.FINE);

		// 创建一个控制台处理程序
		ConsoleHandler consoleHandler = new ConsoleHandler();
		consoleHandler.setLevel(Level.FINE);

		// 将控制台处理程序添加到根日志记录器
		log.addHandler(consoleHandler);

		// 现在，您可以记录FINE级别的日志消息
//		Logger logger = Logger.getLogger(ConfigureLogging.class.getName());
		log.fine("This is a FINE-level log message.");
		log.info("infooooooooo");
	}
}
