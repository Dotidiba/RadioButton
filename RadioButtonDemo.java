import javax.swing.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame implements ActionListener {

    // Objects
    JRadioButton bird, cat, dog, rabbit, pig;
    JLabel picture;

    public RadioButtonDemo() {

        setTitle("Pet Selector");
        setSize(600, 400);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create radio buttons
        bird = new JRadioButton("Bird");
        cat = new JRadioButton("Cat");
        dog = new JRadioButton("Dog");
        rabbit = new JRadioButton("Rabbit");
        pig = new JRadioButton("Pig");

        // Position radio buttons
        bird.setBounds(20, 50, 100, 30);
        cat.setBounds(20, 90, 100, 30);
        dog.setBounds(20, 130, 100, 30);
        rabbit.setBounds(20, 170, 100, 30);
        pig.setBounds(20, 210, 100, 30);

        // Group radio buttons
        ButtonGroup pets = new ButtonGroup();
        pets.add(bird);
        pets.add(cat);
        pets.add(dog);
        pets.add(rabbit);
        pets.add(pig);

        // Add interface listener
        bird.addActionListener(this);
        cat.addActionListener(this);
        dog.addActionListener(this);
        rabbit.addActionListener(this);
        pig.addActionListener(this);

        // Label for displaying images
        picture = new JLabel();
        picture.setBounds(180, 50, 300, 250);

        // Add components
        add(bird);
        add(cat);
        add(dog);
        add(rabbit);
        add(pig);
        add(picture);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (bird.isSelected()) {
            picture.setIcon(new ImageIcon("images/bird.jpg"));
            JOptionPane.showMessageDialog(this,
                    "You selected Bird");
        }

        else if (cat.isSelected()) {
            picture.setIcon(new ImageIcon("images/cat.jpg"));
            JOptionPane.showMessageDialog(this,
                    "You selected Cat");
        }

        else if (dog.isSelected()) {
            picture.setIcon(new ImageIcon("images/dog.jpg"));
            JOptionPane.showMessageDialog(this,
                    "You selected Dog");
        }

        else if (rabbit.isSelected()) {
            picture.setIcon(new ImageIcon("images/rabbit.jpg"));
            JOptionPane.showMessageDialog(this,
                    "You selected Rabbit");
        }

        else if (pig.isSelected()) {
            picture.setIcon(new ImageIcon("images/pig.jpg"));
            JOptionPane.showMessageDialog(this,
                    "You selected Pig");
        }
    }

    public static void main(String[] args) {

        new RadioButtonDemo();

    }
}
