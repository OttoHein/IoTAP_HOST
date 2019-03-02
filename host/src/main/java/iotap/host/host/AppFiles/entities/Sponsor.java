package iotap.host.host.AppFiles.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sponsor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer _id;
    private String _name;
    private String _kboNumber;
    private String _logoLocation;
}
