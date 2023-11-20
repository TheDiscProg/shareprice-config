package shareprice.entity

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers
import shareprice.entity.EntitySecurity.{Authentication, Default, RefreshToken}
import simex.messaging.Simex

class EntitySecurityTest extends AnyFlatSpec with Matchers {

  it should "return default entity security for None" in {
    val result = EntitySecurity.fromEntity(None)
    result shouldBe Default
  }
  it should "return default security for null in string" in {
    val result = EntitySecurity.fromString(null)
    result shouldBe Default
  }

  it should "return default security for undefined string" in {
    val result = EntitySecurity.fromString("abc")
    result shouldBe Default
  }
  it should "return authentication security" in {
    val result = EntitySecurity.fromEntity(Some(Simex.AUTHENTICATION_ENTITY))
    result shouldBe Authentication
  }
  it should "return refresh token security" in {
    val result = EntitySecurity.fromEntity(Some(Simex.REFRESH_TOKEN_ENTITY))
    result shouldBe RefreshToken
  }
}
