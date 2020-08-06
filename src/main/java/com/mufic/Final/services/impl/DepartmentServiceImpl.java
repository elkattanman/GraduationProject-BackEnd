package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.DepartmentMapper;
import com.mufic.Final.api.v2.model.DepartmentDTO;
import com.mufic.Final.api.v2.model.lists.DepartmentListDTO;
import com.mufic.Final.controllers.v2.CityController;
import com.mufic.Final.controllers.v2.DepartmentController;
import com.mufic.Final.repositories.DepartmentRepository;
import com.mufic.Final.services.DepartmentService;
import com.mufic.Final.services.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentMapper departmentMapper;
    private final DepartmentRepository departmentRepository;

    public DepartmentServiceImpl(DepartmentMapper departmentMapper, DepartmentRepository departmentRepository) {
        this.departmentMapper = departmentMapper;
        this.departmentRepository = departmentRepository;
    }


    @Override
    public DepartmentDTO getById(Long id) {
        return departmentRepository.findById(id)
                .map(departmentMapper::departmentToDepartmentDTO)
                .map(departmentDTO -> {
                    departmentDTO.setDepartmentUrl(getUrl(id));
                    return departmentDTO;
                }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public DepartmentListDTO getAll() {
        return new DepartmentListDTO(
                departmentRepository.findAll()
                .stream()
                .map(departmentMapper::departmentToDepartmentDTO)
                .map(departmentDTO -> {
                    departmentDTO.setDepartmentUrl(getUrl(departmentDTO.getId()));
                    return departmentDTO;
                })
                .collect(Collectors.toList())
        );
    }

    @Override
    public DepartmentDTO createNew(DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public DepartmentDTO saveByDTO(Long id, DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public DepartmentDTO patch(Long id, DepartmentDTO departmentDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    private String getUrl(long id) {
        return DepartmentController.BASE_URL + "/" + id;
    }

}
