package com.auth.loginsuperseguro.UserClass;

import jakarta.persistence.*;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import java.util.Date;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
@Getter
@Entity
@Table(name = "users")
public class UserClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "date_registry")
    @CreatedDate
    private Date date;

    public UserClass() {

    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserClass(Long id, String userName, Date date) {
        this.id = id;
        this.userName = userName;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", userName=" + userName + ", date=" + date + "]";
    }
}
