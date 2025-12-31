package com.ldr.incident;

import java.time.Instant;

public class Incident {

    private Long id;
    private String vin;
    private String source;      // Ej: "PDI", "Campo", "Producción"
    private String area;        // Ej: "PDI Exterior", "Chasis"
    private String description;
    private IncidentStatus status;
    private Instant createdAt;

    public Incident() {
    }

    public Incident(Long id,
                    String vin,
                    String source,
                    String area,
                    String description,
                    IncidentStatus status,
                    Instant createdAt) {
        this.id = id;
        this.vin = vin;
        this.source = source;
        this.area = area;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
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

    public IncidentStatus getStatus() {
        return status;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setId(Long id) {
        this.id = id;
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

    public void setStatus(IncidentStatus status) {
        this.status = status;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }
}
