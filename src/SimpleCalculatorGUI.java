import java.awt.*;
import javax.swing.*;

public class SimpleCalculatorGUI
{
    // Object Declarations
    SimpleCalculatorLogic scl = new SimpleCalculatorLogic();

    //Swing Declarations
    JFrame calculatorWindow = new JFrame();

    JPanel calculatorScreen = new JPanel(null);

    JLabel lblCalculator = new JLabel();

    // Buttons for numbers & related
    JButton btn0 = new JButton("0");
    JButton btn1 = new JButton("1");
    JButton btn2 = new JButton("2");
    JButton btn3 = new JButton("3");
    JButton btn4 = new JButton("4");
    JButton btn5 = new JButton("5");
    JButton btn6 = new JButton("6");
    JButton btn7 = new JButton("7");
    JButton btn8 = new JButton("8");
    JButton btn9 = new JButton("9");
    JButton btnDecimal = new JButton(".");
    JButton btnSign = new JButton("+/-");

    //buttons for operations
    JButton btnAdd = new JButton("+");
    JButton btnSubtract = new JButton("-");
    JButton btnMultiply = new JButton("X");
    JButton btnDivide = new JButton("/");
    JButton btnBackspace = new JButton("<-");
    JButton btnClear = new JButton("C");
    JButton btnEquals = new JButton("=");



    /**
     * Initialises window and adds panel
     */
    public void screenInitialisation()
    {
        calculatorWindow.setLayout(new GridLayout(1,1));
        calculatorWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        calculatorWindow.setSize(375,550);
        calculatorWindow.setLocation(550,300);

        calculatorScreenBuilder();
        calculatorWindow.add(calculatorScreen);

        calculatorWindow.setVisible(true);
    }

    /**
     * builds screen and calls components to build panel
     */
    public void calculatorScreenBuilder()
    {

        lblCalculator.setLocation(135,5);
        lblCalculator.setSize(100,50);
        lblCalculator.setText("Calculator");
        calculatorScreen.add(lblCalculator);

        scl.tfOutput.setLocation(7,50);
        scl.tfOutput.setSize(320,70);
        scl.tfOutput.setFont(new Font("Arial", Font.PLAIN,50));
        scl.tfOutput.setHorizontalAlignment(JTextField.RIGHT);
        scl.tfOutput.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 0));
        calculatorScreen.add(scl.tfOutput);

        numberBuilder();
        operationsBuilder();
    }

    /**
     * defines where the number (& related) buttons are positioned and what methods they call
     */
    public void numberBuilder()
    {
        btn9.setLocation(5,200);
        btn9.setSize(70,50);
        btn9.addActionListener(e-> scl.btn9_Click("9"));
        calculatorScreen.add(btn9);

        btn8.setLocation(80,200);
        btn8.setSize(70,50);
        btn8.addActionListener(e-> scl.btn8_Click("8"));
        calculatorScreen.add(btn8);

        btn7.setLocation(155,200);
        btn7.setSize(70,50);
        btn7.addActionListener(e-> scl.btn7_Click("7"));
        calculatorScreen.add(btn7);

        btn6.setLocation(5,255);
        btn6.setSize(70,50);
        btn6.addActionListener(e-> scl.btn6_Click("6"));
        calculatorScreen.add(btn6);

        btn5.setLocation(80,255);
        btn5.setSize(70,50);
        btn5.addActionListener(e-> scl.btn5_Click("5"));
        calculatorScreen.add(btn5);

        btn4.setLocation(155,255);
        btn4.setSize(70,50);
        btn4.addActionListener(e-> scl.btn4_Click("4"));
        calculatorScreen.add(btn4);

        btn3.setLocation(5,310);
        btn3.setSize(70,50);
        btn3.addActionListener(e-> scl.btn3_Click("3"));
        calculatorScreen.add(btn3);

        btn2.setLocation(80,310);
        btn2.setSize(70,50);
        btn2.addActionListener(e-> scl.btn2_Click("2"));
        calculatorScreen.add(btn2);

        btn1.setLocation(155,310);
        btn1.setSize(70,50);
        btn1.addActionListener(e-> scl.btn1_Click("1"));
        calculatorScreen.add(btn1);

        btn0.setLocation(5,365);
        btn0.setSize(70,50);
        btn0.addActionListener(e-> scl.btn0_Click("0"));
        calculatorScreen.add(btn0);

        btnDecimal.setLocation(80,365);
        btnDecimal.setSize(70,50);
        btnDecimal.addActionListener(e-> scl.btnDecimal_Click());
        calculatorScreen.add(btnDecimal);

        btnSign.setLocation(155,365);
        btnSign.setSize(70,50);
        btnSign.addActionListener(e-> scl.btnSign_Click());
        calculatorScreen.add(btnSign);

    }

    /**
     * defines where the operation buttons are positioned and what methods they call
     */
    public void operationsBuilder()
    {
        btnBackspace.setLocation(5,145);
        btnBackspace.setSize(70,50);
        btnBackspace.addActionListener(e->scl.btnBackspace_Click());
        calculatorScreen.add(btnBackspace);

        btnClear.setLocation(230,145);
        btnClear.setSize(70,50);
        btnClear.addActionListener(e->scl.btnClear_Click());
        calculatorScreen.add(btnClear);

        btnDivide.setLocation(230,200);
        btnDivide.setSize(70,50);
        btnDivide.addActionListener(e-> scl.btnDivide_Click());
        calculatorScreen.add(btnDivide);

        btnMultiply.setLocation(230,255);
        btnMultiply.setSize(70,50);
        btnMultiply.addActionListener(e-> scl.btnMultiply_Click());
        calculatorScreen.add(btnMultiply);

        btnSubtract.setLocation(230, 310);
        btnSubtract.setSize(70,50);
        btnSubtract.addActionListener(e-> scl.btnSubtract_Click());
        calculatorScreen.add(btnSubtract);

        btnAdd.setLocation(230,365);
        btnAdd.setSize(70,50);
        btnAdd.addActionListener(e-> scl.btnAdd_Click());
        calculatorScreen.add(btnAdd);

        btnEquals.setLocation(230, 420);
        btnEquals.setSize(70,50);
        btnEquals.addActionListener(e-> scl.btnEquals_Click());
        calculatorScreen.add(btnEquals);

    }



    public static void main (String [] args)
    {
        SimpleCalculatorGUI sgc = new SimpleCalculatorGUI();
        sgc.screenInitialisation();

    }
}
