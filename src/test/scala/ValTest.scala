import org.scalatest.flatspec.AnyFlatSpec

class ValTest extends AnyFlatSpec {

  "ValTest" should "verify if the email is valid or not" in {

    assert(email.isValid("niketm786@gmail.com") == true)

  }

}
