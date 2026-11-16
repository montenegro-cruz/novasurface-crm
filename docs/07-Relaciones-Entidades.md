# Relaciones entre Entidades

## Seguridad

User N:M Role

Role N:M Permission

User 1:N AuditLog

---

## Comercial

Lead 1:N Activity

Lead 1:N Visit

Customer 1:N Contact

Customer 1:N Activity

Customer 1:N Project

Customer 1:N Quote

---

## Presupuestos

Quote 1:N QuoteLine

Quote 1:N QuoteVersion

Customer 1:N Quote

---

## Operaciones

Project 1:N WorkOrder

Project 1:N ProjectAssignment

Project 1:N Evidence

User 1:N ProjectAssignment

---

## Evidencias

Evidence 1:N Photo

Evidence 1:N Video

Evidence 1:N TechnicalReport

Project 1:N Evidence

---

## Facturación

Customer 1:N Invoice

Invoice 1:N InvoiceLine

Invoice 1:N Payment

Project 1:N Invoice

---

## Catálogo

Category 1:N Service

Sector 1:N Service

QuoteLine N:1 Service

---

## Flujo Principal del Negocio

Lead
↓
Customer
↓
Quote
↓
Project
↓
Invoice
↓
Payment