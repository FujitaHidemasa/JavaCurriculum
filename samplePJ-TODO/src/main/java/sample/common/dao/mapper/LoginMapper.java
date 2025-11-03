package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import sample.common.dao.entity.Login;

@Mapper
public interface LoginMapper {
	
	//ユーザー登録
	void insert(Login login);
	
	//ユーザー名とパスワードで1件取得
	Login selectByUsernameAndPassword(@Param("username") String name,@Param("password") String password);
}


