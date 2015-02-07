package adamdecaf.picking.tests

object Runner extends App with Add with Delete {

  println("Starting")

  runAddTests()
  runDeleteTests()

  println("Finished")
}
