package com.imooc.test;

import com.imooc.sm.entity.Department;
import com.imooc.sm.entity.Staff;
import com.imooc.sm.service.StaffService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Create by hza
 * 2019-09-11 17:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestStaffService {

    @Autowired
    private StaffService staffService ;

    @Test
    public void testList() {
        System.out.println(this.staffService.getAll());
    }

    @Test
    public void get() {
        System.out.println(this.staffService.get(2));
    }

    @Test
    public void add() {
        Staff staff = new Staff();
        staff.setAccount("测试1");
        staff.setDid(30);
        staff.setName("华安");
        staff.setSex("男");
        this.staffService.add(staff);
    }

    @Test
    public void edit() {
        Staff staff = this.staffService.get(2) ;
        staff.setName("hza~~~~~");
        this.staffService.edit(staff);
    }
}
