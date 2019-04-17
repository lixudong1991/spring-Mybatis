package lxd.entity;

public class RegisterAddr {
    int id;
    String name;
    int peopleSum;
    int area;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPeopleSum() {
        return peopleSum;
    }

    public void setPeopleSum(int peopleSum) {
        this.peopleSum = peopleSum;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "RegisterAddr{" + id +
                ", " + name +
                ", " + peopleSum +
                ", " + area +
                '}';
    }
}
