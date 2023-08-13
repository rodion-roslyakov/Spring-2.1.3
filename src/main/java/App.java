import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloWorld");
        HelloWorld bean2 =
                (HelloWorld) applicationContext.getBean("helloWorld");

        Cat cat = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean2));
        System.out.println(cat.equals(cat2));
    }
}