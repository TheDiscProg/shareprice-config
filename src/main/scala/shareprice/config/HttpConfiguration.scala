package shareprice.config

import io.circe.Decoder
import io.circe.generic.semiauto.deriveDecoder
import pureconfig.{CamelCase, ConfigFieldMapping}
import pureconfig.generic.ProductHint

case class HttpConfiguration(url: String, port: Int, hostAddress: String)

object HttpConfiguration {
  implicit val hint = ProductHint[HttpConfiguration](ConfigFieldMapping(CamelCase, CamelCase))
  implicit val httpConfiguration: Decoder[HttpConfiguration] = deriveDecoder
}
