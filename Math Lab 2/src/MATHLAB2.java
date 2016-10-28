
// MathLab02st.java
// The Rational Class Program I
// This is the student, starting version of the MathLab02 assignment.

import javax.swing.JOptionPane;

public class MATHLAB2 {
	public static void main(String args[]) {
		String strNbr1 = JOptionPane.showInputDialog("Enter Numerator ");
		String strNbr2 = JOptionPane.showInputDialog("Enter Denominator ");

		int num = Integer.parseInt(strNbr1);
		int den = Integer.parseInt(strNbr2);

		Rational r = new Rational(num, den);
		JOptionPane.showMessageDialog(null, r.getRational(num, den) + " equals " + r.getDecimal(num, den)
				+ " and reduces to " + r.getReducedFraction(num, den));

		System.exit(0);
	}
}

class Rational {
	private int oNum, oDen;

	// Rational
	public Rational(int n, int d) {
		n = oNum;
		d = oDen;
	}

	// getNum
	public int getNum(int num) {
		return num;
	}

	// getDen
	public int getDen(int den) {
		return den;
	}

	// getDecimal
	public double getDecimal(double num, double den) {
		return (double) num / den;
	}

	// getRational
	public String getRational(int num, int den) {
		return getNum(num) + "/" + getDen(den);
	}

	// getReducedFraction
	public String getReducedFraction(int num, int den) {
		return getReduce2(num, den) + "/" + getReduce1(den, num);
	}

	// reduce
	public String getReduce1(int den, int num) {
		String dens = (den / getGCF(num, den)) + "";
		return dens;
	}

	public String getReduce2(int num, int den) {
		String nums = (num / getGCF(num, den)) + "";
		return nums;
	}

	private int getGCF(int n1, int n2) {
		int rem = 0;
		int gcf = 0;
		do {
			rem = n1 % n2;
			if (rem == 0)
				gcf = n2;
			else {
				n1 = n2;
				n2 = rem;
			}
		} while (rem != 0);
		return gcf;
	}
}
