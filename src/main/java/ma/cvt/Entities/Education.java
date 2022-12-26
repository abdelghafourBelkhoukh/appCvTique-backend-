package ma.cvt.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Education {

  private @Id @GeneratedValue Long id;

  private String school;

  private String degree;

  private String fieldOfStudy;
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

  public Education() {
  }

  public Education(String school, String degree, String fieldOfStudy, String start_date, String end_date) {
    this.school = school;
    this.degree = degree;
    this.fieldOfStudy = fieldOfStudy;
    this.start_date = start_date;
    this.end_date = end_date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;

    Education education = (Education) o;

    if (!id.equals(education.id))
      return false;
    if (!school.equals(education.school))
      return false;
    if (!degree.equals(education.degree))
      return false;
    if (!fieldOfStudy.equals(education.fieldOfStudy))
      return false;
    if (!start_date.equals(education.start_date))
      return false;
    return end_date.equals(education.end_date);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + school.hashCode();
    result = 31 * result + degree.hashCode();
    result = 31 * result + fieldOfStudy.hashCode();
    result = 31 * result + start_date.hashCode();
    result = 31 * result + end_date.hashCode();
    return result;
  }

  @Override
  public String toString() {
    return "Education{" +
        "id=" + id +
        ", school='" + school + '\'' +
        ", degree='" + degree + '\'' +
        ", fieldOfStudy='" + fieldOfStudy + '\'' +
        ", from='" + start_date + '\'' +
        ", to='" + end_date + '\'' +
        '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getSchool() {
    return school;
  }

  public void setSchool(String school) {
    this.school = school;
  }

  public String getDegree() {
    return degree;
  }

  public void setDegree(String degree) {
    this.degree = degree;
  }

  public String getFieldOfStudy() {
    return fieldOfStudy;
  }

  public void setFieldOfStudy(String fieldOfStudy) {
    this.fieldOfStudy = fieldOfStudy;
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

}
