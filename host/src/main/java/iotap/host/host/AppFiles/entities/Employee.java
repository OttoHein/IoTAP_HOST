package iotap.host.host.AppFiles.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "first_name")
    private String firstName;

    public String getFirstName() {
        return firstName;
    }

    @Column(name = "last_name")
    private String lastName;

    public String getLastName() {
        return lastName;
    }

    public int getTotalCredits() {
        return totalCredits;
    }

    @Column(name = "total_credits")
    private int totalCredits;

    @Column(name = "card_chip")
    private String cardChip;
    @OneToMany
    private List<Task> tasks;

    public Employee() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setTotalCredits(int totalCredits) {
        this.totalCredits = totalCredits;
    }

    public String getCardChip() {
        return cardChip;
    }

    public void setCardChip(String cardChip) {
        this.cardChip = cardChip;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
}
