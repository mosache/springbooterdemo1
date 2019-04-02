package com.yd.demo.dao;

import com.yd.demo.beans.Emplyee;
import com.yd.demo.dao.IDao.IEmplyeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EmplyeeDao implements IEmplyeeDao {

    private List<Emplyee> emps = new ArrayList<>();

    public EmplyeeDao(){
        emps.add(new Emplyee("aaa",12,"bbb",13.5));
        emps.add(new Emplyee("aaab",13,"dadasd",12.5));
        emps.add(new Emplyee("aaacc",45,"adada",10.1));
    }

    @Override
    public List<Emplyee> getEmps() {
        return emps;
    }
}
