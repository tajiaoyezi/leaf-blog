package com.leafblog.user.controller;


import com.leafblog.common.api.Result;
import com.leafblog.user.entity.UserInfo;
import com.leafblog.user.service.IUserInfoService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


/**
 * @author leaflei
 * @Description 用户信息控制器
 * @Date 2022/12/21 17:26
 */
@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserInfoController {

    private final IUserInfoService iuserInfoService;

    /**
     * 更新用户信息
     * @param userInfo 用户信息
     * @return {@link Result<String>}
     */
    @PutMapping("/update")
    public Result<String> updateUserInfo(@Validated @RequestBody UserInfo userInfo) {
        return iuserInfoService.updateById(userInfo) ?Result.success():Result.fail();
    }



}
