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

import com.mysql.fabric.xmlrpc.base.Member;

import Member.FindMemberDB2;
import Vintage.Get_ProductDB2;
 
 
public class Check_Member extends JFrame implements MouseListener,ActionListener{
	Image img = null;

    JTable table;
    JScrollPane scroll;
    JPanel panel;
    JLabel label;
    JButton button;
    Manager m1;
    
    int count = 0;
    
    public Check_Member(Manager m1){
        super("STAFF Check Member");
       
        this.m1 = m1;
        
        String columnNames[] ={ "�̸�", "���̵�", "��ȭ��ȣ" };

        
    	Object ex[][] = new Object[500][3];
    	for(int i = 0; i < ex.length; i++)
    	{
    		FindMemberDB2 f1 = new FindMemberDB2(i+1);
    		
    		if(f1.getName() == null){
    			continue;
    		}
    		ex[count][0] = f1.getName();		// �̸�
    		ex[count][1] = f1.getID();		// ���̵�
    		ex[count][2] = f1.getCallNumber();		// ��ȭ��ȣ
    		
    		count++;
    	}
    	
    	Object rowData[][] = new Object[count][3];
    	for(int i = 0; i < count; i++)
    	{
    		for(int j = 0; j < 3; j++)
    		{
    			rowData[i][j] = ex[i][j];
    		}
    	}
    	

    	JTable table = new JTable(rowData, columnNames);
    	scroll = new JScrollPane(table);
        add(scroll);
       
        panel = new JPanel();
        label = new JLabel(" ȸ������");
        label.setFont(new Font("���ʷҵ���", Font.BOLD, 25));
        panel.add(label);
        label = new JLabel("                                                 ");
        panel.add(label);           
        
        button = new JButton("�ڷΰ���");
        button.setFont(new Font("���ʷҵ���", Font.BOLD, 15));
        button.setBackground(Color.WHITE);
        panel.add(button);
        
        add(panel,BorderLayout.NORTH);
        
            
        table.addMouseListener(this); //������ ���
        button.addActionListener(this); //�ڷΰ����ư ������ ���
       
        Toolkit kit = Toolkit.getDefaultToolkit();
      Image img = kit.getImage("img/button_img_03/t-shirt.png");
      setIconImage(img);
        
        setSize(400,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /*---------------------------------------------------*/
        
        button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				ManagerMain ma1 = new ManagerMain(m1);
				dispose();
			}
		});;
		
        
    }//end ������

    
    @Override
    public void mouseClicked(MouseEvent e) {
        // mouseClicked �� ���
        int r = table.getSelectedRow();
        String id = (String) table.getValueAt(r, 0);
        //System.out.println("id="+id);
        //MemberProc mem = new MemberProc(id,this); //���̵� ���ڷ� ����â ����
               
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
