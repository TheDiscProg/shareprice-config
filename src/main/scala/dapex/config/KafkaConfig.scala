package dapex.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder

case class KafkaConfig(
    bootstrapServer: String,
    port: Int
)

object KafkaConfig {
  implicit val kafkaConfig: Decoder[KafkaConfig] = deriveDecoder
}
