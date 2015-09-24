/**
 * 
 */
package com.classified.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import com.classified.entity.User;

/**
 * @author Saurav Wahid<saurav1161@gmail.com>
 * @version 1.0.00
 * @since   1.0.00
 *
 */
public interface UserMapper {
	
	@Select("select * from user")
	public List<User> selectAll();

	@Insert("insert into user(username, password) values(#{username}, #{password})")
	public void insert(User u);

}
