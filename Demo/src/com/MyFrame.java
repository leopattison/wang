package com;


import com.entity.Equation;



import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;



class Frame0 extends JFrame
{
	private static final int DEFAULT_WIDTH=500;
	private static final int DEFAULT_HEIGHT=600;
	private static JLabel l1 = new JLabel();
	protected int sum;
	protected int score;
	public long timetime;
	
	public Frame0()//答题界面
	{
		
		
		JTextField[] rater = new JTextField[20];


		ArrayList<String> num1 = new ArrayList<String>();
		final JTextField rater1 = new JTextField();
		final JTextField rater2 = new JTextField();
		final JTextField rater3 = new JTextField();
		final JTextField rater4 = new JTextField();
		final JTextField rater5 = new JTextField();
		final JTextField rater6 = new JTextField();
		final JTextField rater7 = new JTextField();
		final JTextField rater8 = new JTextField();
		final JTextField rater9 = new JTextField();
		final JTextField rater10 = new JTextField();
		final JTextField rater11 = new JTextField();
		final JTextField rater12 = new JTextField();
		final JTextField rater13 = new JTextField();
		final JTextField rater14 = new JTextField();
		final JTextField rater15 = new JTextField();
		final JTextField rater16 = new JTextField();
		final JTextField rater17 = new JTextField();
		final JTextField rater18 = new JTextField();
		final JTextField rater19 = new JTextField();
		final JTextField rater20 = new JTextField();
		
		
		final JTextField answer1 = new JTextField();
		final JTextField answer2 = new JTextField();
		final JTextField answer3 = new JTextField();
		final JTextField answer4 = new JTextField();
		final JTextField answer5 = new JTextField();
		final JTextField answer6 = new JTextField();
		final JTextField answer7 = new JTextField();
		final JTextField answer8 = new JTextField();
		final JTextField answer9 = new JTextField();
		final JTextField answer10 = new JTextField();
		final JTextField answer11 = new JTextField();
		final JTextField answer12 = new JTextField();
		final JTextField answer13 = new JTextField();
		final JTextField answer14 = new JTextField();
		final JTextField answer15 = new JTextField();
		final JTextField answer16 = new JTextField();
		final JTextField answer17 = new JTextField();
		final JTextField answer18 = new JTextField();
		final JTextField answer19 = new JTextField();
		final JTextField answer20 = new JTextField();

		
		JPanel northPanel1 = new JPanel();
		northPanel1.setLayout(new GridLayout(1,3));
		add(northPanel1,BorderLayout.NORTH);
		northPanel1.add(new JLabel("运算式:",SwingConstants.CENTER));
		northPanel1.add(new JLabel("请输入答案:",SwingConstants.CENTER));
		northPanel1.add(new JLabel("判断结果如下:",SwingConstants.CENTER));
		
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(20,1));
		

		northPanel.add(rater1);
		northPanel.add(answer1);
		northPanel.add(rater2);
		northPanel.add(answer2);
		northPanel.add(rater3);
		northPanel.add(answer3);
		northPanel.add(rater4);
		northPanel.add(answer4);
		northPanel.add(rater5);
		northPanel.add(answer5);
		northPanel.add(rater6);
		northPanel.add(answer6);
		northPanel.add(rater7);
		northPanel.add(answer7);
		northPanel.add(rater8);
		northPanel.add(answer8);
		northPanel.add(rater9);
		northPanel.add(answer9);
		northPanel.add(rater10);
		northPanel.add(answer10);
		northPanel.add(rater11);
		northPanel.add(answer11);
		northPanel.add(rater12);
		northPanel.add(answer12);
		northPanel.add(rater13);
		northPanel.add(answer13);
		northPanel.add(rater14);
		northPanel.add(answer14);
		northPanel.add(rater15);
		northPanel.add(answer15);
		northPanel.add(rater16);
		northPanel.add(answer16);
		northPanel.add(rater17);
		northPanel.add(answer17);
		northPanel.add(rater18);
		northPanel.add(answer18);
		northPanel.add(rater19);
		northPanel.add(answer19);
		northPanel.add(rater20);
		northPanel.add(answer20);
		
		add(northPanel,BorderLayout.CENTER);

		
		final JTextArea textArea = new JTextArea(20,13);
		textArea.setFont(new Font(" ",Font.PLAIN,19));
		add(textArea,BorderLayout.WEST);
		
		JPanel southPanel = new JPanel();
		add(southPanel,BorderLayout.SOUTH);
		JButton insertButton = new JButton("确认");
		southPanel.add(insertButton);
		JButton sortButton = new JButton("统计");
		southPanel.add(sortButton);
		southPanel.add(l1);
		l1.setFont(new Font("",1,18));
		
		
		//调用函数产生算式
		randomTopic rand = new randomTopic();
		Equation[] eq = rand.randomTopic();
		

		textArea.append(eq[0].getSuanshi()+"\n");
		textArea.append(eq[1].getSuanshi()+"\n");
		textArea.append(eq[2].getSuanshi()+"\n");
		textArea.append(eq[3].getSuanshi()+"\n");
		textArea.append(eq[4].getSuanshi()+"\n");
		textArea.append(eq[5].getSuanshi()+"\n");
		textArea.append(eq[6].getSuanshi()+"\n");
		textArea.append(eq[7].getSuanshi()+"\n");
		textArea.append(eq[8].getSuanshi()+"\n");
		textArea.append(eq[9].getSuanshi()+"\n");
		textArea.append(eq[10].getSuanshi()+"\n");
		textArea.append(eq[11].getSuanshi()+"\n");
		textArea.append(eq[12].getSuanshi()+"\n");
		textArea.append(eq[13].getSuanshi()+"\n");
		textArea.append(eq[14].getSuanshi()+"\n");
		textArea.append(eq[15].getSuanshi()+"\n");
		textArea.append(eq[16].getSuanshi()+"\n");
		textArea.append(eq[17].getSuanshi()+"\n");
		textArea.append(eq[18].getSuanshi()+"\n");
		textArea.append(eq[19].getSuanshi()+"\n");
		
		
		insertButton.addActionListener(new ActionListener()//点击确认按钮后的操作
		{
			public void actionPerformed(ActionEvent event)
			{
				randomTopic rt = new randomTopic();
				Equation[] questions = rt.randomTopic();
				
				ArrayList<String> answers=new ArrayList<String>();
				String[] text = new String[20];

				String s1 = eq[0].getJieguo();
				String text1 =String.valueOf(rater1.getText());
				String s2 = eq[1].getJieguo();
				String text2 =String.valueOf(rater2.getText());
				String s3 = eq[2].getJieguo();
				String text3 =String.valueOf(rater3.getText());
				String s4 = eq[3].getJieguo();
				String text4 =String.valueOf(rater4.getText());
				String s5 = eq[4].getJieguo();
				String text5 =String.valueOf(rater5.getText());
				String s6 = eq[5].getJieguo();
				String text6 =String.valueOf(rater6.getText());
				String s7 = eq[6].getJieguo();
				String text7 =String.valueOf(rater7.getText());
				String s8 = eq[7].getJieguo();
				String text8 =String.valueOf(rater8.getText());
				String s9 = eq[8].getJieguo();
				String text9 =String.valueOf(rater9.getText());
				String s10 = eq[9].getJieguo();
				String text10 =String.valueOf(rater10.getText());
				String s11 = eq[10].getJieguo();
				String text11 =String.valueOf(rater11.getText());
				String s12 = eq[11].getJieguo();
				String text12 =String.valueOf(rater12.getText());
				String s13 = eq[12].getJieguo();
				String text13 =String.valueOf(rater13.getText());
				String s14 = eq[13].getJieguo();
				String text14 =String.valueOf(rater14.getText());
				String s15 = eq[14].getJieguo();
				String text15 =String.valueOf(rater15.getText());
				String s16 = eq[15].getJieguo();
				String text16 =String.valueOf(rater16.getText());
				String s17 = eq[16].getJieguo();
				String text17 =String.valueOf(rater17.getText());
				String s18 = eq[017].getJieguo();
				String text18 =String.valueOf(rater18.getText());
				String s19 = eq[18].getJieguo();
				String text19 =String.valueOf(rater19.getText());
				String s20 = eq[19].getJieguo();
				String text20 =String.valueOf(rater20.getText());
				
				
			
			if( s1.equals(text1) )
				{answer1.setText("正确 "); sum++;}
			else
				answer1.setText("错误");

			if( s2.equals(text2) )
			{answer2.setText("正确 "); sum++;}
			else
				answer2.setText("错误");
			
			if( s3.equals(text3) )
			{answer3.setText("正确 "); sum++;}
			else
				answer3.setText("错误");
			
			if( s4.equals(text4) )
			{answer4.setText("正确 "); sum++;}
			else
				answer4.setText("错误");
			
			if( s5.equals(text5) )
			{answer5.setText("正确 "); sum++;}
			else
				answer5.setText("错误");
			
			if( s6.equals(text6) )
			{answer6.setText("正确 "); sum++;}
			else
				answer6.setText("错误");
			
			if( s7.equals(text7) )
			{answer7.setText("正确 "); sum++;}
			else
				answer7.setText("错误");
			
			if( s8.equals(text8) )
			{answer8.setText("正确 "); sum++;}
			else
				answer8.setText("错误");
			
			if( s9.equals(text9) )
			{answer9.setText("正确 "); sum++;}
			else
				answer9.setText("错误");
			
			if( s10.equals(text10) )
			{answer10.setText("正确 "); sum++;}
			else
				answer10.setText("错误");
			
			if( s11.equals(text11) )
			{answer11.setText("正确 "); sum++;}
			else
				answer11.setText("错误");
			
			if( s12.equals(text12) )
			{answer12.setText("正确 "); sum++;}
			else
				answer12.setText("错误");
			
			if( s13.equals(text1) )
			{answer13.setText("正确 "); sum++;}
			else
				answer13.setText("错误");
			
			if( s14.equals(text14) )
			{answer14.setText("正确 "); sum++;}
			else
				answer14.setText("错误");
			
			if( s15.equals(text15) )
			{answer15.setText("正确 "); sum++;}
			else
				answer15.setText("错误");
			
			if( s16.equals(text16) )
			{answer16.setText("正确 "); sum++;}
			else
				answer16.setText("错误");
			
			if( s17.equals(text17) )
			{answer17.setText("正确 "); sum++;}
			else
				answer17.setText("错误");
			
			if( s18.equals(text18) )
			{answer18.setText("正确 "); sum++;}
			else
				answer18.setText("错误");
			
			if( s19.equals(text19) )
			{answer19.setText("正确 "); sum++;}
			else
				answer19.setText("错误");
			
			if( s20.equals(text20) )
			{answer20.setText("正确 "); sum++;}
			else
				answer20.setText("错误");


				//score储存分数
				for(int i = 0 ;i <= sum ;i++){
					 
					if(i>0) 
						score += 5;
					
				}



			}
			
		});
	
		
		
        //点击统计按钮后的操作
        sortButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent event)
			{
				setVisible(false);
				
				Row frame = new Row(sum,score);//调用函数判断计算结果

				
			}
		});

        
		
		setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("小学生四则运算系统");
		setLocation(500,100);
		
		
		
	}
	
	
	
}
	


	public class MyFrame extends JFrame {
		
		public MyFrame(String title) {

			super(title);
			JPanel root2 = new JPanel();
			this.setContentPane( root2 );	        				
	        this.setLayout(new GridLayout(9, 2)); 
			System.out.println("按钮被点击了");
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			JPanel north = new JPanel();
			JPanel south = new JPanel();
			JLabel label;
			JButton btn1;
			JButton btn2;
			if( title.equals("四则运算")) {
				 label = new JLabel("点击“开始”按钮开始测试，点击“退出”按钮退出测试",JLabel.CENTER); 
				 btn1 = new JButton("开始");
				 btn2 = new JButton("退出");
			}else if(title.equals("四則運算")) {
				 label = new JLabel("點擊「開始」按鈕開始測試，點擊「退出」按鈕退出測試",JLabel.CENTER); 
				 btn1 = new JButton("開始");
				 btn2 = new JButton("退出");
			}else {
				 label = new JLabel("Click the \"start\" button to start the test, and click the \"exit\" button to exit the test",JLabel.CENTER); 
				 btn1 = new JButton("start");
				 btn2 = new JButton("exit");
			}
			
			add(label);
			south.add(btn1);
			south.add(btn2);
			add(south,BorderLayout.SOUTH);
			
			//点击开始按钮后的操作
			btn1.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					setVisible(false);
					Frame0 frame = new Frame0();
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    			frame.setVisible(true);

				}
			});
	        
		 //点击退出按钮后的操作
		 btn2.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent event)
				{
					System.exit(0);
				}
			});
		}


			
			
		}
		
		
		
		


	
	

	

