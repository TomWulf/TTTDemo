import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TTTTileGui extends JFrame
{
    JPanel mainPnl, boardPnl, statsPnl, controlPnl;
    TicTacToeTile[][] board = new TicTacToeTile[3][3];

    public TTTTileGui() {
        setLayout(new BorderLayout());
        mainPnl = new JPanel();
        boardPnl = new JPanel();
        boardPnl.setLayout(new GridLayout(3,3));

        for(int row = 0; row < 3; row++)
            for(int col= 0; col < 3; col++)
            {
                board[row][col] = new TicTacToeTile(row, col);
                board[row][col].setText(" ");
                board[row][col].setFont(new Font(Font.SERIF, Font.PLAIN,  90));
                int finalRow = row; int finalCol = col;
                board[row][col].addActionListener((ActionEvent ae) -> {
                    System.out.printf("Grid: %3d\t%3d\n", board[finalRow][finalCol].getRow() , board[finalRow][finalCol].getCol());
                });

                boardPnl.add(board[row][col]);

            }

        mainPnl.add(boardPnl);
        add(mainPnl);

        setTitle("Tic Tac Toe Tile Demo");
        setSize(800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
