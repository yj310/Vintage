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
import Vintage.Get_ProductDB2;

import java.awt.image.*;

public class Add_Product extends JFrame{
	Image img = null;
	Product p1;
	
	public Add_Product() {
		//패널 생성
		JPanel p = new JPanel();
        p.setLayout(null);
        
        
        
		JLabel l1 = new JLabel("상  품  명");
		add(l1);
		JLabel l2 = new JLabel("가        격");
		add(l2);
		JLabel l3 = new JLabel("카테고리");
		add(l3);
		
		
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
		TextField t3 = new TextField();
		add(t3);
		
		l1.setBounds(25, 15, 70, 30);
		l2.setBounds(25, 55, 70, 30);
		l3.setBounds(25, 95, 70, 30);
        
		t1.setBounds(100, 15, 250, 30);
		t2.setBounds(100, 55, 250, 30);
		t3.setBounds(100, 95, 250, 30);

		b1.setBounds(20, 135, 100, 30);
		b2.setBounds(280, 135, 70, 30);
		
		add(p);
		setSize(400, 220);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("상품 추가 화면");
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		/*----------------------------------------------*/
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});;
		
		/* 상품 추가 */
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				try {
					int price = Integer.parseInt(t2.getText()); 
					
					switch(t3.getText()) {
						case "아우터": case "상의": case "하의": case "원피스": case "신발": case "악세서리":
						{
							for(int i = 0; i < 100; i ++)
							{
								Get_ProductDB2 g1 = new Get_ProductDB2(); 
					    		g1.Get_Product3(i + 1);
					    		if(g1.getTitle() == null){
					    			p1 = new Product((i+1), t1.getText(), price, t3.getText());
									Add_ProductDB a1 = new Add_ProductDB(p1);
					    			break;
					    		}
							}
							
							JOptionPane.showMessageDialog(null, "상품이 정상적으로 추가되었습니다.");
							dispose();
							dispose();
							break;
						}
						default:
						{
							JOptionPane.showMessageDialog(null, "존재하지 않는 카테고리입니다.");
							break;
						}
					
					
					}
					
				}
				catch(Exception ex){
					JOptionPane.showMessageDialog(null, "입력란을 다시 한 번 확인해 주세요.");
				}
				
				
				
				
				
			}
		});;
		
		
		
		
	}
}

