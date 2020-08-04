package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.TeachingStaffDTO;
import com.mufic.Final.domain.*;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class TeachingStaffMapper {
    public TeachingStaffMapper INSTANCE = Mappers.getMapper(TeachingStaffMapper.class);


    @Mapping(source = "city.id", target = "city")
    public abstract TeachingStaffDTO objToDTO(TeachingStaff obj);

    @IterableMapping(elementTargetType = Long.class)
    protected abstract List<Long> maplistToString(List<User> list);

    protected Long mapToLong(User user){
        return user.getId();
    }


}
