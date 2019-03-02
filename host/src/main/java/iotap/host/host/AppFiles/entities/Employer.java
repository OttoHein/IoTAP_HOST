package iotap.host.host.AppFiles.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="employer")
public class Employer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "birthdate")
    private Date birthDate;

    @Column(name = "national_registery_number")
    private String nationalRegisteryNumber;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "password")
    private String password;

    @Column(name = "total_credits")
    private int totalCredits;

    @OneToMany
    private List<Task> tasks;

}
