# shareprice-config

This is a shared configuration library for the *share price* applications.

In order to define RabbitMQ queues and Kafka topics, along with their configurations, this library pulls in
`dapex-rabbitmq` and `dapex-kafka` libraries.

## Endpoint definitions
Endpoints are defined in the class *ServiceDefinition* as follows:

* DropOffService = "service.drop-off"
* AuthenticationService = "service.auth"
* DatabaseROService = "service.dbread"
* DatabaseUpdateService = "service.dbrw"
* CollectionPointService = "service.collection"
