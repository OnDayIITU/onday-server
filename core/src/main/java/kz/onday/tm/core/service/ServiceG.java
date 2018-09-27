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
    public Event getEventById(Integer id){ return eventJpaRepo.findOne(id);}

    @Override
    public List<EventUserMap> getAllEventUserMap() { return eventUserMapJpaRepo.findAll(); }
    @Override
    public EventUserMap getEventUserMapById(Integer id){ return eventUserMapJpaRepo.findOne(id);}

    @Override
    public List<Group> getAllGroup() { return groupJpaRepo.findAll(); }
    @Override
    public Group getGroupById(Integer id){ return groupJpaRepo.findOne(id);}

    @Override
    public List<GroupUserMap> getAllGroupUserMap() { return groupUserMapJpaRepo.findAll(); }
    @Override
    public GroupUserMap getGroupUserMapById(Integer id){ return groupUserMapJpaRepo.findOne(id);}

    @Override
    public List<Level> getAllLevel() { return levelJpaRepo.findAll(); }
    @Override
    public Level getLevelById(Integer id){ return levelJpaRepo.findOne(id);}

    @Override
    public List<Status> getAllStatus() { return statusJpaRepo.findAll(); }
    @Override
    public Status getStatusById(Integer id){ return statusJpaRepo.findOne(id);}

    @Override
    public List<User> getAllUser() { return userJpaRepo.findAll(); }
    @Override
    public User getUserById(Integer id){ return userJpaRepo.findOne(id);}
}
