import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * Created by nikhil on 9/20/2016.
 */
public class TwoPlayer {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tic Tac Toe");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(2, 3);
        frame.setLayout(grid);
        JLabel sizeLabel = new JLabel("Grid Size");
        frame.add(sizeLabel);
        JLabel diffLabel = new JLabel("Difficulty");
        frame.add(diffLabel);
        String[] boxSizes = {"3x3", "4x4", "5x5"};
        JComboBox boxSizeChooser = new JComboBox(boxSizes);
        String[] difficulties = {"Easy", "Medium", "Hard", "Two Player"};
        JComboBox difficultyChooser = new JComboBox(difficulties);
        JButton label = new JButton("Start!");
        label.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int size = boxSizeChooser.getSelectedIndex()+3;
                int difficulty = difficultyChooser.getSelectedIndex()+1;
                System.out.println(size + " " + difficulty);
                game(size, difficulty);
            }
        });
        frame.add(label);
        frame.add(boxSizeChooser);
        frame.add(difficultyChooser);
        frame.pack();
        frame.setVisible(true);
    }
    static String turn = "X";
    private static void game(int size, int difficulty) {
        if(size == 3 && difficulty == 4) {
            JFrame frame = new JFrame("Game");
            frame.setMinimumSize(new Dimension(300, 400));
            String[][] grid= new String[3][3];
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    grid[i][j] = "";
                }
            }
            JButton ac = new JButton();
            JButton bc = new JButton();
            JButton cc = new JButton();
            JButton ab = new JButton();
            JButton bb = new JButton();
            JButton cb = new JButton();
            JButton aa = new JButton();
            JButton ba = new JButton();
            JButton ca = new JButton();
            ac.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(ac.getText().equals("X") || ac.getText().equals("Y"))) {
                        ac.setText(turn);
                        grid[0][2] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            bc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(bc.getText().equals("X") || bc.getText().equals("Y"))) {
                        bc.setText(turn);
                        grid[1][2] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            cc.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(cc.getText().equals("X") || cc.getText().equals("Y"))) {
                        cc.setText(turn);
                        grid[2][2] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });

            ab.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(ab.getText().equals("X") || ab.getText().equals("Y"))) {
                        ab.setText(turn);
                        grid[0][1] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            bb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(bb.getText().equals("X") || bb.getText().equals("Y"))) {
                        bb.setText(turn);
                        grid[1][1] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            cb.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(cb.getText().equals("X") || cb.getText().equals("Y"))) {
                        cb.setText(turn);
                        grid[2][1] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });

            aa.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(aa.getText().equals("X") || aa.getText().equals("Y"))) {
                        aa.setText(turn);
                        grid[0][0] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            ba.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(ba.getText().equals("X") || ba.getText().equals("Y"))) {
                        ba.setText(turn);
                        grid[1][0] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            ca.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if(!(ca.getText().equals("X") || ca.getText().equals("Y"))) {
                        ca.setText(turn);
                        grid[2][0] = turn;
                        int num = checkWon(grid, turn);
                        if(num != 0) {
                            frame.getContentPane().removeAll();
                            for (int i = 2; i >= 0; i--) {
                                for (int j = 0; j < 3; j++) {
                                    frame.add(new JButton(grid[j][i]));
                                }
                            }
                            JLabel label = new JLabel("");
                            switch (num) {
                                case 3:
                                    label = new JLabel("Tie!");
                                    break;
                                case 1:
                                    label = new JLabel("X Wins!");
                                    break;
                                case 2:
                                    label = new JLabel("Y Wins!");
                                    break;
                            }
                            label.setVerticalAlignment(SwingConstants.CENTER);
                            label.setHorizontalAlignment(SwingConstants.CENTER);
                            frame.add(label);
                            JButton button = new JButton("Restart");
                            button.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    frame.setVisible(false);
                                    turn = "X";
                                }
                            });
                            frame.add(button);
                            frame.pack();
                            frame.setVisible(true);
                        }
                        turn = turn.equals("X") ? "Y" : "X";
                    } else {
                        System.out.println("Invalid Move");
                    }
                }
            });
            GridLayout layout = new GridLayout(4, 3);
            frame.setLayout(layout);
            frame.add(ac);
            frame.add(bc);
            frame.add(cc);
            frame.add(ab);
            frame.add(bb);
            frame.add(cb);
            frame.add(aa);
            frame.add(ba);
            frame.add(ca);
            frame.setMaximumSize(new Dimension(100, 100));
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        }
        else {
            System.out.println("This playing method is not yet supported");
        }
    }

    private static int checkWon(String[][] grid, String turn) {
        System.out.println("\n");
        String aa = grid[0][0];
        String ba = grid[1][0];
        String ca = grid[2][0];
        String ab = grid[0][1];
        String bb = grid[1][1];
        String cb = grid[2][1];
        String ac = grid[0][2];
        String bc = grid[1][2];
        String cc = grid[2][2];
        if(aa.equals(ba) && aa.equals(ca) && aa.length() > 0) {
            System.out.println("1");
            return aa.equals("X") ? 1 : 2;
        }
        if(ac.equals(bc) && ac.equals(cc) && ac.length() > 0) {
            System.out.println("2");
            return ac.equals("X") ? 1 : 2;
        }
        if(ac.equals(ab) && ac.equals(aa) && ac.length() > 0) {
            System.out.println("3");
            return ac.equals("X") ? 1 : 2;
        }
        if(cc.equals(cb) && cc.equals(ca) && cc.length() > 0) {
            System.out.println("4");
            return cc.equals("X") ? 1 : 2;
        }
        if(cc.equals(bb) && cc.equals(aa) && cc.length() > 0) {
            System.out.println("5");
            return cc.equals("X") ? 1 : 2;
        }
        if(ac.equals(bb) && ac.equals(ca) && cc.length() > 0) {
            System.out.println("6");
            return ac.equals("X") ? 1 : 2;
        }
        if(ab.equals(bb) && ab.equals(cb) && cb.length() > 0) {
            System.out.println("7");
            return ab.equals("X") ? 1 : 2;
        }
        if(ba.equals(bb) && ba.equals(bc) && bc.length() > 0) {
            System.out.println("8");
            return ba.equals("X") ? 1 : 2;
        }
        boolean flag = false;
        for (String[] strings : grid) {
            for (String string : strings) {
                if(string.length() == 0) {
                    flag = true;
                }
            }
        }
        if(!flag) {
            return 3;
        }
        return 0;
    }
}
