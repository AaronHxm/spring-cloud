package org.hxm.fegin.dto;

/**
 * @author : Aaron
 * create at:  2019-09-22  09:58
 * @description: userdto
 */
public class UserDto {
    private String id;
    private String name;
    private int age;
    private String sex;


    public UserDto(String id, String name, int age, String sex) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }



}

