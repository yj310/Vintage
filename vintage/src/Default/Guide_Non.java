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
		JPanel p = new JPanel(); //�г� ����
        p.setLayout(null);		 //���̾ƿ�
        p.setBackground(Color.white);	//���� : �� ��
        
		JLabel label = new JLabel("CS CENTER");	//�� ����
		label.setForeground(Color.pink);	//�� �� : ��ũ
		label.setFont(label.getFont().deriveFont(50.0f));	//���� ũ�� ����
		p.add(label);	//�гο� �� ����
		
		JLabel b2= new JLabel("���ֹ�������"); //�� ����
		b2.setForeground(Color.PINK);	//�� �� : ��ũ
		b2.setFont(b2.getFont().deriveFont(25.0f));	//���� ũ�� ����
		add(b2);	//�гο� �� ����
		
		/*-----------------ť�ؿ��� �� ����-------------------------*/
		JLabel q1 = new JLabel("Q. �α����� ��� �ϳ��� ?");
		add(q1);
		JLabel a1 = new JLabel("A. ����ȭ�� ������ ��ܿ� �ִ� �α��� ��ư�� Ŭ���Ͻð� �ź� ���� �� ���̵�� ��й�ȣ�� �°� �Է��Ͻø� �α����� �Ͻ� �� �ֽ��ϴ�.");
		add(a1);
		JLabel q2 = new JLabel("Q. ȸ�������� ��� �ϳ���?");
		add(q2);
		JLabel a2 = new JLabel("A. ����ȭ�� ������ ��ܿ� �ִ� ȸ������ ��ư�� Ŭ���Ͻð� �ź� ���� �� �̸�, ���̵�, ��й�ȣ, ��ȭ��ȣ�� �Է��Ͻø� ȸ�������� �Ͻ� �� �ֽ��ϴ�.");
		add(a2);
		JLabel q3 = new JLabel("Q. ��ǰ�� ��� �� �� �ֳ���?");
		add(q3);
		JLabel a3 = new JLabel("A. ����ȭ�鿡�� �� �� �ֽ��ϴ�.");
		add(a3);
		JLabel q4 = new JLabel("Q. ��ǰ �ֹ� ����� ��� �ϳ���?");
		add(q4);
		JLabel a4 = new JLabel("A. ���Ͻô� ��ǰ ���� �� ���� ����� �����Ͻð� �����Ͻø� �����մϴ�.");
		add(a4);
		JLabel q5 = new JLabel("Q. ī������� ��� �ϳ���?");
		add(q5);
		JLabel a5 = new JLabel("A. ���Ͻô� ��ǰ ���� �� ���� ��� �� ī������� �����Ͻð� �����Ͻø� �����մϴ�.");
		add(a5);
		JLabel q6 = new JLabel("Q. ������ �Ա� ������ ��� �ϳ���?");
		add(q6);
		JLabel a6 = new JLabel("A. ���Ͻô� ��ǰ ���� �� ���� ��� �� ������ �Ա� ������ �����Ͻð� �����Ͻø� �����մϴ�.");
		add(a6);
		
		/*-------------------------------------�������� �� ����--------------------------------*/
		JLabel b3= new JLabel("��������");
		b3.setForeground(Color.PINK);
		b3.setFont(b3.getFont().deriveFont(25.0f));
		add(b3);
		JLabel g1 = new JLabel("[����] ���� ���ϸ��� ���θ� VINTAGE OPEN!!");
		add(g1);
		JLabel g2 = new JLabel("[����] (10.01~11.30)OPEN EVENT�� �ĵ�Ƽ�� 5000��~");
		add(g2);
		JLabel g3 = new JLabel("[����] ���� ���, ī�� ������ �߰� �Ǿ����ϴ�!");
		add(g3);
		JLabel g4 = new JLabel("[����] ���� ���, ������ �Ա��� �߰� �Ǿ����ϴ�!");
		add(g4);
		JLabel g5 = new JLabel("[����] VINTAGE ���� ����, IBK������� 07819990201014");
		add(g5);
		JLabel g6 = new JLabel("[����] ���� ���, �佺(toss) �߰� �����Դϴ�!");
		add(g6);
		JLabel g7 = new JLabel("[����] ���� ���, �Ｚ���� �߰� �����Դϴ�!");
		add(g7);
		JLabel g8 = new JLabel("[����] ���� ���, ��ȭ��ǰ�� �߰� �����Դϴ�!");
		add(g8);
		JLabel g9 = new JLabel("[����] VINTAGE ��� ���� �ð��� (���� : ���� 8:20~����4:20 / �ָ� : ���� 11:00~����8:00) �Դϴ�^_^");
		add(g9);
		JLabel g10 = new JLabel(".");
		add(g10);
		JLabel g11 = new JLabel(".");
		add(g11);
		JLabel g12 = new JLabel(".");
		add(g12);
		/*-------------------------------------ȸ�� ���� �� ����----------------------------------------------*/
		JLabel b4= new JLabel("ABOUT VINTAGE");
		b4.setForeground(Color.PINK);
		b4.setFont(b4.getFont().deriveFont(25.0f));
		add(b4);
		JLabel l1 = new JLabel("�ּ� : ����Ư���� ���Ǳ� ȣ�Ϸ� 546 �̸������������а���б�");
		add(l1);
		JLabel l2 = new JLabel("�����ð� : 8��20�� ~ 16��30��");
		add(l2);
		JLabel l3 = new JLabel("����ó : 02-872-4071");
		add(l3);
		JLabel l4 = new JLabel("����� ��Ϲ�ȣ : 011-15-1117");
		add(l4);
		JLabel l5 = new JLabel("��ȣ : VINTAGE(��)");
		add(l5);
		JButton button = new JButton(new ImageIcon("img/button_img_01/Back1.png"));
		add(button);
		
		//��ư ��������� ����
		button.setBorderPainted(false);
		button.setFocusPainted(false);
		button.setContentAreaFilled(false);
		
		/*------------------------��ġ ����------------------------------*/
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
		
		add(p); //�г� ����
		setSize(1200, 900); //�г� ũ�� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//���� ����
		setTitle("VINTAGE Guide ");	//�г� ����
		setVisible(true);
		
		Toolkit kit = Toolkit.getDefaultToolkit();	//�г� ������ ����
		Image img = kit.getImage("img/button_img_03/t-shirt.png");	//�̹��� �ҷ�����
		setIconImage(img);
		
		button.addActionListener(new ActionListener() {	//������ â ���� ��ư ����
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();	//â ����
			}
		});;
	}
}

