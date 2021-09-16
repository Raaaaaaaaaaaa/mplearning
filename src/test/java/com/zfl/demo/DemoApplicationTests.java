package com.zfl.demo;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import org.junit.jupiter.api.Assertions;
import com.zfl.demo.mapper.UserMapper;
import com.zfl.demo.po.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class DemoApplicationTests {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assertions.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }

    @Test
    public void mp() {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setOutputDir(System.getProperty("user.dir") + "/src/main/java");
        globalConfig.setAuthor("Raaaaaa");
        globalConfig.setOpen(false);
        mpg.setGlobalConfig(globalConfig);

        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/user?characterEncoding=utf-8&serverTimezone=GMT%2B8");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("root");
        mpg.setDataSource(dataSourceConfig);

        PackageConfig pc = new PackageConfig();
        pc.setModuleName("test");
        pc.setParent("com.zfl");
        mpg.setPackageInfo(pc);

//        String templatePath = "/templates/mapper.xml.vm";

        mpg.execute();
    }

    @Test
    void SequenceKeyTest() {

    }

}
