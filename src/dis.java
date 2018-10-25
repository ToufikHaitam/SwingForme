import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Panel;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.ChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class dis extends JFrame{

	   dis(){
		this.setBounds(100, 100, 450, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pan panel = new pan();
		getContentPane().add(panel, BorderLayout.CENTER);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Sens");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmADroite = new JMenuItem("A droite");
		mntmADroite.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.Sens="dr";
			}
		});
		mnNewMenu.add(mntmADroite);
		
		JMenuItem mntmAgouche = new JMenuItem("Agouche");
		mntmAgouche.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.Sens="gch";
			}
		});
		mnNewMenu.add(mntmAgouche);
		
		JMenu mnAction = new JMenu("Action");
		menuBar.add(mnAction);
		
		JMenuItem mntmPause = new JMenuItem("Pause");
		mntmPause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panel.timer.stop();
			}
		});
		mnAction.add(mntmPause);
		
		JMenuItem mntmStart = new JMenuItem("Start");
		mntmStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			panel.timer.restart();
			}
		});
		mnAction.add(mntmStart);
		
		JMenu mnForme = new JMenu("Forme");
	 
		 
		 
		menuBar.add(mnForme);
		
		JMenuItem mntmRectangle = new JMenuItem("Rectangle");
		
		mnForme.add(mntmRectangle);
		
		JMenuItem mntmCercle = new JMenuItem("cercle");
		mntmCercle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				panel.type="Cercle";
			}
		});
		mnForme.add(mntmCercle);
		
		JMenu mnVitesse = new JMenu("Vitesse");
		 
		menuBar.add(mnVitesse);
		
		JMenuItem mntmLente = new JMenuItem("lente");
		mntmLente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.timer.setDelay(50);;
			}
		});
		mnVitesse.add(mntmLente);
		
		JMenuItem mntmMoyenne = new JMenuItem("moyenne");
		mntmMoyenne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.timer.setDelay(30);;
			}
		});
		mnVitesse.add(mntmMoyenne);
		
		JMenuItem mntmRapide = new JMenuItem("rapide");
		mntmRapide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.timer.setDelay(3);;
			}
		});
		
		mnVitesse.add(mntmRapide);
		
		
		
		
		mntmRectangle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                panel.type="rect";
                
			}
		});
		this.setVisible(true);
 		
		
		
		
	   }

	   
	   
	   public static void main(String[] args) {
		   new dis();
		   
	   }
	   
	   
	   
}
