package mariapiabaldoin.Giorno_3_19.esercizio_1;


import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;


@Component
public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("************************** ADAPTER ************************");
        Info info = new Info("Mario", "Bros", new Date(97, 8, 13));
        Adapter adapter = new Adapter(info);
        UserData userData = new UserData();
        userData.setData(adapter);
        System.out.println(userData);

    }
}
