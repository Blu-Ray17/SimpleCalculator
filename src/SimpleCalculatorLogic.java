import javax.swing.*;

public class SimpleCalculatorLogic
{
    JTextField tfOutput= new JTextField();

    String currentInput = "";
    String secondInput = "";
    double storedValue;
    String currentOperator = "";
    String result;
    boolean firstSignAlternator = false;
    boolean secondSignAlternator = false;

    // button functionality

    /**
     * 0 button functionality with additional leading 0 prevention
     *
     */
    public void btn0_Click()
    {
        if (currentOperator.isEmpty()) { // first input
            if (currentInput.isEmpty()) {
                currentInput = "0";
                tfOutput.setText("0");
            } else {
                currentInput += "0";
                tfOutput.setText(tfOutput.getText() + "0");
            }
        } else { // second input
            if (secondInput.isEmpty()) {
                secondInput = "0";
                tfOutput.setText(tfOutput.getText() + "0");
            } else {
                secondInput += "0";
                tfOutput.setText(tfOutput.getText() + "0");
            }
        }
    }



    public void btn1_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "1");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "1");
            currentInput += digit;

        }

    }

    public void btn2_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "2");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "2");
            currentInput += digit;

        }
    }

    public void btn3_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "3");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "3");
            currentInput += digit;

        }
    }

    public void btn4_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
        tfOutput.setText(tfOutput.getText() + "4");
        secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "4");
            currentInput += digit;

        }
    }

    public void btn5_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "5");
            secondInput += digit;


        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "5");
            currentInput += digit;
            if (tfOutput.getText().equals("80085")) //（￣︶￣）
            {
                tfOutput.setText("BOOBS");
            }

        }

    }

    public void btn6_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "6");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "6");
            currentInput += digit;

        }
    }

    public void btn7_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "7");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "7");
            currentInput += digit;

        }
    }

    public void btn8_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "8");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "8");
            currentInput += digit;

        }
    }

    public void btn9_Click(String digit)
    {
        if (currentOperator.equals("+") ||
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            tfOutput.setText(tfOutput.getText() + "9");
            secondInput += digit;

        }
        else
        {
            tfOutput.setText(tfOutput.getText() + "9");
            currentInput += digit;

        }
    }

    /**
     * adds decimal button functionality including automatically adding 0 if not present
     */
    public void btnDecimal_Click()
    {

        if (currentOperator.equals("+") || // determines if value is first or second input
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            if (secondInput.isEmpty()) // automatically adds 0 if there are no numbers after to stop program breaking
            {
                secondInput = "0.";
                tfOutput.setText(tfOutput.getText() + "0.");
            }
            if (!secondInput.contains(".")) // stops multiple decimal points
            {
                secondInput += ".";
                tfOutput.setText(tfOutput.getText() + ".");
            }

        }
        else
        {
            if (currentInput.isEmpty()) // automatically adds 0 if there are no numbers after to stop program breaking
            {
                currentInput = "0.";
                tfOutput.setText(tfOutput.getText() + "0.");
            }
            if (!currentInput.contains(".")) // stops multiple decimal points
            {
                currentInput += ".";
                tfOutput.setText(tfOutput.getText() + ".");
            }
        }
    }

    /**
     * adds negative symbol to front of currently used number (current/second Input)
     */
    public void btnSign_Click()
    {
        int operatorIndex; // holds index of operator in tfOutput string

        if (currentOperator.equals("+") || // determines if to affect current or second Input
                currentOperator.equals("-") ||
                currentOperator.equals("/") ||
                currentOperator.equals("X"))
        {
            if (!secondSignAlternator)
            {
                // adds sign to secondInput
                secondInput = "-" + secondInput;
                operatorIndex = tfOutput.getText().indexOf(currentOperator);
                String tempOutput = tfOutput.getText().substring(0,operatorIndex+1) + "-" + tfOutput.getText().substring(operatorIndex+1); // inserts next to second input not start of whole string (after operator)
                tfOutput.setText(tempOutput);
                secondSignAlternator = true;
            }
            else
            {
                // if boolean is true then sign is removed
                secondInput = secondInput.substring(1);
                tfOutput.setText(tfOutput.getText().substring(1));
                secondSignAlternator = false;
            }
        }

        if (currentOperator.isEmpty())
        {
            if (!firstSignAlternator)
            {
                currentInput = "-" + currentInput;
                tfOutput.setText("-" + tfOutput.getText());
                firstSignAlternator = true;
            }
            else
            {
                currentInput = currentInput.substring(1);
                tfOutput.setText(tfOutput.getText().substring(1));
                firstSignAlternator = false;
            }
        }
    }

    // Operations functions

    /**
     * displays a symbol and flags used operator
     */
    public void btnAdd_Click()
    {
        try
        {
            storedValue = Double.parseDouble(currentInput);
            tfOutput.setText(tfOutput.getText() + "+");
            currentOperator = "+";


        }
        catch (Exception e)
        {
            System.out.println(e);
        }

    }

    /**
     * displays subtract symbol and flags used operator
     */
    public void btnSubtract_Click()
    {
        try
        {
            storedValue = Double.parseDouble(currentInput);
            tfOutput.setText(tfOutput.getText() + "-");
            currentOperator = "-";


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * displays multiplier symbol and flags used operator
     */
    public void btnMultiply_Click()
    {
        try
        {
            storedValue = Double.parseDouble(currentInput);
            tfOutput.setText(tfOutput.getText() + "X");
            currentOperator = "X";


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * displays divide symbol and flags used operator
     */
    public void btnDivide_Click()
    {
        try
        {
            storedValue = Double.parseDouble(currentInput);
            tfOutput.setText(tfOutput.getText() + "/");
            currentOperator = "/";


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * provides functionality for backspace key (remove 1 character)
     */
    public void btnBackspace_Click()
    {
        if (currentOperator.isEmpty()) // affects first value (currentInput)
        {
            currentInput = currentInput.substring(0,currentInput.length()-1);
            tfOutput.setText(tfOutput.getText().substring(0, tfOutput.getText().length()-1));
        }
        else
        {
            secondInput = secondInput.substring(0, secondInput.length()-1);
            tfOutput.setText(tfOutput.getText().substring(0, tfOutput.getText().length()-1));
        }

    }

    /**
     * provides functionality for the clear button
     */
    public void btnClear_Click()
    {
        currentInput = "";
        secondInput = "";
        storedValue = 0;
        tfOutput.setText("");
        currentOperator = "";
        result = "";

    }

    /**
     * provides functionality for the equals button
     */

    public void btnEquals_Click()
    {
        try
        {
            double secondStoredValue = Double.parseDouble(secondInput); // pares second input to double to account for decimals when calculating
            double total = 0;

            switch (currentOperator) // determines operator used and performs it on input 1 and 2
            {
                case "+":
                    total = storedValue + secondStoredValue;
                    break;

                case "-":
                    total = storedValue - secondStoredValue;
                    break;

                case "X":
                    total = storedValue * secondStoredValue;
                    break;

                case "/":
                    total = storedValue / secondStoredValue;
                    break;
            }


            if (total == Math.floor(total)) // removes decimal value if answer is whole
            {
                result = String.valueOf((long) total);

            }
            else
            {
                result = String.valueOf(total);
            }
            int resultLength = result.length();

            if (resultLength >= 10)
            {
                if (result.contains(".")) {
                    tfOutput.setText(result.replaceAll("\\.?0*$", ""));
                } else {
                    tfOutput.setText(result);
                }            }
            else {
                if (result.contains(".")) {
                    tfOutput.setText(result.replaceAll("\\.?0*$", ""));
                } else {
                    tfOutput.setText(result);
                }            }

            // resets variables for next calculation
            currentInput = result;
            secondInput = "";
            currentOperator = "";


        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
