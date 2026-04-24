import java.util.*;
public class main {
public static void main(String[] args) {
Scanner sc = new Scanner(SYStem.in);
System.out.print ("Enter first largest number:");
String num1 = sc.next();
System.out.print ("Enter second largest number:");
String num2 = sc.next();
int m = num1.length();
int n = num2.length();
int result[] = new int[m+n];
for ( int i-m-1; i >= 0; i--) {
for (int j-n-1; j >= 0; j--) {
int mul - (num1.charAt(1) - '0') * (num2.charAt(1) - '0');
int sum - mul + result[i+j+1];
result[i+j+1] = sum % 10;
result[i+j] = sum / 10;
}
}
System.out.print("Result: ");
for (int num : result) {
if(!(num == 0 && result[0] == num)) {
System.out.print(num);
}
}
}



