import org.scalatest.FunSpec
import org.scalatest.Matchers

class CoolThingTest extends FunSpec with Matchers {
  describe("CoolThing") {
    it("should add one to an integer") {
      val expected = 2
      val actual = CoolThing.addOne(1)

      actual shouldBe expected
    }
  }
}
