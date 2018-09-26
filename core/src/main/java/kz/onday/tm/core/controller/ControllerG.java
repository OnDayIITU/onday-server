package kz.onday.tm.core.controller;
import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.Level;
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
    @GetMapping("/level")
    public List<Level> getAllLevels(){
        return  service.getAllLevel();
    }
}
