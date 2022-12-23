package ma.cvt.Entities;

import jakarta.persistence.Entity;

@Entity
public class CME extends User {
  public CME() {
  }

  public CME(String name, String email) {
    super(name, email);
  }

  public static final String ROLE = "cme";
}
