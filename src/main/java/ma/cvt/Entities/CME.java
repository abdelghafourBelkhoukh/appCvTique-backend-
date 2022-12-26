package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class CME extends User {
  public CME() {
  }

  public CME(String name, String email) {
    super(name, email, ROLE);
  }

  public static final String ROLE = "cme";
}
