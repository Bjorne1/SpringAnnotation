import com.annotation.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:48
 */
public class ComponentScanTest {

    @Test
    public void componentScanTest() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("ioc容器中的组件:" + beanDefinitionName);
        }
    }
}
