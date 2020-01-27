package Manager;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import Default.MemberMain;
import Manager.Enter_Code;
import Manager.Login_Form_Manager;
import Member.Join_Member;
import Member.Login_Form_Member;
import Member.MemberIDOverlapCheck;

import java.awt.image.*;

public class Distroy_Product extends JFrame{
	Image img = null;
	public Distroy_Product() {
		//�г� ����
		JPanel p = new JPanel();
        p.setLayout(null);
        
		JLabel l1 = new JLabel("��  ǰ  ��");
		add(l1);
		
		JButton b1 = new JButton("�ڷΰ���");
        b1.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
		b1.setBackground(Color.white);
		add(b1);

		JButton b2 = new JButton("����");
        b2.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
		b2.setBackground(Color.white);
		add(b2);
		
		TextField t1 = new TextField();
		add(t1);
		
		l1.setBounds(25, 15, 70, 30);
		
		t1.setBounds(100, 15, 250, 30);
		
		b1.setBounds(20, 70, 100, 30);
		b2.setBounds(280, 70, 70, 30);
		
		add(p);
		setSize(400, 160);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("��ǰ ���� ȭ��");
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});;
		
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					Distroy_ProductDB a1 = new Distroy_ProductDB();
					
					if(a1.Distroy(t1.getText()))
					{
						JOptionPane.showMessageDialog(null, "��ǰ�� ���������� �����Ǿ����ϴ�.");
						
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "�������� �ʴ� ��ǰ�Դϴ�.");
					}
					
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "�Է¶��� �ٽ� �� �� Ȯ���� �ּ���.");
				}
			}
		});;
		
		
	}
}

