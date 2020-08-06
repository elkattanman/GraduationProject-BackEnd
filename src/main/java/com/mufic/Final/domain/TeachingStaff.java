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
//@ToString
@Builder
@Entity
@Table(name="Teaching_staff")
public class TeachingStaff extends BaseEntity{

//    @Builder
/*    public TeachingStaff(Long id,String nameEnglish, String nameArabic, byte[] img, String nationality, Gender gender,
                         String religion, Date DOB, String nationalId, String email, String phdDegree, User user,
                         City city, Date createTime, Date updateTime) {
        super(id);
        this.nameEnglish = nameEnglish;
        this.nameArabic = nameArabic;
        this.img = img;
        this.nationality = nationality;
        this.gender = gender;
        this.religion = religion;
        this.DOB = DOB;
        this.nationalId = nationalId;
        this.email = email;
        this.phdDegree = phdDegree;
        this.user = user;
        this.city = city;
        this.createTime = createTime;
        this.updateTime = updateTime;
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

    @Column(name = "email")
    String email;

    @Column(name = "PHD_degree")
    String phdDegree;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "users_id")
    User user;


    @ManyToOne
    @JoinColumn(name = "city_id")
    City city;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "instructor")
    List<CourseInTerm> courseInTermList;

    @OneToMany(mappedBy = "teachingStaff")
    List<Labs> labs;

    @OneToMany(mappedBy ="guide")
    List<Student> students;

}