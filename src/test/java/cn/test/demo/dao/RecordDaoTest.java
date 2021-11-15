package cn.test.demo.dao;

import cn.test.demo.bean.User;
import cn.test.demo.dao.RecordDao;
import com.alibaba.testable.core.annotation.MockInvoke;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecordDaoTest {

    public static class Mock{

        @MockInvoke(targetClass = RecordDao.class)
        public User user(){
            User user = new User();
            user.setId("4396-4396-4396-4396");
            user.setUsername("李四");
            user.setAge(20);
            return user;
        }

        @MockInvoke(targetClass = String.class, targetMethod = "substring")
        private String sub(int i, int j) {
            return "sub";
        }
    }

    @Test
    public void test_getRecords(){
        RecordDao recordDao = new RecordDao();
        String userid = (String) recordDao.getRecords().get(0).get("userid");
        System.out.println(userid);
        assertEquals("4396-4396-4396-4396",userid);
    }

    @Test
    public void test_getString(){
        assertEquals("sub",new RecordDao().getString());
    }
}
