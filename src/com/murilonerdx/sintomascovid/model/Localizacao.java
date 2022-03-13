package com.murilonerdx.sintomascovid.model;

import java.time.LocalDateTime;

public class Localizacao {
    private String longitude;
    private String latitude;

    private LocalDateTime data;

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }
}
