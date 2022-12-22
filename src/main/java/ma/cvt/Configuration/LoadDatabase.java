package ma.cvt.Configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ma.cvt.Entities.Student;
import ma.cvt.Repositories.StudentRepository;

@Configuration
public class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(StudentRepository repository) {
        return args -> {
            log.info("preloading " + repository.save(new Student("emad", "emad@youcode.ma")));
            log.info("preloading " + repository.save(new Student("second", "second@youcode.ma")));
        };
    }


}
