package adamdecaf.picking.tests

object Runner extends App with AddTests with DeleteTests with OptionTests {

  println("Starting")

  runAddTests()
  runDeleteTests()
  runOptionTests()

  println("Finished")
}
