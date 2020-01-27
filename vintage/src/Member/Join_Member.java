package Member;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

import Default.MemberMain;

import java.awt.*;
import java.awt.image.*;

import java.sql.*;

public class Join_Member extends JFrame {
	private boolean overlap = true;
	public Join_Member(){
						
			
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		
		JLabel label = new JLabel("�Ϲ� ȸ�� ����");
		label.setFont(label.getFont().deriveFont(20.0f));
		add(label);
		
		Label l1= new Label("�̸�");	
		add(l1);
		
		Label l2 = new Label("���̵�");
		add(l2);
		
		Label l3= new Label("��й�ȣ");
		add(l3);
		
		Label l4 = new Label("��ȭ��ȣ");
		add(l4);
		
		TextField t1 = new TextField();
		add(t1);
		
		JTextField t2 = new JTextField();
		t2.setText("(�ߺ��Ұ�)");
		t2.setEnabled(true);
		add(t2);
		
		TextField t3 = new TextField();
		add(t3);
		t3.setEchoChar('*');
		
		TextField t4 = new TextField();
		add(t4);
		

		l1.setBackground(Color.white);
		l2.setBackground(Color.white);
		l3.setBackground(Color.white);
		l4.setBackground(Color.white);
		
		
		
		JButton j1 = new JButton(new ImageIcon("img/button_img_01/Join3.png"));		// ����
		add(j1);
		
		JButton j2 = new JButton(new ImageIcon("img/button_img_01/Cancel2.png"));				// ���
		add(j2);
		
		JButton j3 = new JButton(new ImageIcon("img/button_img_02/OverlapCheck2.png"));			// �ߺ�Ȯ��
		add(j3);
		
		j1.setBorderPainted(false);
		j1.setFocusPainted(false);
		j1.setContentAreaFilled(false);
		
		j2.setBorderPainted(false);
		j2.setFocusPainted(false);
		j2.setContentAreaFilled(false);
		
		j3.setBorderPainted(false);
		j3.setFocusPainted(false);
		j3.setContentAreaFilled(false);
		
		
		label.setBounds(40, 15, 200, 30);
		l1.setBounds(40, 65, 40, 40);
		l2.setBounds(40, 105, 40, 40);
		l3.setBounds(40, 165, 60, 40);
		l4.setBounds(40, 205, 60, 40);
		
		t1.setBounds(110, 65, 190, 30);
		t2.setBounds(110, 105, 190, 30);
		t3.setBounds(110, 165, 190, 30);
		t4.setBounds(110, 205, 190, 30);
		
		j1.setBounds(150, 260, 70, 30);
		j2.setBounds(230, 260, 70, 30); 
		j3.setBounds(210, 140, 90, 20);
	    add(p);
	    
	    
		setSize(350,350);
		setTitle("VINTAGE �Ϲ�ȸ������");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
       	Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);

		
		/*-----------------------------------------------------------*/
		
		
		/* �ߺ�Ȯ�� */
		j3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ȸ������â���� �̵�
				// TODO Auto-generated method stub
				MemberIDOverlapCheck m1 = new MemberIDOverlapCheck();
				if(m1.check(t2.getText())) 
				{
					/* �ߺ� o */
					JOptionPane.showMessageDialog(null, "���̵� �ߺ��˴ϴ�.");
					overlap = true;
					
				}
				else
				{
					/* �ߺ� x */
					JOptionPane.showMessageDialog(null, "��� ������ ���̵� �Դϴ�.");
					overlap = false;
				}
				
			}
		});;
		
		
		
		
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ȸ������â���� �̵�
				// TODO Auto-generated method stub
				MemberMain f5= new MemberMain();
				dispose();
				}
		});;
		
		
		
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {//ȸ������ ������ ����
				try{
					Member m1 = new Member(t1.getText(), t2.getText(), t3.getText(), t4.getText());
					InsertMemberDB s1 = new InsertMemberDB(m1);
					if(overlap)
					{
						JOptionPane.showMessageDialog(null, "���̵� �ߺ� ���θ� Ȯ�����ֽñ� �ٶ��ϴ�.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "ȸ�������� ���ϵ帳�ϴ�!");
						dispose();
						Login_Form_Member f8= new Login_Form_Member();
					}
				}catch (Exception ex){
					
					JOptionPane.showMessageDialog(null, "�Է¶��� �ٽ� �� �� Ȯ���� �ּ���.");
				}
			}
		});;
		
		
	}
}

