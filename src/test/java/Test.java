import dao.TestDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args){
        ApplicationContext appCon = new ClassPathXmlApplicationContext("applicationContext.xml");
        TestDao test = (TestDao)appCon.getBean("test");
        test.sayHello();
    }
}
