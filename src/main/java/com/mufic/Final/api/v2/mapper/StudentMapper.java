package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.StudentDTO;
import com.mufic.Final.domain.Student;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentMapper {
    StudentMapper INSTANCE = Mappers.getMapper(StudentMapper.class);


    @Mapping(source = "guide.id", target = "guide")
    @Mapping(source = "user.id", target = "user")
    @Mapping(source = "department.id", target = "department")
    @Mapping(source = "city.id", target = "city")
    @Mapping(source = "studentInfo.id", target = "studentInfo")
    StudentDTO objToDTO(Student obj);
}
