package Member;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;

import Default.MemberMain;

import java.awt.image.*;

public class Payment_complete extends JFrame{
	Image img = null;
	public Payment_complete(Member m1, Bought_Product bp1)
	{
		JPanel p = new JPanel();
		p.setBackground(Color.WHITE);
        p.setLayout(null);
        
        JLabel l1 = new JLabel("결제가 완료되었습니다.");
        l1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        add(l1);
        
        JLabel l = new JLabel("결제 내역");
        l.setFont(new Font("함초롬돋움", Font.BOLD, 20));
        l.setForeground(Color.pink);
        add(l);
        
        JLabel l2 = new JLabel("상품명 : " + bp1.getProduct());
        l2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l2);
        
        JLabel l3 = new JLabel("구매 개수 : " + bp1.getCount() + "개");
        l3.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l3);
        
        JLabel l4 = new JLabel("결제 금액 : " + bp1.getPrice() + "원");
        l4.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l4);
        
        JLabel l5 = new JLabel("배송 받는 분 " );
        l5.setFont(new Font("함초롬돋움", Font.BOLD, 20));
        l5.setForeground(Color.pink);
        add(l5);
        
        JLabel l6 = new JLabel("이름 : " +  bp1.getName());
        l6.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l6);
        
        JLabel l7 = new JLabel("전화번호 : " + bp1.getCallNumber());
        l7.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l7);

        JLabel l8 = new JLabel("주소 : " + bp1.getAddress());
        l8.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(l8);
        
        JLabel l9 = new JLabel("구매자 아이디      :    " + m1.getId());
        l9.setFont(new Font("함초롬돋움", Font.BOLD, 20));
        l9.setForeground(Color.black);
        add(l9);

        JButton b1 = new JButton(new ImageIcon("img/button_img_03/홈 화면으로 돌아가기.png"));
        b1.setFont(new Font("함초롬돋움", Font.BOLD, 20));
        add(b1);
        
        
        l1.setBounds(90, 10, 350, 40);
        l.setBounds(22, 60, 250, 40);
        l2.setBounds(22, 110, 250, 40);
        l3.setBounds(22, 150, 250, 40);
        l4.setBounds(22, 190, 250, 40);
        l5.setBounds(22, 240, 250, 40);
        l6.setBounds(22, 290, 250, 40);
        l7.setBounds(22, 330, 250, 40);
        l8.setBounds(22, 370, 500, 30);
        l9.setBounds(22, 420, 500, 40);
        b1.setBounds(15, 470, 400, 50);
        
		add(p);
		
		setSize(450, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Pay ");
		setVisible(true);
		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Mypage f5= new Mypage(m1);
				dispose();
				}
		});;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
	}
}

