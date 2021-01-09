package info.thecodinglive.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
public class UserEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private Integer age;
    private Date createdAt;

    @Column(name = "role")
    @Enumerated(EnumType.ORDINAL)
    private UserRole role;

    @PrePersist
    public void beforeCreate() {
        createdAt = new Date();
    }

    public UserEntity() {

    }

    public UserEntity(String userName) {
        this.userName = userName;
    }

    public UserEntity(String userName, Integer age, UserRole role) {
        this.userName = userName;
        this.age = age;
        this.role = role;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

}
