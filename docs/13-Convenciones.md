# Convenciones y Estándares de Desarrollo

## Objetivo

Definir las normas de desarrollo del proyecto NovaSurface CRM para garantizar consistencia, mantenibilidad y calidad del código.

---

# Git

## Rama principal

main

## Rama de desarrollo

develop

## Ramas de funcionalidades

Formato:

feature/nombre-funcionalidad

Ejemplos:

feature/authentication

feature/customers

feature/leads

feature/quotes

feature/projects

feature/invoices

---

# Commits

Formato:

tipo: descripción

Ejemplos:

docs: define frontend architecture

feat: create customer endpoint

fix: resolve jwt validation issue

refactor: simplify quote service

test: add invoice service tests

---

# Tipos de Commit

docs
feat
fix
refactor
test
style
chore

---

# Backend

## Java

Versión:

Java 21

---

## Convenciones de nombres

Clases:

PascalCase

Ejemplo:

CustomerService

InvoiceController

ProjectRepository

---

## Métodos

camelCase

Ejemplo:

createCustomer()

generateInvoicePdf()

convertLeadToCustomer()

---

## Variables

camelCase

Ejemplo:

customerName

invoiceNumber

projectStatus

---

## Paquetes

minúsculas

Ejemplo:

com.novasurface.crm.customers

com.novasurface.crm.invoices

---

# API REST

## Recursos

Plural

Ejemplos:

/customers

/projects

/invoices

---

## Versionado

/api/v1

---

## Respuestas

Formato JSON

---

# Base de Datos

## Tablas

snake_case

Plural

Ejemplos:

customers

invoices

invoice_lines

projects

---

## Columnas

snake_case

Ejemplos:

created_at

updated_at

invoice_number

customer_id

---

## Claves Primarias

Siempre:

id

Tipo:

BIGINT

---

## Claves Foráneas

Formato:

tabla_referenciada_id

Ejemplo:

customer_id

project_id

invoice_id

---

# Angular

## Componentes

PascalCase

Ejemplo:

CustomerListComponent

ProjectDetailComponent

InvoiceFormComponent

---

## Archivos

kebab-case

Ejemplo:

customer-list.component.ts

project-detail.component.ts

invoice-form.component.ts

---

## Selectores

Prefijo:

ns

Ejemplos:

ns-customer-list

ns-project-form

ns-dashboard

---

# Seguridad

## Contraseñas

BCrypt

Nunca almacenar texto plano.

---

## Autenticación

JWT

---

## Autorización

Roles y permisos.

---

# Calidad de Código

## Principios

SOLID

DRY

KISS

Clean Code

---

## Herramientas

Backend:

- Checkstyle
- SonarQube

Frontend:

- ESLint
- Prettier

---

# Testing

## Backend

JUnit 5

Mockito

---

## Frontend

Jasmine

Karma

---

## End To End

Playwright

---

# Documentación

Toda funcionalidad nueva deberá incluir:

- documentación técnica
- actualización de API
- actualización de modelo de datos si aplica

---

# Regla Principal

Ningún código entra en la rama principal sin:

- revisión
- pruebas
- documentación mínima
