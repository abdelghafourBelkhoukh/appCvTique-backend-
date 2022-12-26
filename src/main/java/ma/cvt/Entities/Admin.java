package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class Admin extends User {
  public static final String ROLE = "admin";

  public Admin() {
  }

  public Admin(String name, String email) {
    super(name, email, ROLE);
  }
}
