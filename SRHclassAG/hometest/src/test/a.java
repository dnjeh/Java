package test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class a extends JFrame implements ActionListener {
    JPanel p = new JPanel();
    JButton btnPp = new JButton("증");
    JButton btnMm = new JButton("감");
    JButton btnCls = new JButton("초기화");
    JButton btnTime = new JButton("카운트다운");
    JLabel label = new JLabel("10");
    public a() {
        add(p);
        p.add(btnPp);
        p.add(btnMm);
        p.add(btnCls);
        p.add(btnTime);
        p.add(label);

        btnPp.addActionListener(this);
        btnMm.addActionListener(this);
        btnCls.addActionListener(this);
        btnTime.addActionListener(this);

        setTitle("테스트");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new a();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnPp) {
            label.setText(Integer.toString((Integer.parseInt(label.getText().trim())+1)));
        }
        else if(e.getSource()==btnMm) {
            label.setText(Integer.toString((Integer.parseInt(label.getText().trim())-1)));
        }
        else if(e.getSource()==btnCls) {
            label.setText("10");
            btnTime.setEnabled(true);
        }
        else if(e.getSource()==btnTime) {
            
        }
    }
}
