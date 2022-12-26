package ma.cvt.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.cvt.Entities.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
  public Student findByName(String name);

  public Student findByEmail(String email);
}
