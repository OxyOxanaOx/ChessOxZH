import java.util.Queue;
import java.util.WeakHashMap;


public class Chess {

    Color color;
    Figures fig;

    public Chess(Figures fig, Color color) {
        this.fig = fig;
        this.color = color;
    }

    //    public Chess(Enum<Color> color, Enum<ChessPiece> chessPiece) {
    public static void main(String[] args) {
        Chess[] chess = {
                new Chess(Figures.KNIGHT, Color.WHITE),
                new Chess(Figures.QUEEN, Color.BLACK),
                new Chess(Figures.PAWN, Color.WHITE),
                new Chess(Figures.PAWN, Color.BLACK),
                new Chess(Figures.ROOK, Color.WHITE),
                new Chess(Figures.QUEEN, Color.BLACK),
                new Chess(Figures.KING, Color.WHITE)
        };

        int countByBlack = countByColor(chess, Color.BLACK);
        int countByWhite = countByColor(chess, Color.WHITE);
        System.out.println("Черных фигур: " + countByBlack);
        System.out.println("Белых фигур: " + countByWhite);

    }

    static int countByColor(Chess[] chess, Color color) {
        int result = 0;
        for (int i = 0; i < chess.length; i++) {
            if (chess[i].color.equals(color))
                result++;
        }
        return result;
    }


    public enum Color {
        WHITE,
        BLACK
    }

    public enum Figures {
        KING,
        QUEEN,
        ROOK,
        BISHOP,
        KNIGHT,
        PAWN
    }
}











