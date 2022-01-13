import java.awt.*;
import java.awt.event.*;

public class EvenOdd implements ActionListener{
	//Declaring
	Button check;
	Label l1,res;
	TextField t1,t2;
	EvenOdd(){
		//Creating
		Frame frame = new Frame("Even & Odd");
		check = new Button("Check");
		l1 = new Label("Number : ");
		res = new Label("Result : ");
		t1 = new TextField();
		t2 = new TextField();

		//Setting Bounds
		l1.setBounds(50,10,100,80);
		res.setBounds(50,100,100,80);
		t1.setBounds(150,30,100,30);
		t2.setBounds(150,130,100,30);
		check.setBounds(50,200,100,80);

		//adding to frame
		frame.add(check);
		frame.add(l1);
		frame.add(res);
		frame.add(t1);
		frame.add(t2);

		//config frame
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		check.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		int num = Integer.parseInt(t1.getText());
		if(num%2==1){
			t2.setText(String.valueOf("Odd"));
		}else{
			t2.setText(String.valueOf("Even"));
		}
	}
	public static void main(String[] args) {
		new EvenOdd();
	}
}
