package com.imooc.sm.service;

import com.imooc.sm.entity.Staff;

import java.util.List;
import java.util.Map;

public interface StaffService {
    public void add(Staff staff);
    public void edit(Staff staff) ;
    public void remove(Integer id) ;
    public Staff get(Integer id) ;
    public List<Staff> getAll() ;
//    public Map<String,Object> selectById(Integer id) ;
//    public Map<String,Object> selectAll() ;
}
