package com.cyz.springbootdatajpa.user;

import javax.persistence.*;

@Entity//告诉jpa这是一个实体类（和数据表映射的类）
@Table(name = "user")//@table来指定和那个数据表对应，如果省略默认表名就是user
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键自增
    Integer id;
    @Column(name = "name")//指定和表里的列名，如果没有则默认name
    String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
