package Vintage;

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

import java.awt.image.*;

public class Join_Identity extends JFrame{//로그인화면
	Image img = null;
	public Join_Identity()
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        /* 관리자 */
		ImageIcon Imageicon = new ImageIcon("img/button_img_03/manager.png");
		JButton button1 = new JButton("관리자", Imageicon);
		button1.setFont(button1.getFont().deriveFont(20.0f));
		p.add(button1);
		
		button1.setBorderPainted(false);
		button1.setFocusPainted(false);
		button1.setContentAreaFilled(false);
		
		/* 일반회원 */
		ImageIcon Imageicon1 = new ImageIcon("img/button_img_03/member.png");
		JButton button2 = new JButton("일반회원", Imageicon1);
		button2.setFont(button2.getFont().deriveFont(20.0f));
		p.add(button2);
		
		button2.setBorderPainted(false);
		button2.setFocusPainted(false);
		button2.setContentAreaFilled(false);
		
		
		/* 뒤로가기 */
		JButton j1 = new JButton(new ImageIcon("img/button_img_01/Back1.png"));
		p.add(j1);
		
		j1.setBorderPainted(false);
		j1.setFocusPainted(false);
		j1.setContentAreaFilled(false);
		
		/* 버튼위치 */
		button1.setBounds(40, 40, 230, 150);
		button2.setBounds(40, 200, 250, 150);
		j1.setBounds(240, 400, 100, 30);
		
		add(p);
		setSize(400, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Join Identity ");
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		
		/*---------------------------------------------------------------------*/
		
		
		/* 관리자 회원가입 선택 시 */
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Enter_Code f1= new Enter_Code();
				dispose();
			}
		});;
		
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Join_Member f2= new Join_Member();
				dispose();
			}
		});;
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MemberMain f2= new MemberMain();
				dispose();
			}
		});;
		
	}
}

