package cafe.hoyoverse.hsr;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class HonkaiStarRailApplication {

    public static void main(String[] args) {
//        BasicTextEncryptor textEncryptor = new BasicTextEncryptor();
//        //加密所需的salt(盐)
//        textEncryptor.setPassword("");
//        //要加密的数据（数据库的用户名或密码）
//        String mysql_username = textEncryptor.encrypt("xxxxxx");
//        String mysql_password = textEncryptor.encrypt("xxxxxx");
//        System.out.println("username:"+mysql_username);
//        System.out.println("password:"+mysql_password);

        SpringApplication.run(HonkaiStarRailApplication.class, args);
    }
}
