package Home_task.IV_V;

public class task_5_2 {
    public static void main(String[] args) { // Шахматная доска
        String[][] chessmate = new String[8][8];
        for (int i = 0; i < chessmate.length; i++) {
            for (int j = 0; j < chessmate[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    chessmate[i][j] = "W";
                } else {
                    chessmate[i][j] = "B";
                }
                System.out.print(chessmate[i][j] + " ");
            }
            System.out.println();
        }
    }
}
