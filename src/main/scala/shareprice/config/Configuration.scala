package shareprice.config

import cats.effect.kernel.Sync
import fs2.Stream
import pureconfig._
import pureconfig.generic.auto._

object Configuration {

  def loadAsStream[F[_]: Sync](): Stream[F, ServerConfiguration] = Stream.eval(loadSync())

  def loadSync[F[_]: Sync](): F[ServerConfiguration] =
    Sync[F].delay(ConfigSource.default.at("server").loadOrThrow[ServerConfiguration])
}
