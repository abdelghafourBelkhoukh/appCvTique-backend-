package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class Former extends User {

  public static final String ROLE = "former";

  public Former() {
  }

  public Former(String name, String email) {
    super(name, email);
  }

}
