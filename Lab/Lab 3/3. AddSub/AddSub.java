import java.awt.*;
import java.awt.event.*;

public class AddSub implements ActionListener{
	//Declaring
	Button add,sub;
	Label l1,l2,res;
	TextField t1,t2,t3;
	AddSub(){
		//Creating
		Frame frame = new Frame("Even & Odd");
		add = new Button("Add");
		sub = new Button("Sub");
		l1 = new Label("Number 1 : ");
		l2 = new Label("Number 2 : ");
		res = new Label("Result : ");
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();

		//Setting Bounds
		l1.setBounds(50,40,100,80);
		l2.setBounds(50,90,100,80);
		res.setBounds(50,150,100,80);
		t1.setBounds(150,60,100,30);
		t2.setBounds(150,110,100,30);
		t3.setBounds(150,170,100,30);
		add.setBounds(50,220,100,80);
		sub.setBounds(200,220,100,80);

		//adding to frame
		frame.add(add);
		frame.add(sub);
		frame.add(l1);
		frame.add(l2);
		frame.add(res);
		frame.add(t1);
		frame.add(t2);
		frame.add(t3);

		//config frame
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		add.addActionListener(this);
		sub.addActionListener(this);
	}

	public void actionPerformed(ActionEvent event) {
		double num1 = Double.parseDouble(t1.getText());
		double num2 = Double.parseDouble(t2.getText());
	try {
		if(event.getSource() == add) {
			t3.setText(String.valueOf(num1 + num2));
		}

		if(event.getSource() == sub) {
			t3.setText(String.valueOf(num1 - num2));
		}
	} catch (Exception e) {
			t3.setText("invalid " + e.getMessage());
	}
	}
	public static void main(String[] args) {
		new AddSub();
	}
}
