package iotap.host.host.AppFiles.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Employer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer _id;
    private String _firstName;
    private String _lastName;
    private Date _birthDate;
    private String _nationalRegisteryNumber;
    private String _eMail;
    private String _password;
    private int _totalCredits;

    public Employer(String firstName, String lastName, Date birthDate, String nationalRegisteryNumber, String eMail, String password, int totalCredits) {
        _firstName = firstName;
        _lastName = lastName;
        _birthDate = birthDate;
        _nationalRegisteryNumber = nationalRegisteryNumber;
        _eMail = eMail;
        _password = password;
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

    public Date get_birthDate() {
        return _birthDate;
    }

    public void set_birthDate(Date _birthDate) {
        this._birthDate = _birthDate;
    }

    public String get_nationalRegisteryNumber() {
        return _nationalRegisteryNumber;
    }

    public void set_nationalRegisteryNumber(String _nationalRegisteryNumber) {
        this._nationalRegisteryNumber = _nationalRegisteryNumber;
    }

    public String get_eMail() {
        return _eMail;
    }

    public void set_eMail(String _eMail) {
        this._eMail = _eMail;
    }

    public String get_password() {
        return _password;
    }

    public void set_password(String _password) {
        this._password = _password;
    }

    public int get_totalCredits() {
        return _totalCredits;
    }

    public void set_totalCredits(int _totalCredits) {
        this._totalCredits = _totalCredits;
    }
}
