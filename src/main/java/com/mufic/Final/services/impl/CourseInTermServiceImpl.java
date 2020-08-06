package com.mufic.Final.services.impl;

import com.mufic.Final.api.v2.mapper.CourseInTermMapper;
import com.mufic.Final.api.v2.model.CourseInTermDTO;
import com.mufic.Final.api.v2.model.lists.CourseInTermListDTO;
import com.mufic.Final.controllers.v2.CityController;
import com.mufic.Final.controllers.v2.CourseInTermController;
import com.mufic.Final.repositories.CourseInTermRepository;
import com.mufic.Final.services.CourseInTermService;
import com.mufic.Final.services.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class  CourseInTermServiceImpl implements CourseInTermService {

    private final CourseInTermMapper courseInTermMapper;
    private final CourseInTermRepository courseInTermRepository;

    public CourseInTermServiceImpl(CourseInTermMapper courseInTermMapper, CourseInTermRepository courseInTermRepository) {
        this.courseInTermMapper = courseInTermMapper;
        this.courseInTermRepository = courseInTermRepository;
    }


    @Override
    public CourseInTermDTO getById(Long id) {
        return courseInTermRepository.findById(id)
                .map(courseInTermMapper::courseInTermToCourseInTermDTO)
                .map(courseInTermDTO -> {
                    courseInTermDTO.setCourseInTermUrl(getUrl(id));
                    return courseInTermDTO;
                }).orElseThrow(ResourceNotFoundException::new);
    }

    @Override
    public CourseInTermListDTO getAll() {
        return new CourseInTermListDTO(
                courseInTermRepository.findAll()
                .stream()
                .map(courseInTermMapper::courseInTermToCourseInTermDTO)
                .map(courseInTermDTO -> {
                    courseInTermDTO.setCourseInTermUrl(getUrl(courseInTermDTO.getId()));
                    return courseInTermDTO;
                })
                .collect(Collectors.toList())
        );
    }

    @Override
    public CourseInTermDTO createNew(CourseInTermDTO courseInTermDTO) {
        return null;
    }

    @Override
    public CourseInTermDTO saveByDTO(Long id, CourseInTermDTO courseInTermDTO) {
        return null;
    }

    @Override
    public CourseInTermDTO patch(Long id, CourseInTermDTO courseInTermDTO) {
        return null;
    }

    @Override
    public void deleteById(Long id) {

    }

    private String getUrl(long id) {
        return CourseInTermController.BASE_URL + "/" + id;
    }

}
