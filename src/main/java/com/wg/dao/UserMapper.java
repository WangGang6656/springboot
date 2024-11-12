package com.wg.dao;

import com.wg.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface UserMapper {
    @Select("select  * from users")
    @Results({
        @Result(property = "sex",column = "sex"),
        @Result(property = "username",column = "username"),
        @Result(property = "nickName",column = "nick_name")
    }
    )
    List<User> getAll();

    @Select("select * from users where id=#{id};")
    @Results({
            @Result(property = "sex",column = "sex"),
            @Result(property = "username",column = "username"),
            @Result(property = "nickName",column = "nick_name"),
    })
    User getById(Long uid);

    @Insert("INSERT INTO users(username,nick_name,sex) VALUES(#{username}, #{nickName}, #{sex})")
    int save(Map<String, Object> map);

    @Update("UPDATE users SET username=#{username},nick_name=#{nickName} WHERE id =#{id}")
    public int update(Map<String,Object> map);

    @Delete("DELETE FROM users WHERE id =#{id}")
    public int delete(long id);
}
