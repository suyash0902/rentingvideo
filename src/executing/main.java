/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 11:53
 *   File: main.java
 */

package executing;

import defining.videos;

public class main {
    public static void main(String[] args) {
        videos video = new videos("Titanic", 10, true);
        videos video1 = new videos("Shutter Island", 9, false);
        if (video.equals(video1)) {
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}

