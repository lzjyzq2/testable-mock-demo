package cn.test.demo.service;

import cn.test.demo.bean.User;
import cn.test.demo.dao.RecordDao;
import com.alibaba.testable.core.annotation.MockInvoke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordServiceTest {

    public static class Mock{
        @MockInvoke(targetClass = RecordDao.class)
        public User user(){
            User user = new User();
            user.setId("4396-4396-4396-4396");
            user.setUsername("李四");
            user.setAge(20);
            return user;
        }
    }

    /**
     * 测试用例
     */
    @Test
    public void test_getRecords(){
        RecordService recordService = new RecordService();
        String userid = (String) recordService.getRecords().get(0).get("userid");
        System.out.println(userid);
        // 期望输出 4396-4396-4396-4396 ， 实际输出 9527-9527-9527-9527
        assertEquals("4396-4396-4396-4396",userid);
    }
}
