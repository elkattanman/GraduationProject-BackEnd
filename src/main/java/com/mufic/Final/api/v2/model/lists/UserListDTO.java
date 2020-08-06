package com.mufic.Final.api.v2.model.lists;

import com.mufic.Final.api.v2.model.UserDTO;
import com.mufic.Final.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class UserListDTO {
    List<UserDTO> users;
}
