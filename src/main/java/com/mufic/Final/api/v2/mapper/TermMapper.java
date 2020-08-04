package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.TermDTO;
import com.mufic.Final.domain.City;
import com.mufic.Final.domain.CourseInTerm;
import com.mufic.Final.domain.Term;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class TermMapper {
    TermMapper INSTANCE = Mappers.getMapper(TermMapper.class);


    protected abstract TermDTO objToDTO(Term obj);

    @IterableMapping(elementTargetType = Long.class)
    protected abstract List<Long> maplistToLong(List<CourseInTerm> list);

    protected Long mapToLong(CourseInTerm courseInTerm) {
        return courseInTerm.getId();
    }

}
