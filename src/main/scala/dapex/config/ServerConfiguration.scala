package dapex.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder

case class ServerConfiguration(
    // All microservices must have a basic HTTP port for health monitoring
    http: HttpConfiguration,
    // All microservices mush have a RMQ publisher or consumer
    rabbitMQ: RabbitMQConfig,
    caching: Option[HazelcastConfig],
    // Secret key for JWT token signing
    tokenKey: String
)

object ServerConfiguration {
  implicit val serverConfigurationDecoder: Decoder[ServerConfiguration] = deriveDecoder
}
