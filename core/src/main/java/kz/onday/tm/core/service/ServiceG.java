package kz.onday.tm.core.service;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.EventUserMap;
import kz.onday.tm.core.model.Group;
import kz.onday.tm.core.model.GroupUserMap;
import kz.onday.tm.core.model.Level;
import kz.onday.tm.core.model.Status;
import kz.onday.tm.core.model.User;
import kz.onday.tm.core.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceG implements IService {
    @Autowired
    EventJpaRepo eventJpaRepo;
    @Autowired
    EventUserMapJpaRepo eventUserMapJpaRepo;
    @Autowired
    GroupJpaRepo groupJpaRepo;
    @Autowired
    GroupUserMapJpaRepo groupUserMapJpaRepo;
    @Autowired
    LevelJpaRepo levelJpaRepo;
    @Autowired
    StatusJpaRepo statusJpaRepo;
    @Autowired
    UserJpaRepo userJpaRepo;

    @Override
    public List<Event> getAllEvent() { return eventJpaRepo.findAll(); }
    @Override
    public List<EventUserMap> getAllEventUserMap() { return eventUserMapJpaRepo.findAll(); }
    @Override
    public List<Group> getAllGroup() { return groupJpaRepo.findAll(); }
    @Override
    public List<GroupUserMap> getAllGroupUserMap() { return groupUserMapJpaRepo.findAll(); }
    @Override
    public List<Level> getAllLevel() { return levelJpaRepo.findAll(); }
    @Override
    public List<Status> getAllStatus() { return statusJpaRepo.findAll(); }
    @Override
    public List<User> getAllUser() { return userJpaRepo.findAll(); }

}
