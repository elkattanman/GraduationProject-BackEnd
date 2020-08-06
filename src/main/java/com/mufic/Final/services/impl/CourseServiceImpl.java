package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.CourseMapper;
import com.mufic.Final.api.v2.model.CourseDTO;
import com.mufic.Final.api.v2.model.lists.CourseListDTO;
import com.mufic.Final.controllers.v2.CityController;
import com.mufic.Final.controllers.v2.CourseController;
import com.mufic.Final.repositories.CourseRepository;
import com.mufic.Final.services.CourseService;
import com.mufic.Final.services.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseMapper courseMapper;
    private final CourseRepository courseRepository;

    public CourseServiceImpl(CourseMapper courseMapper, CourseRepository courseRepository) {
        this.courseMapper = courseMapper;
        this.courseRepository = courseRepository;
    }

    @Override
    public CourseDTO getById(String code) {
        return courseRepository.findById(code)
                .map(courseMapper::courseToCourseDTO)
                .map(courseDTO -> {
                    courseDTO.setCourseUrl(getUrl(code));
                    return courseDTO;
                }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public CourseListDTO getAll() {
        return new CourseListDTO(
                courseRepository.findAll()
                    .stream()
                    .map(courseMapper::courseToCourseDTO)
                    .map(courseDTO -> {
                        courseDTO.setCourseUrl(getUrl(courseDTO.getCode()));
                        return courseDTO;
                    }).collect(Collectors.toList())
        );
    }

    @Override
    public CourseDTO createNew(CourseDTO courseDTO) {
        return null;
    }

    @Override
    public CourseDTO saveByDTO(String code, CourseDTO courseDTO) {
        return null;
    }

    @Override
    public CourseDTO patch(Long id, CourseDTO courseDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    private String getUrl(String code) {
        return CourseController.BASE_URL + "/" + code;
    }

}
