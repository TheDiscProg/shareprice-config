package shareprice.caching

trait CachingMap {
  val name: String
  val ttl: Long
}
object CachingMap {

  case object RequestAuthentication extends CachingMap {
    override val name: String = "request.authentication"
    override val ttl: Long = 60
  }

  case object AuthenticationAuthorisationToken extends CachingMap {
    override val name: String = "authenticatin.auth-token"
    override val ttl: Long = 300
  }

  case object AuthenticationRefreshToken extends CachingMap {
    override val name: String = "authentication.refresh-token"
    override val ttl: Long = 1800
  }
}
