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
		
		JLabel label = new JLabel("일반 회원 가입");
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
		t2.setText("(중복불가)");
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
		
		
		
		JButton j1 = new JButton(new ImageIcon("img/button_img_01/Join3.png"));		// 가입
		add(j1);
		
		JButton j2 = new JButton(new ImageIcon("img/button_img_01/Cancel2.png"));				// 취소
		add(j2);
		
		JButton j3 = new JButton(new ImageIcon("img/button_img_02/OverlapCheck2.png"));			// 중복확인
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
		setTitle("VINTAGE 일반회원가입");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
       
       	Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);

		
		/*-----------------------------------------------------------*/
		
		
		/* 중복확인 */
		j3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				MemberIDOverlapCheck m1 = new MemberIDOverlapCheck();
				if(m1.check(t2.getText())) 
				{
					/* 중복 o */
					JOptionPane.showMessageDialog(null, "아이디가 중복됩니다.");
					overlap = true;
					
				}
				else
				{
					/* 중복 x */
					JOptionPane.showMessageDialog(null, "사용 가능한 아이디 입니다.");
					overlap = false;
				}
				
			}
		});;
		
		
		
		
		j2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				MemberMain f5= new MemberMain();
				dispose();
				}
		});;
		
		
		
		
		j1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent T) {//회원가입 데이터 저장
				try{
					Member m1 = new Member(t1.getText(), t2.getText(), t3.getText(), t4.getText());
					InsertMemberDB s1 = new InsertMemberDB(m1);
					if(overlap)
					{
						JOptionPane.showMessageDialog(null, "아이디 중복 여부를 확인해주시기 바랍니다.");
					}
					else
					{
						JOptionPane.showMessageDialog(null, "회원가입을 축하드립니다!");
						dispose();
						Login_Form_Member f8= new Login_Form_Member();
					}
				}catch (Exception ex){
					
					JOptionPane.showMessageDialog(null, "입력란을 다시 한 번 확인해 주세요.");
				}
			}
		});;
		
		
	}
}

