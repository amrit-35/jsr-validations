package com.example.mapper;

import com.example.entity.User;
import com.example.web.resource.UserResource;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    @Mapping(target = "dob", dateFormat = "dd/MM/yyyy")
    User toUser(UserResource userResource);

}
