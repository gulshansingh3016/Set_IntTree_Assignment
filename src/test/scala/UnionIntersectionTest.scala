import com.knoldus.Set.{SetOperation}
import org.scalatest.funsuite.AnyFunSuite

class UnionIntersectionTest extends AnyFunSuite{
  val test = new SetOperation
  test("Test Union Set") {
    val set1: Set[Int] = Set(3, 4, 5, 3, 2, 1)
    val set2: Set[Int] = Set(9, 8, 7, 6, 5, 1)
    val set3: Set[Int] = set1 ++ set2
    assert(test.union(set1, set2) === set3)
}
  test("Test Intersection Set") {
    val set1: Set[Int] = Set(3, 4, 5, 3, 2, 1)
    val set2: Set[Int] = Set(9, 8, 7, 6, 5, 1)
    val set3: Set[Int] = set1 & set2
    assert(test.intersection(set1, set2) === set3)
  }
}

