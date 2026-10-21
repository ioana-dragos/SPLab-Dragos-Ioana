package ro.uvt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ro.uvt.difexample.ClientComponent;
import ro.uvt.difexample.SingletonComponent;
import ro.uvt.difexample.TransientComponent;

@SpringBootApplication
public class MySpringApplication {

    public static void main(String[] args) {
        // Inițializează contextul Spring Boot
        ApplicationContext context = SpringApplication.run(MySpringApplication.class, args);

        // Instanțe de TransientComponent (creează instanțe noi de fiecare dată)
        TransientComponent transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComponent.class);
        transientBean.operation();

        // Instanțe de SingletonComponent (returnează aceeași instanță unică)
        SingletonComponent singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComponent.class);
        singletonBean.operation();

        // Obținerea componentei ClientComponent prin clasă
        ClientComponent c = context.getBean(ClientComponent.class);
        c.operation();

        // Obținerea componentei ClientComponent după numele bean-ului
        c = (ClientComponent) context.getBean("clientComponent");
        c.operation();
    }
}