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
	 
	 Font ProNaFont = new Font("���ʷҵ���", Font.BOLD, 23);
	 Font mainFont = new Font("���ʷҵ���", Font.BOLD, 20);
	 Font ButFont = new Font("���ʷҵ���", Font.BOLD, 15);
	
	/* ������ �Լ� */
	public Buy_Product(Member m1, int id){


		Get_ProductDB2 g1 = new Get_ProductDB2(); 
		g1.Get_Product3(id);		// ��ǰ id �̿��� ��ǰ ����
		
		
		/* ������ ���� */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//
		
		
		/* ��üȭ�� �г� ���� */
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		/* ���� �г� ���� */
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
		
		/* ���� �г� ���� */
		//��ǰ��
		ImageIcon img1 = new ImageIcon("img/product_img_big/" + id + ".gif");
		JLabel img2 = new JLabel(img1);
	
		panel.add(img2);
	
		JLabel pl1 = new JLabel(g1.getTitle());
		pl1.setFont(new Font("���ʷҵ���", Font.BOLD, 30));
		p1.add(pl1);
		
		//����
		JLabel pl2 = new JLabel("���� : " + g1.getPrice() + "��");
		pl2.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		p1.add(pl2);
		
		//���
		JLabel pl3 = new JLabel("��� :  " + g1.getStock());
		pl3.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		p1.add(pl3);
		
		//���ż���
		JLabel pl4 = new JLabel("���ż���");
		pl4.setFont(new Font("���ʷҵ���", Font.PLAIN, 25));
		p1.add(pl4);
		
		//���Ź�ư
		ImageIcon buy_img = new ImageIcon("img/button_img_01/BuyNow.png");
		JButton buy = new JButton(buy_img);
		p1.add(buy);
		
		
		 //���� ��Ÿ����
        JTextField stock = new JTextField(click);
        stock.setEnabled(false);
        stock.setFont(new Font("���ʷҹ���", Font.BOLD, 23));
       
        //���� �ø���
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
        
		pl1.setBounds(30, 20, 500, 40);	// ��ǰ��
		pl2.setBounds(30, 95, 300, 40);	// ����
		pl3.setBounds(30, 170, 300, 40);	// ���
		pl4.setBounds(30, 245, 150, 40);	// "���ż���"
		buy.setBounds(30, 340, 450, 55);	// ���� ��ư
		
		count1.setBounds(210, 250, 34, 40);	// ����
		stock.setBounds(260, 250, 40, 40);	// ���ż���
		count2.setBounds(315, 250, 34, 40);	// ����
	     
	     
		//���Ź�ư ������ ����
		buy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
				if(click > Integer.parseInt(g1.getStock())) 
				{
					JOptionPane.showMessageDialog(null, "��� ���ϴ� �������� �����ϴ�.");
					
				}
				else if(click < 1) 
				{
					JOptionPane.showMessageDialog(null, "���ż����� �������ֽʽÿ�.");
				}
				else
				{
					Buy f2= new Buy(m1, click, g1.getTitle(), Integer.parseInt(g1.getPrice()));
					dispose();
				}
				
			}
		});;
		
		//�ø���
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
		
		//�پ���
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
		
		
		//���θ� �̸�
		JButton logo = new JButton("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("", Font.BOLD, 50));
		p.add(logo);
		
		JTextField t1 = new JTextField();
		add(t1);
		
		/* ��ư �� �̹��� ���� */
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
		
		JLabel member1 = new JLabel("ȸ���� ȯ���մϴ� ��");
		member1.setFont(member.getFont().deriveFont(15.0f));
		p.add(member1);
		
		JButton b5 = new JButton("�ƿ���");
		b5.setFont(ProNaFont);
		p.add(b5);
		
		JButton b6 = new JButton("����");
		p.add(b6);
		b6.setFont(ProNaFont);
		
		JButton b7 = new JButton("����");
		p.add(b7);
		b7.setFont(ProNaFont);
		
		JButton b8 = new JButton("���ǽ�");
		p.add(b8);
		b8.setFont(ProNaFont);
		
		JButton b9 = new JButton("�Ź�");
		p.add(b9);
		b9.setFont(ProNaFont);
		
		JButton b10 = new JButton("�׼�����");
		p.add(b10);
		b10.setFont(ProNaFont);
		
		

		/* �̹��� ��ư ���� */
		ImageIcon Imageicon = new ImageIcon("img/button_img_03/search.png");		// �˻� ��ư(�̹��� �ַ� �ҷ�����)
		JButton button = new JButton(Imageicon);
		p.add(button);
		
		new JButton(new ImageIcon("img/button_img_03/search.png"));				// �˻� ��ư ���� �߰�
		
		
		
		// ���� �Ұ����� ��ư ����
		button.setBorderPainted(false);				// border
		button.setFocusPainted(false);				// �߽���
		button.setContentAreaFilled(false);			// ����
		
		b2.setBorderPainted(false);				
		b2.setFocusPainted(false);				
		b2.setContentAreaFilled(false);	
		
		b3.setBorderPainted(false);				
		b3.setFocusPainted(false);				
		b3.setContentAreaFilled(false);	
		
		
		/* ��ư �� �ؽ�Ʈ�� ��ġ ���� */
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
		
		panel.setBounds(30, 250, 980, 450);//���� �г� ����
		
	
		
		/* ��ư �����ϰ� ����� ���� �Ұ���  */
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
		
		add(p);		// ���� �гο� ���
		
		/* �г� ���� */
		
		setSize(1050,800);		// �г� ũ��
		setTitle("Woman DailyLook VINTAGE");		// �г� ����	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// ���� ���� ����
		setVisible(true);
		
		/*----------------------------------------------*/
		
		
		/* �˻� ���� */
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Search_Mem f6= new Search_Mem(t1.getText(), m1);	
				dispose();			
			}
		});;
		
		/* ������ ���� */
		b2.addActionListener(new ActionListener() {				// ȸ������ ��ư�� ������
			@Override
			public void actionPerformed(ActionEvent e) {// ȸ������â���� �̵�
				// TODO Auto-generated method stub
				Guide_Mem f10= new Guide_Mem();
			}
		});;//
		
		/* �α׾ƿ� ���� */
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// �α���â���� �̵�
				// TODO Auto-generated method stub
				int result =JOptionPane.showConfirmDialog(null, "���� �α׾ƿ� �Ͻðڽ��ϱ�?", getWarningString(), JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.CLOSED_OPTION) {
					//��, �ƴϿ� ������ ���� �ʰ� â�� ���� ���
				}
				else if(result ==JOptionPane.YES_OPTION) {
					//���� ������ ���
					JOptionPane.showMessageDialog(null, "�α׾ƿ��� �Ϸ�Ǿ����ϴ�.");
					MemberMain f6= new MemberMain();
					dispose();
				}
				else {
					//�ƴϿ��� ������ ���
				}		
			}
		});;
		/*
		showMessageDialog : �ܼ� �˸�â(���â, �޽��� �ڽ�)�� ���ϴ�.
		showConfirmDialog : Ȯ��â(��/�ƴϿ�, Ȯ��/��� ��)�� ���ϴ�.
		showInputDialog : ����â�� ���ϴ�. ������ �Է� ����� �޽��ϴ�.
		showOptionDialog : Ȯ��â�� ����ѵ�, ��/�ƴϿ� ��� ���� ��ư�� ���� ���� ������ �� �ֽ��ϴ�.
		 */
		
		/*-----------------------------------------------*/
		

		/* �ΰ� ���� */
		logo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Mypage m2 = new Mypage(m1);
				dispose();			// ���� �г� ����
			}
		});;
		
		/* �ƿ��� ���� */
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Outer_Mem s1 = new Show_Outer_Mem(m1);
				dispose();
			}
		});
		
		/* ���� ���� */
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Top_Mem s2 = new Show_Top_Mem(m1);
				dispose();
			}
		});
		
		
		/* ���� ���� */
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Bottoms_Mem s3 = new Show_Bottoms_Mem(m1);
				dispose();
			}
		});
		
		/* ���ǽ� ���� */
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_OnePiece_Mem s4 = new Show_OnePiece_Mem(m1);
				dispose();
			}
		});
		
		/* �Ź� ���� */
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Shoes_Mem s5 = new Show_Shoes_Mem(m1);
				dispose();
			}
		});
		
		/* �Ǽ����� ���� */
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