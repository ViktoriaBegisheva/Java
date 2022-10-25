package lab5;

import java.util.Random;
import java.util.Scanner;

class Task2 {
	
  static int[][] RandomMatrix(int n) {
    Random rnd = new Random();
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        matrix[i][j] = rnd.nextInt(-n, n+1);
    }
    return matrix;
  }

  static int[][] InputMatrix(Scanner in, int n) {
    int[][] matrix = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        matrix[i][j] = in.nextInt();
    }
    return matrix;
  }

  static void PrintMatrix(int[][] matrix, int n) {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.printf("%d ", matrix[i][j]);
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }

  static int[][] Task2_1_c(int[][] matrix, int n, int k) {
    System.out.println("2.1 Sort by column " + k);
    int[][] m = new int[n][n];
    for (int i = 0; i < n; i++) {
      m[i]=matrix[i];
      for (int j = i; j >0; j--){
        if (m[j-1][k]<=m[j][k])break;
        int[] p=m[j];
        m[j]=m[j-1];
        m[j-1]=p;
      }
    }
    return m;
  }

  static int[][] Task2_1_r(int[][] matrix, int n, int k) {
    System.out.println("2.1 Sort by row " + k);
    int[][] m = new int[n][n];
    int [][] matrix0 = Task2_7(matrix,n,90);
    System.out.println("2.1 Sort by column " + k);
    for (int i = 0; i < n; i++) {
      m[i]=matrix0[i];
      for (int j = i; j >0; j--){
        if (m[j-1][k]>=m[j][k])break;
        int[] p=m[j];
        m[j]=m[j-1];
        m[j-1]=p;
      }
    }
    m = Task2_7(m,n,270);
    return m;
  }

  static int[][] Task2_2(int[][] matrix, int n, int k_r, int k_d) {
    System.out.println("2.2 Rotate right " + k_r + "; Rotate up " + k_d);
    int[][] r = new int[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        r[i][j] = matrix[Math.abs((i + k_d + n) % n)][Math.abs((j + k_r + n) % n)];
    }
    return r;
  }

  static int Task2_3(int[][] matrix, int n) {
    System.out.println("2.3 max len growing ");
    // in all matrix without splitting by rows
    int len = 1, max_l = 0;
    int a_prev = matrix[0][0];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] > a_prev)
          len++;
        else {
          if (len > max_l)
            max_l = len;
          len = 1;
        }
        a_prev = matrix[i][j];
      }
    }
    return max_l;
  }

  static int[] Task2_4(int[][] matrix, int n) {
    System.out.println("2.4 sum between first and second positive");
    int[] newM = new int[n];
    for (int i = 0; i < n; i++) {
      int ans = 0;
      for (int j = 0; j < n; j++) {
        if (matrix[i][j] > 0) {
          for (int k = j + 1; k < n; k++) {
            if (matrix[i][k] > 0)
              break;
            ans += matrix[i][k];
          }
          break;
        }
      }
      newM[i] = ans;
    }
    return newM;
  }

  static int[][] Task2_5(int[][] matrix, int n) {
    System.out.println("2.5 Transpose ");
    int[][] t = new int[n][n];
    for (int i = 0; i < n; i++) {
      // System.out.println(-7%n);
      for (int j = 0; j < n; j++)
        t[i][j] = matrix[j][i];
    }
    return t;
  }

  static double Task2_6(int[][] matrix, int n) {
    System.out.println("2.6 Norm ");
    int ans=0;
    for (int i = 0; i < n; i++) {
      // System.out.println(-7%n);
      for (int j = 0; j < n; j++)
        ans += Math.pow(matrix[i][j],2);
    }
    return Math.sqrt(ans);
  }
  static int[][] Task2_7(int[][] matrix, int n, int degr) {
    int[][] r = new int[n][n];
    System.out.println("2.7 Rotate " + degr);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (degr == 90)
          r[n - j - 1][i] = matrix[i][j];
        else if (degr == 180)
          r[n - i - 1][n - j - 1] = matrix[i][j];
        else if (degr == 270)
          r[j][n - i - 1] = matrix[i][j];
        // System.out.printf("(%d %d)->(%d %d) ",i,j,n-i-1,n-j-1);
      }
      // System.out.printf("\n");
    }
    return r;
  }

  static float[][] Task2_9(int[][] matrix, int n) {
    System.out.println("2.9  a[i][j] - sum/(n*n) ");
    int s = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        s += matrix[i][j];
    }
    float[][] r = new float[n][n];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        r[i][j] = matrix[i][j] - (float) s / (n * n);
    }
    return r;
  }


  public static void main(String[] args) {
    int n = 4;
    int[][] randMatrix = RandomMatrix(n);
    PrintMatrix(randMatrix, n);

    /** 
    //Input matrix from console
    Scanner in = new Scanner(System.in);
    int m=2;
    int[][] inpMatrix=InputMatrix(in,m);
    PrintMatrix(inpMatrix,m);
    in.close();
    //**/

    // 2.1
    PrintMatrix(Task2_1_c(randMatrix, n, 2), n);
    PrintMatrix(Task2_1_r(randMatrix, n, 2), n);

    // 2.2
    int k = 1;
    PrintMatrix(Task2_2(randMatrix, n, k, 0), n);
    PrintMatrix(Task2_2(randMatrix, n, -k, 0), n);
    PrintMatrix(Task2_2(randMatrix, n, 0, k), n);
    PrintMatrix(Task2_2(randMatrix, n, 0, -k), n);

    // 2.3
    System.out.println(Task2_3(randMatrix, n) + "\n");

    // 2.4
    int[] sum = new int[n];
    sum = Task2_4(randMatrix, n);
    for (int i = 0; i < n; i++)
      System.out.println(sum[i]);
    System.out.println();

    // 2.5
    PrintMatrix(Task2_5(randMatrix, n), n);

    // 2.6
    System.out.println(Task2_6(randMatrix, n) + "\n");

    
    // 2.7
    PrintMatrix(Task2_7(randMatrix, n, 90), n);
    PrintMatrix(Task2_7(randMatrix, n, 180), n);
    PrintMatrix(Task2_7(randMatrix, n, 270), n);


    // 2.9 (dz)
    float[][] floatM = new float[n][n];
    floatM = Task2_9(randMatrix, n);
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++)
        System.out.printf("%.2f ", floatM[i][j]);
      System.out.printf("\n");
    }
    System.out.printf("\n");
  }
}
