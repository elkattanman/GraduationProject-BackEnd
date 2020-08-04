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
@Table(name = "cities")
public class City extends BaseEntity{

//    @Builder
/*    public City(Long id, String name, State state, String stateCode, Country country, String countryCode,
                double latitude, double longitude, Date createdAt, Date updatedAt, boolean flag, String wikiDataId,
                Set<TeachingStaff> teachingStaffs, Set<StudentInfo> studentInfos) {
        super(id);
        this.name = name;
        this.state = state;
        this.stateCode = stateCode;
        this.country = country;
        this.countryCode = countryCode;
        this.latitude = latitude;
        this.longitude = longitude;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.flag = flag;
        this.wikiDataId = wikiDataId;
        this.teachingStaffs = teachingStaffs;
        this.studentInfos = studentInfos;
    }*/

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "state_id")
    State state;

    @Column(name = "state_code")
    String stateCode;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    @Column(name = "country_code")
    String countryCode;

    @Column(name = "latitude")
    double latitude;

    @Column(name = "longitude")
    double longitude;

    @CreationTimestamp
    @Column(name = "created_at")
    Date createdAt;

    @UpdateTimestamp
    @Column(name = "UPDATED_ON")
    Date updatedOn;

    @Column(name = "flag")
    boolean flag;

    @Column(name = "wikidataid")
    String wikiDataId;

    @OneToMany(mappedBy = "city")
    List<TeachingStaff> teachingStaffs;

    @OneToMany(mappedBy = "city")
    List<Student> studentInfos;


}
