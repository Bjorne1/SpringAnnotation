import com.annotation.bean.Blue;
import com.annotation.bean.Person;
import com.annotation.config.MainConfig;
import com.annotation.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: WenChangSheng
 * @Date: Created in 2019/1/22 15:48
 */
public class ComponentScanTest {

    private void printName(AnnotationConfigApplicationContext ioc) {
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            System.out.println("ioc容器中的组件:" + beanDefinitionName);
        }
    }

    @Test
    public void componentScanTest() {
        printName(new AnnotationConfigApplicationContext(MainConfig.class));
    }

    @Test
    public void scopeLazyTest() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);
        System.out.println("ioc容器创建完成");
        Person person = (Person) ioc.getBean("person");
    }

    @Test
    public void conditionTest() {
        printName(new AnnotationConfigApplicationContext(MainConfig2.class));
    }

    @Test
    public void importTest() {
        printName(new AnnotationConfigApplicationContext(MainConfig2.class));
    }

    @Test
    public void importSelectTest() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);
        Blue bean = ioc.getBean(Blue.class);
        System.out.println(bean);
    }

    @Test
    public void ImportBeanDefinitionRegistrarTest() {
        printName(new AnnotationConfigApplicationContext(MainConfig2.class));
    }

    @Test
    public void factoryBeanTest() {
        AnnotationConfigApplicationContext ioc = new AnnotationConfigApplicationContext(MainConfig2.class);
        //ioc容器中的组件:colorFactoryBean
        printName(ioc);
        //但是获取到的是com.annotation.bean.Color@2b6856dd
        Object bean = ioc.getBean("colorFactoryBean");
        System.out.println(bean);
        //如要获取colorFactoryBean则需加上&
        Object bean2 = ioc.getBean("colorFactoryBean");
        System.out.println(bean2);
    }
}
