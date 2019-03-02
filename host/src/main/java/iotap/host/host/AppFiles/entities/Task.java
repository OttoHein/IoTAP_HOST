package iotap.host.host.AppFiles.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "location")
    private String location;

    @Column(name = "description")
    private String description;

    @Column(name = "start_time")
    private Date startTime;

    @Column(name = "end_time")
    private Date endTime;

    @Column(name = "is_taken")
    private boolean isTaken;

    @Column(name = "is_completed")
    private boolean isCompleted;

    @Column(name = "credits")
    private int credits;

    @ManyToOne
    private Employee employee;

    @ManyToOne
    private Employer employer;

    public Task(Integer id, String name, String location, String description, Date startTime, Date endTime, boolean isTaken, boolean isCompleted, int credits) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isTaken = isTaken;
        this.isCompleted = isCompleted;
        this.credits = credits;
    }

    public Task(String name, String location, String description, Date startTime, Date endTime, boolean isTaken, boolean isCompleted, int credits) {
        this.name = name;
        this.location = location;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.isTaken = isTaken;
        this.isCompleted = isCompleted;
        this.credits = credits;
    }
}
