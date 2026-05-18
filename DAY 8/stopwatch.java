import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StopWatch extends JFrame {
    private JLabel timeLabel;
    private JButton startButton, resetButton;
    private int hours, minutes, seconds, milliseconds;
    private boolean running;
    
    public StopWatch() {
        setTitle("Stop Watch");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        
        // Label for stopwatch display
        timeLabel = new JLabel("00 : 00 : 00 . 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(timeLabel);
        



        // Start button
        startButton = new JButton("Start");
        startButton.addActionListener(new StartAction());
        add(startButton);
        
        // Reset button
        resetButton = new JButton("Reset");
        resetButton.addActionListener(e -> reset());
        add(resetButton);
    }
    
    private class StartAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (!running) {
                running = true;
                startButton.setText("Stop");
                new Thread(() -> runStopwatch()).start();
            } else {
                running = false;
                startButton.setText("Start");
            }
        }
    }
    
    private void runStopwatch() {
        while (running) {
            try {
                Thread.sleep(10);
                milliseconds += 10;
                if (milliseconds == 1000) {
                    milliseconds = 0;
                    seconds++;
                }
                if (seconds == 60) {
                    seconds = 0;
                    minutes++;
                }
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
                timeLabel.setText(String.format("%02d : %02d : %02d . %02d", hours, minutes, seconds, milliseconds / 10));
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
    
    private void reset() {
        running = false;
        hours = minutes = seconds = milliseconds = 0;
        timeLabel.setText("00 : 00 : 00 . 00");
        startButton.setText("Start");
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StopWatch stopwatch = new StopWatch();
            stopwatch.setVisible(true);
        });
    }
}
