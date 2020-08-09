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
@Table(name = "Term")
public class Term extends BaseEntity {


    @Column(name = "name_english")
    private String nameEnglish;

    @Column(name = "name_arabic")
    private String nameArabic;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "Term_type")
    private TermType termType;

    @Column(name = "start_at")
    @Temporal(TemporalType.DATE)
    private Date start;

    @Column(name = "end_at")
    @Temporal(TemporalType.DATE)
    private Date end;

    @Column(name = "start_registration")
    @Temporal(TemporalType.DATE)
    private Date startRegistration;

    @Column(name = "end_registration")
    @Temporal(TemporalType.DATE)
    private Date endRegistration;

    @Column(name = "start_updating")
    @Temporal(TemporalType.DATE)
    private Date startUpdating;

    @Column(name = "end_updating")
    @Temporal(TemporalType.DATE)
    private Date endUpdating;

    @Column(name = "start_withdrawn")
    @Temporal(TemporalType.DATE)
    private Date startWithdrawn;

    @Column(name = "end_withdrawn")
    @Temporal(TemporalType.DATE)
    private Date endWithdrawn;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @OneToMany(mappedBy = "term")
    List<CourseInTerm> courseInTermList;

    @OneToMany(mappedBy = "term")
    List<Transaction> transactions;

    @ManyToMany(mappedBy = "terms")
    List<Student> students;
    

}
