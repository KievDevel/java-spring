package my.app.repository;


import my.app.entities.Administrators;
import my.app.entities.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BudgetRepository extends JpaRepository<Budget, Long> {

    @Query("select c from Budget c where c.id = :id")
    Budget findById(@Param("id") long id);
}
