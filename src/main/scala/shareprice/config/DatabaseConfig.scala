package shareprice.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder
import pureconfig.generic.ProductHint
import pureconfig.{CamelCase, ConfigFieldMapping}

case class DatabaseConfig(
    driver: String,
    url: String,
    user: String,
    password: String,
    threadPoolSize: Int,
    connectionPoolSize: Int
)

object DatabaseConfig {
  implicit val hint = ProductHint[DatabaseConfig](ConfigFieldMapping(CamelCase, CamelCase))
  implicit val dbConfig: Decoder[DatabaseConfig] = deriveDecoder
}
