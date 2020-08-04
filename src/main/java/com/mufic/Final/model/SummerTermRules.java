package com.mufic.Final.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString(callSuper = true)
@Builder
@Entity
@Table(name = "summer_term_rules")
public class SummerTermRules {

//    @Builder
/*    public SummerTermRules(PointKey pointKey, int hourMin, int hourMax, int hourSpMin, int hourSpMax) {
        this.pointKey = pointKey;
        this.hourMin = hourMin;
        this.hourMax = hourMax;
        this.hourSpMin = hourSpMin;
        this.hourSpMax = hourSpMax;
    }*/
    @EmbeddedId
    private PointKey pointKey;

    @Column(name = "hour_min")
    private int hourMin;

    @Column(name = "hour_max")
    private int hourMax;

    @Column(name = "hour_sp_min")
    private int hourSpMin;

    @Column(name = "hour_sp_max")
    private int hourSpMax;

}
