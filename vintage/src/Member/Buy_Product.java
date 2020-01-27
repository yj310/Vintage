package Member;

import javax.swing.*;

import org.w3c.dom.css.RGBColor;

import Default.MemberMain;
import Default.Search;

import java.awt.image.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import Vintage.Get_ProductDB2;
import Vintage.Join_Identity;
import Vintage.Login_Identity;

public class Buy_Product extends JFrame{	

	 int num = 5;
	 
	 JFrame frame;
	 JPanel panel = new JPanel();
	
	 int click = 0;
	 
	 Font ProNaFont = new Font("함초롬돋움", Font.BOLD, 23);
	 Font mainFont = new Font("함초롬돋움", Font.BOLD, 20);
	 Font ButFont = new Font("함초롬돋움", Font.BOLD, 15);
	
	/* 생성자 함수 */
	public Buy_Product(Member m1, int id){


		Get_ProductDB2 g1 = new Get_ProductDB2(); 
		g1.Get_Product3(id);		// 제품 id 이용해 상품 적출
		
		
		/* 아이콘 생성 */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//
		
		
		/* 전체화면 패널 설정 */
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		/* 구매 패널 설정 */
		panel.setLayout(null);
		panel.setVisible(true); 
		panel.setBackground(Color.pink);
		p.add(panel);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.white);
		p1.setVisible(true);
		p1.setLayout(null);
		panel.add(p1);
		p1.setBounds(450, 20, 510, 410);
		
		/* 구매 패널 내용 */
		//상품명
		ImageIcon img1 = new ImageIcon("img/product_img_big/" + id + ".gif");
		JLabel img2 = new JLabel(img1);
	
		panel.add(img2);
	
		JLabel pl1 = new JLabel(g1.getTitle());
		pl1.setFont(new Font("함초롬돋움", Font.BOLD, 30));
		p1.add(pl1);
		
		//가격
		JLabel pl2 = new JLabel("가격 : " + g1.getPrice() + "원");
		pl2.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		p1.add(pl2);
		
		//재고
		JLabel pl3 = new JLabel("재고 :  " + g1.getStock());
		pl3.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		p1.add(pl3);
		
		//구매수량
		JLabel pl4 = new JLabel("구매수량");
		pl4.setFont(new Font("함초롬돋움", Font.PLAIN, 25));
		p1.add(pl4);
		
		//구매버튼
		ImageIcon buy_img = new ImageIcon("img/button_img_01/BuyNow.png");
		JButton buy = new JButton(buy_img);
		p1.add(buy);
		
		
		 //개수 나타내기
        JTextField stock = new JTextField(click);
        stock.setEnabled(false);
        stock.setFont(new Font("함초롬바탕", Font.BOLD, 23));
       
        //개수 늘리기
        JButton count1 = new JButton(new ImageIcon("img/button_img_01/Decrease1.png"));
        JButton count2 = new JButton(new ImageIcon("img/button_img_01/Increase2.png"));
        p1.add(count1);
        p1.add(count2);
        p1.add(stock);
		
        
        count1.setBorderPainted(false);				
        count1.setFocusPainted(false);				
        count1.setContentAreaFilled(false);	
		
        count2.setBorderPainted(false);				
        count2.setFocusPainted(false);				
        count2.setContentAreaFilled(false);	
        
        
        img2.setBounds(10, 10, 400, 420);
        
		pl1.setBounds(30, 20, 500, 40);	// 상품명
		pl2.setBounds(30, 95, 300, 40);	// 가격
		pl3.setBounds(30, 170, 300, 40);	// 재고
		pl4.setBounds(30, 245, 150, 40);	// "구매수량"
		buy.setBounds(30, 340, 450, 55);	// 구매 버튼
		
		count1.setBounds(210, 250, 34, 40);	// 감소
		stock.setBounds(260, 250, 40, 40);	// 구매수량
		count2.setBounds(315, 250, 34, 40);	// 증가
	     
	     
		//구매버튼 누르면 결제
		buy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				if(click > Integer.parseInt(g1.getStock())) 
				{
					JOptionPane.showMessageDialog(null, "재고가 원하는 수량보다 적습니다.");
					
				}
				else if(click < 1) 
				{
					JOptionPane.showMessageDialog(null, "구매수량을 지정해주십시오.");
				}
				else
				{
					Buy f2= new Buy(m1, click, g1.getTitle(), Integer.parseInt(g1.getPrice()));
					dispose();
				}
				
			}
		});;
		
		//늘리기
		count2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				if(click<30) {
					
					click += 1;
					stock.setText(""+click);
					
				}
				
			}
		});;
		
		//줄어들기
		count1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				if(click>0) {
					click -= 1;
					stock.setText(""+click);
				}
				
			}
		});;
		
		/*------------------------------------------------------------------------*/
		
		
		//쇼핑몰 이름
		JButton logo = new JButton("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("", Font.BOLD, 50));
		p.add(logo);
		
		JTextField t1 = new JTextField();
		add(t1);
		
		/* 버튼 및 이미지 생성 */
		JButton b2 = new JButton(new ImageIcon("img/button_img_01/Guide1.png"));
		b2.setFont(ButFont);
		p.add(b2);
		
		JButton b3 = new JButton(new ImageIcon("img/button_img_01/Logout1.png"));
		b3.setFont(ButFont);
		p.add(b3);
		
		Color b = new Color(255, 25, 86);
		
		JLabel member = new JLabel(m1.getName());
		member.setFont(member.getFont().deriveFont(15.0f));
		member.setForeground(b);
		p.add(member);
		
		JLabel member1 = new JLabel("회원님 환영합니다 ♥");
		member1.setFont(member.getFont().deriveFont(15.0f));
		p.add(member1);
		
		JButton b5 = new JButton("아우터");
		b5.setFont(ProNaFont);
		p.add(b5);
		
		JButton b6 = new JButton("상의");
		p.add(b6);
		b6.setFont(ProNaFont);
		
		JButton b7 = new JButton("하의");
		p.add(b7);
		b7.setFont(ProNaFont);
		
		JButton b8 = new JButton("원피스");
		p.add(b8);
		b8.setFont(ProNaFont);
		
		JButton b9 = new JButton("신발");
		p.add(b9);
		b9.setFont(ProNaFont);
		
		JButton b10 = new JButton("액세서리");
		p.add(b10);
		b10.setFont(ProNaFont);
		
		

		/* 이미지 버튼 생성 */
		ImageIcon Imageicon = new ImageIcon("img/button_img_03/search.png");		// 검색 버튼(이미지 주로 불러오기)
		JButton button = new JButton(Imageicon);
		p.add(button);
		
		new JButton(new ImageIcon("img/button_img_03/search.png"));				// 검색 버튼 사진 추가
		
		
		
		// 수정 불가능한 버튼 생성
		button.setBorderPainted(false);				// border
		button.setFocusPainted(false);				// 중심점
		button.setContentAreaFilled(false);			// 넓이
		
		b2.setBorderPainted(false);				
		b2.setFocusPainted(false);				
		b2.setContentAreaFilled(false);	
		
		b3.setBorderPainted(false);				
		b3.setFocusPainted(false);				
		b3.setContentAreaFilled(false);	
		
		
		/* 버튼 및 텍스트의 위치 설정 */
		logo.setBounds(0, 30, 260, 50);
		t1.setBounds(300, 30, 300, 50);
		button.setBounds(260, 35, 40, 40);
		b2.setBounds(620, 33, 100, 43);
		b3.setBounds(715, 33, 100, 43);
		member.setBounds(820, 30, 50, 50);
		member1.setBounds(870, 30, 220, 50);
		
		b5.setBounds(40, 120, 120, 50);
		b6.setBounds(202, 120, 120, 50);
		b7.setBounds(364, 120, 120, 50);
		b8.setBounds(526, 120, 120, 50);
		b9.setBounds(688, 120, 120, 50);
		b10.setBounds(850, 120, 140, 50);
		
		panel.setBounds(30, 250, 980, 450);//구매 패널 생성
		
	
		
		/* 버튼 투명하게 만들고 편집 불가능  */
		logo.setOpaque(false);
		logo.setContentAreaFilled(false);
		logo.setBorderPainted(false);
		
		b5.setOpaque(false);
		b5.setContentAreaFilled(false);
		b5.setBorderPainted(false);
		
		b6.setOpaque(false);
		b6.setContentAreaFilled(false);
		b6.setBorderPainted(false);
		
		b7.setOpaque(false);
		b7.setContentAreaFilled(false);
		b7.setBorderPainted(false);
		
		b8.setOpaque(false);
		b8.setContentAreaFilled(false);
		b8.setBorderPainted(false);
		
		b9.setOpaque(false);
		b9.setContentAreaFilled(false);
		b9.setBorderPainted(false);
		
		b10.setOpaque(false);
		b10.setContentAreaFilled(false);
		b10.setBorderPainted(false);//
		
		add(p);		// 전부 패널에 출력
		
		/* 패널 설정 */
		
		setSize(1050,800);		// 패널 크기
		setTitle("Woman DailyLook VINTAGE");		// 패널 제목	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// 종료 조건 생성
		setVisible(true);
		
		/*----------------------------------------------*/
		
		
		/* 검색 실행 */
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Search_Mem f6= new Search_Mem(t1.getText(), m1);	
				dispose();			
			}
		});;
		
		/* 고객센터 실행 */
		b2.addActionListener(new ActionListener() {				// 회원가입 버튼을 누르면
			@Override
			public void actionPerformed(ActionEvent e) {// 회원가입창으로 이동
				// TODO Auto-generated method stub
				Guide_Mem f10= new Guide_Mem();
			}
		});;//
		
		/* 로그아웃 실행 */
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// 로그인창으로 이동
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
		/*
		showMessageDialog : 단순 알림창(경고창, 메시지 박스)을 띄웁니다.
		showConfirmDialog : 확인창(예/아니오, 확인/취소 등)을 띄웁니다.
		showInputDialog : 질문창을 띄웁니다. 간단한 입력 결과를 받습니다.
		showOptionDialog : 확인창과 비슷한데, 예/아니오 대신 선택 버튼의 말을 직접 정해줄 수 있습니다.
		 */
		
		/*-----------------------------------------------*/
		

		/* 로고 선택 */
		logo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Mypage m2 = new Mypage(m1);
				dispose();			// 매인 패널 삭제
			}
		});;
		
		/* 아우터 선택 */
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Outer_Mem s1 = new Show_Outer_Mem(m1);
				dispose();
			}
		});
		
		/* 상의 선택 */
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Top_Mem s2 = new Show_Top_Mem(m1);
				dispose();
			}
		});
		
		
		/* 하의 선택 */
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Bottoms_Mem s3 = new Show_Bottoms_Mem(m1);
				dispose();
			}
		});
		
		/* 원피스 선택 */
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_OnePiece_Mem s4 = new Show_OnePiece_Mem(m1);
				dispose();
			}
		});
		
		/* 신발 선택 */
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Shoes_Mem s5 = new Show_Shoes_Mem(m1);
				dispose();
			}
		});
		
		/* 악세서리 선택 */
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Accessory_Mem s6 = new Show_Accessory_Mem(m1);
				dispose();
			}
		});	
	}
	
}