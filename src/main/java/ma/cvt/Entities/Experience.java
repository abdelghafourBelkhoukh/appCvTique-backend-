package ma.cvt.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Experience {

  private @Id @GeneratedValue Long id;

  private String company;

  private String position;

  private Contract contract;
  private String location;
  private String start_date;
  private String end_date;

  public Cv getCv() {
    return cv;
  }

  public void setCv(Cv cv) {
    this.cv = cv;
  }

  @ManyToOne
  private Cv cv;

  private String description;

  public Experience() {
  }

  public Experience(String company, String position, String location, String start_date, String end_date,
      String description,
      Contract contract) {
    this.company = company;
    this.position = position;
    this.location = location;
    this.start_date = start_date;
    this.end_date = end_date;
    this.description = description;
    this.contract = contract;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Experience that = (Experience) o;

    if (!id.equals(that.id))
      return false;
    if (!company.equals(that.company))
      return false;
    if (!position.equals(that.position))
      return false;
    if (!location.equals(that.location))
      return false;
    if (!start_date.equals(that.start_date))
      return false;
    if (!end_date.equals(that.end_date))
      return false;
    return description.equals(that.description);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + company.hashCode();
    result = 31 * result + position.hashCode();
    result = 31 * result + location.hashCode();
    result = 31 * result + start_date.hashCode();
    result = 31 * result + end_date.hashCode();
    result = 31 * result + description.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Experience{" +
        "id=" + id +
        ", company='" + company + '\'' +
        ", title='" + position + '\'' +
        ", location='" + location + '\'' +
        ", from='" + start_date + '\'' +
        ", to='" + end_date + '\'' +
        ", description='" + description + '\'' +
        '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  public String getPosition() {
    return position;
  }

  public void setPosition(String title) {
    this.position = title;
  }

  public Contract getContract() {
    return contract;
  }

  public void setContract(Contract contract) {
    this.contract = contract;
  }

  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public String getStart_date() {
    return start_date;
  }

  public void setStart_date(String from) {
    this.start_date = from;
  }

  public String getEnd_date() {
    return end_date;
  }

  public void setEnd_date(String to) {
    this.end_date = to;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

}
