package com.mufic.Final.repositories;

import com.mufic.Final.model.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

@CrossOrigin(origins = "*", maxAge = 3600)
public interface CourseRepository extends JpaRepository<Course, String> {


//    Page<Course> findByNameArabicContainingOrNameEnglishContaining(@RequestParam("code") String code,
//                                                               @RequestParam("NameArabic") String nameArabic,
//                                                               @RequestParam("NameEnglish") String nameEnglish,
//                                                               Pageable pageable);


    Page<Course> findAllByCodeContainingOrNameEnglishContainingOrNameArabicContaining(@RequestParam("code") String code,
                                                                                      @RequestParam("NameEnglish") String nameEnglish,
                                                                                      @RequestParam("NameArabic") String nameArabic,
                                                                                      Pageable pageable);
}
