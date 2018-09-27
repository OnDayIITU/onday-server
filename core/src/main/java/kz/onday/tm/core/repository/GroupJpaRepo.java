package kz.onday.tm.core.repository;

import kz.onday.tm.core.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupJpaRepo extends JpaRepository<Group, Integer> {
}