# Arquitectura Backend

## Tecnología

### Framework

Spring Boot 3

### Lenguaje

Java 21

### Base de datos

MySQL 8

### Seguridad

Spring Security
JWT

### Persistencia

Spring Data JPA
Hibernate

### Migraciones

Flyway

### Mapeo

MapStruct

### Documentación

OpenAPI
Swagger

### Almacenamiento de Archivos

MinIO

### Reportes

JasperReports

---

# Arquitectura por Capas

Controller
↓
Service
↓
Repository
↓
Database

---

# Estructura Base del Proyecto

com.novasurface.crm

---

# Módulo Auth

com.novasurface.crm.auth

### Responsabilidades

- Login
- JWT
- Refresh Token
- Logout
- Seguridad

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Users

com.novasurface.crm.users

### Responsabilidades

- Usuarios
- Roles
- Permisos

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Leads

com.novasurface.crm.leads

### Responsabilidades

- Leads
- Conversión a cliente
- Seguimiento

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Customers

com.novasurface.crm.customers

### Responsabilidades

- Clientes
- Contactos
- Historial

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Quotes

com.novasurface.crm.quotes

### Responsabilidades

- Presupuestos
- Versiones
- PDF

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Projects

com.novasurface.crm.projects

### Responsabilidades

- Proyectos
- Planificación
- Técnicos

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Evidences

com.novasurface.crm.evidences

### Responsabilidades

- Fotografías
- Vídeos
- Informes técnicos

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Invoices

com.novasurface.crm.invoices

### Responsabilidades

- Facturas
- PDF
- Cobros

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Payments

com.novasurface.crm.payments

### Responsabilidades

- Gestión de pagos

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Catalog

com.novasurface.crm.catalog

### Responsabilidades

- Servicios
- Sectores
- Categorías

### Componentes

- controller
- service
- repository
- entity
- dto
- mapper

---

# Módulo Dashboard

com.novasurface.crm.dashboard

### Responsabilidades

- KPIs
- Métricas
- Estadísticas

### Componentes

- controller
- service
- dto

---

# Shared Module

com.novasurface.crm.shared

### Responsabilidades

Código reutilizable.

### Contenido

- exceptions
- constants
- utils
- validators
- configuration

---

# Principios de Desarrollo

## Arquitectura

- Clean Code
- SOLID
- DRY
- KISS

## Seguridad

- JWT obligatorio
- Contraseñas cifradas con BCrypt
- Control de roles

## Persistencia

- Flyway obligatorio
- Sin creación automática de tablas por Hibernate

## API

- Versionada
- RESTful
- Documentada con Swagger

---

# Estructura Objetivo

com.novasurface.crm

├── auth
├── users
├── leads
├── customers
├── quotes
├── projects
├── evidences
├── invoices
├── payments
├── catalog
├── dashboard
└── shared