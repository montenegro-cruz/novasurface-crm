# Modelo de Entidades

## Seguridad

### User

Descripción:

Representa un usuario del sistema autorizado para acceder al CRM.

Atributos:

- id
- firstName
- lastName
- email
- password
- enabled
- createdAt
- updatedAt

---

### Role

Descripción:

Define un conjunto de permisos asignables a usuarios.

Atributos:

- id
- name
- description

---

### Permission

Descripción:

Permiso específico del sistema.

Atributos:

- id
- name
- description

---

## Comercial

### Lead

Descripción:

Posible cliente pendiente de conversión.

Atributos:

- id
- companyName
- contactName
- email
- phone
- sector
- status
- source
- notes
- createdAt

---

### Customer

Descripción:

Cliente activo del sistema.

Atributos:

- id
- companyName
- vatNumber
- email
- phone
- website
- address
- createdAt

---

### Contact

Descripción:

Persona de contacto asociada a un cliente.

Atributos:

- id
- firstName
- lastName
- email
- phone
- position

---

### Activity

Descripción:

Actividad comercial realizada.

Atributos:

- id
- type
- description
- activityDate
- createdBy

---

## Presupuestos

### Quote

Descripción:

Presupuesto enviado a un cliente.

Atributos:

- id
- quoteNumber
- status
- issueDate
- expirationDate
- subtotal
- taxAmount
- totalAmount

---

### QuoteLine

Descripción:

Línea de un presupuesto.

Atributos:

- id
- description
- quantity
- unitPrice
- discount
- total

---

## Operaciones

### Project

Descripción:

Trabajo contratado por un cliente.

Atributos:

- id
- projectCode
- name
- description
- startDate
- endDate
- status

---

### WorkOrder

Descripción:

Orden de trabajo asociada a un proyecto.

Atributos:

- id
- workOrderNumber
- description
- plannedDate
- status

---

## Evidencias

### Evidence

Descripción:

Evidencia asociada a un proyecto.

Atributos:

- id
- type
- description
- uploadDate

---

### Photo

Descripción:

Fotografía del proyecto.

Atributos:

- id
- filename
- path
- category
- uploadDate

---

### TechnicalReport

Descripción:

Informe técnico generado durante o al finalizar un proyecto.

Atributos:

- id
- reportNumber
- title
- generatedDate
- status

---

## Facturación

### Invoice

Descripción:

Factura emitida a un cliente.

Atributos:

- id
- invoiceNumber
- issueDate
- dueDate
- status
- subtotal
- taxAmount
- totalAmount

---

### Payment

Descripción:

Pago asociado a una factura.

Atributos:

- id
- paymentDate
- amount
- paymentMethod
- reference

---

## Catálogo

### Service

Descripción:

Servicio ofrecido por NovaSurface.

Atributos:

- id
- name
- description
- estimatedPrice
- active

---

### Sector

Descripción:

Sector de actividad del cliente.

Atributos:

- id
- name
- description
