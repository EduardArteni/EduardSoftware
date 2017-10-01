package edu;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TicTacToe {
	public static String winer = null;
	public static int XPoints = 0;
	public static int OPoints = 0;
	public static String table[][] = new String[3][3];
	public static JTextField winerIs = new JTextField();
	public static JTextField Points0 = new JTextField("0 has " + OPoints + " points");
	public static JTextField PointsX = new JTextField("X has " + XPoints + " points");

	public static JButton button1 = new JButton("");
	public static JButton button2 = new JButton("");
	public static JButton button3 = new JButton("");
	public static JButton button4 = new JButton("");
	public static JButton button5 = new JButton("");
	public static JButton button6 = new JButton("");
	public static JButton button7 = new JButton("");
	public static JButton button8 = new JButton("");
	public static JButton button9 = new JButton("");

	public static void main(String[] args) {

		String table[][] = new String[3][3];

		String turn[] = { "X" };
		JFrame f = new JFrame();

		winerIs.setVisible(false);
		winerIs.setBounds(500, 1000, 1000, 100);
		winerIs.setEditable(false);

		JTextField WhosTurn = new JTextField();
		WhosTurn.setVisible(true);
		WhosTurn.setBounds(700, 100, 300, 100);

		Font bigFont = WhosTurn.getFont().deriveFont(Font.PLAIN, 50f);
		WhosTurn.setFont(bigFont);

		WhosTurn.setText("Its " + turn[0] + "'s turn");
		WhosTurn.setEditable(false);

		winerIs.setFont(bigFont);
		PointsX.setBounds(10, 100, 350, 100);
		PointsX.setEditable(false);

		Font bigFont3 = Points0.getFont().deriveFont(Font.PLAIN, 50f);
		Points0.setFont(bigFont3);
		Points0.setBounds(1900, 100, 350, 100);
		Points0.setEditable(false);
		PointsX.setFont(bigFont3);

		button1.setBounds(700, 300, 100, 100);
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button1 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[0][0] = "X";
					turn[0] = "0";
					button1.setText("X");
					WhosTurn.setText("Its " + turn[0] + "'s turn");

				} else if (turn[0].equalsIgnoreCase("0")) {
					table[0][0] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button1.setText("0");
				}
				button1.setFont(bigFont3);

				button1.setEnabled(false);
				checkIfWin(table);

			}
		});
		button2.setBounds(800, 300, 100, 100);
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 2 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[0][1] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button2.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[0][1] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button2.setText("0");
				}
				button2.setEnabled(false);
				checkIfWin(table);
				button2.setFont(bigFont3);
			}
		});
		button3.setBounds(900, 300, 100, 100);
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 3pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[0][2] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button3.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[0][2] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button3.setText("0");
				}
				button3.setEnabled(false);
				checkIfWin(table);
				button3.setFont(bigFont3);
			}
		});
		button4.setBounds(700, 400, 100, 100);
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 4 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[1][0] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button4.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[1][0] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button4.setText("0");
				}
				button4.setEnabled(false);
				checkIfWin(table);
				button4.setFont(bigFont3);
			}
		});
		button5.setBounds(800, 400, 100, 100);
		button5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 5 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[1][1] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button5.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[1][1] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button5.setText("0");
				}
				button5.setEnabled(false);
				checkIfWin(table);
				button5.setFont(bigFont3);
			}
		});
		button6.setBounds(900, 400, 100, 100);
		button6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 6 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[1][2] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button6.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[1][2] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button6.setText("0");
				}
				button6.setEnabled(false);
				checkIfWin(table);
				button6.setFont(bigFont3);
			}
		});
		button7.setBounds(700, 500, 100, 100);
		button7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 7 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[2][0] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button7.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[2][0] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button7.setText("0");
				}
				button7.setEnabled(false);
				checkIfWin(table);
				button7.setFont(bigFont3);
			}
		});
		button8.setBounds(800, 500, 100, 100);
		button8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 8 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[2][1] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button8.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[2][1] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button8.setText("0");
				}

				button8.setEnabled(false);
				checkIfWin(table);
				button8.setFont(bigFont3);
			}
		});
		button9.setBounds(900, 500, 100, 100);
		button9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("button 9 pressed");
				if (turn[0].equalsIgnoreCase("X")) {
					table[2][2] = "X";
					turn[0] = "0";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button9.setText("X");
				} else if (turn[0].equalsIgnoreCase("0")) {
					table[2][2] = "0";
					turn[0] = "X";
					WhosTurn.setText("Its " + turn[0] + "'s turn");
					button9.setText("0");
				}
				button9.setEnabled(false);
				checkIfWin(table);
				button9.setFont(bigFont3);
			}
		});
		JButton buttonReset = new JButton("Reset");
		buttonReset.setBounds(100, 1000, 100, 100);
		buttonReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				button1.setEnabled(true);
				button2.setEnabled(true);
				button3.setEnabled(true);
				button4.setEnabled(true);
				button5.setEnabled(true);
				button6.setEnabled(true);
				button7.setEnabled(true);
				button8.setEnabled(true);
				button9.setEnabled(true);
				table[0][0] = null;
				table[0][1] = null;
				table[0][2] = null;
				table[1][0] = null;
				table[1][1] = null;
				table[1][2] = null;
				table[2][0] = null;
				table[2][1] = null;
				table[2][2] = null;
				turn[0] = "X";
				button1.setText("");
				button2.setText("");
				button3.setText("");
				button4.setText("");
				button5.setText("");
				button6.setText("");
				button7.setText("");
				button8.setText("");
				button9.setText("");
				WhosTurn.setText("Its " + turn[0] + "'s turn");
				winerIs.setText("");
				winerIs.setVisible(false);

			}
		});

		f.setLayout(null);
		f.add(button1);
		f.add(button2);
		f.add(button3);
		f.add(button4);
		f.add(button5);
		f.add(button6);
		f.add(button7);
		f.add(button8);
		f.add(button9);
		f.add(WhosTurn);
		f.add(PointsX);
		f.add(Points0);
		f.add(buttonReset);
		f.add(winerIs);

		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setResizable(true);

	}

	public static String checkIfWin(String table[][]) {
		// orizontala
		// linia 0
		winer = null;

		if ("X".equalsIgnoreCase(table[0][0]) && "X".equalsIgnoreCase(table[0][1])
				&& "X".equalsIgnoreCase(table[0][2])) {

			winer = "X";
		}
		if ("0".equalsIgnoreCase(table[0][0]) && "0".equalsIgnoreCase(table[0][1])
				&& "0".equalsIgnoreCase(table[0][2])) {

			winer = "0";
		}
		// linia 1
		if (("X").equalsIgnoreCase(table[1][0]) && ("X".equalsIgnoreCase(table[1][1]))
				&& ("X".equalsIgnoreCase(table[1][2]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[1][0])) && ("0".equalsIgnoreCase(table[1][1]))
				&& ("0".equalsIgnoreCase(table[1][2]))) {

			winer = "0";
		}
		// linia 2
		if (("X".equalsIgnoreCase(table[2][0])) && ("X".equalsIgnoreCase(table[2][1]))
				&& ("X".equalsIgnoreCase(table[2][2]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[2][0])) && ("0".equalsIgnoreCase(table[2][1]))
				&& ("0".equalsIgnoreCase(table[2][2]))) {

			winer = "0";
		}

		// verticala
		// linia 0
		if (("X".equalsIgnoreCase(table[0][0])) && ("X".equalsIgnoreCase(table[1][0]))
				&& ("X".equalsIgnoreCase(table[2][0]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[0][0])) && ("0".equalsIgnoreCase(table[1][0]))
				&& ("0".equalsIgnoreCase(table[2][0]))) {

			winer = "0";
		}
		// linia 1
		if (("X".equalsIgnoreCase(table[0][1])) && ("X".equalsIgnoreCase(table[1][1]))
				&& ("X".equalsIgnoreCase(table[2][1]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[0][1])) && ("0".equalsIgnoreCase(table[1][1]))
				&& ("0".equalsIgnoreCase(table[2][1]))) {

			winer = "0";
		}
		// linia 2
		if (("X".equalsIgnoreCase(table[0][2])) && ("X".equalsIgnoreCase(table[1][2]))
				&& ("X".equalsIgnoreCase(table[2][2]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[0][2])) && ("0".equalsIgnoreCase(table[1][2]))
				&& ("0".equalsIgnoreCase(table[2][2]))) {

			winer = "0";
		}
		// diagonala

		// dreapta sus - stanga jos
		if (("X".equalsIgnoreCase(table[0][2])) && ("X".equalsIgnoreCase(table[1][1]))
				&& ("X".equalsIgnoreCase(table[2][0]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[0][2])) && ("0".equalsIgnoreCase(table[1][1]))
				&& ("0".equalsIgnoreCase(table[2][0]))) {

			winer = "0";
		}
		// stanga sus - dreapta jos
		if (("X".equalsIgnoreCase(table[0][0])) && ("X".equalsIgnoreCase(table[1][1]))
				&& ("X".equalsIgnoreCase(table[2][2]))) {

			winer = "X";
		}
		if (("0".equalsIgnoreCase(table[0][0])) && ("0".equalsIgnoreCase(table[1][1]))
				&& ("0".equalsIgnoreCase(table[2][2]))) {

			winer = "0";
		}

		if (("X".equalsIgnoreCase(winer))) {
			XPoints++;
			PointsX.setText("X has " + XPoints + " points");
		}
		if (("0".equalsIgnoreCase(winer))) {
			OPoints++;
			Points0.setText("0 has " + OPoints + " points");

		}
		if (winer != null) {
			winerIs.setVisible(true);
			winerIs.setText("The winer is " + winer + " Congratulations !");
			button1.setEnabled(false);
			button2.setEnabled(false);
			button3.setEnabled(false);
			button4.setEnabled(false);
			button5.setEnabled(false);
			button6.setEnabled(false);
			button7.setEnabled(false);
			button8.setEnabled(false);
			button9.setEnabled(false);
		}
		if (winer == null && !button1.isEnabled() && !button2.isEnabled() && !button3.isEnabled()
				&& !button4.isEnabled() && !button5.isEnabled() && !button6.isEnabled() && !button7.isEnabled()
				&& !button8.isEnabled() && !button9.isEnabled()) {
			winerIs.setVisible(true);
			winerIs.setText("Draw well played !");
		}

		return winer;

	}

}
