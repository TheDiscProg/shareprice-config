package shareprice.kafka

import simex.kafka.KafkaTopic

object SharepriceTopic {

  case object DB_WRITE extends KafkaTopic {
    override val name: String = "Database Writer Queue"
    override val topic: String = "db-write"
    override val partitions: Int = 3
    override val replication: Short = 2.toShort
  }

}
