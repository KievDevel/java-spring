package my.app.repository;

import my.app.entities.Customer;
import my.app.entities.KnowledgeBase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


public interface KnowledgeBaseRepository extends JpaRepository<KnowledgeBase, Long> {

    @Query("select c from KnowledgeBase c where c.id = :id")
    KnowledgeBase findById(@Param("id") long id);
}
