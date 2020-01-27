package Member;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import java.awt.image.*;

public class Buy extends JFrame{
	Image img = null;
	private boolean overlap = true;
	public Buy(Member m1, int count, String product, int price)
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        JLabel l1 = new JLabel("결제 내역");
        l1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        add(l1);
        
        //결제 내역 출력
        JLabel l2 = new JLabel("상품명 : " + product);
        l2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l2);
        
        JLabel l3 = new JLabel("구매 개수 : " + count + "개");
        l3.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l3);
        
        JLabel l4 = new JLabel("결제 금액 : " + price*count + "원");
        l4.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l4);
        
        /*------------------------------------------------------*/
        
        //배송받는분 입력 창
        
        JLabel l5 = new JLabel("배송 받는 분 " );
        l5.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        add(l5);
        
        JLabel l6 = new JLabel("이름 : " );
        l6.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l6);
        
        JTextField t1 = new JTextField();
        t1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(t1);
        
        JLabel l7 = new JLabel("전화번호 : " );
        l7.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l7);
        
        JTextField t2 = new JTextField();
        t2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(t2);
        
        JLabel l8 = new JLabel("주소 : " );
        l8.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l8);
        
        JTextField t3 = new JTextField();
        t3.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(t3);
        
        /*------------------------------------------------------*/
        JLabel l9 = new JLabel("결제 방법" );
        l9.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        add(l9);
        ImageIcon card = new ImageIcon("img/button_img_03/카드결제.png");
        JButton b1 = new JButton(card);
        b1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(b1);
        
        ImageIcon mu = new ImageIcon("img/button_img_03/무통장입금.png");
        JButton b2 = new JButton(mu);
        b2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(b2);
        
        b1.setBorderPainted(false);
		b1.setFocusPainted(false);
		b1.setContentAreaFilled(false);
		
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
        
        l1.setBounds(22, 10, 250, 40);
        l2.setBounds(22, 60, 250, 40);
        l3.setBounds(22, 100, 250, 40);
        l4.setBounds(22, 140, 250, 40);
        
        l5.setBounds(22, 190, 250, 40);
       
        l6.setBounds(22, 240, 250, 40);
        t1.setBounds(100, 240, 250, 30);
        l7.setBounds(22, 300, 250, 40);
        t2.setBounds(100, 300, 250, 30);
        l8.setBounds(22, 360, 250, 30);
        t3.setBounds(100, 360, 250, 30);
        
        l9.setBounds(22, 410, 250, 40);
        b1.setBounds(22, 470, 150, 50);
        b2.setBounds(200, 470, 150, 50);
        
		add(p);
		setSize(400, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Buy ");
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//카드결제
				// TODO Auto-generated method stub
				Bought_Product b1 = new Bought_Product(m1.getId(), product, count, (price*count), t1.getText(), t2.getText(), t3.getText(), "");
				Payment_Card f5= new Payment_Card(m1, b1);
				dispose();
				}
		});;
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//무통장입금
				// TODO Auto-generated method stub
				Bought_Product b1 = new Bought_Product(m1.getId(), product, count, price*count, t1.getText(), t2.getText(), t3.getText(), "");
				Payment_Passbook f5= new Payment_Passbook(m1, b1);
				dispose();
				}
		});;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
	}
}

