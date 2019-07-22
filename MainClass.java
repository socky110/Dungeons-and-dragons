import javax.swing.*;
import java.awt.event.*;
public class MainClass extends JApplet{ 
  public MainClass(){} 
  public static MainClass mc = new MainClass(); 
  
  public void init(){ 
    JButton jb1 = new JButton("file");
    this.add(jb1);
    this.setVisible(true);
  }
}
