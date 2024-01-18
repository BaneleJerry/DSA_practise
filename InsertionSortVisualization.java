import javax.swing.*;
import java.awt.*;
import java.util.Arrays;

public class InsertionSortVisualization extends JFrame {

    private int[] arrayToSort = {12, 11, 13, 5, 6};

    public InsertionSortVisualization() {
        setTitle("Insertion Sort Visualization");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Add your visualization components here, e.g., a JPanel for drawing

        JLabel label = new JLabel("Original Array: " + Arrays.toString(arrayToSort));
        add(label, BorderLayout.NORTH);

        InsertionSortAlgorithm insertionSortAlgorithm = new InsertionSortAlgorithm(this);
        insertionSortAlgorithm.sort(arrayToSort);

        setVisible(true);
    }

    public void updateArray(int[] newArray) {
        // Update the array and repaint the visualization
        arrayToSort = newArray;
        repaint();
    }

    // Override the paint method to draw the current state of the array
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        // Add your drawing logic here to visualize the current state of the array
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new InsertionSortVisualization());
    }
}

