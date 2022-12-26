package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class Student extends User {

  public static final String ROLE = "student";

  public Student() {
  }

  public Student(String name, String email) {
    super(name, email, ROLE);
  }

}
