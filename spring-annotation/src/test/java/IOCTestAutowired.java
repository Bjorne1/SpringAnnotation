import com.annotation.config.MainConifgOfAutowired;
import com.annotation.dao.BookDao;
import com.annotation.service.BookService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCTestAutowired {

    @Test
    public void test01() {
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        BookDao bean = applicationContext.getBean(BookDao.class);
        System.out.println(bean);

    }

}
