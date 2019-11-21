package jOSCScope;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class QScopeView {

	private JFrame frmQscopeRevision;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QScopeView window = new QScopeView();
					window.frmQscopeRevision.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QScopeView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQscopeRevision = new JFrame();
		frmQscopeRevision.setTitle("QScope Console");
		frmQscopeRevision.setBounds(100, 100, 608, 353);
		frmQscopeRevision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmQscopeRevision.getContentPane().setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		frmQscopeRevision.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		JMenu mnControl = new JMenu("Control");
		menuBar.add(mnControl);
		
		JRadioButtonMenuItem rdbtnmntmProbe = new JRadioButtonMenuItem("Probe");
		mnControl.add(rdbtnmntmProbe);
		
		JRadioButtonMenuItem rdbtnmntmHold = new JRadioButtonMenuItem("Hold");
		mnControl.add(rdbtnmntmHold);
		
		JMenu mnAbout = new JMenu("Help");
		menuBar.add(mnAbout);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mnAbout.add(mntmAbout);
	}
}
