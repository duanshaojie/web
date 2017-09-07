package cn.duanshaojie.dao;

import java.util.HashMap;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
	public HashMap<String,Object> findUserByUsername(@Param(value = "username") String username);
}
