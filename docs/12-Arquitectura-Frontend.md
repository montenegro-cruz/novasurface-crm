# Arquitectura Frontend

## Tecnología

### Framework

Angular 20

### Lenguaje

TypeScript

### Estilos

Tailwind CSS

### Componentes UI

Angular Material

### Gestión del Estado

Signals

### HTTP

HttpClient

### Rutas

Angular Router

### Formularios

Reactive Forms

---

# Arquitectura por Funcionalidades

Se utilizará una arquitectura Feature-Based.

Cada módulo funcional tendrá:

- pages
- components
- services
- models
- guards
- routes

---

# Estructura Base del Proyecto

src

├── app
├── assets
├── environments
└── styles

---

# App

src/app

├── core
├── shared
├── features
└── layouts

---

# Core Module

src/app/core

Responsabilidades:

- Autenticación
- Guards
- Interceptors
- Servicios globales
- Configuración

Contenido:

├── authentication
├── guards
├── interceptors
├── services
└── configuration

---

# Shared Module

src/app/shared

Responsabilidades:

Componentes reutilizables.

Contenido:

├── components
├── directives
├── pipes
├── models
└── utils

---

# Layouts

src/app/layouts

Responsabilidades:

Estructura visual de la aplicación.

Contenido:

├── auth-layout
├── dashboard-layout
└── client-layout

---

# Features

src/app/features

---

## Auth

src/app/features/auth

Responsabilidades:

- Login
- Logout
- Recuperar contraseña

---

## Dashboard

src/app/features/dashboard

Responsabilidades:

- KPIs
- Gráficas
- Resumen ejecutivo

---

## Leads

src/app/features/leads

Responsabilidades:

- Gestión de leads
- Conversión a cliente

---

## Customers

src/app/features/customers

Responsabilidades:

- Gestión de clientes
- Contactos
- Historial

---

## Quotes

src/app/features/quotes

Responsabilidades:

- Presupuestos
- Versiones
- PDF

---

## Projects

src/app/features/projects

Responsabilidades:

- Gestión de proyectos
- Planificación
- Técnicos asignados

---

## Evidences

src/app/features/evidences

Responsabilidades:

- Fotografías
- Vídeos
- Informes

---

## Invoices

src/app/features/invoices

Responsabilidades:

- Facturas
- PDF
- Cobros

---

## Payments

src/app/features/payments

Responsabilidades:

- Registro de pagos

---

## Catalog

src/app/features/catalog

Responsabilidades:

- Servicios
- Sectores

---

# Environments

src/environments

environment.ts

environment.prod.ts

---

# Seguridad

## JWT

El token será almacenado de forma segura.

## Guards

- AuthGuard
- RoleGuard

## Interceptors

- AuthInterceptor
- ErrorInterceptor

---

# Principios de Desarrollo

## Arquitectura

- Feature Based Architecture
- Component Reusability
- Separation of Concerns

## Rendimiento

- Lazy Loading
- Standalone Components
- Signals

## Calidad

- Tipado estricto
- ESLint
- Prettier

---

# Estructura Objetivo

src/app

├── core
├── shared
├── layouts
└── features

    ├── auth
    ├── dashboard
    ├── leads
    ├── customers
    ├── quotes
    ├── projects
    ├── evidences
    ├── invoices
    ├── payments
    └── catalog