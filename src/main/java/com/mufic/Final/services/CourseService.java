package com.mufic.Final.services;

import com.mufic.Final.api.v2.model.CourseDTO;
import com.mufic.Final.api.v2.model.lists.CourseListDTO;

public interface CourseService {
    CourseDTO getById(String code);

    CourseListDTO getAll();

    CourseDTO createNew(CourseDTO courseDTO);

    CourseDTO saveByDTO(String code, CourseDTO courseDTO);

    CourseDTO patch(Long id, CourseDTO courseDTO);

    void deleteById(Long id);

}
