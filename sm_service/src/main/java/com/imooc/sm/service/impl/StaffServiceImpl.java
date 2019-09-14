package com.imooc.sm.service.impl;

import com.imooc.sm.dao.DepartmentDao;
import com.imooc.sm.dao.StaffDao;
import com.imooc.sm.entity.Department;
import com.imooc.sm.entity.Staff;
import com.imooc.sm.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Create by hza
 * 2019-09-12 20:14
 *
 *  Integer id          ;   // 编号
 *  String  account     ;   // 账户
 *  String  password    ;   // 密码
 *  String  status      ;   // 状态
 *  Integer did         ;   // 部门编号
 *  String  name        ;   // 姓名
 *  String  sex         ;   // 性别
 *  String  idNumber   ;   // 身份证号码
 *  Date    workTime   ;   // 入职时间
 *  Date    leaveTime  ;   // 离职时间
 *  Date    bornDate   ;   // 出生日期
 *  String  info        ;   // 备注
 *
 *
 */
@Service("staffService")
public class StaffServiceImpl implements StaffService {

    @Autowired
    private StaffDao staffDao ;
//
//    @Autowired
//    private DepartmentDao departmentDao ;

    @Override
    public void add(Staff staff) {
        staff.setPassword("123456");
        staff.setStatus("正常");
        staff.setWorkTime(new Date());
        this.staffDao.insert(staff);
    }

    @Override
    public void edit(Staff staff) {
        this.staffDao.update(staff);
    }

    @Override
    public void remove(Integer id) {
        this.staffDao.delete(id);
    }

    @Override
    public Staff get(Integer id) {
        return this.staffDao.selectById(id);
    }

    @Override
    public List<Staff> getAll() {
        return this.staffDao.selectAll();
    }


//    @Override
//    public Map<String,Object> get(Integer id) {
//        Staff staff = this.staffDao.selectById(id) ;
//        Department department = this.departmentDao.selectById(staff.getId()) ;
//        Map<String,Object> map = new HashMap<>() ;
//        map.put("staff",staff) ;
//        map.put("dept",department) ;
//        return map;
//    }
//
//    @Override
//    public Map<String,Object> getAll() {
//        Map<String,Object> map = new HashMap<>() ;
//        List<Staff> allStaffs = this.staffDao.selectAll() ;
//        List<Department> allDepts = this.departmentDao.selectAll() ;
//        map.put("allStaffs", allStaffs);
//        map.put("allDepts", allDepts) ;
//        return map;
//    }
}
