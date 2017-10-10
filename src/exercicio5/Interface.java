package exercicio5;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface extends JFrame {
	JLabel lblh = new JLabel("Altura");
	JLabel lblb = new JLabel("Base");
	JLabel lblarea = new JLabel("Àrea");
	
	JTextField txth = new JTextField();
	JTextField txtb = new JTextField();
	JTextField txtarea = new JTextField();
	
	JButton btnCalculo = new JButton("Calcular");
	double h, b;
	public Interface(){
		Calculo calc = new Calculo();
		
		
		
		Container paine = this.getContentPane();
		
		paine.add(lblh); // label
		lblh.setBounds(20,20,245,40);
		
		paine.add(txth);// caixa
		txth.setBounds(80,30,140,20);
		
		paine.add(lblb);// label
		lblb.setBounds(20,100,245,40);
		
		paine.add(txtb);// caixa
		txtb.setBounds(80,110,140,20);
		
		paine.add(lblarea);// label
		lblarea.setBounds(20,140,245,40);
		
		paine.add(txtarea);// caixa
		txtarea.setBounds(80,150,140,20);
		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 h = Double.parseDouble(txth.getText());
				 b = Double.parseDouble(txtb.getText());
				 txtarea.setText("" + calc.area(h, b));
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtarea.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String args[]){
		Interface inte = new Interface();
	}
}
