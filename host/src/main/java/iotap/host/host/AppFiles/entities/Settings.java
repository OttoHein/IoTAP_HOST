package iotap.host.host.AppFiles.entities;

import javax.persistence.*;

@Entity
@Table(name="settings")
public final class Settings {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private static int maxCreditsPerYear;

    private Settings(int maxCreditsPerYear) {
        this.maxCreditsPerYear = maxCreditsPerYear;
    }


    public static int getMaxCreditsPerYear() {
        return maxCreditsPerYear;
    }

    public static void set_maxCreditsPerYear(int maxCreditsPerYear) {
        Settings.maxCreditsPerYear = maxCreditsPerYear;
    }
}
