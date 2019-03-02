package iotap.host.host.AppFiles.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TaskDetail {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer _id;
    private String _name;
    private String _location;
    private String _description;
    private Date _startTime;
    private Date _endTime;
    private boolean _isTaken;
    private boolean _isCompleted;
    private int _credits;
    private Employee _employee;
    private Employer _employer;


    public TaskDetail(String name, String location, String description, Date startTime, Date endTime, boolean isTaken, boolean isCompleted, int credits, Employer employer) {
        _name = name;
        _location = location;
        _description = description;
        _startTime = startTime;
        _endTime = endTime;
        _isTaken = isTaken;
        _isCompleted = isCompleted;
        _credits = credits;
        _employer = employer;
    }

    public Integer get_id() {
        return _id;
    }

    public void set_id(Integer _id) {
        this._id = _id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_location() {
        return _location;
    }

    public void set_location(String _location) {
        this._location = _location;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String _description) {
        this._description = _description;
    }

    public Date get_startTime() {
        return _startTime;
    }

    public void set_startTime(Date _startTime) {
        this._startTime = _startTime;
    }

    public Date get_endTime() {
        return _endTime;
    }

    public void set_endTime(Date _endTime) {
        this._endTime = _endTime;
    }

    public boolean is_isTaken() {
        return _isTaken;
    }

    public void set_isTaken(boolean _isTaken) {
        this._isTaken = _isTaken;
    }

    public boolean is_isCompleted() {
        return _isCompleted;
    }

    public void set_isCompleted(boolean _isCompleted) {
        this._isCompleted = _isCompleted;
    }

    public int get_credits() {
        return _credits;
    }

    public void set_credits(int _credits) {
        this._credits = _credits;
    }

    public Employee get_employee() {
        return _employee;
    }

    public void set_employee(Employee _employee) {
        this._employee = _employee;
    }

    public Employer get_employer() {
        return _employer;
    }

    public void set_employer(Employer _employer) {
        this._employer = _employer;
    }
}
