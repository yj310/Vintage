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

public class Payment_Card extends JFrame{
	Image img = null;
	public Payment_Card(Member m1, Bought_Product bp1)
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        JLabel l1 = new JLabel("카드결제");
        l1.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        add(l1);
        JLabel l2 = new JLabel("카드사");
        add(l2);
        
        JComboBox<String> com;
        String card[] = { "BC카드", "신한카드", "삼성카드 ", "현대카드", "국민카드", "롯데카드", "하나카드", "우리카드",
        				"씨티카드", "NH카드", "수협", "광주은행", "전북은행"};
        com = new JComboBox<String>(card);
        com.setFont(new Font("함초롬돋움", Font.BOLD, 13));
        
        JScrollPane s = new JScrollPane(com);
        p.add(s);
        
        
        TextField t1 = new TextField();
        t1.setText("예금주 : (주) 빈티지");
        t1.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		t1.setEnabled(false);
		add(t1);
		
		TextField t2 = new TextField();
        t2.setText("은행사 : IBK기업은행");
        t2.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		t2.setEnabled(false);
		add(t2);
		
		TextField t3 = new TextField();
        t3.setText("계좌 : 07819990201014");
        t3.setFont(new Font("함초롬돋움", Font.BOLD, 20));
		t3.setEnabled(false);
		add(t3);
		
        JButton b1 = new JButton("결제");
        b1.setBackground(Color.white);
        b1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(b1);
        
        JButton b2 = new JButton("취소");
        b2.setBackground(Color.white);
        b2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        add(b2);
        
        
        l1.setBounds(22, 20, 250, 40);
        l2.setBounds(22, 70, 40, 30);
        b1.setBounds(120, 300, 70, 30);
        b2.setBounds(200, 300, 70, 30);
        s.setBounds(70, 70, 193, 30);
        t1.setBounds(22, 130, 240, 50);
        t2.setBounds(22, 180, 240, 50);
        t3.setBounds(22, 230, 240, 50);
        
		add(p);
		
		setSize(300, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Pay ");
		setVisible(true);
		
		
		/*---------------------------------------------------------------------*/

		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				bp1.setHow("카드결제");
				SellProductDB s1 = new SellProductDB();
				if(s1.sell(bp1.getProduct(), bp1.getCount()));
				Bought_Product_Data b2 = new Bought_Product_Data(bp1);
				Payment_complete f5= new Payment_complete(m1, bp1);
				dispose();
				}
		});;
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//회원가입창으로 이동
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "결제 취소 되었습니다.");
				Mypage f5= new Mypage(m1);
				dispose();
				}
		});;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
	}
}

