import javax.swing.JOptionPane;

public class ChoosingOption {
    
    public static void main(String[] args) {
        String[] options = {"I do", "I don’t"};
        int option = JOptionPane.showOptionDialog(
                null,
                "Do you agree",
                "Custom Options",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
        );

        JOptionPane.showMessageDialog(
                null,
                "You've chosen: " + (option == JOptionPane.YES_OPTION ? "I do" : "I dont")
        );
        
        System.exit(0);
    }
}
