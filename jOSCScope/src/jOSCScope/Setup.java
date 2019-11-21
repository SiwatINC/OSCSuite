package jOSCScope;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Setup {

	private JFrame frmSetupOscscope;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setup window = new Setup();
					window.frmSetupOscscope.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Setup() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSetupOscscope = new JFrame();
		frmSetupOscscope.setTitle("Setup | OSCScope Suite");
		frmSetupOscscope.setBounds(100, 100, 458, 388);
		frmSetupOscscope.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmSetupOscscope.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(522, 472, 156, 36);
		frmSetupOscscope.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"QScope R1", "QScope R2", "QScope X", "DScope R1", "DScope R2", "SScope R1", "SScope R2", "Arduinoscope (DIY)"}));
		comboBox.setToolTipText("Oscilloscope Model");
		comboBox.setBounds(191, 101, 228, 44);
		frmSetupOscscope.getContentPane().add(comboBox);
		
		JLabel lblOscilloscopeModel = new JLabel("Oscilloscope Model");
		lblOscilloscopeModel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOscilloscopeModel.setBounds(31, 114, 143, 27);
		frmSetupOscscope.getContentPane().add(lblOscilloscopeModel);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"0.25MHz", "0.5MHz", "1MHz", "2MHz", "5MHz", "10MHz"}));
		comboBox_1.setToolTipText("Oscilloscope Model");
		comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox_1.setBounds(191, 156, 228, 44);
		frmSetupOscscope.getContentPane().add(comboBox_1);
		
		JLabel lblPollingRate = new JLabel("Polling Rate");
		lblPollingRate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPollingRate.setBounds(31, 169, 143, 27);
		frmSetupOscscope.getContentPane().add(lblPollingRate);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"JSON", "XML", "SERIALSTREAM", "WiFi"}));
		comboBox_2.setToolTipText("Oscilloscope Model");
		comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		comboBox_2.setBounds(191, 211, 228, 44);
		frmSetupOscscope.getContentPane().add(comboBox_2);
		
		JLabel lblProtocol = new JLabel("Protocol");
		lblProtocol.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProtocol.setBounds(31, 224, 143, 27);
		frmSetupOscscope.getContentPane().add(lblProtocol);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnContinue.setBounds(31, 284, 388, 56);
		frmSetupOscscope.getContentPane().add(btnContinue);
		
		JLabel lblOscilloscopeSetup = new JLabel("CH Series Oscilloscope Setup");
		lblOscilloscopeSetup.setFont(new Font("Dialog", Font.BOLD, 26));
		lblOscilloscopeSetup.setHorizontalAlignment(SwingConstants.CENTER);
		lblOscilloscopeSetup.setBounds(33, 11, 388, 79);
		frmSetupOscscope.getContentPane().add(lblOscilloscopeSetup);
	}
}
