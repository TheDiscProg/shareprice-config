package shareprice.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder

case class DatabaseConfig(
    driver: String,
    url: String,
    user: String,
    password: String,
    threadPoolSize: Int,
    connectionPoolSize: Int
)

object DatabaseConfig {

  implicit val dbConfig: Decoder[DatabaseConfig] = deriveDecoder
}
