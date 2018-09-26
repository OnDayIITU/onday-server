package kz.onday.tm.core.repository;

import kz.onday.tm.core.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventJpaRepo extends JpaRepository<Event, Integer> {
}
