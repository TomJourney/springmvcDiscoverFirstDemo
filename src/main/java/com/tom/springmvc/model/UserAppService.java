package com.tom.springmvc.model;

import java.util.List;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserAppService.java
 * @Description TODO
 * @createTime 2024年09月21日 16:48:00
 */
public class UserAppService {

    public List<UserDto> listUser() {
        // 这里本应该调用dao层或http，为简单期间，我们在内存mock一个userlist
        return List.of(
                UserDto.build(1L, "张三1", "17612340001", "成都高新区地址01号")
                , UserDto.build(2L, "张三2", "17612340002", "成都高新区地址02号")
                , UserDto.build(3L, "张三3", "17612340003", "成都高新区地址03号")
        );
    }
}
