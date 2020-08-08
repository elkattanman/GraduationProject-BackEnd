package com.mufic.Final.domain;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@ToString
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity{

//    @Builder
/*    public User(Long id, String name, String username, String email, String password, Date createTime, Date updateTime,
                Set<Role> roles, TeachingStaff teachingStaff, StudentInfo studentInfo) {
        super(id);
        this.name = name;
        this.username = username;
        this.email = email;
        this.password = password;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.roles = roles;
        this.teachingStaff = teachingStaff;
        this.studentInfo = studentInfo;
    }*/
    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "img")
    private byte[] img;

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "enabled")
    boolean enabled;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "users_has_roles",
        joinColumns = @JoinColumn(name="users_id"),
        inverseJoinColumns = @JoinColumn(name="roles_id"))
    private Set<Role> roles;

    @OneToOne(mappedBy = "user")
    TeachingStaff teachingStaff;

    @OneToOne(mappedBy = "user")
    Student student;


}
