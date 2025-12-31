package com.ldr.incident;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class IncidentController {

    private final IncidentService incidentService;

    public IncidentController(IncidentService incidentService) {
        this.incidentService = incidentService;
    }

    @PostMapping("/incidents")
    @ResponseStatus(HttpStatus.CREATED)
    public Incident createIncident(@RequestBody CreateIncidentRequest request) {
        return incidentService.createIncident(request);
    }

    @GetMapping("/incidents")
    public List<Incident> listIncidents() {
        return incidentService.getAllIncidents();
    }

    @PostMapping("/incidents/reset")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void resetIncidents() {
        incidentService.clearAll();
    }
}
