package Default;

import javax.swing.*;

import java.awt.image.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;

import Vintage.Get_ProductDB;
import Vintage.Get_ProductDB2;
import Vintage.Join_Identity;
import Vintage.Login_Identity;

public class Show_Bottoms extends JFrame{
	 
	int num = 100;
	String category="하의";
	int count = 0;
	
	JFrame frame;
	JButton[] product_Button = new JButton[num];
	JScrollPane scroll = new JScrollPane();
	JPanel[] line = new JPanel[13];
	
	JPanel panel = new JPanel();
	
	
	ImageIcon [] img0 = new ImageIcon[num];
	JLabel [] title = new JLabel[num];
	JLabel [] price = new JLabel[num];
	Get_ProductDB g = new Get_ProductDB();
	
	
	GridBagLayout Gbag = new GridBagLayout();
	GridBagConstraints gbc1;
	
	
	Font ProNaFont = new Font("함초롬돋움", Font.BOLD, 23);
	Font mainFont = new Font("함초롬돋움", Font.BOLD, 20);
	Font ButFont = new Font("함초롬돋움", Font.BOLD, 15);
	
	/* 생성자 함수 */
	public Show_Bottoms(){
		
		/* 아이콘 생성 */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//

		/* 전체화면 패널 설정 */
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		/* 스크롤페인 내의 패널 설정 */
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setLayout(Gbag);  
		panel.setBackground(Color.pink);


		/* 상품버튼들 설정 */
		for(int i = 0; i < num; i++) {
			product_Button[i] = new JButton();
			product_Button[i].setLayout(Gbag);
			product_Button[i].setBackground(Color.white);
		}
		
		/* 상품버튼이 모인 하나의 줄, line 패널 설정 */
		for(int i = 0; i < line.length; i++)
		{
			line[i] = new JPanel();
			line[i].setBackground(Color.pink);
					
		}
		
		
		//쇼핑몰 이름
		JButton logo = new JButton("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("나눔바른고딕", Font.BOLD, 50));
		p.add(logo);
		
		
		JTextField t1 = new JTextField();
		add(t1);
		//검색 이미지
		JLabel searchImage = new JLabel (new ImageIcon("img/button_img_03/search.png"));
		add(searchImage);
		
		
		/* 버튼 및 이미지 생성 */
		JButton b2 = new JButton(new ImageIcon("img/button_img_01/MemberJoin1.png"));
		b2.setFont(ButFont);
		p.add(b2);
		
		JButton b3 = new JButton(new ImageIcon("img/button_img_01/LogIn1.png"));
		b3.setFont(ButFont);
		p.add(b3);
		
		JButton b4 = new JButton(new ImageIcon("img/button_img_01/Guide1.png"));
		b4.setFont(ButFont);
		p.add(b4);
		
		
		
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
		
		JLabel category_label = new JLabel(category);
		category_label.setFont(new Font("나눔바른고딕", Font.BOLD, 30));
		p.add(category_label);
		
		JButton exit = new JButton("종료");
		exit.setBackground(Color.white);
		exit.setFont(new Font("", Font.BOLD, 15));
		p.add(exit);
		
		exit.setBounds(920, 710, 80, 30);
		
		/* 이미지 버튼 생성 */
		ImageIcon Imageicon = new ImageIcon("img/button_img_03/search.png");		// 검색 버튼(이미지 주로 불러오기)
		JButton button = new JButton(Imageicon);
		p.add(button);
		
		new JButton(new ImageIcon("img/button_img_03/search.png"));				// 검색 버튼 사진 추가
		
		
		
		
		
		
		
		/*--------스크롤 패인 구성------------*/
		
		/* 카테고리가 아우터인 제품을 구해서 product_Button 생성*/
		for(int i = 0; i < num; i++)
		{
			
			int a = g.Get_Product(category, (i+1));
			
			
			if(a != 0) {
				
				Get_ProductDB2 g1 = new Get_ProductDB2(); 
				
				g1.Get_Product3(a);		// 제품 id 이용해 상품 적출
				
				img0[count] = new ImageIcon("img/product_img_small/" + a + ".gif");
				JLabel imge = new JLabel( img0[count]);
				create_Button(imge, 1,0,30,10, count);
				
				
				title[count] = new JLabel(""+g1.getTitle()+"", SwingConstants.CENTER);
				title[count].setFont(mainFont);
				create_Button(title[count], 1,70,30,10, count);
				
				
				price[count] = new JLabel(g1.getPrice() + " 원", SwingConstants.CENTER);
				price[count].setFont(mainFont);
				create_Button(price[count], 1,100,30,10, count);
				
				
				count++;
			}
			else
			{
				continue;
			}
		}
		
		

		for(int i = 0; i < count; i++) 
		{
			line[(i/4)].add(product_Button[i]);  // line패널에 product_Button버튼 추가
		}
		
		/* 스크롤 패인의 전체화면인 panel패널에 line패널을 넣은 후 위치, 크기 설정*/
		for(int i = 0; i <= ((count-1)/4); i++) {
			create_panel(line[i], 50, (i*300)+(i*10), 900, 300);
		}
		
		
		scroll = new JScrollPane(panel,					//스크롤패널 선언
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,		//스크롤바가 계속 보이게 함
	            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setBounds(0,  0, 980,  10000);
		
		p.add(scroll);
		
		
		
		
		
		
		
		
		//버튼을 투명하게하고 이미지만 띄움
		button.setBorderPainted(false);				// border
		button.setFocusPainted(false);				// 중심점
		button.setContentAreaFilled(false);			// 넓이
		
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
		
		b3.setBorderPainted(false);
		b3.setFocusPainted(false);
		b3.setContentAreaFilled(false);

		b4.setBorderPainted(false);
		b4.setFocusPainted(false);
		b4.setContentAreaFilled(false);
		
		/* 버튼 및 텍스트의 위치 설정 */
		logo.setBounds(0, 30, 260, 50);
		t1.setBounds(300, 30, 400, 50);
		button.setBounds(260, 35, 40, 40);
		b2.setBounds(705, 30, 100, 50);
		b3.setBounds(810, 30, 90, 50);
		b4.setBounds(905, 30, 100, 50);

		b5.setBounds(40, 120, 120, 50);
		b6.setBounds(202, 120, 120, 50);
		b7.setBounds(364, 120, 120, 50);
		b8.setBounds(526, 120, 120, 50);
		b9.setBounds(688, 120, 120, 50);
		b10.setBounds(850, 120, 140, 50);
		
		category_label.setBounds(480, 210, 520, 30);
		scroll.setBounds(30, 250, 980, 450);//
		
		
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
		setVisible(true);
		setSize(1050,800);		// 패널 크기
		setTitle("Woman DailyLook VINTAGE");		// 패널 제목	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// 종료 조건 생성
		setVisible(true);//
		
		
		

		/*----------------------------------------------*/
		
		
		
		/* 검색 실행 */
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Search f6= new Search(t1.getText());	
				dispose();			
			}
		});;
		
		
		
		/* 회원 가입 실행 */
		b2.addActionListener(new ActionListener() {				// 회원가입 버튼을 누르면
			@Override
			public void actionPerformed(ActionEvent e) {// 회원가입창으로 이동
				// TODO Auto-generated method stub
				Join_Identity f6= new Join_Identity();		// 회원가입으로 이동
				dispose();			// 매인 패널 삭제
			}
		});;//
		
		/* 로그인 실행 */
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// 로그인창으로 이동
				// TODO Auto-generated method stub
				Login_Identity f7= new Login_Identity();
				dispose();
			}
		});;
		
		/* 고객 샌터 실행 */
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//고객센터
				// TODO Auto-generated method stub
				Guide_Non f11= new Guide_Non();		// 로그인 안했을 때의 고객센터창
			}
		});
		
		/*-----------------------------------------------*/
		
		/* 로고 선택 */
		logo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MemberMain m1 = new MemberMain();	//메인으로 이동
				dispose();			//  패널 삭제
			}
		});;
		
		/* 아우터 선택 */
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Outer s1 = new Show_Outer();	
				dispose();
			}
		});
		
		/* 상의 선택 */
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Top s2 = new Show_Top();
				dispose();
			}
		});
		
		
		/* 하의 선택 */
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Bottoms s3 = new Show_Bottoms();
				dispose();
			}
		});
		
		/* 원피스 선택 */
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_OnePiece s4 = new Show_OnePiece();
				dispose();
			}
		});
		
		/* 신발 선택 */
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Shoes s5 = new Show_Shoes();
				dispose();
			}
		});
		
		/* 악세서리 선택 */
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Accessory s6 = new Show_Accessory();
				dispose();
			}
		});

		//종료
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result =JOptionPane.showConfirmDialog(null, "정말 종료 하시겠습니까?", getWarningString(), JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.CLOSED_OPTION) {
					//예, 아니오 선택을 하지 않고 창을 닫은 경우
				}
				else if(result ==JOptionPane.YES_OPTION) {
					//예를 선택한 경우
					JOptionPane.showMessageDialog(null, "방문해 주셔서 감사합니다. 안녕히 가세요");
					dispose();
				}
				else {
					//아니오를 선택한 경우
				}		
			}
		});;
		/*----------------------상품 클릭했을 때 화면-----------------*/
		for(int j = 0; j < count; j++)
		{
			product_Button[j].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "로그인을 하여야 이용할 수 있습니다.");
				}
			});
		}
		
		/*-----------------------------------------------*/
		
		
	}//
	
	

	
	public void create_Button(Component cmpt, int x, int y, int w, int h, int i){
		GridBagConstraints gbc = new GridBagConstraints();
			  gbc.fill = GridBagConstraints.BOTH;
			  gbc.gridx = x;
			  gbc.gridy = y;
			  gbc.gridwidth = w;
			  gbc.gridheight = h;
			  this.Gbag.setConstraints(cmpt, gbc);
			  product_Button[i].add(cmpt);
			  product_Button[i].updateUI();
			  
	}
	
	public void create_panel(Component cmpt, int x, int y, int w, int h){
		GridBagConstraints gbc = new GridBagConstraints();
			  gbc.fill = GridBagConstraints.BOTH;
			  gbc.gridx = x;
			  gbc.gridy = y;
			  gbc.gridwidth = w;
			  gbc.gridheight = h;
			  this.Gbag.setConstraints(cmpt, gbc);
			  panel.add(cmpt);
			  panel.updateUI();
	}
}