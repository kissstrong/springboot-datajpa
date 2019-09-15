package com.cyz.springbootdatajpa.dao;

import com.cyz.springbootdatajpa.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
//继承JpaRepository来完成对数据库的操作，User指操作对象，Integer指主键的类型
public interface U extends JpaRepository<User,Integer> {
}
