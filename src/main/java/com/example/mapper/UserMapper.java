package com.example.mapper;

import com.example.entity.User;
import com.example.web.resource.UserResource;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper( UserMapper.class );

    User toUser(UserResource userResource);

    default Date convertDate(String dob) throws ParseException {
       return new SimpleDateFormat("dd/MM/yyyy").parse(dob);
    }
}
