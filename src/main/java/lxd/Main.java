package lxd;

import lxd.entity.People;
import lxd.service.PeopleService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) throws Exception {
        new Main().testANNOmode();
    }
    public void testXMLmode() throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("AppXmlMode.xml");
        PeopleService service= (PeopleService) ac.getBean("peopleService");
        service.updatePeopelById((People) ac.getBean("father"),(People)ac.getBean("mother"));
    }

    public void testANNOmode() throws Exception {
        ApplicationContext ac=new ClassPathXmlApplicationContext("AppAnnoMode.xml");
        PeopleService service= (PeopleService) ac.getBean("peopleService");
        service.updatePeopelById((People) ac.getBean("father"),(People)ac.getBean("mother"));
    }
}
