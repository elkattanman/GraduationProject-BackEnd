package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.ProgramLevelDTO;
import com.mufic.Final.domain.ProgramLevel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrgramLevelMapper {
    PrgramLevelMapper INSTANCE = Mappers.getMapper(PrgramLevelMapper.class);


    ProgramLevelDTO objToDTO(ProgramLevel obj);
}
