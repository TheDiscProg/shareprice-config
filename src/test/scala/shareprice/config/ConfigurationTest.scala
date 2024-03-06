package shareprice.config

import cats.effect.IO
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import cats.effect.unsafe.implicits.global
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.time.{Millis, Seconds, Span}

class ConfigurationTest extends AnyFlatSpec with Matchers with ScalaFutures {

  implicit val defaultPatience =
    PatienceConfig(timeout = Span(30, Seconds), interval = Span(100, Millis))

  it should "load configuration" in {
    val result = Configuration.loadAsStream[IO]().compile.drain.unsafeToFuture()

    whenReady(result) { r =>
      r shouldBe ()
    }
  }
}
