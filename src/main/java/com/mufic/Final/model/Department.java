package com.mufic.Final.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Builder
@Entity
@Table(name = "department")
public class Department extends BaseEntity{

//    @Builder
/*    public Department(Long id,String nameEnglish, String nameArabic, String code, int graduationProjectHours,
                      int graduationHours, int minTerms, int maxDegreeOnFail, Set<StudentInfo> studentInfos) {
        super(id);
        this.nameEnglish = nameEnglish;
        this.nameArabic = nameArabic;
        this.code = code;
        this.graduationProjectHours = graduationProjectHours;
        this.graduationHours = graduationHours;
        this.minTerms = minTerms;
        this.maxDegreeOnFail = maxDegreeOnFail;
        this.studentInfos = studentInfos;
    }*/

    @Column(name = "name_English")
    private String nameEnglish;

    @Column(name="name_Arabic")
    private String nameArabic;

    @Column(name = "code")
    private String code;

    @Column(name = "Graduation_Project_hours")
    private int graduationProjectHours;

    @Column(name = "Graduation_hours")
    private int graduationHours;

    @Column(name = "min_terms")
    private int minTerms;

    @Column(name = "max_degree_on_fail")
    private int maxDegreeOnFail;

    @OneToMany(mappedBy = "department")
    List<Student> students;

    @ManyToMany(mappedBy = "departments")
    List<Course> courses;

//    public static void main(String[] args) {
//        Department department=Department.builder().code("cs").graduationHours(15).graduationProjectHours(15).minTerms(65).nameArabic("علوم حاسب").courses(new HashSet<>()).build();
//        department.setId(15l);
//        System.out.print(department);
//    }


}
