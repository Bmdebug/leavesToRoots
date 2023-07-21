package com.top.sports.data.center.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * mybatis-plus 支持
 * @author zyg
 */
@Configuration
@MapperScan("com.top.sports.data.center.repository")
public class MybatisPlus {
}
