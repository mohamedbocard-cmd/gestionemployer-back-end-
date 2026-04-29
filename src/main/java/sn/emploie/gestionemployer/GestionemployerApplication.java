package sn.emploie.gestionemployer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import sn.emploie.gestionemployer.model.Student;
import sn.emploie.gestionemployer.repository.StudentRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackages = {"sn.emploie.gestionemployer.repository"})
public class GestionemployerApplication {
	@Autowired
	private  StudentRepository studentRepository;

    public GestionemployerApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
		SpringApplication.run(GestionemployerApplication.class, args);
	}
	@Bean
	CommandLineRunner start() {
		return args -> {
			Student s = new Student();
			s.setSId(10);
			s.setSName("diagana");
			s.setSPrenom("Mohame vcdfwfa");
			s.setSTelephonne("5487845787");
			s.setSEmail("mdg@gmail.com");

			studentRepository.save(s);


		};
	}
}
