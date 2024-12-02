public class Minesweeper 
{
    public static void main(String[] args)
     {
        int m = Integer.parseInt(args[0]); 
        int n = Integer.parseInt(args[1]); 
        int k = Integer.parseInt(args[2]); 

        char[][] grid = new char[m][n];

        // Initialize the grid with '0'
        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                grid[i][j] = '0';
            }
        }

        // Randomly place k mines
        int minesPlaced = 0;
        while (minesPlaced < k)
        {
            int row = (int) (Math.random() * m);
            int col = (int) (Math.random() * n);
            if (grid[row][col] != '*') 
            {
                grid[row][col] = '*';
                minesPlaced++;
            }
        }


        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                if (grid[i][j] == '*') 
                {
                    continue;
                }
                int mineCount = 0;
                for (int row = i - 1; row <= i + 1; row++) 
                {
                    for (int col = j - 1; col <= j + 1; col++) 
                    {
                        if (row >= 0 && row < m && col >= 0 && col < n && grid[row][col] == '*') {
                            mineCount++;
                        }
                    }
                }
                grid[i][j] = (char) (mineCount + '0');
            }
        }


        for (int i = 0; i < m; i++) 
        {
            for (int j = 0; j < n; j++) 
            {
                System.out.print(grid[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
