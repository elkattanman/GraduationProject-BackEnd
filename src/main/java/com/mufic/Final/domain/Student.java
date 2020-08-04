package com.mufic.Final.domain;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.jpa.domain.AbstractPersistable;

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
@Table(name = "Student")
public class Student extends AbstractPersistable<Long> {

//    @Builder
/*    public Student(String nameEnglish, String nameArabic, String nationality, Gender gender, String religion, Date DOB,
                   String nationalId, String guardianName, String GuardianJob, String email, String secSchool,
                   String preQualfication, Date QuilificationYear, double degrees, StudentInfo studentInfo,
                   Date createTime, Set<StudentHasCourseInTerm> studentHasCourseInTerms, Set<Transaction> transactions,
                   Set<Term> terms) {
        this.nameEnglish = nameEnglish;
        this.nameArabic = nameArabic;
        this.nationality = nationality;
        this.gender = gender;
        this.religion = religion;
        this.DOB = DOB;
        this.nationalId = nationalId;
        this.guardianName = guardianName;
        this.GuardianJob = GuardianJob;
        this.email = email;
        this.secSchool = secSchool;
        this.preQualfication = preQualfication;
        this.QuilificationYear = QuilificationYear;
        this.degrees = degrees;
        this.studentInfo = studentInfo;
        this.createTime = createTime;
        this.studentHasCourseInTerms = studentHasCourseInTerms;
        this.transactions = transactions;
        this.terms = terms;
    }*/

    @Column(name = "name_english")
    private String nameEnglish;

    @Column(name = "name_arabic")
    private String nameArabic;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @Column(name = "nationality")
    String nationality;

    @Column(name = "gender")
    @Enumerated(value = EnumType.ORDINAL)
    Gender gender;

    @Column(name = "Religion")
    String religion;

    @Column(name = "DOB")
    @Temporal(TemporalType.DATE)
    Date DOB;

    @Column(name = "national_id")
    String nationalId;

    @Column(name = "Guardian_name")
    String guardianName;

    @Column(name = "Guardian_job")
    String GuardianJob;

    @Column(name = "email")
    String email;

    @Column(name = "sec_school")
    String secSchool;

    @Column(name = "pre_qualfication")
    String preQualfication;

    @Column(name = "quilification_year")
    @Temporal(TemporalType.DATE)
    Date QuilificationYear;

    @Column(name="degrees")
    double degrees;

    @ManyToOne
    @JoinColumn(name="guide_id")
    TeachingStaff guide;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    User user;

    @ManyToOne
    @JoinColumn(name = "department_id")
    Department department;

    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @OneToOne
    @JoinColumn(name = "student_info_id")
    StudentInfo studentInfo;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;


    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "student")
    List<StudentHasCourseInTerm> studentHasCourseInTerms;

    @OneToMany(mappedBy = "student")
    List<Transaction> transactions;



    @ManyToMany(cascade = CascadeType.ALL)
            @JoinTable(name = "Student_in_Term",
                    joinColumns = @JoinColumn(name = "student_id"),
                    inverseJoinColumns = @JoinColumn(name = "term_id")
            )
    List<Term> terms;



}
