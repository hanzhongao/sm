package com.imooc.sm.dao;

import com.imooc.sm.entity.Staff;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository("staffDao")
public interface StaffDao {
    public void insert(Staff staff) ;
    public void delete(Integer id)  ;
    public void update(Staff staff) ;
    public Staff selectById(Integer id) ;
    public List<Staff> selectAll() ;
}
