package adamdecaf.picking.tests

trait OptionTests extends PicklePersistence {

  // case class OptionTest(
  //   existingMethod1: String,
  //   existingMethod2: List[Int]
  // )

  case class OptionTest(
    existingMethod1: String,
    existingMethod2: List[Int],
    newMethod1: Option[Boolean]
  )

  def runOptionTests(): Unit = {
    // In a previous run the application created an OptionTest (from above) and persisted it
    // val model = OptionTest("hello world", List(1,2,3))
    // save("option-test-orig")(model)

    // Now we try and read out the old persisted data but after fields are added.

    println(read[OptionTest]("option-test-orig"))
  }
}
