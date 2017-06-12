package my.app.entities;


import javax.persistence.*;

@Entity
@Table
public class Budget {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String project_name;

    @Column
    private String amount;

    @Column
    private int days_allowed;

    public Budget() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public int getDays_allowed() {
        return days_allowed;
    }

    public void setDays_allowed(int days_allowed) {
        this.days_allowed = days_allowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Budget budget = (Budget) o;

        if (id != budget.id) return false;
        if (days_allowed != budget.days_allowed) return false;
        if (project_name != null ? !project_name.equals(budget.project_name) : budget.project_name != null)
            return false;
        return amount != null ? amount.equals(budget.amount) : budget.amount == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (project_name != null ? project_name.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + days_allowed;
        return result;
    }

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", project_name='" + project_name + '\'' +
                ", amount='" + amount + '\'' +
                ", days_allowed=" + days_allowed +
                '}';
    }
}
