package kz.onday.tm.core.service;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.EventUserMap;
import kz.onday.tm.core.model.Group;
import kz.onday.tm.core.model.GroupUserMap;
import kz.onday.tm.core.model.Level;
import kz.onday.tm.core.model.Status;
import kz.onday.tm.core.model.User;

import java.util.List;

public interface IService {

    List<Event> getAllEvent();
    Event getEventById(Integer id);

    List<EventUserMap> getAllEventUserMap();
    EventUserMap getEventUserMapById(Integer id);

    List<Group> getAllGroup();
    Group getGroupById(Integer id);

    List<GroupUserMap> getAllGroupUserMap();
    GroupUserMap getGroupUserMapById(Integer id);

    List<Level> getAllLevel();
    Level getLevelById(Integer id);

    List<Status> getAllStatus();
    Status getStatusById(Integer id);

    List<User> getAllUser();
    User getUserById(Integer id);
}
