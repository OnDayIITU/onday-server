package kz.onday.tm.core.controller;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.EventUserMap;
import kz.onday.tm.core.model.Group;
import kz.onday.tm.core.model.GroupUserMap;
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
    @GetMapping("/event/{id}")
    Event getEventById(@PathVariable(value = "id") Integer id){ return service.getEventById(id);}

    @GetMapping("/eventusermap")
    public List<EventUserMap> getAllEventUserMaps(){ return  service.getAllEventUserMap(); }
    @GetMapping("/eventusermap/{id}")
    EventUserMap getEventUserMapById(@PathVariable(value = "id") Integer id){ return service.getEventUserMapById(id);}

    @GetMapping("/group")
    public List<Group> getAllGroups(){ return  service.getAllGroup(); }
    @GetMapping("/group/{id}")
    Group getGroupById(@PathVariable(value = "id") Integer id){ return service.getGroupById(id);}

    @GetMapping("/groupusermap")
    public List<GroupUserMap> getAllGroupUserMaps(){
        return  service.getAllGroupUserMap();
    }
    @GetMapping("/groupusermap/{id}")
    GroupUserMap getGroupUserMapById(@PathVariable(value = "id") Integer id){ return service.getGroupUserMapById(id);}

    @GetMapping("/status")
    public List<Status> getAllStatuses(){ return  service.getAllStatus(); }
    @GetMapping("/status/{id}")
    Status  getStatusById(@PathVariable(value = "id") Integer id){ return service.getStatusById(id);}

    @GetMapping("/user")
    public List<User> getAllUsers(){ return  service.getAllUser(); }
    @GetMapping("/user/{id}")
    User getUserById(@PathVariable(value = "id") Integer id){ return service.getUserById(id);}
}
