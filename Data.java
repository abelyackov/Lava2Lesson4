import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Data extends JFrame {
    static JTextArea jta1 = new JTextArea();
    static JTextArea jta2 = new JTextArea();
    static JTextArea jta3 = new JTextArea();
    static JButton jb = new JButton("Add");

    static int x1 = 500;
    static int y1 = 300;
    static int x2 = 900;
    static int y2 = 500;

    public Data(JTextArea jta1, JTextArea jta2, JTextArea jta3) throws HeadlessException {
        this.jta1 = jta1;
        this.jta2 = jta2;
        this.jta3 = jta3;
    }

    public Data() {
        setTitle("Данные");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(x1, y1, x2, y2);
        setResizable(false);

        JPanel bottomPanel = new JPanel();
        JPanel centerPanel1 = new JPanel();

        centerPanel1.setBackground(Color.black.gray);

        bottomPanel.setPreferredSize(new Dimension(1, 40));

        add(bottomPanel, BorderLayout.SOUTH);
        add(centerPanel1, BorderLayout.CENTER);

        centerPanel1.setLayout(new BorderLayout());
        bottomPanel.setLayout(new FlowLayout());

        JScrollPane jsp1 = new JScrollPane(jta1);
        JScrollPane jsp2 = new JScrollPane(jta2);
        JScrollPane jsp3 = new JScrollPane(jta3);

        centerPanel1.add(jsp1, BorderLayout.NORTH);
        jsp1.setPreferredSize(new Dimension(1, 35));
        jta1.setEditable(false);
        centerPanel1.add(jsp2, BorderLayout.CENTER);
        jsp2.setPreferredSize(new Dimension(1, 35));
        jta2.setEditable(false);
        centerPanel1.add(jsp3, BorderLayout.SOUTH);
        jsp3.setPreferredSize(new Dimension(1, 35));
        jta3.setEditable(false);

        bottomPanel.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new EnterData();
                jb.setEnabled(false);
            }
        });

        setVisible(true);
    }
}
