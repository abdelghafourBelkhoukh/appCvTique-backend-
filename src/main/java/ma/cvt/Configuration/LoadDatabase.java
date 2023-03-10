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
      var emad = repository.findByName("emad");
      if (emad != null)
        log.info("found: " + emad.toString());
      else
        log.info("preloading " + repository.save(new Student("emad", "emad@youcode.ma")));
    };
  }

}
