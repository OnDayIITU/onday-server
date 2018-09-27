package kz.onday.tm.core.controller;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.EventUserMap;
import kz.onday.tm.core.model.Group;
import kz.onday.tm.core.model.GroupUserMap;
import kz.onday.tm.core.model.Level;
import kz.onday.tm.core.model.Status;
import kz.onday.tm.core.model.User;
import kz.onday.tm.core.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/g")
public class ControllerG {
    @Autowired
    public IService service;
    @GetMapping("/event")
    public List<Event> getAllEvents(){
        return  service.getAllEvent();
    }
    @GetMapping("/eventusermap")
    public List<EventUserMap> getAllEventUserMaps(){
        return  service.getAllEventUserMap();
    }
    @GetMapping("/group")
    public List<Group> getAllGroups(){ return  service.getAllGroup(); }
    @GetMapping("/groupusermap")
    public List<GroupUserMap> getAllGroupUserMaps(){
        return  service.getAllGroupUserMap();
    }
    @GetMapping("/level")
    public List<Level> getAllLevels(){
        return  service.getAllLevel();
    }
    @GetMapping("/status")
    public List<Status> getAllStatuses(){ return  service.getAllStatus(); }
    @GetMapping("/user")
    public List<User> getAllUsers(){ return  service.getAllUser(); }
}
