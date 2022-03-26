package com;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Demo {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable()
    	{
    		public void run()
    		{
    			
    			Demo frame = new Demo();
    			
    			
    		}
    	});
	}
	
	public  Demo() {//主界面
		JFrame frame = new JFrame(" 小学生四则运算系统 ");
		frame.setBounds(700, 400, 650, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		JPanel root = new JPanel();
		frame.setContentPane( root );
		
		JButton cn1 = new JButton("中文");
		JButton eng = new JButton("English");
		JButton cn2 = new JButton("繁體中文");
		
		frame.setLayout(null);
		cn1.setSize(100, 20);
		cn2.setSize(100, 20);
		eng.setSize(100, 20);
		cn1.setLocation(250,200);
		cn2.setLocation(250,280);
		eng.setLocation(250,240);
		root.add(cn1);
		root.add(cn2);
		root.add(eng);
		
		
		
		JLabel label = new JLabel("请选择语言");
		label.setBounds(	230,0,200,200);
		label.setFont(new Font("宋体",Font.BOLD,29));
		root.add(label);
		
		
		cn1.addActionListener(new ActionListener()//点击中文按钮后的操作
		{
			public void actionPerformed(ActionEvent e)
			{
				
				frame.dispose();
				MyFrame frm = new MyFrame("四则运算");
				frm.setBounds(700, 400, 650, 400);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
				
			}
		});
		
		cn2.addActionListener(new ActionListener()//点击繁体按钮后的操作
		{
			public void actionPerformed(ActionEvent e)
			{
				
				frame.dispose();
				MyFrame frm = new MyFrame("四則運算");
				frm.setBounds(700, 400, 650, 400);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
				
			}
		});
		
		eng.addActionListener(new ActionListener()//点击英文按钮后的操作
		{
			public void actionPerformed(ActionEvent e)
			{
				
				frame.dispose();
				MyFrame frm = new MyFrame("Four arithmetic");
				frm.setBounds(700, 400, 650, 400);
				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frm.setVisible(true);
				
			}
		});
	}
}
