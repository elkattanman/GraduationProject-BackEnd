package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.StudentHasCourseInTermDTO;
import com.mufic.Final.domain.StudentHasCourseInTerm;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface StudentHasCourseInTermMapper {
    StudentHasCourseInTermMapper INSTANCE = Mappers.getMapper(StudentHasCourseInTermMapper.class);


    StudentHasCourseInTermDTO objToDTO(StudentHasCourseInTerm obj);
}
