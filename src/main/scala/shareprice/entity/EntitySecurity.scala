package shareprice.entity

import simex.messaging.{Security, Simex}

/** Define all common business entities here.
  * This could be extended within the service for service specific entities.
  */

trait EntitySecurity {

  def value: String

  def security: Security

  def ttl: Long

}

object EntitySecurity {

  case object Authentication extends EntitySecurity {

    override val value: String = Simex.AUTHENTICATION_ENTITY

    override val security: Security = Security.BASIC

    override val ttl: Long = 60L
  }

  case object RefreshToken extends EntitySecurity {
    override val value: String = Simex.REFRESH_TOKEN_ENTITY

    override val security: Security = Security.BASIC

    override def ttl: Long = 60L
  }

  case object Default extends EntitySecurity {
    override val value: String = "default"

    override val security: Security = Security.AUTHORIZED

    override val ttl: Long = 300L
  }

  case object Person extends EntitySecurity {
    override def value: String = "person"

    override def security: Security = Security.ORIGINAL_TOKEN

    override def ttl: Long = 300L
  }

  def fromString(s: String): EntitySecurity = fromEntity(Option(s))

  def fromEntity(entity: Option[String]): EntitySecurity = entity match {
    case Some(ent) =>
      ent.toLowerCase match {
        case Simex.AUTHENTICATION_ENTITY => Authentication
        case Simex.REFRESH_TOKEN_ENTITY => RefreshToken
        case _ => Default
      }
    case None => Default
  }

  def values: Vector[EntitySecurity with Serializable] = Vector(
    Authentication,
    RefreshToken,
    Default,
    Person
  )

}
