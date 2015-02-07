package adamdecaf.picking.tests

trait Add extends PicklePersistence {

  // case class AddTest(
  //   existingMethod1: String,
  //   existingMethod2: List[Int]
  // )

  case class AddTest(
    existingMethod1: String,
    existingMethod2: List[Int],
    newMethod1: Boolean = false
  )

  def runAddTests(): Unit = {
    // In a previous run the application created an AddTest (from above) and persisted it
    // val model = AddTest("hello world", List(1,2,3))
    // save("add-test-orig")(model)

    // Now we try and read out the old persisted data but after fields are added.
    // Note: We've added defaults on the new method.

    println(read[AddTest]("add-test-orig")) // 2015-02-07: No field 'newMethod1'
  }
}
