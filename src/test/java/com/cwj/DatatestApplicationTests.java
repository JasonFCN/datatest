package com.cwj;

import com.cwj.mapper.EmpMapper;
import com.cwj.model.Emp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class DatatestApplicationTests {

    @Autowired
    private EmpMapper empMapper;


    @Test void contextLoads() {
        Emp emp = new Emp();
        emp.setId(2);
//        emp.setName("帅杰克");
        emp.setName("帅杰克\uD83D\uDE00");
        int insert = empMapper.insert(emp);
        System.out.println("插入结果：" + insert);

        List<Emp> all = empMapper.findAll();
        all.stream().forEach(emp1 -> System.out.print(emp1.getName()));
    }

}
