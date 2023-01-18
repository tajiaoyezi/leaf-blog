package com.leafblog.common.utils;



import org.springframework.lang.Nullable;

/**
 * @author leaflei
 * @Description 对象工具类
 * @Date 2022/12/21 17:44
 */
public class ObjectUtil extends org.springframework.util.ObjectUtils {

    /**
     * 判断元素不为空
     * @param obj object
     * @return boolean
     */
    public static boolean isNotEmpty(@Nullable Object obj) {
        return !ObjectUtil.isEmpty(obj);
    }

}