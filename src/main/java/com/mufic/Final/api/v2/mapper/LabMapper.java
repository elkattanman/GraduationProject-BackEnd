package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.LabDTO;
import com.mufic.Final.domain.Labs;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    @Mapping(source = "courseInTerm.id", target = "courseInTerm")
    @Mapping(source = "teachingStaff.id", target = "teachingStaff")
    LabDTO objToDTO(Labs obj);
}
