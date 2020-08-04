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
@Table(name = "Roles")
public class Role extends BaseEntity{

//    @Builder
/*    public Role(Long id, String name, String discription, Date createTime, Date updateTime, Set<User> users,
                Set<Privilege> privileges) {
        super(id);
        this.name = name;
        this.discription = discription;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.users = users;
        this.privileges = privileges;
    }*/
    @Column(name = "name")
    @Enumerated(value = EnumType.STRING)
    private ERole name;

    @Column(name = "description")
    private String description;

    @CreationTimestamp
    @Column(name = "create_time")
    private Date createTime;

    @UpdateTimestamp
    @Column(name = "update_time")
    private Date updateTime;

    @ManyToMany(mappedBy = "roles")
    private List<User> users;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "roles_has_privileges",
            joinColumns = @JoinColumn(name="roles_id"),
            inverseJoinColumns = @JoinColumn(name="Privileges_id"))
    private List<Privilege> privileges;

}
