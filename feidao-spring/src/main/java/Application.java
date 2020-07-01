import com.zjl.service.MyService;
import com.zjl.service.SpringService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

/**
 * @author feidao
 */
@ComponentScan("com.zjl")
@PropertySource(value = "application.properties")
public class Application {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		SpringService springService = context.getBean(SpringService.class);
		springService.query();
		springService = (SpringService) context.getBean("springService", new MyService());
		springService.query();
		System.out.println(context.getEnvironment().getProperty("zjl"));
	}

}
