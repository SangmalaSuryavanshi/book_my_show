package com.application.demo.book_my_show.convertors;

import com.application.demo.book_my_show.entity.UserEntity;
import com.application.demo.book_my_show.requestdtos.UserRequestDto;

public class UserConvertor {

    public static UserEntity convertUserRequestDtoUserEntity(UserRequestDto userRequestDto ){

        UserEntity userEntity = UserEntity.builder().name(userRequestDto.getName()).age(userRequestDto.getAge())
                .email(userRequestDto.getEmail()).mobile(userRequestDto.getMobile()).address(userRequestDto.getAddress()).build();

        return userEntity;

    }
}
