package Manager;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.*;

import Default.MemberMain;
import Member.InsertMemberDB;

import java.awt.*;
import java.awt.image.*;

public class Join_Manager extends JFrame {
	public Join_Manager(){
		
		JPanel p = new JPanel();
		p.setBackground(Color.white);
		
		JLabel label = new JLabel("관리자 회원 가입");
		label.setFont(label.getFont().deriveFont(20.0f));
		add(label);
		
		Label l1= new Label("이름");	
		add(l1);
		Label l2 = new Label("아이디");
		add(l2);
		Label l3= new Label("비밀번호");
		add(l3);
		Label l4 = new Label("전화번호");
		add(l4);
	        
		TextField t1 = new TextField();
		add(t1);
		
		JTextField t2 = new JTextField();
		t2.setText("(가입일날짜)");
		t2.setEnabled(true);
		add(t2);
		
		TextField t3 = new TextField();
		t3.setEchoChar('*');
		add(t3);
		
		TextField t4 = new TextField();
		add(t4);
		
		JButton j1 = new JButton(new ImageIcon("img/button_img_01/Join3.png"));
		add(j1);
		
		JButton j2 = new JButton(new ImageIcon("img/button_img_01/Cancel2.png"));
		add(j2);
		
		j1.setBorderPainted(false);
		j1.setFocusPainted(false);
		j1.setContentAreaFilled(false);
		
		j2.setBorderPainted(false);
		j2.setFocusPainted(false);
		j2.setContentAreaFilled(false);
		
		l1.setBackground(Color.white);
		l2.setBackground(Color.white);
		l3.setBackground(Color.white);
		l4.setBackground(Color.white);
		
		label.setBounds(40, 15, 200, 30);
		l1.setBounds(40, 65, 40, 40);
		l2.setBounds(40, 105, 40, 40);
		l3.setBounds(40, 145, 60, 40);
		l4.setBounds(40, 185, 60, 40);
		
		t1.setBounds(120, 65, 180, 30);
		t2.setBounds(120, 105, 180, 30);
		t3.setBounds(120, 145, 180, 30);
		t4.setBounds(120, 185, 180, 30);
		
		j1.setBounds(150, 240, 70, 30);
		j2.setBounds(230, 240, 70, 30); 
		add(p);
		
		
		setSize(350,350);
		setTitle("VINTAGE 관리자 회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
        
        
       	Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);

		
		/*--------------------------------------------------*/
		
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MemberMain m2 = new MemberMain();
				dispose();
				}
		});;
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {//회원가입 데이터 저장
				try{

					Manager m1 = new Manager(t1.getText(), t2.getText(), t3.getText(), t4.getText());
					InsertManagerDB s1 = new InsertManagerDB(m1);
					
					JOptionPane.showMessageDialog(null, "회원가입을 축하드립니다!");
					dispose();
					Login_Form_Manager f8= new Login_Form_Manager();
				}catch (Exception ex){
					JOptionPane.showMessageDialog(null, "입력란을 다시 한 번 확인해 주세요.");
				}
			}
		});;
	}
}

