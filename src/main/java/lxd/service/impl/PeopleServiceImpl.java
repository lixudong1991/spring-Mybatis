package lxd.service.impl;

import lxd.dao.IPeopleMapper;
import lxd.entity.People;
import lxd.service.PeopleService;

import java.util.List;


public class PeopleServiceImpl implements PeopleService {

    IPeopleMapper peopleMapper;

    public void setPeopleMapper(IPeopleMapper peopleMapper) {
        this.peopleMapper = peopleMapper;
    }

    @Override
    public void deletePeopelById(int id) throws Exception {
        peopleMapper.deletePeopelById(id);
    }
    @Override
    public void updatePeopelById(People people,People people1) throws Exception {
        peopleMapper.updatePeopelById(people);
        peopleMapper.updatePeopelById(people1);
    }

    @Override
    public List<People> getPeopels() throws Exception {
        return  peopleMapper.getPeopels();
    }

}
