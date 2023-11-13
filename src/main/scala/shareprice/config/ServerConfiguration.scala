package shareprice.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder
import simex.caching.config.HazelcastConfig
import simex.kafka.config.KafkaConfig
import simex.rabbitmq.config.RabbitMQConfig

case class ServerConfiguration(
    // All microservices must have a basic HTTP port for health monitoring
    http: HttpConfiguration,
    // All microservices mush have a RMQ publisher or consumer
    rabbitMQ: RabbitMQConfig,
    // Not all will have the following configuration
    kafka: Option[KafkaConfig],
    caching: Option[HazelcastConfig],
    db: Option[DatabaseConfig],
    // Secret key for JWT token signing
    tokenKey: String
)

object ServerConfiguration {
  implicit val serverConfigurationDecoder: Decoder[ServerConfiguration] = deriveDecoder
}
