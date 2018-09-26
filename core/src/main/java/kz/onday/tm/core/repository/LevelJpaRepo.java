package kz.onday.tm.core.repository;

import kz.onday.tm.core.model.Level;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelJpaRepo extends JpaRepository<Level, Integer> {
}
