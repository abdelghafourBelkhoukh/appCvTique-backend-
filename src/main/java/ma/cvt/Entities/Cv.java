package ma.cvt.Entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;

@Entity
public class Cv {

    private @Id
    @GeneratedValue Long id;

    private Date created_at;
    private Date updated_at;
    @OneToOne
    private Student student;
    @OneToMany(mappedBy = "cv")
    private List<Education> educations;
    @OneToMany(mappedBy = "cv")
    private List<Experience> experiences;
    @OneToMany(mappedBy = "cv")
    private List<Competence> competences;
    @OneToMany(mappedBy = "cv")
    private List<Language> languages;

    public Cv() {
    }

    public Cv(Date created_at, Date updated_at, Student student, List<Education> educations, List<Experience> experiences, List<Competence> competences, List<Language> languages) {
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.student = student;
        this.educations = educations;
        this.experiences = experiences;
        this.competences = competences;
        this.languages = languages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cv cv = (Cv) o;

        if (!id.equals(cv.id)) return false;
        if (!created_at.equals(cv.created_at)) return false;
        if (!updated_at.equals(cv.updated_at)) return false;
        if (!student.equals(cv.student)) return false;
        if (!educations.equals(cv.educations)) return false;
        if (!experiences.equals(cv.experiences)) return false;
        if (!competences.equals(cv.competences)) return false;
        return languages.equals(cv.languages);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + created_at.hashCode();
        result = 31 * result + updated_at.hashCode();
        result = 31 * result + student.hashCode();
        result = 31 * result + educations.hashCode();
        result = 31 * result + experiences.hashCode();
        result = 31 * result + competences.hashCode();
        result = 31 * result + languages.hashCode();
        return result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Date created_at) {
        this.created_at = created_at;
    }

    public Date getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Date updated_at) {
        this.updated_at = updated_at;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Education> getEducations() {
        return educations;
    }

    public void setEducations(List<Education> educations) {
        this.educations = educations;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }

    public List<Competence> getCompetences() {
        return competences;
    }

    public void setCompetences(List<Competence> competences) {
        this.competences = competences;
    }

    public List<Language> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Language> languages) {
        this.languages = languages;
    }

    @Override
    public String toString() {
        return "Cv{" +
                "id=" + id +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", student=" + student +
                ", educations=" + educations +
                ", experiences=" + experiences +
                ", competences=" + competences +
                ", languages=" + languages +
                '}';
    }


}
