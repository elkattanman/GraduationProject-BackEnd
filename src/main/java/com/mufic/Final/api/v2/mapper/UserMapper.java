package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.UserDTO;
import com.mufic.Final.domain.Privilege;
import com.mufic.Final.domain.Role;
import com.mufic.Final.domain.User;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;
import java.util.Set;

@Mapper
public abstract class UserMapper {
//    public UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);



    public abstract UserDTO objToDTO(User obj);

    @IterableMapping(elementTargetType = String.class)
    protected abstract List<String> maplistToString(Set<Role> list);

    protected String mapToString(Role privilege){
        return privilege.getName().name();
    }
}
