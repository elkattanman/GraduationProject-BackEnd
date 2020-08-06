package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.ProgramDTO;
import com.mufic.Final.domain.Course;
import com.mufic.Final.domain.CourseInTerm;
import com.mufic.Final.domain.Program;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class ProgramMapper {
//    public ProgramMapper INSTANCE = Mappers.getMapper(ProgramMapper.class);


    @Mapping(source = "underRequirement.id", target = "underRequirement")
    public abstract ProgramDTO objToDTO(Program obj);

    @IterableMapping(elementTargetType = String.class)
    protected abstract List<String> maplistToString(List<Course> list);

    protected String mapToString(Course course){
        return course.getCode();
    }
}
