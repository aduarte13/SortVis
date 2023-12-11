import java.awt.*
import javax.swing.*

class DisplayPanel(
    listLength: Int = 250,
    private val barWidth: Int = 4,
    private val list: MutableList<Int> = mutableListOf(),

    private val backgroundColor: Color = Color(20, 20, 20),
    private val regColor: Color = Color(230, 230, 230),

    var sorting: Boolean = false
    ) : JPanel(){

    init{
        border = BorderFactory.createEtchedBorder()

        for(i in 0..<listLength){
            list.add(i * 2)
            println("" + i + " | " + list[i])
        }

    }

    override fun paint(g: Graphics) {

        g.font = Font("American Typewriter", Font.BOLD, 24)

        g.color = backgroundColor
        g.fillRect(0, 0, 1010, 610) // fill background

        drawBars(g)

    }

    private fun drawBars(g: Graphics){
        g.color = backgroundColor
        g.fillRect(0, 0, 1010, 610) // fill background

        g.color = regColor

        for (i in 0..<list.size){
            g.fillRect(
                i + 1 + (i * barWidth),500 - list[i],
                barWidth, 500)
        }

    }

    fun bubbleSort(){

        for (i in 0..<list.size - 1) {
            for (j in 0..<list.size - i - 1) {
                if (list[j] > list[j + 1]) {
                    // Swap the elements
                    val temp = list[j]
                    list[j] = list[j + 1]
                    list[j + 1] = temp
                    Thread.sleep(1)
                    println("sorting...")
                    paint(this.graphics)
                }
            }
        }

        Thread.sleep(1)

        repaint()

    }

    fun randomizeList(){

        list.shuffle()

    }

}