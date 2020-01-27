package Vintage;

import javax.swing.*;

import Default.MemberMain;
import Default.Show_Accessory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstMain extends JFrame{	// �α��� �� ����ȭ��
	 JFrame frame;
	 
	/* ������ �Լ� */
	public FirstMain(){
		
		/* ������ ���� */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		//���θ� �̸�
		JLabel logo = new JLabel("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("�����ٸ����", Font.BOLD, 120));
		p.add(logo);
		logo.setBounds(250, 150, 700, 400);
		
		JLabel logo2 = new JLabel("Shopping Mall");
		logo2.setForeground(Color.pink);
		logo2.setFont(new Font("�����ٸ����", Font.BOLD, 30));
		p.add(logo2);
		logo2.setBounds(410, 230, 700, 400);
		
		JLabel logo3 = new JLabel("( �� )     V i n t a g e");
		logo3.setFont(new Font("����", Font.BOLD, 15));
		p.add(logo3);
		logo3.setBounds(850, 680, 200, 100);
		
		
		JButton all = new JButton();
		
		p.add(all);
		all.setBounds(0, 0, 1050, 800);
		
		
		// ��ư �����ϰ� ����� ���� �Ұ���  
		all.setOpaque(false);
		all.setContentAreaFilled(false);
		all.setBorderPainted(false);
		
		add(p);		// ���� �гο� ���
		
		
		/* �г� ���� */
		setVisible(true);
		setSize(1050,800);		// �г� ũ��
		setTitle("Woman DailyLook VINTAGE");		// �г� ����	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// ���� ���� ����
		setVisible(true);//
		
		/*---------------------------------------------------------------------*/

		
		all.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				MemberMain m = new MemberMain();
				dispose();
			}
		});
		
	}
	
	
	
}