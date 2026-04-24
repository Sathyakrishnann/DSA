import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of elements: ");
int n = sc.nextInt();//2
int[] arr = new int[n];
System.out.println("Enter " + n + " elements:");
for (int i = 0; i < n; i++) {
arr[i] = sc.nextInt();
}
mergeSort(arr, 0, n - 1);
System.out.println("Sorted array:");
for (int num : arr) {
System.out.print(num + " ");
}
}
static void mergeSort(int[] arr, int left, int right) {
if (left >= right){
return;
}
int mid = (left + right) / 2;
mergeSort(arr, left, mid);
mergeSort(arr, mid + 1, right);
merge(arr, left, mid, right);
}
static void merge(int[] arr, int left, int mid, int right) {
int[] temp = new int[right - left + 1];
int i = left, j = mid + 1, k = 0;
while (i <= mid && j <= right) {
if (arr[i] <= arr[j]){
temp[k++] = arr[i++];
}
else{
temp[k++] = arr[j++];
}
}
while (i <= mid){0<=0
temp[k++] = arr[i++];
}
while(j <= right){
temp[k++] = arr[j++];
}
for (i = left, k = 0; i <= right; i++, k++){
arr[i] = temp[k];
}
}
}












