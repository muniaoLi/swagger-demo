package com.muniao.swaggerdemo.controller;

import com.muniao.swaggerdemo.vo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 江南一点雨
 * @Site www.javaboy.org 2019-06-05 9:38
 */
@RestController
@Api(tags = "用户管理接口")//@Api注解可以用来标记当前Controller的功能
@RequestMapping("/user")
public class UserController {

    @ApiOperation("根据id查询用户")//@ApiOperation注解用来标记一个方法的作用。
    @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99")//@ApiImplicitParam注解用来描述一个参数，可以配置参数的中文含义，也可以给参数设置默认值，这样在接口测试的时候可以避免手动输入。
    @GetMapping("/")
    public User getUserById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    @ApiOperation("根据id更新用户名")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "用户id", defaultValue = "99"),
            @ApiImplicitParam(name = "username", value = "用户名", defaultValue = "javaboy")
    })
    @PutMapping("/")
    public User updateUsernameById(String username, Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        return user;
    }

    @PostMapping("/")
    @ApiOperation("添加用户")
    public User addUser(@RequestBody User user) {
        return user;
    }

    @DeleteMapping("/{id}")
    @ApiOperation("根据id 删除用户")
    public void deleteUserById(@PathVariable Long id) {

    }

    @GetMapping("/hello")
    public String hello(String name) {
        return "hello " + name + " !";
    }
}
