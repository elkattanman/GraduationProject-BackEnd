package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.CourseInTermDTO;
import com.mufic.Final.domain.CourseInTerm;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseInTermMapper {
    CourseInTermMapper INSTANCE = Mappers.getMapper(CourseInTermMapper.class);



    @Mapping(source = "term.id", target = "term")
    @Mapping(source = "course.code", target = "course")
    @Mapping(source = "instructor.id", target = "instructor")
    CourseInTermDTO courseInTermToCourseInTermDTO(CourseInTerm courseInTerm);
}
