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

public class ManagerMain extends JFrame{
	Image img = null;
	public ManagerMain(Manager m1)
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
		JLabel label = new JLabel("VINTAGE STAFF");
		label.setFont(label.getFont().deriveFont(30.0f));
		p.add(label);
		JButton b1 = new JButton(new ImageIcon("img/button_img_02/ProductControl1.png"));	// 상품관리
		b1.setFont(new Font("나눔바른고딕", Font.BOLD, 15));
		add(b1);
		JButton b2 = new JButton(new ImageIcon("img/button_img_02/MemberControl.png"));	// 회원관리
		b2.setFont(new Font("나눔바른고딕", Font.BOLD, 15));
		b2.setFont(b2.getFont().deriveFont(20.0f));
		add(b2);
		JButton b3 = new JButton(new ImageIcon("img/button_img_02/StockCheck1.png"));	//재고조회
		b3.setFont(new Font("나눔바른고딕", Font.BOLD, 15));
		b3.setFont(b3.getFont().deriveFont(20.0f));
		add(b3);
		JButton b4 = new JButton(new ImageIcon("img/button_img_01/Logout1.png"));	//로그아웃
		b4.setFont(new Font("나눔바른고딕", Font.BOLD, 15));
		add(b4);
		JLabel manager = new JLabel(m1.getName() + " 관리자님");
		manager.setFont(manager.getFont().deriveFont(15.0f));
		p.add(manager);
		
		label.setBounds(22, 20, 500, 40);
		b1.setBounds(22, 60, 230, 40);
		b2.setBounds(22, 110, 230, 40);
		b3.setBounds(22, 160, 230, 40);
		b4.setBounds(163, 210, 90, 30);
		manager.setBounds(20, 240, 200, 50);
		
		add(p);
		setSize(300, 350);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Manager Main ");
		setVisible(true);
		
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
		
		
		/*---------------------------------------------------*/
		
		
		b1.addActionListener(new ActionListener() {//상품관리
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Supervise_Product f2= new Supervise_Product(m1);
				dispose();
			}
		});;
		b2.addActionListener(new ActionListener() {//회원관리
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Check_Member f2= new Check_Member(m1);
				dispose();
			}
		});;
		b3.addActionListener(new ActionListener() {//재고조회
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Supervise_Stock f2= new Supervise_Stock(m1);
				dispose();
			}
		});;
		
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//로그아웃
				// TODO Auto-generated method stub
					
				int result =JOptionPane.showConfirmDialog(null, "정말 로그아웃 하시겠습니까?", getWarningString(), JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.CLOSED_OPTION) {
					//예, 아니오 선택을 하지 않고 창을 닫은 경우
				}
				else if(result ==JOptionPane.YES_OPTION) {
					//예를 선택한 경우
					JOptionPane.showMessageDialog(null, "로그아웃이 완료되었습니다.");
					MemberMain f6= new MemberMain();
					dispose();
				}
				else {
					//아니오를 선택한 경우
				}		
				
			}
		});;
	}
}

