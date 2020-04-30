package com.cwj.mapper;

import com.cwj.model.Emp;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author chenwujie
 * @date: 2020/4/30
 * @time: 9:45
 */
@Mapper
public interface EmpMapper {
    @Select("select * from emp")
    List<Emp> findAll();

    @Select("select * from emp where id=#{id}")
    Emp findById(@Param("id") Integer id);
    @Insert("insert into emp(id, name) values(#{id}, #{name})")
    int insert(Emp emp);
    @Update("update emp set name=#{name} where id=#{id}")
    int updateById(Emp emp);

}
