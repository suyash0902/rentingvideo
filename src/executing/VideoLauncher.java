/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 11:53
 *   File: VideoLauncher.java
 */

package executing;

import java.util.Scanner;

public class VideoLauncher {
    public static final int ADD_Video = 1;
    public static final int CHECK_OUT_Video = 2;
    public static final int RETURN_Video = 3;
    public static final int RECEIVE_Rating = 4;
    public static final int LIST_Inventory = 5;
    public static final int EXIT = 6;

    public static void main(String[] args) {
        System.out.println("MAIN MENU");
        System.out.println("=========");
        System.out.println("1. Add Video : ");
        System.out.println("2. Check Out Video : ");
        System.out.println("3. Return Video : ");
        System.out.println("4. Receive rating : ");
        System.out.println("5. List inventory : ");
        System.out.println("Enter your choice from (1-6) : ");
        Scanner scanner = new Scanner(System.in);
        int customerInput = scanner.nextInt();
        switch (customerInput) {
            case ADD_Video:
                break;

        }
        scanner.close();
    }
}

