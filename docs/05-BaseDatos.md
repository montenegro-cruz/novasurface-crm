# Modelo Conceptual de Datos

## Seguridad

User
│
├── Role
│
└── AuditLog

---

## Comercial

Lead
│
├── Contact
├── Activity
└── Visit

Customer
│
├── Contact
├── Activity
└── Project

---

## Presupuestos

Quote
│
├── QuoteLine
└── QuoteVersion

Quote
│
└── Customer

---

## Operaciones

Project
│
├── WorkOrder
├── ProjectAssignment
└── Evidence

---

## Evidencias

Evidence
│
├── Photo
├── Video
└── TechnicalReport

---

## Facturación

Invoice
│
├── InvoiceLine
└── Payment

Invoice
│
└── Customer

---

## Catálogo

Category
│
└── Service

Sector
│
└── Service

---

## Dashboard

DashboardMetric

KPI