import java.awt.*
import javax.swing.JFrame

class Main : JFrame(){
    init{
        title = "Sort Vis"
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        // create panels
        val displayPanel = DisplayPanel()
        val selectionPanel = SelectionPanel(displayPanel)

        // set panel sizes
        selectionPanel.preferredSize = Dimension(1000, 60)
        displayPanel.preferredSize = Dimension(1000, 500)

        // add panels to frame
        add(selectionPanel, BorderLayout.CENTER)
        add(displayPanel, BorderLayout.SOUTH)

        pack()
        setLocationRelativeTo(null) // center frame on screen

        isResizable = false

        isVisible = true
    }
}

fun main() {
    Main()
}