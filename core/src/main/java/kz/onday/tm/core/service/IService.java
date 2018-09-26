package kz.onday.tm.core.service;

import kz.onday.tm.core.model.Event;
import kz.onday.tm.core.model.Level;

import java.util.List;

public interface IService {
    List<Event> getAllEvent();
    List<Level> getAllLevel();

}
