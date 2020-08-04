package com.mufic.Final.model;


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
@Table(name = "states")
public class State extends BaseEntity{

//    @Builder
/*    public State(Long id, String name, Country country, String countryCode, String fipsCode, String ios2,
                 Date createdAt, Date updatedAt, boolean flag, String wikiDataId, Set<City> cities) {
        super(id);
        this.name = name;
        this.country = country;
        this.countryCode = countryCode;
        this.fipsCode = fipsCode;
        this.ios2 = ios2;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.flag = flag;
        this.wikiDataId = wikiDataId;
        this.cities = cities;
    }*/

    @Column(name = "name")
    String name;

    @ManyToOne
    @JoinColumn(name = "country_id")
    Country country;

    @Column(name = "country_code")
    String countryCode;

    @Column(name = "fips_code")
    String fipsCode;

    @Column(name = "iso2")
    String iso2;

    @CreationTimestamp
    @Column(name = "created_at")
    Date createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    Date updatedAt;

    @Column(name = "flag")
    boolean flag;

    @Column(name = "wikidataid")
    String wikiDataId;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "country")
    List<City> cities;


}
