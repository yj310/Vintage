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

public class Payment_Passbook extends JFrame{
	Image img = null;
	public Payment_Passbook(Member m1, Bought_Product bp1)
	{
		JPanel p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.white);
        
        JLabel l1 = new JLabel("�������Ա�");
        l1.setFont(l1.getFont().deriveFont(30.0f));
        add(l1);
        
        TextField t1 = new TextField();
        t1.setText("������ : (��) ��Ƽ��");
        t1.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		t1.setEnabled(false);
		add(t1);
		
		TextField t2 = new TextField();
        t2.setText("����� : IBK�������");
        t2.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		t2.setEnabled(false);
		add(t2);
		
		TextField t3 = new TextField();
        t3.setText("���� : 07819990201014");
        t3.setFont(new Font("���ʷҵ���", Font.BOLD, 20));
		t3.setEnabled(false);
		add(t3);
		
        JButton b1 = new JButton("����");
        b1.setBackground(Color.white);
        b1.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
        add(b1);
        
        JButton b2 = new JButton("���");
        b2.setBackground(Color.white);
        b2.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
        add(b2);
        
        
        l1.setBounds(22, 20, 250, 40);
        b1.setBounds(120, 250, 70, 30);
        b2.setBounds(200, 250, 70, 30);
        t1.setBounds(22, 90, 240, 50);
        t2.setBounds(22, 140, 240, 50);
        t3.setBounds(22, 190, 240, 50);
        
        
		add(p);
		
		setSize(300, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("VINTAGE Pay ");
		setVisible(true);
		
		
		/*---------------------------------------------------------------------*/

		
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ȸ������â���� �̵�
				// TODO Auto-generated method stub
				bp1.setHow("�������Ա�");
				Bought_Product_Data b2 = new Bought_Product_Data(bp1);
				SellProductDB s1 = new SellProductDB();
				if(s1.sell(bp1.getProduct(), bp1.getCount()));
				Payment_complete f5= new Payment_complete(m1, bp1);
				dispose();
				}
		});;
		
		b2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//ȸ������â���� �̵�
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(null, "���� ��� �Ǿ����ϴ�.");
				Mypage f5= new Mypage(m1);
				dispose();
				}
		});;
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);
	}
}

