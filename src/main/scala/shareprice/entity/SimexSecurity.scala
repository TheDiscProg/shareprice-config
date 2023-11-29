package shareprice.entity

import simex.messaging.{Security, Simex}

object SimexSecurity {

  def getSecurity(simexMessage: Simex): Security = {
    val entitySecurity = EntitySecurity.fromEntity(simexMessage.endpoint.entity).security
    val originatorSecurity = Security.fromString(simexMessage.originator.security)
    Security.determineHighestSecurity(entitySecurity, originatorSecurity)
  }

}
