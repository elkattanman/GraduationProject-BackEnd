package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.RoleDTO;
import com.mufic.Final.domain.Course;
import com.mufic.Final.domain.Privilege;
import com.mufic.Final.domain.Role;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public abstract class RoleMapper {
    public RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);


    public abstract RoleDTO objToDTO(Role obj);

    @IterableMapping(elementTargetType = String.class)
    protected abstract List<String> maplistToString(List<Privilege> list);

    protected String mapToString(Privilege privilege){
        return privilege.getName().name();
    }
}
