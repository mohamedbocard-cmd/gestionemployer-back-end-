package sn.emploie.gestionemployer.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import sn.emploie.gestionemployer.model.Student;
import sn.emploie.gestionemployer.repository.StudentRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")

public class StudentRestController {
	@Autowired
	private StudentRepository studentRepository;
	
	@ResponseBody
	@PostMapping("/student/add")
	public Student addStudent(@RequestBody Student student) {
		//System.out.print(student.toString());
		return studentRepository.insert(student);
	

}
	@GetMapping("/student")
	public List<Student> getAllStudent(){
		return studentRepository.findAll();
	}

	/* RECUPERATION iD DU L'ETUDIANT DANS LA BASE DE DONNES*/

	@GetMapping("student/{sId}")
	public Student getStudentById(@PathVariable ("sId") int sId){
		return studentRepository.findById(sId).get();
	}
}
