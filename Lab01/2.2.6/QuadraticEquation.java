import javax.swing.JOptionPane;

public class QuadraticEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Enter a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Enter b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Enter c:"));

        if (a == 0) {
            // trở thành bậc 1
            if (b == 0) {
                if (c == 0)
                    JOptionPane.showMessageDialog(null, "Infinite solutions");
                else
                    JOptionPane.showMessageDialog(null, "No solution");
            } else {
                double x = -c / b;
                JOptionPane.showMessageDialog(null, "Linear solution x = " + x);
            }
            System.exit(0);
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            JOptionPane.showMessageDialog(null,
                    "x1 = " + x1 + "\nx2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            JOptionPane.showMessageDialog(null,
                    "Double root x = " + x);
        } else {
            JOptionPane.showMessageDialog(null, "No real solution");
        }

        System.exit(0);
    }
}
