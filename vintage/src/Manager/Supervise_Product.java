package Manager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import Vintage.Get_ProductDB;
import Vintage.Get_ProductDB2;
 
 
public class Supervise_Product extends JFrame implements MouseListener,ActionListener{
	Image img = null;
    
    JTable table;
    JScrollPane scroll;
    JPanel panel, pn;
    JLabel label;
    JButton button, button1, button2;
    Manager m1;
    
    int count=0;
    
    public Supervise_Product(Manager m1){
    	
        super("STAFF Supervise Product");
        
        this.m1 = m1;
       
        String columnNames[] ={ "상품명", "가격", "재고", "카테고리" };

    	
    	Object ex[][] = new Object[100][4];
    	for(int i = 0; i < ex.length; i++)
    	{
    		Get_ProductDB2 g1 = new Get_ProductDB2(); 
    		g1.Get_Product3(i + 1);
    		if(g1.getTitle() == null){
    			break;
    		}
    		ex[i][0] = g1.getTitle();		// 상품명
    		ex[i][1] = g1.getPrice();		// 가격
    		ex[i][2] = g1.getStock();		// 재고
    		ex[i][3] = g1.getCategory();		// 카테고리
    		count++;
    	}
    	
    	Object rowData[][] = new Object[count][4];
    	for(int i = 0; i < count; i++)
    	{
    		for(int j = 0; j < 4; j++)
    		{
    			rowData[i][j] = ex[i][j];
    		}
    	}
    	

    	JTable table = new JTable(rowData, columnNames);
    	scroll = new JScrollPane(table);
        add(scroll);
       
        panel = new JPanel();
        label = new JLabel("상품관리");
        label.setFont(new Font("함초롬돋움", Font.BOLD, 25));
        panel.add(label);
        
        label = new JLabel("                                  ");
        panel.add(label);    
       
        JButton button3 = new JButton(new ImageIcon("img/button_img_03/newload1.png"));
        button3.setBackground(Color.white);
        panel.add(button3);
        
        button = new JButton("뒤로가기");
        button.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        button.setBackground(Color.WHITE);
        panel.add(button);
        
        add(panel,BorderLayout.NORTH);
        
        pn = new JPanel();
        button1 = new JButton("추가");
        button1.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        button1.setBackground(Color.WHITE);
        pn.add(button1);
        
        button2 = new JButton("삭제");
        button2.setFont(new Font("함초롬돋움", Font.BOLD, 15));
        button2.setBackground(Color.WHITE);
        pn.add(button2);
        
        add(pn,BorderLayout.SOUTH);
        
        
            
        table.addMouseListener(this); //리스너 등록
        button.addActionListener(this); //뒤로가기버튼 리스너 등록
       
        Toolkit kit = Toolkit.getDefaultToolkit();
        Image img = kit.getImage("img/button_img_03/t-shirt.png");
        setIconImage(img);
        
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerMain ma1 = new ManagerMain(m1);
				dispose();
			}
		});;
		
        /* 추가 */
        button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Add_Product a1 = new Add_Product();
				
				
				
			}
		});;
		
		/* 삭제 */
		button2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Distroy_Product d1 = new Distroy_Product();
			}
		});;
		
		button3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				Supervise_Product s2 = new Supervise_Product(m1);
				dispose();
			}
		});;
        
    }//end 생성자

    
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked 만 사용
        int r = table.getSelectedRow();
        String id = (String) table.getValueAt(r, 0);
             
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
       
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    
}
