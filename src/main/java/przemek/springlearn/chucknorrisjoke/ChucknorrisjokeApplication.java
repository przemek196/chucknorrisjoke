package przemek.springlearn.chucknorrisjoke;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import przemek.springlearn.chucknorrisjoke.controllers.JokeController;

@SpringBootApplication
public class ChucknorrisjokeApplication{

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(ChucknorrisjokeApplication.class, args);

        JokeController jokeController = (JokeController) ctx.getBean("jokeController");

        System.out.println(jokeController.showJokeCommandLine());

    }

}
