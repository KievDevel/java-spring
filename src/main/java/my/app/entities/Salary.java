package my.app.entities;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Salary {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private int manager_id;

    @Column
    private int sum;

    @Column
    private int days;

    @Column
    private Timestamp updated_at;

    public Salary() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getManager_id() {
        return manager_id;
    }

    public void setManager_id(int manager_id) {
        this.manager_id = manager_id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Salary salary = (Salary) o;

        if (id != salary.id) return false;
        if (manager_id != salary.manager_id) return false;
        if (sum != salary.sum) return false;
        if (days != salary.days) return false;
        return updated_at != null ? updated_at.equals(salary.updated_at) : salary.updated_at == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + manager_id;
        result = 31 * result + sum;
        result = 31 * result + days;
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Salary{" +
                "id=" + id +
                ", manager_id=" + manager_id +
                ", sum=" + sum +
                ", days=" + days +
                ", updated_at=" + updated_at +
                '}';
    }
}
