import java.util.Scanner;

// fix / optimization : https://chatgpt.com/share/6798e443-7c78-8001-88e1-39b9c4ed8b78
/*
There is an integer array num sorted in ascending order (with distinct values). Prior to being passed to your function,
num is possibly rotated at an unknown pivot index k (1 <= k < num.length) such that the resulting array is
[num[k], num[k+1], ..., num[n-1], num[0], num[1], ..., num[k-1]] (0-indexed).

For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

Given the array num after the possible rotation and an integer target, return the index of target if it is in num,
or -1 if it is not in num.

Example 1:
    Input: num = [4,5,6,7,0,1,2],
    target = 0 Output: 4
Example 2:
    Input: num = [4,5,6,7,0,1,2],
    target = 3 Output: -1
 */

public class PrintNumFromRotatedArray
{
    static void RotateArray(int[] arr, int n, int pivot)
    {
        int first;

        for (int i = 0; i < pivot; i ++)   // Here Number of ROTATIONS needed to rotate the array == pivot index - 1
        {
            first = arr[0];

            for (int j = 0; j < n - 1; j ++)
            {
                arr[j] = arr[j + 1];
            }
            arr[n - 1] = first;
        }
    }

    static int isAvailable(int[] arr, int n, int target)
    {
        for (int i = 0; i < n; i ++)
        {
            if (arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    static boolean isSorted (int[] arr)
    {
        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1])
            {
                return false;
            }
        }
        return true;
    }

    static void SortArray(int[] arr)
    {
        if(isSorted(arr))
        {
            return;
        }

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void printArray(int[] arr)
    {
        for(int num : arr)
        {
            System.out.print(num + ", ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of the array : ");
        int size = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = sc.nextInt();
        }

        SortArray(arr);

        System.out.println("Original (*sorted) array : ");
        printArray(arr);

        System.out.println("Enter the pivot index to rotate the array : ");
        int pivot = sc.nextInt();

        RotateArray(arr, size, pivot);
        printArray(arr);

        System.out.println("Enter the target element to search : ");
        int target = sc.nextInt();

        int result = isAvailable(arr, size, target);

        System.out.println((result == -1)
                ? "code = -1, The target is NOT available in the rotated array !"
                : "The target is found at index = " + result);

        sc.close();
    }
}
