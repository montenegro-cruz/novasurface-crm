# Diseño de API REST

## Convenciones Generales

### Base URL

/api/v1

### Formato

JSON

### Autenticación

JWT Bearer Token

Ejemplo:

Authorization: Bearer <token>

---

# AUTH

## Login

POST /api/v1/auth/login

## Refresh Token

POST /api/v1/auth/refresh

## Logout

POST /api/v1/auth/logout

## Current User

GET /api/v1/auth/me

---

# USERS

## Obtener usuarios

GET /api/v1/users

## Obtener usuario por id

GET /api/v1/users/{id}

## Crear usuario

POST /api/v1/users

## Actualizar usuario

PUT /api/v1/users/{id}

## Eliminar usuario

DELETE /api/v1/users/{id}

---

# LEADS

## Listar leads

GET /api/v1/leads

## Obtener lead

GET /api/v1/leads/{id}

## Crear lead

POST /api/v1/leads

## Actualizar lead

PUT /api/v1/leads/{id}

## Eliminar lead

DELETE /api/v1/leads/{id}

## Convertir lead en cliente

POST /api/v1/leads/{id}/convert

---

# CUSTOMERS

## Listar clientes

GET /api/v1/customers

## Obtener cliente

GET /api/v1/customers/{id}

## Crear cliente

POST /api/v1/customers

## Actualizar cliente

PUT /api/v1/customers/{id}

## Eliminar cliente

DELETE /api/v1/customers/{id}

---

# CONTACTS

## Listar contactos

GET /api/v1/contacts

## Obtener contacto

GET /api/v1/contacts/{id}

## Crear contacto

POST /api/v1/contacts

## Actualizar contacto

PUT /api/v1/contacts/{id}

## Eliminar contacto

DELETE /api/v1/contacts/{id}

---

# QUOTES

## Listar presupuestos

GET /api/v1/quotes

## Obtener presupuesto

GET /api/v1/quotes/{id}

## Crear presupuesto

POST /api/v1/quotes

## Actualizar presupuesto

PUT /api/v1/quotes/{id}

## Enviar presupuesto

POST /api/v1/quotes/{id}/send

## Aprobar presupuesto

POST /api/v1/quotes/{id}/approve

## Rechazar presupuesto

POST /api/v1/quotes/{id}/reject

## Generar PDF

GET /api/v1/quotes/{id}/pdf

---

# PROJECTS

## Listar proyectos

GET /api/v1/projects

## Obtener proyecto

GET /api/v1/projects/{id}

## Crear proyecto

POST /api/v1/projects

## Actualizar proyecto

PUT /api/v1/projects/{id}

## Cerrar proyecto

POST /api/v1/projects/{id}/close

---

# EVIDENCES

## Listar evidencias

GET /api/v1/evidences

## Obtener evidencia

GET /api/v1/evidences/{id}

## Crear evidencia

POST /api/v1/evidences

## Subir fotografía

POST /api/v1/evidences/{id}/photos

## Subir vídeo

POST /api/v1/evidences/{id}/videos

## Generar informe técnico

POST /api/v1/evidences/{id}/report

---

# INVOICES

## Listar facturas

GET /api/v1/invoices

## Obtener factura

GET /api/v1/invoices/{id}

## Crear factura

POST /api/v1/invoices

## Generar PDF

GET /api/v1/invoices/{id}/pdf

## Marcar como pagada

POST /api/v1/invoices/{id}/paid

---

# PAYMENTS

## Listar pagos

GET /api/v1/payments

## Obtener pago

GET /api/v1/payments/{id}

## Registrar pago

POST /api/v1/payments

---

# SERVICES

## Listar servicios

GET /api/v1/services

## Obtener servicio

GET /api/v1/services/{id}

## Crear servicio

POST /api/v1/services

## Actualizar servicio

PUT /api/v1/services/{id}

## Eliminar servicio

DELETE /api/v1/services/{id}

---

# DASHBOARD

## KPIs

GET /api/v1/dashboard/kpis

## Resumen comercial

GET /api/v1/dashboard/commercial

## Resumen financiero

GET /api/v1/dashboard/financial

## Resumen operativo

GET /api/v1/dashboard/operations