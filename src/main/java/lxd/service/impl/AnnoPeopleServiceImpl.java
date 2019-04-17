package lxd.service.impl;

import lxd.dao.IPeopleMapper;
import lxd.entity.People;
import lxd.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service("peopleService")
public class AnnoPeopleServiceImpl implements PeopleService {
    @Autowired
    IPeopleMapper peopleMapper;
    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void deletePeopelById(int id) throws Exception {
        peopleMapper.deletePeopelById(id);
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED,readOnly = false)
    public void updatePeopelById(People people, People people1) throws Exception {
        peopleMapper.updatePeopelById(people);
        peopleMapper.updatePeopelById(people1);
    }

    @Override
    public List<People> getPeopels() throws Exception {
        return peopleMapper.getPeopels();
    }
}
