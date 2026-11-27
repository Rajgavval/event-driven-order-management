
# Event-Driven Order Processing System

## 1. Project Overview

A distributed order processing platform built
using Java, Spring Boot, Apache Kafka and PostgreSQL.

## 2. Microservices

### Order Service
- Order creation
- Order status management
- Order history
- Event publishing

### Inventory Service
- Product inventory
- Stock availability
- Inventory reservation
- Inventory release

### Payment Service
- Payment simulation
- Payment processing
- Payment status tracking

## 3. Communication

- REST APIs for synchronous communication.
- Apache Kafka for asynchronous communication.
- JSON-based event payloads.

## 4. Database Strategy

- Order Service owns Order DB.
- Inventory Service owns Inventory DB.
- Payment Service owns Payment DB.

## 5. Reliability

- Idempotent event processing.
- Retry mechanisms.
- Dead-letter queues.
- Saga-based transaction recovery.

## 6. Security

- JWT authentication.
- Role-based authorization.
