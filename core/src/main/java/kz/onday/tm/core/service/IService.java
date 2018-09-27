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
    List<EventUserMap> getAllEventUserMap();
    List<Group> getAllGroup();
    List<GroupUserMap> getAllGroupUserMap();
    List<Level> getAllLevel();
    List<Status> getAllStatus();
    List<User> getAllUser();
}
