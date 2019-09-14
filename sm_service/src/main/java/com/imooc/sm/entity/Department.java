package com.imooc.sm.entity;

/**
 * Create by hza
 * 2019-09-11 14:55
 * +---------+-------------+------+------+--------+----------------+
 * | Field    | Type        | Null  | Key | Default | Extra        |
 * +---------+-------------+------+------+--------+----------------+
 * | id      | int(11)      | NO  | PRI  | NULL   | auto_increment |
 * | name    | varchar(20)  | NO  |      | NULL   |                |
 * | address | varchar(100) | YES |      | NULL   |                |
 * +---------+-------------+------+------+--------+----------------+
 */
public class Department {
    private Integer id ;
    private String name ;
    private String address ;

    public Department() {
    }

    public Department(Integer id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
