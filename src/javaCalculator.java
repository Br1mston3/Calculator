import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class javaCalculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel javaCalculator;
    private JTextField textPanel;
    private JButton buttonEquals;
    private JButton buttonDivide;
    private JButton buttonTwo;
    private JButton buttonThree;
    private JButton buttonFive;
    private JButton buttonEight;
    private JButton buttonDot;
    private JButton buttonPlus;
    private JButton buttonSix;
    private JButton buttonNine;
    private JButton buttonClear;
    private JButton buttonMinus;
    private JButton buttonMultiply;
    private JButton buttonOne;
    private JButton buttonFour;
    private JButton buttonSeven;
    private JButton buttonZero;
    private JButton buttonNegative;
    private JButton buttonPow;

    private void getOperator(String buttonText) {
        math_operator = buttonText.charAt(0);
        total1 += Double.parseDouble(textPanel.getText());
        textPanel.setText("");

    }


    private javaCalculator() {
        buttonOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonOneText = textPanel.getText() + buttonOne.getText();
                textPanel.setText(buttonOneText);
            }
        });
        buttonTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonTwoText = textPanel.getText() + buttonTwo.getText();
                textPanel.setText(buttonTwoText);
            }
        });
        buttonThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonThreeText = textPanel.getText() + buttonThree.getText();
                textPanel.setText(buttonThreeText);
            }
        });
        buttonFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFourText = textPanel.getText() + buttonFour.getText();
                textPanel.setText(buttonFourText);
            }
        });
        buttonFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonFiveText = textPanel.getText() + buttonFive.getText();
                textPanel.setText(buttonFiveText);
            }
        });
        buttonSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSixText = textPanel.getText() + buttonSix.getText();
                textPanel.setText(buttonSixText);
            }
        });
        buttonSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonSevenText = textPanel.getText() + buttonSeven.getText();
                textPanel.setText(buttonSevenText);
            }
        });
        buttonEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonEightText = textPanel.getText() + buttonEight.getText();
                textPanel.setText(buttonEightText);
            }
        });
        buttonNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonNineText = textPanel.getText() + buttonNine.getText();
                textPanel.setText(buttonNineText);
            }
        });
        buttonZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String buttonZeroText = textPanel.getText() + buttonZero.getText();
                textPanel.setText(buttonZeroText);
            }
        });
        buttonDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textPanel.getText().equals("")) {
                    textPanel.setText("0.");
                } else if (textPanel.getText().contains(".")) {
                    buttonDot.setEnabled(false);
                } else {
                    String buttonDotText = textPanel.getText() + buttonDot.getText();
                    textPanel.setText(buttonDotText);
                }
                buttonDot.setEnabled(true);
            }
        });

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonPlus.getText();
                getOperator(button_text);
            }
        });

        buttonMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMinus.getText();
                getOperator(button_text);

            }
        });
        buttonDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonDivide.getText();
                getOperator(button_text);
            }
        });

        buttonMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = buttonMultiply.getText();
                getOperator(button_text);
            }

        });
        buttonPow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String button_text = buttonPow.getText();
               getOperator(button_text);
            }
        });


        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator) {
                    case '+':
                        total2 = total1 + Double.parseDouble(textPanel.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(textPanel.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(textPanel.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(textPanel.getText());
                        break;
                    case '^':
                        total2 = Math.pow(total1, Double.parseDouble(textPanel.getText()));
                        break;
                }
                textPanel.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        buttonClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                textPanel.setText("");

            }
        });


        buttonNegative.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textPanel.getText().equals("")){
                    textPanel.setText("0");
                }else{
                Double x = -1 * Double.parseDouble(textPanel.getText());
                textPanel.setText(Double.toString(x));
                }

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("javaCalculator");
        frame.setContentPane(new javaCalculator().javaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
