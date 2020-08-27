import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Aug 01 09:12:13 CST 2020
 */



/**
 * @author unknown
 */
public class test extends JFrame {
    public test() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        label1 = new JLabel();
        button1 = new JButton();
        scrollPane1 = new JScrollPane();
        textArea1 = new JTextArea();
        textField1 = new JTextField();
        comboBox1 = new JComboBox();

        //======== this ========
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        //---- label1 ----
        label1.setText("zhaiyi");
        label1.setFont(label1.getFont().deriveFont(label1.getFont().getSize() + 7f));
        label1.setLabelFor(textArea1);
        contentPane.add(label1, BorderLayout.EAST);

        //---- button1 ----
        button1.setText("text");
        contentPane.add(button1, BorderLayout.NORTH);

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(textArea1);
        }
        contentPane.add(scrollPane1, BorderLayout.SOUTH);
        contentPane.add(textField1, BorderLayout.WEST);
        contentPane.add(comboBox1, BorderLayout.CENTER);
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    private JLabel label1;
    private JButton button1;
    private JScrollPane scrollPane1;
    private JTextArea textArea1;
    private JTextField textField1;
    private JComboBox comboBox1;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
