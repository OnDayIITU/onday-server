package kz.onday.tm.core.repository;

import kz.onday.tm.core.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatusJpaRepo extends JpaRepository<Status, Integer> {
}