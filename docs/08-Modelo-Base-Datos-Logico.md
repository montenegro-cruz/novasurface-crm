# Modelo Lógico de Base de Datos

## SECURITY

User
- id
- firstName
- lastName
- email
- password
- enabled
- createdAt
- updatedAt

Role
- id
- name
- description

Permission
- id
- name
- description

AuditLog
- id
- action
- entityName
- entityId
- createdAt

---

## COMMERCIAL

Lead
- id
- companyName
- contactName
- email
- phone
- sector
- status
- source
- notes

Customer
- id
- companyName
- vatNumber
- email
- phone
- website
- address

Contact
- id
- firstName
- lastName
- email
- phone
- position

Activity
- id
- type
- description
- activityDate

Visit
- id
- visitDate
- description
- result

---

## QUOTES

Quote
- id
- quoteNumber
- issueDate
- expirationDate
- status
- subtotal
- taxAmount
- totalAmount

QuoteLine
- id
- description
- quantity
- unitPrice
- discount
- total

QuoteVersion
- id
- versionNumber
- createdAt

---

## OPERATIONS

Project
- id
- projectCode
- name
- description
- startDate
- endDate
- status

ProjectAssignment
- id
- assignedDate

WorkOrder
- id
- workOrderNumber
- description
- status

---

## EVIDENCE

Evidence
- id
- type
- description

Photo
- id
- filename
- path
- category

Video
- id
- filename
- path

TechnicalReport
- id
- reportNumber
- title

---

## BILLING

Invoice
- id
- invoiceNumber
- issueDate
- dueDate
- status
- subtotal
- taxAmount
- totalAmount

InvoiceLine
- id
- description
- quantity
- unitPrice
- total

Payment
- id
- paymentDate
- amount
- paymentMethod
- reference

---

## CATALOG

Category
- id
- name

Sector
- id
- name

Service
- id
- name
- description
- estimatedPrice
- active