package iotap.host.host.AppFiles.entities;

import javax.persistence.*;

@Entity
@Table(name="sponsor")
public class Sponsor {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer _id;

    @Column(name = "name")
    private String name;

    @Column(name = "kbo_number")
    private String kboNumber;

    @Column(name = "logo_location")
    private String logoLocation;
}
