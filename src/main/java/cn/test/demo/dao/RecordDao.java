package cn.test.demo.dao;

import cn.test.demo.bean.Record;
import cn.test.demo.bean.User;

import java.util.ArrayList;
import java.util.List;

public class RecordDao {
    public List<Record> getRecords(){
        List<Record> records = new ArrayList<>();
        Record record = new Record();
        record.put("userid",user().getId());
        records.add(record);
        return records;
    }

    public User user(){
        User user = new User();
        user.setId("9527-9527-9527-9527");
        user.setUsername("张三");
        user.setAge(18);
        return user;
    }

    public String getString(){
        return "Hello".substring(0,1);
    }
}
