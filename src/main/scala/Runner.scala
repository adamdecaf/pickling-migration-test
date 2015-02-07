package adamdecaf.picking.tests

object Runner extends App with Add with Delete with InPlaceModify {

  println("Starting")

  runAddTests()
  runDeleteTests()

  println("Finished")
}
