package adamdecaf.picking.tests

trait Delete extends PicklePersistence {

  // case class DeleteTest(
  //   existingMethod1: String,
  //   existingMethod2: Boolean
  // )

  case class DeleteTest(
    existingMethod1: String
  )

  def runDeleteTests(): Unit = {
    // In a prior version of the application we persisted a "DeleteTest"
    // val model = DeleteTest("greetings", true)
    // save("delete-test-orig")(model)

    // Then later we've deleted a field from the model and wish to read the persisted back.
    println(read[DeleteTest]("delete-test-orig")) // 2015-02-07: Success(DeleteTest(greetings))
  }
}
