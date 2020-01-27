package Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import Default.MemberMain;

import java.awt.image.*;

public class Enter_Code extends JFrame{
	Image img = null;
	public Enter_Code()
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
		JLabel label = new JLabel("Enter Manager Code");
		label.setFont(label.getFont().deriveFont(20.0f));
		p.add(label);
		
		TextField b1 = new TextField();
		add(b1);
		b1.setEchoChar('*');//암호화
		
		JButton b2 = new JButton(new ImageIcon("img/button_img_01/Ok3.png"));		// 확인
		add(b2);
		
		JButton b3 = new JButton(new ImageIcon("img/button_img_01/Cancel2.png"));		// 취소
		add(b3);
		
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
		
		b3.setBorderPainted(false);
		b3.setFocusPainted(false);
		b3.setContentAreaFilled(false);
		
		label.setBounds(52, 20, 500, 40);
		b1.setBounds(52, 60, 250, 40);
		b2.setBounds(230, 110, 70, 40);
		b3.setBounds(150, 110, 70, 40);
		add(p);
		
		
		setSize(370, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Enter Code ");
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		/*-------------------------------------------------------------*/
		
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(b1.getText().equals("11151117")){
		            JOptionPane.showMessageDialog(null, "Success");
		            // 코드 확인            
		            Join_Manager f1= new Join_Manager();
		            dispose();
		        }else{
		            JOptionPane.showMessageDialog(null, "Faild");
		        }
			}
		});;
		
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub         
		            MemberMain f1= new MemberMain();
		            dispose();
			}
		});;
	}
}

