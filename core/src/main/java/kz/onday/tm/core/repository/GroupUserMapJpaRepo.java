package kz.onday.tm.core.repository;

import kz.onday.tm.core.model.GroupUserMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupUserMapJpaRepo extends JpaRepository<GroupUserMap, Integer> {
}

