package com.imooc.sm.service;

import com.imooc.sm.entity.Department;

import java.util.List;

public interface DepartmentService {
    public void add(Department department) ;
    public void remove(Integer id) ;
    public void edit(Department department) ;
    public Department get(Integer id) ;
    public List<Department> getAll() ;
}
