import com.annotation.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/24 16:01
 */
public class IOCTestLifeCycle {

    @Test
    public void lifeCycle() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        System.out.println("ioc is created");
        ioc.close();
    }
}
