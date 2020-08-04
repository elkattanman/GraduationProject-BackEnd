package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.StudentInfoDTO;
import com.mufic.Final.domain.StudentInfo;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentInfoMapper {
    StudentInfoMapper INSTANCE = Mappers.getMapper(StudentInfoMapper.class);


    @Mapping(source = "student.id", target = "student")
    StudentInfoDTO objToDTO(StudentInfo obj);
}
