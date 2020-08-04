package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.CityDTO;
import com.mufic.Final.domain.City;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CityMapper {
    CityMapper INSTANCE = Mappers.getMapper(CityMapper.class);


    @Mapping(source = "state.id", target = "state")
    @Mapping(source = "country.id", target = "country")
    CityDTO cityToCityDTO(City city);
}
