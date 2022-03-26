package com;

import java.awt.BorderLayout;

import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Row extends JFrame  {

	
	public Row(int i,int j) {
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("小学生四则运算系统");
		setLocation(600,400);
		setVisible(true);
		
		JPanel north = new JPanel();
		JLabel Jl1 = new JLabel("正确题数为："+i+"\n");
		JLabel Jl2 = new JLabel("最终得分为："+j+"分");
		north.add(Jl1);
		north.add(Jl2);
		add(north,BorderLayout.CENTER);

	}
	
	public void paint(Graphics g) {
		JPanel south = new JPanel();
	    JButton btn1 = new JButton("继续测试");
		south.add(btn1);
		JButton btn2 = new JButton("结束");
		south.add(btn2);
		add(south,BorderLayout.SOUTH);
		
		
		
		
		
		//点击继续测试回到答题界面
		 btn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					setVisible(false);
					Frame0 frame = new Frame0();
					frame.setVisible(true);
					
				}
			});
		 //点击结束关闭窗口
		 btn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{	
					System.exit(0);
				}
			});
		

	    
		 
		 
		
	}
	}
	
