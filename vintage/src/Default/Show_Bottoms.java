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
	String category="����";
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
	
	
	Font ProNaFont = new Font("���ʷҵ���", Font.BOLD, 23);
	Font mainFont = new Font("���ʷҵ���", Font.BOLD, 20);
	Font ButFont = new Font("���ʷҵ���", Font.BOLD, 15);
	
	/* ������ �Լ� */
	public Show_Bottoms(){
		
		/* ������ ���� */
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("img/button_img_03/t-shirt.png");
		setIconImage(img);//

		/* ��üȭ�� �г� ���� */
		JPanel p = new JPanel();
		p.setLayout(null);
		p.setVisible(true);
		p.setBackground(Color.white);
		
		/* ��ũ������ ���� �г� ���� */
		panel.setLayout(null);
		panel.setVisible(true);
		panel.setLayout(Gbag);  
		panel.setBackground(Color.pink);


		/* ��ǰ��ư�� ���� */
		for(int i = 0; i < num; i++) {
			product_Button[i] = new JButton();
			product_Button[i].setLayout(Gbag);
			product_Button[i].setBackground(Color.white);
		}
		
		/* ��ǰ��ư�� ���� �ϳ��� ��, line �г� ���� */
		for(int i = 0; i < line.length; i++)
		{
			line[i] = new JPanel();
			line[i].setBackground(Color.pink);
					
		}
		
		
		//���θ� �̸�
		JButton logo = new JButton("VINTAGE");
		logo.setForeground(Color.pink);
		logo.setFont(new Font("�����ٸ����", Font.BOLD, 50));
		p.add(logo);
		
		
		JTextField t1 = new JTextField();
		add(t1);
		//�˻� �̹���
		JLabel searchImage = new JLabel (new ImageIcon("img/button_img_03/search.png"));
		add(searchImage);
		
		
		/* ��ư �� �̹��� ���� */
		JButton b2 = new JButton(new ImageIcon("img/button_img_01/MemberJoin1.png"));
		b2.setFont(ButFont);
		p.add(b2);
		
		JButton b3 = new JButton(new ImageIcon("img/button_img_01/LogIn1.png"));
		b3.setFont(ButFont);
		p.add(b3);
		
		JButton b4 = new JButton(new ImageIcon("img/button_img_01/Guide1.png"));
		b4.setFont(ButFont);
		p.add(b4);
		
		
		
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
		
		JLabel category_label = new JLabel(category);
		category_label.setFont(new Font("�����ٸ����", Font.BOLD, 30));
		p.add(category_label);
		
		JButton exit = new JButton("����");
		exit.setBackground(Color.white);
		exit.setFont(new Font("", Font.BOLD, 15));
		p.add(exit);
		
		exit.setBounds(920, 710, 80, 30);
		
		/* �̹��� ��ư ���� */
		ImageIcon Imageicon = new ImageIcon("img/button_img_03/search.png");		// �˻� ��ư(�̹��� �ַ� �ҷ�����)
		JButton button = new JButton(Imageicon);
		p.add(button);
		
		new JButton(new ImageIcon("img/button_img_03/search.png"));				// �˻� ��ư ���� �߰�
		
		
		
		
		
		
		
		/*--------��ũ�� ���� ����------------*/
		
		/* ī�װ��� �ƿ����� ��ǰ�� ���ؼ� product_Button ����*/
		for(int i = 0; i < num; i++)
		{
			
			int a = g.Get_Product(category, (i+1));
			
			
			if(a != 0) {
				
				Get_ProductDB2 g1 = new Get_ProductDB2(); 
				
				g1.Get_Product3(a);		// ��ǰ id �̿��� ��ǰ ����
				
				img0[count] = new ImageIcon("img/product_img_small/" + a + ".gif");
				JLabel imge = new JLabel( img0[count]);
				create_Button(imge, 1,0,30,10, count);
				
				
				title[count] = new JLabel(""+g1.getTitle()+"", SwingConstants.CENTER);
				title[count].setFont(mainFont);
				create_Button(title[count], 1,70,30,10, count);
				
				
				price[count] = new JLabel(g1.getPrice() + " ��", SwingConstants.CENTER);
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
			line[(i/4)].add(product_Button[i]);  // line�гο� product_Button��ư �߰�
		}
		
		/* ��ũ�� ������ ��üȭ���� panel�гο� line�г��� ���� �� ��ġ, ũ�� ����*/
		for(int i = 0; i <= ((count-1)/4); i++) {
			create_panel(line[i], 50, (i*300)+(i*10), 900, 300);
		}
		
		
		scroll = new JScrollPane(panel,					//��ũ���г� ����
				JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,		//��ũ�ѹٰ� ��� ���̰� ��
	            JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		panel.setBounds(0,  0, 980,  10000);
		
		p.add(scroll);
		
		
		
		
		
		
		
		
		//��ư�� �����ϰ��ϰ� �̹����� ���
		button.setBorderPainted(false);				// border
		button.setFocusPainted(false);				// �߽���
		button.setContentAreaFilled(false);			// ����
		
		b2.setBorderPainted(false);
		b2.setFocusPainted(false);
		b2.setContentAreaFilled(false);
		
		b3.setBorderPainted(false);
		b3.setFocusPainted(false);
		b3.setContentAreaFilled(false);

		b4.setBorderPainted(false);
		b4.setFocusPainted(false);
		b4.setContentAreaFilled(false);
		
		/* ��ư �� �ؽ�Ʈ�� ��ġ ���� */
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
		setVisible(true);
		setSize(1050,800);		// �г� ũ��
		setTitle("Woman DailyLook VINTAGE");		// �г� ����	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);			// ���� ���� ����
		setVisible(true);//
		
		
		

		/*----------------------------------------------*/
		
		
		
		/* �˻� ���� */
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Search f6= new Search(t1.getText());	
				dispose();			
			}
		});;
		
		
		
		/* ȸ�� ���� ���� */
		b2.addActionListener(new ActionListener() {				// ȸ������ ��ư�� ������
			@Override
			public void actionPerformed(ActionEvent e) {// ȸ������â���� �̵�
				// TODO Auto-generated method stub
				Join_Identity f6= new Join_Identity();		// ȸ���������� �̵�
				dispose();			// ���� �г� ����
			}
		});;//
		
		/* �α��� ���� */
		b3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {// �α���â���� �̵�
				// TODO Auto-generated method stub
				Login_Identity f7= new Login_Identity();
				dispose();
			}
		});;
		
		/* �� ���� ���� */
		b4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {//������
				// TODO Auto-generated method stub
				Guide_Non f11= new Guide_Non();		// �α��� ������ ���� ������â
			}
		});
		
		/*-----------------------------------------------*/
		
		/* �ΰ� ���� */
		logo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MemberMain m1 = new MemberMain();	//�������� �̵�
				dispose();			//  �г� ����
			}
		});;
		
		/* �ƿ��� ���� */
		b5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Outer s1 = new Show_Outer();	
				dispose();
			}
		});
		
		/* ���� ���� */
		b6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Top s2 = new Show_Top();
				dispose();
			}
		});
		
		
		/* ���� ���� */
		b7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Bottoms s3 = new Show_Bottoms();
				dispose();
			}
		});
		
		/* ���ǽ� ���� */
		b8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_OnePiece s4 = new Show_OnePiece();
				dispose();
			}
		});
		
		/* �Ź� ���� */
		b9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Shoes s5 = new Show_Shoes();
				dispose();
			}
		});
		
		/* �Ǽ����� ���� */
		b10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Show_Accessory s6 = new Show_Accessory();
				dispose();
			}
		});

		//����
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int result =JOptionPane.showConfirmDialog(null, "���� ���� �Ͻðڽ��ϱ�?", getWarningString(), JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.CLOSED_OPTION) {
					//��, �ƴϿ� ������ ���� �ʰ� â�� ���� ���
				}
				else if(result ==JOptionPane.YES_OPTION) {
					//���� ������ ���
					JOptionPane.showMessageDialog(null, "�湮�� �ּż� �����մϴ�. �ȳ��� ������");
					dispose();
				}
				else {
					//�ƴϿ��� ������ ���
				}		
			}
		});;
		/*----------------------��ǰ Ŭ������ �� ȭ��-----------------*/
		for(int j = 0; j < count; j++)
		{
			product_Button[j].addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "�α����� �Ͽ��� �̿��� �� �ֽ��ϴ�.");
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