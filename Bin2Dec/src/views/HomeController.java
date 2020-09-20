package views;

import exceptions.InvalidNumberException;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import exceptions.InvalidNumberException;

public class HomeController {
    @FXML
    TextField inputNumber;
    @FXML
    Label result, error;

    public void convert() {
        try {
            char[] digits = this.inputNumber.getText().toCharArray();

            for (char digit:digits) {
                boolean condition = digit == '0' || digit == '1';
                if (condition){
                    this.error.setText("");
                } else {
                    throw new InvalidNumberException();
                }
            }
            int max = digits.length - 1;
            long result = 0;

            for (char digit:digits) {
                result += (digit=='0' ? 0 : (Math.pow(2, max)));
                max--;
            }

            this.result.setText(result+"");
        } catch (Exception e){
            this.error.setText(e.getMessage());
        }
    }

    public void clean() {
        this.inputNumber.setText("");
        this.result.setText("");
    }
}