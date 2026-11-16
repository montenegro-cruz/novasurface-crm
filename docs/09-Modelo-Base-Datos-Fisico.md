# Modelo Físico de Base de Datos

## Convenciones Generales

### Motor

MySQL 8

### Codificación

utf8mb4

### Zona horaria

UTC

### Convención de nombres

Tablas:
- snake_case
- plural

Ejemplos:
- users
- customers
- quotes
- invoices

Columnas:
- snake_case

Ejemplos:
- first_name
- created_at
- invoice_number

---

# SECURITY

## users

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| first_name | VARCHAR(100) | NOT NULL |
| last_name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(255) | UNIQUE |
| password | VARCHAR(255) | NOT NULL |
| enabled | BOOLEAN | NOT NULL |
| created_at | TIMESTAMP | NOT NULL |
| updated_at | TIMESTAMP | NOT NULL |

---

## roles

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| name | VARCHAR(100) | UNIQUE |
| description | VARCHAR(255) | NULL |

---

## permissions

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| name | VARCHAR(100) | UNIQUE |
| description | VARCHAR(255) | NULL |

---

# COMMERCIAL

## leads

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| company_name | VARCHAR(255) | NOT NULL |
| contact_name | VARCHAR(255) | NOT NULL |
| email | VARCHAR(255) | NULL |
| phone | VARCHAR(50) | NULL |
| sector | VARCHAR(100) | NULL |
| status | VARCHAR(50) | NOT NULL |
| source | VARCHAR(100) | NULL |
| notes | TEXT | NULL |
| created_at | TIMESTAMP | NOT NULL |

---

## customers

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| company_name | VARCHAR(255) | NOT NULL |
| vat_number | VARCHAR(50) | NULL |
| email | VARCHAR(255) | NULL |
| phone | VARCHAR(50) | NULL |
| website | VARCHAR(255) | NULL |
| address | VARCHAR(500) | NULL |
| created_at | TIMESTAMP | NOT NULL |

---

## contacts

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| customer_id | BIGINT | FK |
| first_name | VARCHAR(100) | NOT NULL |
| last_name | VARCHAR(100) | NOT NULL |
| email | VARCHAR(255) | NULL |
| phone | VARCHAR(50) | NULL |
| position | VARCHAR(100) | NULL |

---

# QUOTES

## quotes

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| customer_id | BIGINT | FK |
| quote_number | VARCHAR(50) | UNIQUE |
| status | VARCHAR(50) | NOT NULL |
| issue_date | DATE | NOT NULL |
| expiration_date | DATE | NULL |
| subtotal | DECIMAL(12,2) | NOT NULL |
| tax_amount | DECIMAL(12,2) | NOT NULL |
| total_amount | DECIMAL(12,2) | NOT NULL |

---

## quote_lines

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| quote_id | BIGINT | FK |
| service_id | BIGINT | FK |
| description | VARCHAR(500) | NOT NULL |
| quantity | DECIMAL(10,2) | NOT NULL |
| unit_price | DECIMAL(12,2) | NOT NULL |
| discount | DECIMAL(12,2) | NULL |
| total | DECIMAL(12,2) | NOT NULL |

---

# OPERATIONS

## projects

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| customer_id | BIGINT | FK |
| quote_id | BIGINT | FK |
| project_code | VARCHAR(100) | UNIQUE |
| name | VARCHAR(255) | NOT NULL |
| description | TEXT | NULL |
| start_date | DATE | NULL |
| end_date | DATE | NULL |
| status | VARCHAR(50) | NOT NULL |

---

# EVIDENCE

## evidences

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| project_id | BIGINT | FK |
| type | VARCHAR(50) | NOT NULL |
| description | TEXT | NULL |

---

## photos

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| evidence_id | BIGINT | FK |
| filename | VARCHAR(255) | NOT NULL |
| path | VARCHAR(500) | NOT NULL |
| category | VARCHAR(50) | NOT NULL |

---

# BILLING

## invoices

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| customer_id | BIGINT | FK |
| project_id | BIGINT | FK |
| invoice_number | VARCHAR(50) | UNIQUE |
| issue_date | DATE | NOT NULL |
| due_date | DATE | NOT NULL |
| status | VARCHAR(50) | NOT NULL |
| subtotal | DECIMAL(12,2) | NOT NULL |
| tax_amount | DECIMAL(12,2) | NOT NULL |
| total_amount | DECIMAL(12,2) | NOT NULL |

---

## payments

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| invoice_id | BIGINT | FK |
| payment_date | DATE | NOT NULL |
| amount | DECIMAL(12,2) | NOT NULL |
| payment_method | VARCHAR(50) | NOT NULL |
| reference | VARCHAR(255) | NULL |

---

# CATALOG

## services

| Campo | Tipo | Restricciones |
|---------|---------|---------|
| id | BIGINT | PK |
| name | VARCHAR(255) | NOT NULL |
| description | TEXT | NULL |
| estimated_price | DECIMAL(12,2) | NULL |
| active | BOOLEAN | NOT NULL |