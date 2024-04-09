package shareprice.config

object ServiceDefinition {
  val DropOffService = "service.drop-off"
  val AuthenticationService = "service.auth"
  val DatabaseROService = "service.dbread"
  val DatabaseUpdateService = "service.dbwrite"
  val CollectionPointService = "service.collectionPoint"

  val ServiceAccessibleList = List(
    ServiceAccessible(DropOffService, accessibleFromHttp = true),
    ServiceAccessible(AuthenticationService, accessibleFromHttp = true),
    ServiceAccessible(DatabaseROService),
    ServiceAccessible(DatabaseUpdateService),
    ServiceAccessible(CollectionPointService)
  )

  case class ServiceAccessible(
      service: String,
      accessibleFromHttp: Boolean = false
  )
}
