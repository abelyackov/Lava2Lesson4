import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnterData extends JFrame {

    int x1 = (Data.x2 / 4 + Data.x1);
    int y1 = (Data.y2 / 4 + Data.y1);
    int x2 = Data.x2 / 2;
    int y2 = Data.y2 / 2;

    public EnterData() {
        setTitle("Ввод данных");
        setBounds(x1, y1, x2, y2);
        setResizable(false);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel1 = new JPanel();

        centerPanel1.setBackground(Color.black.gray);

        bottomPanel.setPreferredSize(new Dimension(1, 35));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel1, BorderLayout.CENTER);

        centerPanel1.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JButton jb1 = new JButton("Ok");
        JTextField jtf1 = new JTextField();
        JTextField jtf2 = new JTextField();
        JTextField jtf3 = new JTextField();
        JScrollPane jsp1 = new JScrollPane(jtf1);
        JScrollPane jsp2 = new JScrollPane(jtf2);
        JScrollPane jsp3 = new JScrollPane(jtf3);

        centerPanel1.add(jsp1, BorderLayout.NORTH);
        jsp1.setPreferredSize(new Dimension(1, 25));

        centerPanel1.add(jsp2, BorderLayout.CENTER);
        jsp2.setPreferredSize(new Dimension(1, 25));

        centerPanel1.add(jsp3, BorderLayout.SOUTH);
        jsp3.setPreferredSize(new Dimension(1, 25));

        bottomPanel.add(jb1);

        jb1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Data.jta1.setText(jtf1.getText());
                Data.jta2.setText(jtf2.getText());
                Data.jta3.setText(jtf3.getText());
                Data.jb.setEnabled(true);
                dispose();
            }
        });

        setVisible(true);
    }
}
