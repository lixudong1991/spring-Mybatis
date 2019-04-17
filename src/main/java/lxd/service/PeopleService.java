package lxd.service;

import lxd.entity.People;

import java.util.List;

public interface PeopleService {

    void deletePeopelById(int id)throws Exception;
    void updatePeopelById(People people,People people1)throws Exception;
    List<People> getPeopels()throws Exception;
}
