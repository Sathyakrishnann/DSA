import java.util.*;
public class Main {
static void warshall (int[][] adjMatrix) {
int n = adjMatrix.length;
int[][] closure = new int[n][n];
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
closure [i][j] = adjMatrix[i][j];
}
}
for (int k = 0; k < n; k++) {
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
if (closure[i][j] == 1 && closure[k][j] == 1) {
closure[i][j] = 1;
}
}
}
}
System.out.println ("Transitive Closure Matrix: ");
for (int i = 0; i < n; i++) {
for (int j = 0; j < n; j++) {
System.out.println (closure[i][j] + " ");
}
System.out.println ();
}
}
public static void main (String[] args) {
int[][] adjMatrix = {
{0, 1, 0},
{0, 0, 1},
{0, 0, 0}
};
warshall (adjMatrix);
}
}











