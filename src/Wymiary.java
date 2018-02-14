import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Wymiary{
	private JFrame okno  = new JFrame();
	JTextField widD = new JTextField();
	JTextField heiD = new JTextField();
	JTextField xB = new JTextField();
	JTextField yB = new JTextField();
	JTextField widB = new JTextField();
	JTextField heiB = new JTextField();
	JTextField wynik = new JTextField();
	
	double w, h;
	
	public static void main (String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {new Wymiary();} 
				catch (Exception e) {e.printStackTrace();}
			}
			});	
		
	}

	public Wymiary(){
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		double W = screenSize.getWidth();		
		double H = screenSize.getHeight();
		
		w = W*0.01;
		h = H*0.01;
		
		okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		okno.setVisible(true);
		okno.setPreferredSize(new Dimension(540,330));
		okno.setTitle("Procentowe wymiary");
		okno.setLayout(new FlowLayout());
		
		JPanel roz = new JPanel();
		roz.setPreferredSize(new Dimension(530, 40));
		roz.setBackground(new Color(240,240,220));
		roz.setLayout(null);
		String tt = "Ekran: " + String.valueOf(W)+" x "+String.valueOf(H);
		JLabel j = new JLabel();
		j.setBounds(10, 0, 200, 20);
		j.setText(tt);
		roz.add(j);
		
		JPanel panelD = new JPanel();
		//panelD.setBackground(Color.LIGHT_GRAY);
		panelD.setLayout(null);
		panelD.setPreferredSize(new Dimension(250,170));
		//panelD.setBounds(10,10,300,160);
		JLabel d = new JLabel("Dimension:");
		d.setBounds(0, 0, 100, 20);
		JLabel m1 = new JLabel("width:");
		m1.setBounds(20, 22, 70, 20);
		widD.setBounds(80, 20, 100, 20);
		JLabel m2 = new JLabel("height:");
		m2.setBounds(20, 52, 70, 20);
		heiD.setBounds(80, 52, 100, 20);
		JButton bD  = new JButton("Licz");
		bD.setBounds(80,82,100,20);
		bD.setFocusable(false);
		bD.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				obliczD();
			}
		});
		
		panelD.add(d);
		panelD.add(m1);
		panelD.add(widD);
		panelD.add(m2);
		panelD.add(heiD);
		panelD.add(bD);
		
		JPanel panelR = new JPanel();
		//panelR.setBackground(Color.WHITE);
		panelR.setLayout(null);
	//	panelR.setBounds(10,210,300,160);
		panelR.setPreferredSize(new Dimension(250,170));
		JLabel r = new JLabel("Bounds:");
		r.setBounds(0, 0, 100, 20);
		JLabel m3 = new JLabel("pos x:");
		m3.setBounds(20, 22, 70, 20);
		xB.setBounds(80, 20, 100, 20);
		JLabel m4 = new JLabel("pos y:");
		m4.setBounds(20, 52, 70, 20);
		yB.setBounds(80, 52, 100, 20);
		JLabel m5 = new JLabel("width:");
		m5.setBounds(20, 82, 70, 20);
		widB.setBounds(80, 82, 100, 20);
		JLabel m6 = new JLabel("height:");
		m6.setBounds(20, 112, 70, 20);
		heiB.setBounds(80, 112, 100, 20);
		JButton bB  = new JButton("Licz");
		bB.setBounds(80,142,100,20);
		bB.setFocusable(false);
		bB.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent arg0) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				// TODO Auto-generated method stub
				obliczB();
			}
		});
		
		
		JPanel wyn = new JPanel();
		wyn.setPreferredSize(new Dimension(530, 40));
		wyn.setBackground(new Color(240,240,220));
		wyn.setLayout(null);
		
		
		wynik.setBounds(10, 5, 500, 20);
		
		
		wyn.add(wynik);
		
		panelR.add(r);
		panelR.add(m3);
		panelR.add(xB);
		panelR.add(m4);
		panelR.add(yB);
		panelR.add(m5);
		panelR.add(widB);
		panelR.add(m6);
		panelR.add(heiB);
		panelR.add(bB);
		okno.add(roz);
		okno.add(panelD);
		okno.add(panelR);
		okno.add(wyn);
		okno.pack();
		
		widD.setText("30");
		heiD.setText("20");
	}
	
	private void obliczD(){
		StringBuilder sb = new StringBuilder();
		sb.append(" = new Dimension(w(");
		int v;
		double vv;
		v = Integer.parseInt(widD.getText());
		System.out.println("szer: "+ v);
		vv = Math.round(v/w*100.0)/100.0;
		System.out.println("double: "+ vv);
		sb.append(vv);
		sb.append("), h(");
		v = Integer.parseInt(heiD.getText());
		vv = Math.round(v/h*100.0)/100.0;
		sb.append(vv);
		sb.append("));");
		wynik.setText(sb.toString());

	}
	private void obliczB(){
		StringBuilder sb = new StringBuilder();
		sb.append(" = new Rectangle(w(");
		int v;
		double vv;
		v = Integer.parseInt(xB.getText());
		vv = Math.round(v/w*100.0)/100.0;
		sb.append(vv);
		sb.append("), h(");
		v = Integer.parseInt(yB.getText());
		vv = Math.round(v/h*100.0)/100.0;
		sb.append(vv);
		sb.append("), w(");
		
		v = Integer.parseInt(widB.getText());
		vv = Math.round(v/w*100.0)/100.0;
		sb.append(vv);
		sb.append("), h(");
		v = Integer.parseInt(heiB.getText());
		vv = Math.round(v/h*100.0)/100.0;
		sb.append(vv);
		sb.append("));");
		wynik.setText(sb.toString());
	}
	
}
