package my.app.repository;


import my.app.entities.Salary;
import my.app.entities.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SalaryRepository extends JpaRepository<Salary, Long>{

    @Query("select c from Salary c where c.id = :id")
    Salary findById(@Param("id") long id);
}
