package sn.emploie.gestionemployer.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

import sn.emploie.gestionemployer.model.Student;
@Repository
@EnableMongoRepositories
public interface StudentRepository extends MongoRepository<Student, Integer>{
	

}
