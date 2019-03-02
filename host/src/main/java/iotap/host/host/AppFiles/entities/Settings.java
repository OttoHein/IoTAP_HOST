package iotap.host.host.AppFiles.entities;

import javax.persistence.Entity;

@Entity
public final class Settings {
    private static int _maxCreditsPerYear;

    private Settings(int maxCreditsPerYear) {
        _maxCreditsPerYear = maxCreditsPerYear;
    }


    public static int get_maxCreditsPerYear() {
        return _maxCreditsPerYear;
    }

    public static void set_maxCreditsPerYear(int _maxCreditsPerYear) {
        Settings._maxCreditsPerYear = _maxCreditsPerYear;
    }
}
