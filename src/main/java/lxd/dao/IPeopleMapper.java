package lxd.dao;

import lxd.entity.People;
import lxd.entity.PeopleQueryVo;

import java.util.List;

public interface IPeopleMapper {
    People getPeopelById(int id) throws Exception;
    List<People> getPeopelByName(String name)throws Exception;
    List<People> getPeopels()throws Exception;
    void insertPeople(People people)throws Exception;
    void deletePeopelById(int id)throws Exception;
    void updatePeopelById(People people)throws Exception;
    List<People> getPeopleByNameAndReg(PeopleQueryVo peopleQueryVo)throws Exception;
    List<PeopleQueryVo> getPeopleInfoByNameAndReg(PeopleQueryVo peopleQueryVo)throws Exception;
}
