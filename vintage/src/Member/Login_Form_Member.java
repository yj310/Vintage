package Member;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import Default.MemberMain;
import Vintage.Join_Identity;

import java.awt.image.*;
import java.sql.*;

public class Login_Form_Member extends JFrame{
	Image img = null;
	public Login_Form_Member()
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        
		JLabel label = new JLabel("LOG IN");
		label.setFont(label.getFont().deriveFont(20.0f));
		p.add(label);
		
		JLabel b2= new JLabel("아이디 :");
		b2.setFont(b2.getFont().deriveFont(12.5f));
		add(b2);
		
		JLabel b3= new JLabel("비밀번호 :");
		b3.setFont(b3.getFont().deriveFont(12.5f));
		add(b3);
		
		TextField b4 = new TextField();
		add(b4);
		
		TextField b5 = new TextField();
		add(b5);
		b5.setEchoChar('*');//암호화
		
		JButton b6 = new JButton(new ImageIcon("img/button_img_01/LogIn1.png"));
		add(b6);
		
		JButton b7 = new JButton(new ImageIcon("img/button_img_01/MemberJoin1.png"));
		add(b7);
		
		JButton b8 = new JButton(new ImageIcon("img/button_img_01/Main1.png"));
		add(b8);
		
		JLabel member = new JLabel("(일반 회원)");
		member.setFont(member.getFont().deriveFont(15.0f));
		p.add(member);
		
		
		b6.setBorderPainted(false);
		b6.setFocusPainted(false);
		b6.setContentAreaFilled(false);
		
		b7.setBorderPainted(false);
		b7.setFocusPainted(false);
		b7.setContentAreaFilled(false);
		
		b8.setBorderPainted(false);
		b8.setFocusPainted(false);
		b8.setContentAreaFilled(false);
		
		
		label.setBounds(120, 20, 100, 40);
		b2.setBounds(52, 60, 50, 40);
		b3.setBounds(38, 100, 70, 40);
		b4.setBounds(120, 60, 230, 30);
		b5.setBounds(120, 100, 230, 30);
		b6.setBounds(160, 150, 90, 30);
		b7.setBounds(260, 150, 90, 30);
		b8.setBounds(10, 150, 90, 30);
		member.setBounds(200, 15, 200, 50);
		add(p);
		
		
		setSize(400, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Member Login ");
		setVisible(true);
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		
		/*-------------------------------------------------------*/
		
		
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				MemberMain f = new MemberMain();
				dispose();
			}
		});;
		
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				Join_Identity f2 = new Join_Identity();
				dispose();
			}
		});;
		
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e2) {//로그인 할때 
				// TODO Auto-generated method stub
				
				FindMemberDB f1 = new FindMemberDB();
				Member m1 = f1.FindMember(b4.getText(), b5.getText());
				
				if(m1 != null)
				{
					JOptionPane.showMessageDialog(null, "♥ Welcome to VINTAGE ♥");
					Mypage f3 = new Mypage(m1);
					dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호가 틀렸습니다.");
					Login_Form_Member f2= new Login_Form_Member();
				}
				dispose();
				
			}
		});
		
		
	}
}

