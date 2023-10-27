import com.a.test.TestInterface;
import com.b.study.TestImpl;

/**
 * @author lili
 * @date 2023/9/26 11:01
 */module module.b {
	 requires module.a;
	 provides TestInterface with TestImpl;
}