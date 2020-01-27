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

public class Add_Stock extends JFrame{
	Image img = null;
	public Add_Stock() {
		//패널 생성
		JPanel p = new JPanel();
        p.setLayout(null);
        
		JLabel l1 = new JLabel("상  품  명");
		add(l1);
		JLabel l2 = new JLabel("재       고");
		add(l2);
		
		JButton b1 = new JButton("뒤로가기");
        b1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		b1.setBackground(Color.white);
		add(b1);
		
		JButton b2 = new JButton("추가");
        b2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
		b2.setBackground(Color.white);
		add(b2);
		
		TextField t1 = new TextField();
		add(t1);
		TextField t2 = new TextField();
		add(t2);
		
		l1.setBounds(25, 15, 70, 30);
		l2.setBounds(25, 55, 70, 30);
		
		t1.setBounds(100, 15, 250, 30);
		t2.setBounds(100, 55, 250, 30);
		
		b1.setBounds(20, 100, 100, 30);
		b2.setBounds(280, 100, 70, 30);
		
		add(p);
		setSize(400, 190);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("재고 추가 화면");
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		/*---------------------------------------------------*/
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});;
		
		/* 재고 추가 */
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					Add_StockDB a1 = new Add_StockDB();
					if(a1.Add(t1.getText(), t2.getText()))
					{
						JOptionPane.showMessageDialog(null, "재고가 정상적으로 추가되었습니다.");
						
						dispose();
					}
					else
					{
						JOptionPane.showMessageDialog(null, "존재하지 않는 상품입니다.");
					}
					
					
					
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "입력란을 다시 한 번 확인해 주세요.");
				}
				
			}
		});;
		
		
		
	}
}

