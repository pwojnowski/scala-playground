package poligon

import org.scalatest._

class MultiTableSpec extends FunSuite {

  val mt = new MultiTable()

  test("should return 1x1 table") {
    val table = mt.generate(1)

    val expected = Vector(Vector(1))

    assert(expected == table)
  }

  test("should return 2x2 table") {
    val table = mt.generate(2)

    val expected = Vector(
      Vector(1, 2),
      Vector(2, 4)
    )

    assert(expected == table)
  }

  test("should return 10x10 table by default") {
    val table = mt.generate()

    val expected = Vector(
      Vector( 1,  2,  3,  4,  5,  6,  7,  8,  9, 10),
      Vector( 2,  4,  6,  8, 10, 12, 14, 16, 18, 20),
      Vector( 3,  6,  9, 12, 15, 18, 21, 24, 27, 30),
      Vector( 4,  8, 12, 16, 20, 24, 28, 32, 36, 40),
      Vector( 5, 10, 15, 20, 25, 30, 35, 40, 45, 50),
      Vector( 6, 12, 18, 24, 30, 36, 42, 48, 54, 60),
      Vector( 7, 14, 21, 28, 35, 42, 49, 56, 63, 70),
      Vector( 8, 16, 24, 32, 40, 48, 56, 64, 72, 80),
      Vector( 9, 18, 27, 36, 45, 54, 63, 72, 81, 90),
      Vector(10, 20, 30, 40, 50, 60, 70, 80, 90, 100)
    )

    assert(expected == table)
  }

  test("should print multiplication table") {
    mt.printTable(10)
  }
}
