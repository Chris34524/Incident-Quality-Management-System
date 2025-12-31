package com.ldr.incident;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class IncidentService {

    private final List<Incident> incidents = new ArrayList<>();
    private long nextId = 1L;

    public Incident createIncident(CreateIncidentRequest request) {
        Incident incident = new Incident(
                nextId++,
                request.getVin(),
                request.getSource(),
                request.getArea(),
                request.getDescription(),
                IncidentStatus.OPEN,
                Instant.now()
        );
        incidents.add(incident);
        return incident;
    }

    public List<Incident> getAllIncidents() {
        return Collections.unmodifiableList(incidents);
    }

    public void clearAll() {
        incidents.clear();
        nextId = 1L;
    }
}
