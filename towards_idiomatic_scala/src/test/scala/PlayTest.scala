import org.junit._

class PlayTest {

    @Test def test() {
        sealed abstract class Device
        case class SetTopBox(name: String) extends Device
        case class SmartPhone(name: String) extends Device
        case class Computer(name: String) extends Device

        val userDevice: Device = new SmartPhone("Android")
        userDevice match {
            case SetTopBox(name) => false
            case SmartPhone(name) => true
        }
    }
}