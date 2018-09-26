package kz.onday.tm.core.service;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.Level;
import kz.onday.tm.core.repository.EventJpaRepo;
import kz.onday.tm.core.repository.LevelJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceG implements IService {
    @Autowired
    EventJpaRepo eventJpaRepo;
    @Autowired
    LevelJpaRepo levelJpaRepo;

    @Override
    public List<Event> getAllEvent() {
        return eventJpaRepo.findAll();
    }

    @Override
    public List<Level> getAllLevel() {
        return levelJpaRepo.findAll();
    }
}
