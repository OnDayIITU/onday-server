package kz.onday.tm.core.controller;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.EventUserMap;
import kz.onday.tm.core.model.Group;
import kz.onday.tm.core.model.GroupUserMap;
import kz.onday.tm.core.model.Status;
import kz.onday.tm.core.model.User;
import kz.onday.tm.core.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.transaction.Transactional;
import javax.validation.Valid;
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

    @RequestMapping(value = "/{userId}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> updateUser(@PathVariable("userId") int userId, @RequestBody @Valid User user) {
        HttpHeaders headers = new HttpHeaders();
        if ((user == null)) {
            return new ResponseEntity<User>(headers, HttpStatus.BAD_REQUEST);
        }
        User currentUser = this.service.getUserById(userId);
        if (currentUser == null) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
        currentUser.setUsername(user.getUsername());
        currentUser.setFirstName(user.getFirstName());
        currentUser.setLastName(user.getLastName());
        this.service.saveUser(currentUser);
        return new ResponseEntity<User>(currentUser, HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/{userId}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @Transactional
    public ResponseEntity<Void> deleteOwner(@PathVariable("userId") int userId) {
        User user = this.service.getUserById(userId);
        if (user == null) {
            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
        }
        this.service.deleteUser(user);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "user", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<User> addUser(@RequestBody @Valid User user) {
        HttpHeaders headers = new HttpHeaders();
        if (user == null) {
            return new ResponseEntity<User>(headers, HttpStatus.BAD_REQUEST);
        }
        this.service.saveUser(user);
        return new ResponseEntity<User>(user, headers, HttpStatus.CREATED);
    }


}
