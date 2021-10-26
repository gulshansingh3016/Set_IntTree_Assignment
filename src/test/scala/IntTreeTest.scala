import com.knoldus.Tree.IntegerTreeRun
import com.knoldus.Tree.IntegerTreeRun.{EmptyTree, insert}
import org.scalatest.funsuite.AnyFunSuite

class IntTreeTest extends AnyFunSuite {
  val t = insert(insert(insert(insert(insert(EmptyTree, 12), 14), 19), 18), 28)
  test("Element present in Integer tree ") {
    assert(IntegerTreeRun.contains(t, 28))
  }

  test("Element not present in Integer tree ") {
    assert(!IntegerTreeRun.contains(t, 2))
  }
}
