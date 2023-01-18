package com.leafblog.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.leafblog.user.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author leaflei
 * @Description 用户信息Mapper接口
 * @Date 2022/12/21 17:29
 */
@Mapper
public interface UserInfoMapper extends BaseMapper<UserInfo> {
}
