package shareprice.config

import cats.effect.IO
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import cats.effect.unsafe.implicits.global
import org.scalatest.concurrent.ScalaFutures

class ConfigurationTest extends AnyFlatSpec with Matchers with ScalaFutures {

  it should "load configuration" in {
    val result = Configuration.loadAsStream[IO]().compile.drain.unsafeToFuture()

    whenReady(result) { r =>
      r shouldBe ()
    }
  }
}
