package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {

  public Student() {
  }

  public Student(String name, String email) {
    super(name, email);
  }

  public static final String ROLE = "student";
}
