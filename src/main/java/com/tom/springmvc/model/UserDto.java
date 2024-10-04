package com.tom.springmvc.model;

/**
 * @author Tom
 * @version 1.0.0
 * @ClassName UserDto.java
 * @Description TODO
 * @createTime 2024年09月21日 16:45:00
 */
public class UserDto {

    private Long id ;

    private String name;

    private String mobilePhone;

    private String address;

    public UserDto() {
        // do nothing.
    }

    public static UserDto build(Long id, String name, String mobilePhone, String address) {
        UserDto userDto = new UserDto();
        userDto.id = id;
        userDto.name = name;
        userDto.mobilePhone = mobilePhone;
        userDto.address = address;
        return userDto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
