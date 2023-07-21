package com.top.sports.data.center.api;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.top.sports.data.center.constant.ErrorCode;
import com.top.sports.data.center.domain.BusinessException;
import com.top.sports.data.center.entity.User;
import com.top.sports.data.center.repository.UserMapper;
import com.top.sports.data.center.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 *
 * @ClassName UserController
 * @author zyg
 * @date 2021/12/18
 */
@Controller
@RestController
@Api(value = "demo" ,position = 10)
@ApiSupport(order = 284)
@RequestMapping("/demo")
public class UserApi {
    private Logger logger = LoggerFactory.getLogger(getClass());

    private UserService userService;
    private UserMapper userMapper;
    UserApi (UserService userService,UserMapper userMapper){
        this.userService = userService;
        this.userMapper = userMapper;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "查询用户",notes = "123" ,tags = "test")
    @ApiOperationSupport(order=1)
    public User get(@PathVariable Integer id) {
        logger.info("用户Id：{}",id);
        return userService.getById(id);
    }

    @GetMapping("/plus/{id}")
    @ApiOperation(value = "查询用户(mybatis-plus)")
    @ApiOperationSupport(order=2)
    public User getByPlus(@PathVariable Integer id) {
        logger.info("mybatis-plus 用户Id：{}",id);
        return userMapper.selectById(id);
    }
    @PostMapping("/{id}")
    public User post(@PathVariable Integer id) {
        String s = null;
        s.concat("123");
        return null;
    }
    @PutMapping("/{id}")
    public User put(@PathVariable Integer id) {
        throw new BusinessException(ErrorCode.USER_ID_NOT_NULL);
    }
    @DeleteMapping("/{id}")
    public User delete(@PathVariable Integer id) {
        return userService.getById(id);
    }

}