package Vintage;

import javax.swing.*;

import Default.MemberMain;
import Default.Show_Accessory;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FirstMain extends JFrame{	// 로그인 전 메인화면
	 JFrame frame;
	 
	/* 생성자 함수 */
	public FirstMain(){
		
		/* 아이콘 생성 */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//
		
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		//쇼핑몰 이름
		JLabel logo = new JLabel("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("나눔바른고딕", Font.BOLD, 120));
		p.add(logo);
		logo.setBounds(250, 150, 700, 400);
		
		JLabel logo2 = new JLabel("Shopping Mall");
		logo2.setForeground(Color.pink);
		logo2.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		p.add(logo2);
		logo2.setBounds(410, 230, 700, 400);
		
		JLabel logo3 = new JLabel("( 주 )     V i n t a g e");
		logo3.setFont(new Font("돋움", Font.BOLD, 15));
		p.add(logo3);
		logo3.setBounds(850, 680, 200, 100);
		
		
		JButton all = new JButton();
		
		p.add(all);
		all.setBounds(0, 0, 1050, 800);
		
		
		// 버튼 투명하게 만들고 편집 불가능  
		all.setOpaque(false);
		all.setContentAreaFilled(false);
		all.setBorderPainted(false);
		
		add(p);		// 전부 패널에 출력
		
		
		/* 패널 설정 */
		setVisible(true);
		setSize(1050,800);		// 패널 크기
		setTitle("Woman DailyLook VINTAGE");		// 패널 제목	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// 종료 조건 생성
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