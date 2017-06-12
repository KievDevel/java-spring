package my.app.entities;


import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table
public class Supply {

    @Id
    @GeneratedValue
    @Column
    private long id;

    @Column
    private String department_name;

    @Column
    private String manager_name;

    @Column
    private String goods_list;

    @Column
    private Timestamp updated_at;

    public Supply() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    public String getGoods_list() {
        return goods_list;
    }

    public void setGoods_list(String goods_list) {
        this.goods_list = goods_list;
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

        Supply supply = (Supply) o;

        if (id != supply.id) return false;
        if (department_name != null ? !department_name.equals(supply.department_name) : supply.department_name != null)
            return false;
        if (manager_name != null ? !manager_name.equals(supply.manager_name) : supply.manager_name != null)
            return false;
        if (goods_list != null ? !goods_list.equals(supply.goods_list) : supply.goods_list != null) return false;
        return updated_at != null ? updated_at.equals(supply.updated_at) : supply.updated_at == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (department_name != null ? department_name.hashCode() : 0);
        result = 31 * result + (manager_name != null ? manager_name.hashCode() : 0);
        result = 31 * result + (goods_list != null ? goods_list.hashCode() : 0);
        result = 31 * result + (updated_at != null ? updated_at.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Supply{" +
                "id=" + id +
                ", department_name='" + department_name + '\'' +
                ", manager_name='" + manager_name + '\'' +
                ", goods_list='" + goods_list + '\'' +
                ", updated_at=" + updated_at +
                '}';
    }
}
