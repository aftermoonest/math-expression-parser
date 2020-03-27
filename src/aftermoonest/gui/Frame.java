package aftermoonest.gui;

import aftermoonest.Expression;
import javafx.scene.input.KeyCode;

import javax.swing.*;
import java.awt.event.*;

public class Frame extends FrameMain {
    private JTextArea textAreaExp;
    private JButton submitButton;
    private JPanel panel;
    private JTextArea textAreaAnsw;
    private JButton clearButton;

    @Override
    void createView() {
        frame.add(panel);
        textAreaAnsw.setEditable(false);
    }

    @Override
    void actionListener() {
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                execute();
            }
        });
        textAreaExp.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent keyEvent) {
                if(keyEvent.getKeyCode() == KeyEvent.VK_ENTER){
                    execute();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textAreaExp.setText(null);
            }
        });
    }

    private void execute(){
        textAreaAnsw.setText(Double.toString(Expression.eval(textAreaExp.getText())));
    }

}
