package com.imooc.sm.entity;

import java.util.Date;

/**
 * Create by hza
 * 2019-09-12 19:39
 *
 * id        | int(11)
 * account   | varchar(20)
 * password  | varchar(20)
 * status    | varchar(10)
 * did       | int(11)
 * name      | varchar(20)
 * sex       | char(2)
 * id_number | char(18)
 * work_time | datetime
 * leave_time| datetime
 * born_date | date
 * info      | varchar(200)
 */

public class Staff {

    private Integer id          ;   // 编号
    private String  account     ;   // 账户
    private String  password    ;   // 密码
    private String  status      ;   // 状态
    private Integer did         ;   // 部门编号
    private String  name        ;   // 姓名
    private String  sex         ;   // 性别
    private String  idNumber   ;   // 身份证号码
    private Date    workTime   ;   // 入职时间
    private Date    leaveTime  ;   // 离职时间
    private Date    bornDate   ;   // 出生日期
    private String  info        ;   // 备注

    private Department department ; // 部门信息

    public Staff() {
    }

    public Staff(Integer id,    String account, String password, String status,
                 Integer did,   String name,    String sex,      String idNumber,
                 Date workTime, Date leaveTime, Date bornDate,   String info) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.status = status;
        this.did = did;
        this.name = name;
        this.sex = sex;
        this.idNumber = idNumber;
        this.workTime = workTime;
        this.leaveTime = leaveTime;
        this.bornDate = bornDate;
        this.info = info;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getWorkTime() {
        return workTime;
    }

    public void setWorkTime(Date workTime) {
        this.workTime = workTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Date getBornDate() {
        return bornDate;
    }

    public void setBornDate(Date bornDate) {
        this.bornDate = bornDate;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", did=" + did +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", workTime=" + workTime +
                ", leaveTime=" + leaveTime +
                ", bornDate=" + bornDate +
                ", info='" + info + '\'' +
                '}';
    }
}
