package quiz_pack;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;


public class QuizTest extends JFrame implements ActionListener
{
	
	JLabel label;
	JRadioButton radioButton []=new JRadioButton[5];
	JButton btnNext,btnResult;
	ButtonGroup bg;
	int count=0 ,current =0 , x=1, y=1,now=0 , max_index=15;
//	int m[] = new int[10];
	int correct_ans[]=new int[15]; 
	
	
	QuizTest(String s)
	{
		super(s);
		label =new JLabel();
		add(label);
		bg =new ButtonGroup();
		
		for(int i=0;i<5;i++)
		{
			radioButton[i]=new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
		btnResult.setVisible(false);
		btnResult.addActionListener(this);
		btnNext.addActionListener(this);
		add(btnNext);
		add(btnResult);
		setData();
		label.setBounds(30,40,450, 20);
		radioButton[0].setBounds(50,80,450,20);
		radioButton[1].setBounds(50,110,200,20);
		radioButton[2].setBounds(50,140,200,20);
		radioButton[3].setBounds(50,170,200,20);
		btnNext.setBounds(100, 240, 100, 30);
		btnResult.setBounds(270,240,100,30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250,100);
		setVisible(true);
		setSize(600,350);
	}
	public void setData()
	{
		radioButton[4].setSelected(true);
		if(current==0)
		{
			label.setText("Q1: Who invented Java Programming?");
			radioButton[0].setText("(a) Guido van Rossum"); 
			radioButton[1].setText("(b) James Gosling");
			radioButton[2].setText("(c) Dennis Ritchie");
			radioButton[3].setText("(d) Bjarne Stroustrup");
			
			//Answer:  b
			 
			
		}
		
		if(current==1)
		{
			label.setText("Q2:Which one of the following is not an access modifier?");
			radioButton[0].setText("(a) Protected");
			radioButton[1].setText("(b)  Void");
			radioButton[2].setText("(c) Public");
			radioButton[3].setText("(d)  Private");
			
			
			//Answer:  b
			
		}
		if(current==2)
		{
			label.setText("Q3:  Which component is used to compile, debug and execute the java programs?");
			radioButton[0].setText("(a) JRE");
			radioButton[1].setText("(b) JIT");
			radioButton[2].setText("(c) JDK");
			radioButton[3].setText("(d) JVM");
			
			//Answer:  c
			 
			
		}
		if(current==3)
		{
			label.setText("Q4: Which one of the following is not a Java feature?");
			radioButton[0].setText("(a) Object-oriented");
			radioButton[1].setText("(b) Use of pointers");
			radioButton[2].setText("(c) Portable");
			radioButton[3].setText("(d) Dynamic and Extensible");
			
			//Answer:  b
			 
			
		}
		if(current==4)
		{
			label.setText("Q5: Which of these cannot be used for a variable name in Java?");
			radioButton[0].setText("(a) identifier & keyword");
			radioButton[1].setText("(b) identifier");
			radioButton[2].setText("(c) keyword");
			radioButton[3].setText("(d) none of the mentioned");
			
			
			//Answer:  c
			 
		}
		if(current==5)
		{
			label.setText("Q6: What is the extension of java code files?");
			radioButton[0].setText("(a)  .js");
			radioButton[1].setText("(b) .txt");
			radioButton[2].setText("(c) .class");
			radioButton[3].setText("(d) .java");
			
			//Answer:  d
			 
			
		}
		if(current==6)
		{
			label.setText("Q7: What is the numerical range of a char data type in Java? ");
			radioButton[0].setText("(a) 0 to 256");
			radioButton[1].setText("(b) -128 to 127");
			radioButton[2].setText("(c) 0 to 65535");
			radioButton[3].setText("(d) 0 to 32767");
			
			//Answer:  b
			 
			
		}
		if(current==7)
		{
			label.setText("Q8: Which environment variable is used to set the java path?");
			radioButton[0].setText("(a) MAVEN_Path");
			radioButton[1].setText("(b) JavaPATH");
			radioButton[2].setText("(c) JAVA");
			radioButton[3].setText("(d) JAVA_HOME");
			
			//Answer:  d
			 
			
		}
		if(current==8)
		{
			label.setText("Q9: Which class provides system independent server side implementation?");
			radioButton[0].setText("(a)  Server");
			radioButton[1].setText("(b) ServerReader");
			radioButton[2].setText("(c) Socket");
			radioButton[3].setText("(d) ServerSocket");
			
			//Answer:  d
			 
			
		}if(current==9)
		{
			label.setText("Q10: Which of these packages contains the exception Stack Overflow in Java?");
			radioButton[0].setText("(a) java.io");
			radioButton[1].setText("(b) java.system");
			radioButton[2].setText("(c)  java.lang");
			radioButton[3].setText("(d) java.util");
			
			//Answer: c
			 
			
		}
		if(current==10)
		{
			label.setText("Q11:  Which of the following is a type of polymorphism in Java Programming?");
			radioButton[0].setText("(a) Multiple polymorphism");
			radioButton[1].setText("(b) Compile time polymorphism");
			radioButton[2].setText("(c) Multilevel polymorphism");
			radioButton[3].setText("(d) Execution time polymorphism");
			
			//Answer:  b
			 
			
		}
		if(current==11)
		{
			label.setText("Q12: Which of the below is not a Java Profiler?");
			radioButton[0].setText("(a)  JProfiler");
			radioButton[1].setText("(b)  Eclipse Profiler");
			radioButton[2].setText("(c)  JVM");
			radioButton[3].setText("(d)  JConsole");
			
			//Answer:  c
			 
			
		}
		if(current==12)
		{
			label.setText("Q13: What is the extension of compiled java classes?");
			radioButton[0].setText("(a) .txt");
			radioButton[1].setText("(b) .js");
			radioButton[2].setText("(c) .class");
			radioButton[3].setText("(d) .java");
			
			//Answer: d 
			 
			
		}
		if(current==13)
		{
			label.setText("Q14: Which of these are selection statements in Java?");
			radioButton[0].setText("(a) break");
			radioButton[1].setText("(b) continue");
			radioButton[2].setText("(c) for()");
			radioButton[3].setText("(d) if()");
			
			//Answer:  d
			 
			
		}
		if(current==14)
		{
			label.setText("Q15: Which of these keywords is used to define interfaces in Java?");
			radioButton[0].setText("(a) intf");
			radioButton[1].setText("(b) Intf");
			radioButton[2].setText("(c) interface");
			radioButton[3].setText("(d) Interface");
			
			///Answer:  c
			 
		}
		
				
		
		label.setBounds(30,40,450,20);
		for(int i=0,j=0;i<=90;i+=30,j++)
		{
			radioButton[j].setBounds(50,80+i,200,20);
		}
		
	}
	
	boolean checkAns()
	{
		if(current==0)
		{	
			if(radioButton[1].isSelected())
				count++;
			current++;
		}
		
		if(current==1)
		{
			if(radioButton[1].isSelected())
				count++;
			current++;
		}
		
		if(current==2)
		{
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		if(current==3)
		{
			if(radioButton[1].isSelected())
				count++;
			current++;
		}
		
		if(current==4)
		{
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		if(current==5)
		{
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==6)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		if(current==7)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==8)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==9)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		if(current==10)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==11)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		if(current==12)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==13)
		{
			
//			return(radioButton[2].isSelected());
			if(radioButton[3].isSelected())
				count++;
			current++;
		}
		
		if(current==14)
		{
//			current++;
//			return(radioButton[2].isSelected());
			if(radioButton[2].isSelected())
				count++;
			current++;
		}
		
		
		return true;
	}
	
	public static void main(String []ar)
	{
		new QuizTest("SIMPL QUIZ APPLICATION ");
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNext)
		{
//			count = count+1;
			current++;
			setData();
			if(current==14)
			{
				btnNext.setEnabled(false);
				btnResult.setVisible(true);
				btnResult.setText("Result");
				
				
			}
			
		}
		if(e.getActionCommand().equals("Result"))
		{
			current = 0;
			if(checkAns())
			{
//				count = count +1;
				current++;
				JOptionPane.showMessageDialog(this, "Corrent Answers are "+ count);
				System.exit(0);
				
			}
		}
		
		
	}

}
