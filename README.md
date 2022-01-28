### Project description
🚀 This project aims to create an application with microservices architecture by applying the Saga(Orchestration) pattern with Axon and Spring for all development. Dockerfile files are available for virtualization of microservices and within each service there is a deploy folder for running services in a Kubernetes cluster.

## Installation and  Technologies##

The following technologies were used to carry out the project and it is necessary to install some items:
- Docker
- Java 11
- Maven
- Kubernetes
- Spring
- Axon
- Docker

### Saga

Saga is an old pattern developed in 1987 as a conceptual alternative for long-running database transactions in SQL databases. But a modern variation of this pattern works amazingly for the distributed transaction as well. Saga pattern is a local transaction sequence where each transaction updates data in the Data Store within a single Microservice and publishes an Event or Message. The first transaction in a saga is initiated by an external request (Event or Action). Once the local transaction is complete (data is stored in Data Store, and message or event is published), the published message/event triggers the next local transaction in the Saga.

### Choreography or Orchestration
Choreography: Decentralised co-ordinations where each Microservice produces and listen to other Microservice’s events/messages and decides if an action should be taken or not.

Orchestration: Centralised co-ordinations where an Orchestrator tells the participating Microservices which local transaction needs to be executed.
Pros

### Pros
- Provide consistency via transactions in a highly scalable or loosely coupled, event-driven Microservice Architecture.
- Provide consistency via transactions in Microservice Architecture where NoSQL databases without 2PC support are used.

### Cons

- Need to handle transient failures and should provide idempotency.
- Hard to debug, and the complexity grows as the number of Microservices increase.

### Situations to use SAGA

- In highly scalable, loosely coupled Microservice Architecture where event sourcing is used.
- In systems where distributed NoSQL databases are used.

### Situations not to use SAGA

- Lowly scalable transactional systems with SQL Databases.
- In systems where cyclic dependency exists among services.


Here we finish a Project implementing Saga(Orchestration) with Axon.
