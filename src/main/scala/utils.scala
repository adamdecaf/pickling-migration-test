package adamdecaf.picking.tests
import java.io.{File, FileWriter, IOException}
import scala.pickling.{Pickler, PickleFormat, Ops, Unpickler}
import scala.pickling.pickler.AllPicklers
import scala.pickling.json._
import scala.pickling.functions._
import scala.util.Try
import org.apache.commons.io.FileUtils

// case class Person(name: String, age: Int)
// val pkl = Person("foo", 20).pickle

// pkl: pickling.json.pickleFormat.PickleType =
// JSONPickle({
//   "$type": "Person",
//   "name": "foo",
//   "age": 20
// })

// val person = pkl.unpickle[Person]
// todo: failure?

trait PicklePersistence extends AllPicklers with Ops with JsonFormats {

  def save[T: Pickler](filename: String)(in: T): File = {
    val file = new File(s"out/${filename}")
    val writer = new FileWriter(file)

    try {
      if (!file.exists) {
        file.getParentFile.mkdirs()
      }
      val result = scala.pickling.functions.pickle(in)
      writer.write(result.value)
      file
    } catch {
      case err: IOException =>
        println(s"Got error ${err.getMessage} during file write to ${filename}")
        file
    } finally {
      writer.close()
    }
  }

  def read[T: Unpickler](filename: String): Try[T] = {
    Try {
      val file = new File(s"out/${filename}")
      val contents = FileUtils.readFileToString(file, "UTF-8")
      scala.pickling.functions.unpickle[T](scala.pickling.json.JSONPickle(contents))
    }
  }
}
