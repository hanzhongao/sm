package com.imooc.test;

import com.imooc.sm.entity.Department;
import com.imooc.sm.service.DepartmentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Create by hza
 * 2019-09-11 17:26
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class TestDepartmentService {

    @Autowired
    private DepartmentService departmentService ;

    @Test
    public void testList() {
        System.out.println(this.departmentService.getAll());
    }

    @Test
    public void get() {
        System.out.println(this.departmentService.get(1));
    }

    @Test
    public void add() {
        Department department = new Department() ;
        department.setName("市场部");
        department.setAddress("北京");
        this.departmentService.add(department);
    }

    @Test
    public void edit() {
        Department department = new Department() ;
        department.setId(1);
        department.setName("市场部");
        department.setAddress("11111111111111111111111");
        this.departmentService.edit(department);
    }
}
