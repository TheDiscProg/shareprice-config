package shareprice.entity

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import simex.messaging.Security.{AUTHORIZED, BASIC}
import simex.messaging.Simex
import simex.test.SimexTestFixture

class SimexSecurityTest extends AnyFlatSpec with Matchers with SimexTestFixture {

  it should "determine highest level of security with no entity defined" in {
    val level = SimexSecurity.getSecurity(simexMessage)

    level shouldBe AUTHORIZED
  }

  it should "determine highest level of security when entity is defined" in {
    val level = SimexSecurity.getSecurity(
      simexMessage.copy(destination = endpoint.copy(entity = Some(Simex.AUTHENTICATION_ENTITY)))
    )

    level shouldBe BASIC
  }
}
