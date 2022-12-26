package ma.cvt.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Language {

    private @Id @GeneratedValue Long id;
    private String language;
    private String level;
    @ManyToOne
    private Cv cv;

    public Cv getCv() {
        return cv;
    }

    public void setCv(Cv cv) {
        this.cv = cv;
    }

    public Language() {
    }

    public Language(String language, String level) {
        this.language = language;
        this.level = level;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Language language1 = (Language) o;

        if (!id.equals(language1.id)) return false;
        if (!language.equals(language1.language)) return false;
        return level.equals(language1.level);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + language.hashCode();
        result = 31 * result + level.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Language{" +
                "id=" + id +
                ", language='" + language + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

}
