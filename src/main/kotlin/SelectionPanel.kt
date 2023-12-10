import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.*

class SelectionPanel(
    private val displayPanel: DisplayPanel
) : JPanel(){
    private val sortList = arrayOf(
        // Iterative sorting algorithms (comparison based)
        "Selection Sort",
        "Bubble Sort",
        "Insertion Sort",
        // Recursive sorting algorithms (comparison based)
        "Merge Sort",
        "Quick Sort"
    )

    private val selectionListener = SelectionListener()

    private val sortDropMenu = JComboBox(sortList)
    private val randomButton = JButton("Randomize")
    private val sortButton = JButton("Sort")


    init {
        border = BorderFactory.createTitledBorder("Selection")
        layout = FlowLayout()

        sortDropMenu.selectedItem = "Bubble Sort"
        sortDropMenu.maximumRowCount = 5


        // add action listeners
        sortDropMenu.addActionListener(selectionListener)
        randomButton.addActionListener(selectionListener)
        sortButton.addActionListener(selectionListener)

        // add components to panels
        add(sortDropMenu)
        add(randomButton)
        add(sortButton)

    }

    inner class SelectionListener : ActionListener {
        override fun actionPerformed(e: ActionEvent) {

            if (e.source == randomButton){
                displayPanel.randomizeList()
            }
            else if (e.source == sortButton){
                println("Sort button pressed!")
                if (sortDropMenu.selectedItem == "Bubble Sort")
                    displayPanel.bubbleSort()
            }

            displayPanel.repaint()  // should be optimized to not redraw unnecessarily
        }
    }

}


