package iotap.host.host.AppFiles.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "id")
    private String id;

    public String getFirstName() {
        return firstName;
    }

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "total_credits")
    private int totalCredits;

    @OneToMany
    private List<Task> tasks;
}
