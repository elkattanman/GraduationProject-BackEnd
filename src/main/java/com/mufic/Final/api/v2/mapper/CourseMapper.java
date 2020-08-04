package com.mufic.Final.api.v2.mapper;

import com.mufic.Final.api.v2.model.CourseDTO;
import com.mufic.Final.domain.Course;
import com.mufic.Final.domain.Department;
import com.mufic.Final.repositories.DepartmentRepository;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public abstract class CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    @Autowired
    DepartmentRepository departmentRepository;

    @Mapping(source = "program.id", target = "program")
    @Mapping(source = "preCourse.code", target = "preCourse")
    public abstract CourseDTO courseToCourseDTO(Course course);

    @Mapping(target = "program.id", source = "program")
    @Mapping(target = "preCourse.code", source = "preCourse")
    public abstract Course CourseDtoTocourse(CourseDTO course);

    @IterableMapping(elementTargetType = String.class)
    protected abstract List<String> mapDepartmentToList(List<Department> obj);

    protected String mapDepartmentToString(Department obj) {
        return obj.getCode();
    }

    @IterableMapping(elementTargetType = Department.class)
    protected abstract List<Department> mapStringToDepartments(List<String> obj);

    protected Department mapStringToDepartment(String code) {
        return departmentRepository.findByCode(code).get();
    }


}
