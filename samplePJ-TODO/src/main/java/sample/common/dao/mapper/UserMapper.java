package sample.common.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import sample.common.dao.entity.User;

@Mapper
public interface UserMapper {

	//ユーザー検索（ログイン用）
	User userSearch(User searchUser) ;
}
