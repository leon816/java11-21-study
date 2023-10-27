import com.a.test.TestInterface;

/**
 * @author lili
 * @date 2023/9/26 10:59
 */module module.a {
	exports com.a.test;
	opens com.a.test; //开放反射权限
	requires transitive java.logging;  //传递依赖
	uses TestInterface; //需要外部模块实现的接口
}