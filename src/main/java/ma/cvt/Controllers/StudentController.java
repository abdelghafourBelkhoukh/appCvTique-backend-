package ma.cvt.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ma.cvt.Entities.Student;
import ma.cvt.Exceptions.StudentNotFoundException;
import ma.cvt.Repositories.StudentRepository;

@RestController
public class StudentController {

  private final StudentRepository repository;

  public StudentController(StudentRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/students")
  List<Student> all() {
    return repository.findAll();
  }

  @PostMapping("/students")
  Student save(@RequestBody Student student) {
    return repository.save(student);
  }

  @GetMapping("/students/{id}")
  Student one(@PathVariable Long id) {
    return repository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
  }

  @PutMapping("/students/{id}")
  Student update(@RequestBody Student newStudent, @PathVariable Long id) {
    return repository.findById(id).map(student -> {
      student.setName(newStudent.getName());
      student.setEmail(newStudent.getEmail());
      return repository.save(student);
    }).orElseGet(() -> {
      newStudent.setId(id);
      return repository.save(newStudent);
    });
  }

  @DeleteMapping("/students/{id}")
  void delete(@PathVariable Long id) {
    repository.deleteById(id);
  }

  // danger
  @DeleteMapping("/rm-rf")
  void wipe() {
    repository.findAll().forEach(student -> {
      repository.delete(student);
    });
  }

}
