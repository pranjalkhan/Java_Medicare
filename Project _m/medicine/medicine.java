package medicine;

import javax.swing.*;

import Homepage.Homepage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class medicine extends JFrame implements ActionListener {
    private JPanel panel;
    private JButton searchButton, backButton;
    private JTextField searchField;
    private JLabel[] medicineLabels;
    private JLabel[] priceLabels;
    private String[] medicines = {"Paracetamol", "Ciprofloxacin", "Omeprazole", "Aspirin", "Amlodipine", "Amoxicillin"};
    private double[] prices = {5.0, 10.0, 8.5, 3.0, 15.0, 7.5};
    private Font myFont;

    public medicine() {
        super("Medicine Inventory");
        this.setSize(800, 600);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel(new GridLayout(0, 2));
        panel.setBackground(Color.gray);

        searchField = new JTextField();
        searchButton = new JButton("Search Here");
        backButton = new JButton("Back");

        searchButton.addActionListener(this);
        backButton.addActionListener(this);

        myFont = new Font("Arial", Font.PLAIN, 16);

        medicineLabels = new JLabel[medicines.length];
        priceLabels = new JLabel[prices.length];
        for (int i = 0; i < medicines.length; i++) {
            medicineLabels[i] = new JLabel(medicines[i]);
            medicineLabels[i].setFont(myFont);
            panel.add(medicineLabels[i]);

            priceLabels[i] = new JLabel("$" + prices[i]);
            priceLabels[i].setFont(myFont);
            panel.add(priceLabels[i]);
        }

        panel.add(searchField);
        panel.add(searchButton);
        panel.add(backButton);

        this.add(panel);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == searchButton) {
            String searchText = searchField.getText();
            boolean found = false;
            for (int i = 0; i < medicines.length; i++) {
                if (medicines[i].equalsIgnoreCase(searchText)) {
                    new MedicineDetailsFrame(medicines[i], prices[i]);
                    found = true;
                    break;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "Medicine not found.");
            }
        } 
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                Homepage h = new Homepage();
                h.setVisible(true);
                dispose();
            }
        });
    }

}






