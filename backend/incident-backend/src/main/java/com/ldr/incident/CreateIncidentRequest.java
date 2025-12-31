package com.ldr.incident;

public class CreateIncidentRequest {

    private String vin;
    private String source;
    private String area;
    private String description;

    public CreateIncidentRequest() {
    }

    public String getVin() {
        return vin;
    }

    public String getSource() {
        return source;
    }

    public String getArea() {
        return area;
    }

    public String getDescription() {
        return description;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
