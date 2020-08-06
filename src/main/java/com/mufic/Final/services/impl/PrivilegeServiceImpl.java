package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.PrivilegeMapper;
import com.mufic.Final.api.v2.model.PrivilegeDTO;
import com.mufic.Final.api.v2.model.lists.PrivilegeListDTO;
import com.mufic.Final.controllers.v2.CityController;
import com.mufic.Final.controllers.v2.PrivilegeController;
import com.mufic.Final.repositories.PrivilegeRepository;
import com.mufic.Final.services.PrivilegeService;
import com.mufic.Final.services.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class PrivilegeServiceImpl implements PrivilegeService {

    private final PrivilegeMapper privilegeMapper;
    private final PrivilegeRepository privilegeRepository;

    public PrivilegeServiceImpl(PrivilegeMapper privilegeMapper, PrivilegeRepository privilegeRepository) {
        this.privilegeMapper = privilegeMapper;
        this.privilegeRepository = privilegeRepository;
    }

    @Override
    public PrivilegeDTO getById(Long id) {
        return privilegeRepository.findById(id)
                .map(privilegeMapper::objToDTO)
                .map(privilegeDTO -> {
                    privilegeDTO.setPrivilegeUrl(getUrl(id));
                    return privilegeDTO;
                })
                .orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public PrivilegeListDTO getAll() {
        return new PrivilegeListDTO(
                privilegeRepository.findAll()
                .stream()
                .map(privilegeMapper::objToDTO)
                .map(privilegeDTO -> {
                    privilegeDTO.setPrivilegeUrl(getUrl(privilegeDTO.getId()));
                    return privilegeDTO;
                })
                .collect(Collectors.toList())
        );
    }

    @Override
    public PrivilegeDTO createNew(PrivilegeDTO privilegeDTO) {
        return null;
    }

    @Override
    public PrivilegeDTO saveByDTO(Long id, PrivilegeDTO privilegeDTO) {
        return null;
    }

    @Override
    public PrivilegeDTO patch(Long id, PrivilegeDTO privilegeDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }
    private String getUrl(long id) {
        return PrivilegeController.BASE_URL + "/" + id;
    }

}
