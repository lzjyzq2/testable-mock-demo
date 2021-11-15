package cn.test.demo.service;

import cn.test.demo.bean.Record;
import cn.test.demo.dao.RecordDao;

import java.util.List;

public class RecordService {

    public List<Record> getRecords(){
        return new RecordDao().getRecords();
    }
}
