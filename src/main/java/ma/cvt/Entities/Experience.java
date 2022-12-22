package ma.cvt.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Experience {

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Experience that = (Experience) o;

            if (!id.equals(that.id)) return false;
            if (!company.equals(that.company)) return false;
            if (!position.equals(that.position)) return false;
            if (!location.equals(that.location)) return false;
            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;
            return description.equals(that.description);
        }

        @Override
        public int hashCode() {
            int result = id.hashCode();
            result = 31 * result + company.hashCode();
            result = 31 * result + position.hashCode();
            result = 31 * result + location.hashCode();
            result = 31 * result + from.hashCode();
            result = 31 * result + to.hashCode();
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
                    ", from='" + from + '\'' +
                    ", to='" + to + '\'' +
                    ", description='" + description + '\'' +
                    '}';
        }

    private @Id @GeneratedValue Long id;
        private String company;
        private String position;
        private Contract contract;


    private String location;
        private String from;
        private String to;
        private String description;

        public Experience() {
        }

        public Experience( String company, String position, String location, String from, String to, String description, Contract contract) {
            this.company = company;
            this.position = position;
            this.location = location;
            this.from = from;
            this.to = to;
            this.description = description;
            this.contract = contract;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
