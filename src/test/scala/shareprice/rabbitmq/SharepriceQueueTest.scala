package shareprice.rabbitmq

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should._

class SharepriceQueueTest extends AnyFlatSpec with Matchers {

  it should "get queues for given name" in {
    val listOfSupportedQueues = SharepriceQueue.values.map(_.name.value)

    val queue = SharepriceQueue.queueWithName("service.auth")

    (listOfSupportedQueues should contain).allOf(
      "service.auth",
      "service.dbread",
      "service.collectionPoint"
    )
    queue shouldBe SharepriceQueue.SERVICE_AUTHENTICATION_QUEUE
  }

  it should "throw an exception when a queue is not found" in {
    val result = intercept[RuntimeException](SharepriceQueue.queueWithName("does.not.exist"))

    result.getMessage shouldBe "No queue with name does.not.exist defined"
  }
}
