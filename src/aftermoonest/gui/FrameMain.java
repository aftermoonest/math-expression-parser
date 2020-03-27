package aftermoonest.gui;

import javax.swing.*;

public abstract class FrameMain extends JFrame {
    static final int SIZE_OF_FRAME_X = 1100;
    static final int SIZE_OF_FRAME_Y = 580;

    JFrame frame = new JFrame();

    public void run() {
        config();
        createView();
        actionListener();
    }

    private void config() {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(SIZE_OF_FRAME_X, SIZE_OF_FRAME_Y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
    }

    abstract void createView();

    abstract void actionListener();
}
