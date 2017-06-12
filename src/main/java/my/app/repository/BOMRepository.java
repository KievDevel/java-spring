package my.app.repository;

import my.app.entities.BoardOfManagers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BOMRepository extends JpaRepository<BoardOfManagers, Long> {
}
