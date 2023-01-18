package com.leafblog.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.leafblog.user.entity.UserInfo;

import com.leafblog.user.mapper.UserInfoMapper;
import com.leafblog.user.service.IUserInfoService;
import org.springframework.stereotype.Service;


/**
 * @author leaflei
 * @Description 用户信息业务层实现类
 * @Date 2022/12/21 17:28
 */
@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

}
