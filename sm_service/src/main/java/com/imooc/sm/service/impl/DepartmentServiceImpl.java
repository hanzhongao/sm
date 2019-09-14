package com.imooc.sm.service.impl;

import com.imooc.sm.dao.DepartmentDao;
import com.imooc.sm.entity.Department;
import com.imooc.sm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Create by hza
 * 2019-09-11 15:23
 */

@Service("departmentService")
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentDao departmentDao ;

    @Override
    public void add(Department department) {
        this.departmentDao.insert(department);
    }

    @Override
    public void remove(Integer id) {
        this.departmentDao.delete(id);
    }

    @Override
    public void edit(Department department) {
        this.departmentDao.update(department);
    }

    @Override
    public Department get(Integer id) {
        return this.departmentDao.selectById(id);
    }

    @Override
    public List<Department> getAll() {
        return this.departmentDao.selectAll();
    }
}
