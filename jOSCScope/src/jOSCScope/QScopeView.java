package jOSCScope;

import javax.swing.*;
import java.awt.*;
import javax.swing.GroupLayout.Alignment;

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
		frmQscopeRevision.setBounds(100, 100, 1694, 1064);
		frmQscopeRevision.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JMenuBar menuBar = new JMenuBar();
		frmQscopeRevision.setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmConfigure = new JMenuItem("Configure");
		mnFile.add(mntmConfigure);
		
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
		frmQscopeRevision.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1680, 1004);
		frmQscopeRevision.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 0, 1195, 918);
		panel.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(1195, 0, 485, 918);
		panel.add(panel_2);
		
		JLabel lblDiv = new JLabel("DIV");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(37)
					.addComponent(lblDiv)
					.addContainerGap(428, Short.MAX_VALUE))
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(51)
					.addComponent(lblDiv)
					.addContainerGap(851, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.5);
		splitPane.setContinuousLayout(true);
		splitPane.setBounds(0, 920, 1680, 84);
		panel.add(splitPane);
		
		JButton btnChannel = new JButton("Channel 1");
		splitPane.setLeftComponent(btnChannel);
		
		JButton btnChannel_1 = new JButton("Channel 2");
		splitPane.setRightComponent(btnChannel_1);
	}
}
