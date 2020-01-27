package Default;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import java.awt.image.*;
import java.awt.Toolkit;

public class Guide_Non extends JFrame{
	Image img = null;
	public Guide_Non()
	{
		JPanel p = new JPanel(); //패널 생성
        p.setLayout(null);		 //레이아웃
        p.setBackground(Color.white);	//배경색 : 흰 색
        
		JLabel label = new JLabel("CS CENTER");	//라벨 생성
		label.setForeground(Color.pink);	//라벨 색 : 핑크
		label.setFont(label.getFont().deriveFont(50.0f));	//글자 크기 지정
		p.add(label);	//패널에 라벨 생성
		
		JLabel b2= new JLabel("자주묻는질문"); //라벨 생성
		b2.setForeground(Color.PINK);	//라벨 색 : 핑크
		b2.setFont(b2.getFont().deriveFont(25.0f));	//글자 크기 지정
		add(b2);	//패널에 라벨 생성
		
		/*-----------------큐앤에이 라벨 생성-------------------------*/
		JLabel q1 = new JLabel("Q. 로그인은 어떻게 하나요 ?");
		add(q1);
		JLabel a1 = new JLabel("A. 메인화면 오른쪽 상단에 있는 로그인 버튼을 클릭하시고 신분 선택 후 아이디와 비밀번호를 맞게 입력하시면 로그인을 하실 수 있습니다.");
		add(a1);
		JLabel q2 = new JLabel("Q. 회원가입은 어떻게 하나요?");
		add(q2);
		JLabel a2 = new JLabel("A. 메인화면 오른쪽 상단에 있는 회원가입 버튼을 클릭하시고 신분 선택 후 이름, 아이디, 비밀번호, 전화번호를 입력하시면 회원가입을 하실 수 있습니다.");
		add(a2);
		JLabel q3 = new JLabel("Q. 상품은 어디서 볼 수 있나요?");
		add(q3);
		JLabel a3 = new JLabel("A. 메인화면에서 볼 수 있습니다.");
		add(a3);
		JLabel q4 = new JLabel("Q. 상품 주문 방법은 어떻게 하나요?");
		add(q4);
		JLabel a4 = new JLabel("A. 원하시는 상품 선택 후 결제 방법을 선택하시고 진행하시면 가능합니다.");
		add(a4);
		JLabel q5 = new JLabel("Q. 카드결제는 어떻게 하나요?");
		add(q5);
		JLabel a5 = new JLabel("A. 원하시는 상품 선택 후 결제 방법 중 카드결제를 선택하시고 진행하시면 가능합니다.");
		add(a5);
		JLabel q6 = new JLabel("Q. 무통장 입금 결제는 어떻게 하나요?");
		add(q6);
		JLabel a6 = new JLabel("A. 원하시는 상품 선택 후 결제 방법 중 무통장 입금 결제를 선택하시고 진행하시면 가능합니다.");
		add(a6);
		
		/*-------------------------------------공지사항 라벨 생성--------------------------------*/
		JLabel b3= new JLabel("공지사항");
		b3.setForeground(Color.PINK);
		b3.setFont(b3.getFont().deriveFont(25.0f));
		add(b3);
		JLabel g1 = new JLabel("[공지] 여성 데일리룩 쇼핑몰 VINTAGE OPEN!!");
		add(g1);
		JLabel g2 = new JLabel("[공지] (10.01~11.30)OPEN EVENT♥ 후드티가 5000원~");
		add(g2);
		JLabel g3 = new JLabel("[공지] 결제 방법, 카드 결제가 추가 되었습니다!");
		add(g3);
		JLabel g4 = new JLabel("[공지] 결제 방법, 무통장 입금이 추가 되었습니다!");
		add(g4);
		JLabel g5 = new JLabel("[공지] VINTAGE 계좌 정보, IBK기업은행 07819990201014");
		add(g5);
		JLabel g6 = new JLabel("[공지] 결제 방법, 토스(toss) 추가 예정입니다!");
		add(g6);
		JLabel g7 = new JLabel("[공지] 결제 방법, 삼성페이 추가 예정입니다!");
		add(g7);
		JLabel g8 = new JLabel("[공지] 결제 방법, 문화상품권 추가 예정입니다!");
		add(g8);
		JLabel g9 = new JLabel("[공지] VINTAGE 상담 가능 시간은 (평일 : 오전 8:20~오후4:20 / 주말 : 오전 11:00~오후8:00) 입니다^_^");
		add(g9);
		JLabel g10 = new JLabel(".");
		add(g10);
		JLabel g11 = new JLabel(".");
		add(g11);
		JLabel g12 = new JLabel(".");
		add(g12);
		/*-------------------------------------회사 정보 라벨 생성----------------------------------------------*/
		JLabel b4= new JLabel("ABOUT VINTAGE");
		b4.setForeground(Color.PINK);
		b4.setFont(b4.getFont().deriveFont(25.0f));
		add(b4);
		JLabel l1 = new JLabel("주소 : 서울특별시 관악구 호암로 546 미림여자정보과학고등학교");
		add(l1);
		JLabel l2 = new JLabel("영업시간 : 8시20분 ~ 16시30분");
		add(l2);
		JLabel l3 = new JLabel("연락처 : 02-872-4071");
		add(l3);
		JLabel l4 = new JLabel("사업자 등록번호 : 011-15-1117");
		add(l4);
		JLabel l5 = new JLabel("상호 : VINTAGE(주)");
		add(l5);
		JButton button = new JButton(new ImageIcon("img/button_img_01/Back1.png"));
		add(button);
		
		//버튼 투명색으로 지정
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		/*------------------------위치 지정------------------------------*/
		label.setBounds(52, 20, 400, 50);
		b2.setBounds(52, 100, 200, 40);
		q1.setBounds(60, 140, 400, 30);
		a1.setBounds(70, 150, 1000, 50);
		q2.setBounds(60, 180, 400, 30);
		a2.setBounds(70, 190, 1000, 50);
		q3.setBounds(60, 220, 400, 30);
		a3.setBounds(70, 230, 1000, 50);
		q4.setBounds(60, 260, 400, 30);
		a4.setBounds(70, 270, 1000, 50);
		q5.setBounds(60, 300, 400, 30);
		a5.setBounds(70, 310, 1000, 50);
		q6.setBounds(60, 340, 400, 30);
		a6.setBounds(70, 350, 1000, 50);
		b3.setBounds(52, 400, 200, 40);
		g1.setBounds(60, 440, 1000, 30);
		g2.setBounds(60, 460, 1000, 30);
		g3.setBounds(60, 480, 1000, 30);
		g4.setBounds(60, 500, 1000, 30);
		g5.setBounds(60, 520, 1000, 30);
		g6.setBounds(60, 540, 1000, 30);
		g7.setBounds(60, 560, 1000, 30);
		g8.setBounds(60, 580, 1000, 30);
		g9.setBounds(60, 600, 1000, 30);
		g10.setBounds(60, 620, 1000, 30);
		g11.setBounds(60, 640, 1000, 30);
		g12.setBounds(60, 660, 1000, 30);
		b4.setBounds(52, 700, 250, 40);
		l5.setBounds(60, 740, 500, 30);
		l2.setBounds(60, 760, 500, 30);
		l3.setBounds(60, 780, 500, 30);
		l4.setBounds(60, 800, 500, 30);
		l1.setBounds(60, 820, 500, 30);
		button.setBounds(1050, 790, 100, 43);
		
		add(p); //패널 생성
		setSize(1200, 900); //패널 크기 조정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//종료 조건
		setTitle("VINTAGE Guide ");	//패널 제목
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();	//패널 아이콘 생성
		Image img = kit.getImage("img/button_img_03/t-shirt.png");	//이미지 불러오기
		setIconImage(img);
		
		button.addActionListener(new ActionListener() {	//고객센터 창 끄는 버튼 실행
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();	//창 종료
			}
		});;
	}
}

