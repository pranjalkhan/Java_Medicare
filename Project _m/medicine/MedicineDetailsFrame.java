package medicine;

import javax.swing.*;
import java.awt.*;


class MedicineDetailsFrame extends JFrame {
    private JLabel nameLabel;
    private JLabel priceLabel;

    public MedicineDetailsFrame(String medicineName, double price) {
        super("Medicine Details");
        this.setSize(300, 200);
        setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(2, 1));
        panel.setBackground(Color.WHITE);

        nameLabel = new JLabel("Medicine Name: " + medicineName);
        priceLabel = new JLabel("Price: $" + price);

        panel.add(nameLabel);
        panel.add(priceLabel);

        this.add(panel);
        this.setVisible(true);
    }
}