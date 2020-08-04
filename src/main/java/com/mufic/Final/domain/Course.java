package com.mufic.Final.domain;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Builder
@Entity
@Table(name="course")
public class Course{

    @Id
    String code;

    @Column(name = "name_english")
    private String nameEnglish;

    @Column(name = "name_arabic")
    private String nameArabic;

    @Column(name = "hours")
    private int hours;

    @Column(name = "lec_hours")
    private int lecHours;

    @Column(name = "lab_hours")
    private int LabHours;

    @Lob
    @Column(name = "desc")
    private String description;

    @ManyToOne
    @JoinColumn(name = "programs_id")
    Program program;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "pre_course")
    Course preCourse;

    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL,
            mappedBy = "preCourse")
    List<Course> childern;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "course")
    List<CourseInTerm> courseInTermList;

    @ManyToMany
    @JoinTable(name = "course_has_department",
            joinColumns = @JoinColumn(name = "course_code"),
            inverseJoinColumns = @JoinColumn(name = "department_id")
    )
    List<Department> departments;


    public String getParCourse(){
        if(preCourse!=null)
            return preCourse.getCode();
        return "-";
//        return "Hello";
    }

}
