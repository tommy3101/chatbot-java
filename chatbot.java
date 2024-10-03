package projects;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Chatbot1 extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JTextArea ca= new JTextArea();
	private JTextField cf=new JTextField();                                  
	private JButton b=new JButton();
	private JLabel l=new JLabel();
	
	Chatbot1(){                                                                          
		
		JFrame f=new JFrame();                                     
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);                      
		f.setVisible(true);
		f.setResizable(false);
		f.setLayout(null);
		f.setSize(500,500);
		f.getContentPane().setBackground(Color.white);
		f.setTitle("ChatBot");
		f.add(ca);
		f.add(cf);
		ca.setSize(600,390);
		ca.setLocation(1, 1);
		ca.setBackground(Color.BLACK);
		cf.setSize(300,60);
		cf.setLocation(1,400);
		f.add(b);
		l.setText("CHAT");
		b.add(l);
		b.setSize(300,60);
		b.setLocation(300,400);
		
		b.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				    
				if(e.getSource()==b) {                          
					
					String text=cf.getText().toLowerCase();
					ca.setForeground(Color.GREEN);
					ca.append("You-->"+text+"\n");
					cf.setText("");
					
					if(text.contains("hi")) {                        
						replyMeth("Hi there");
					}
					else if(text.contains("how are you")) {
						replyMeth("I'm Good :).Thankyou for asking");
					}
					else if(text.contains("what is your name")) {
						replyMeth("I don't have a name bruhhhh!!!");
					}
					else if(text.contains("gender")) {
						replyMeth("I'm Female.Don't Try to Flirt with me"+"\n"+"you Fell in love :)");
					}
					else if(text.contains("love you")) {
						replyMeth("I'm Feeling Shy :) Love you to");
					}
					else if(text.contains("how is the weather today")){
						replyMeth("its kinda warm and chill");
					}
					else if(text.contains("bye")) {
						replyMeth("Too Soon :( AnyWays"+"\n"+"STAY HOME STAY SAFE ");
					}
					else 
						replyMeth("I Can't Understand");
					
				}
				
			}
			
		});
		
	}
	public void replyMeth(String s) {                          
		ca.append("ChatBot-->"+s+"\n");         
	}
			

}



public class chatbot {                                     

	public static void main(String[] args) {             
		
          new Chatbot1();                                   
	}

}