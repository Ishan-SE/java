import javax.swing.*;
import java.awt.event.*; 

class MenuExample
{
	JMenu file,edit,view,open,new1;
	JMenuItem save, class1, folder,text,window,panel;
	

	MenuExample()
	{
		//menu bar
		JFrame frame = new JFrame("MenuExample");
		JMenuBar bar = new JMenuBar(); 
		file= new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("View");
		open=new JMenu("Open");
		new1= new JMenu("New");
		save=new JMenuItem("Save");
		class1=new JMenuItem("Class");
		folder=new JMenuItem("Folder");
		text=new JMenuItem("Text");
		window=new JMenuItem("Window");
		panel=new JMenuItem("Panel");
		
		// adding to menu and sub menu
		file.add(new1);
		file.add(save);
		file.add(class1);
		new1.add(text);
		new1.add(folder);
		view.add(window);
		view.add(panel);
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		bar.add(open);

		frame.setJMenuBar(bar);  
        frame.setSize(400,400);  
        frame.setLayout(null);  
        frame.setVisible(true);  
		//mouse click event
		frame.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e){
	    JPopupMenu popupmenu= new JPopupMenu();
		file= new JMenu("File");
		edit=new JMenu("Edit");
		view=new JMenu("View");
		open=new JMenu("Open");
		new1= new JMenu("New");
		save=new JMenuItem("Save");
		class1=new JMenuItem("Class");
		folder=new JMenuItem("Folder");
		text=new JMenuItem("Text");
		window=new JMenuItem("Window");
		panel=new JMenuItem("Panel");
		
		// adding to menu and sub menu
		file.add(new1);
		file.add(save);
		file.add(class1);
		new1.add(text);
		new1.add(folder);
		view.add(window);
		view.add(panel);
		bar.add(file);
		bar.add(edit);
		bar.add(view);
		bar.add(open);
			//popupmenu
        popupmenu=new JPopupMenu();
        popupmenu.add(file);
        popupmenu.add(edit);
        popupmenu.add(view);
        popupmenu.add(open);

  
        popupmenu.setSize(100,200);  
        popupmenu.setLayout(null);    
		popupmenu.add(popupmenu);
		 if (SwingUtilities.isRightMouseButton(e)){
				 popupmenu.show(frame, e.getX(), e.getY());
				 popupmenu.setVisible(true); 
			}
		}
		});

	}
	public static void main(String[] args) {
		new MenuExample();
	}
}