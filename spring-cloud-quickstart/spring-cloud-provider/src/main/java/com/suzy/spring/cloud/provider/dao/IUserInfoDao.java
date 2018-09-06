package com.suzy.spring.cloud.provider.dao;

import com.suzy.spring.cloud.model.UserInfoDo;

public interface IUserInfoDao {

	UserInfoDo saveUser(UserInfoDo userInfoDo);

	UserInfoDo updateUser(UserInfoDo userInfoDo);

	UserInfoDo findUser(int id);

}
