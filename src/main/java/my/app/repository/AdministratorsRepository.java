package my.app.repository;

import my.app.entities.Administrators;
import my.app.entities.KnowledgeBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface AdministratorsRepository extends JpaRepository<Administrators, Long> {

    @Query("select c from Administrators c where c.id = :id")
    Administrators findById(@Param("id") long id);
}
