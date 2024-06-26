package com.zhihao.usercenterbackend;

import com.baomidou.mybatisplus.core.toolkit.Assert;
import com.zhihao.usercenterbackend.mapper.UserMapper;
import com.zhihao.usercenterbackend.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Zhihao Zhang
 * @description TODO
 * @date 2024-04-06 6:13 PM
 */
@SpringBootTest
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.isTrue(5 == userList.size(), "");
        userList.forEach(System.out::println);
    }

}
