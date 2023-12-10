import java.awt.*
import javax.swing.*
import kotlin.random.Random

class DisplayPanel(
    private val listLength: Int = 1000,
    private val list: MutableList<Int> = mutableListOf(),

    private val backgroundColor: Color = Color(20, 20, 20),
    private val regColor: Color = Color(230, 230, 230),

    ) : JPanel(){

    init{
        border = BorderFactory.createEtchedBorder()

        for(i in 0 until listLength){
            list.add(Random.nextInt(500))
            println("" + i + " | " + list[i])
        }

    }

    override fun paint(g: Graphics) {

        g.font = Font("American Typewriter", Font.BOLD, 24)

        g.color = backgroundColor
        g.fillRect(0, 0, 1010, 610) // fill background

        drawBars(g)

    }

    fun drawBars(g: Graphics){
        g.color = regColor

        for (i in 0 until list.size){
            g.drawLine(
                i + 1,500,
                i + 1, 500 - list[i])
        }
    }

    fun randomizeList(){

        list.clear()

        for(i in 0 until listLength){
            list.add(Random.nextInt(800))
            println("" + i + " | " + list[i])
        }
    }

}