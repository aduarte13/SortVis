import java.awt.*
import javax.swing.*

class DisplayPanel(
    private val list: MutableList<Int> = mutableListOf(),

    private val backgroundColor: Color = Color(20, 20, 20),
    private val regColor: Color = Color(230, 230, 230),

    ) : JPanel(){

    init{
        border = BorderFactory.createEtchedBorder()
    }

    override fun paint(g: Graphics) {

        g.font = Font("American Typewriter", Font.BOLD, 24)

        g.color = backgroundColor
        g.fillRect(0, 0, 860, 610) // fill background


    }

}