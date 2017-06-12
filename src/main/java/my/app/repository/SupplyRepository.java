package my.app.repository;

import my.app.entities.Budget;
import my.app.entities.Supply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface SupplyRepository extends JpaRepository<Supply,Long> {

    @Query("select c from Supply c where c.id = :id")
    Supply findById(@Param("id") long id);
}
