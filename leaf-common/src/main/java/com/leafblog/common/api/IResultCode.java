package com.leafblog.common.api;

import java.io.Serializable;

/**
 * @author leaflei
 * @Description 业务代码接口
 * @Date 2022/12/21 17:35
 */
public interface IResultCode extends Serializable {

    /**
     * 消息
     *
     * @return String
     */
    String getMessage();

    /**
     * 状态码
     *
     * @return int
     */
    int getCode();

}
