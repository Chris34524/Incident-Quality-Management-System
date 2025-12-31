# Incident & Quality Management System

## Descripción

Servicio backend para gestionar incidentes de calidad (PDI, campo, producción, etc.)
y dejar la base para flujos tipo 8D / A3, integrados con datos de producción y
vehículos (VIN).

## Estado actual (MVP técnico end-to-end)

Backend Spring Boot (`backend/incident-backend`) con:

- `GET /health`
  - Verifica que el servicio está vivo.

- `POST /incidents`
  - Crea un incidente en memoria.
  - Campos:
    - `vin`: VIN del vehículo.
    - `source`: origen del hallazgo (PDI, Campo, Producción, Cliente, etc.).
    - `area`: área o zona relacionada (PDI Exterior, Chasis, Interior, Documentación, etc.).
    - `description`: descripción libre del problema.
  - El sistema asigna:
    - `id` (incremental),
    - `status` (`OPEN` por defecto),
    - `createdAt` (timestamp).

- `GET /incidents`
  - Lista todos los incidentes creados en esta sesión (almacenados en memoria).

- `POST /incidents/reset`
  - Limpia la lista de incidentes (sólo para pruebas en este MVP).

Ejemplo de incidente:

```json
{
  "id": 1,
  "vin": "LDRTEST1234567890",
  "source": "PDI",
  "area": "PDI Exterior",
  "description": "Daño en defensa delantera",
  "status": "OPEN",
  "createdAt": "2025-12-30T20:15:32.123Z"
}
