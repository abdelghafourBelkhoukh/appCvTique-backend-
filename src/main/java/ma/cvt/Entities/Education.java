package ma.cvt.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Education {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Education education = (Education) o;

            if (!id.equals(education.id)) return false;
            if (!school.equals(education.school)) return false;
            if (!degree.equals(education.degree)) return false;
            if (!fieldOfStudy.equals(education.fieldOfStudy)) return false;
            if (!from.equals(education.from)) return false;
            return to.equals(education.to);
        }

        @Override
        public int hashCode() {
            int result = id.hashCode();
            result = 31 * result + school.hashCode();
            result = 31 * result + degree.hashCode();
            result = 31 * result + fieldOfStudy.hashCode();
            result = 31 * result + from.hashCode();
            result = 31 * result + to.hashCode();
            return result;
        }

        @Override
        public String toString() {
            return "Education{" +
                    "id=" + id +
                    ", school='" + school + '\'' +
                    ", degree='" + degree + '\'' +
                    ", fieldOfStudy='" + fieldOfStudy + '\'' +
                    ", from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    '}';
        }

        private @Id @GeneratedValue Long id;
        private String school;
        private String degree;
        private String fieldOfStudy;
        private String from;
        private String to;

        public Education() {
        }

        public Education( String school, String degree, String fieldOfStudy, String from, String to )  {
            this.school = school;
            this.degree = degree;
            this.fieldOfStudy = fieldOfStudy;
            this.from = from;
            this.to = to;
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

        public String getFrom() {
            return from;
        }

        public void setFrom(String from) {
            this.from = from;
        }

        public String getTo() {
            return to;
        }

        public void setTo(String to) {
            this.to = to;
        }


    }
