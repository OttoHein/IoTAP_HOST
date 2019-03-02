package iotap.host.host.AppFiles.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer _id;
    private String _firstName;
    private String _lastName;
    private String _chipId;
    private int _totalCredits;


    public Employee(String firstName, String lastName, String chipId, int totalCredits) {
        _firstName = firstName;
        _lastName = lastName;
        _chipId = chipId;
        _totalCredits = totalCredits;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public String get_chipId() {
        return _chipId;
    }

    public void set_chipId(String _chipId) {
        this._chipId = _chipId;
    }

    public int get_totalCredits() {
        return _totalCredits;
    }

    public void set_totalCredits(int _totalCredits) {
        this._totalCredits = _totalCredits;
    }
}
