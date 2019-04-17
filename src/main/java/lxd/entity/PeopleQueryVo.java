package lxd.entity;

import java.util.List;

public class PeopleQueryVo {
    People people;
    IDcard iDcard;
    RegisterAddr registerAddr;
    List<String> pidentitys;

    public List<String> getIds() {
        return pidentitys;
    }

    public void setIds(List<String> pidentitys) {
        this.pidentitys = pidentitys;
    }

    public People getPeople() {
        return people;
    }

    public void setPeople(People people) {
        this.people = people;
    }

    public RegisterAddr getRegisterAddr() {
        return registerAddr;
    }

    public void setRegisterAddr(RegisterAddr registerAddr) {
        this.registerAddr = registerAddr;
    }

    public IDcard getiDcard() {
        return iDcard;
    }

    public void setiDcard(IDcard iDcard) {
        this.iDcard = iDcard;
    }

    @Override
    public String toString() {
        return "PeopleQueryVo{" +
                "people=" + people +
                ", iDcard=" + iDcard +
                ", registerAddr=" + registerAddr +
                '}';
    }
}
