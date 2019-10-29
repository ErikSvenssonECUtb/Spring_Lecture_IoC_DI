package se.lexicon.erik;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import se.lexicon.erik.config.AppConfig;
import se.lexicon.erik.data.AppUserDao;
import se.lexicon.erik.model.AppUser;
import se.lexicon.erik.service.NewAppUserService;

public class App
{
    public static void main( String[] args )
    {
        AnnotationConfigApplicationContext context
                = new AnnotationConfigApplicationContext(AppConfig.class);

        NewAppUserService service = context.getBean(NewAppUserService.class);
        System.out.println(service.createNewAppUser());
    }
}
