/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 11:51
 *   File: videos.java
 */

package defining;

public class videos {
    // Creating member variable
    private String videoName;
    private boolean checkOut;
    private int rating;

    //Constructor method
    //Non-parameterized constructor
    public videos() {
        this.videoName = "Inception";
        this.rating = 9;
        this.checkOut = false;
    }

    //Parameterized constructor
    public videos(String videoName, int rating, boolean checkOut) {
        this.videoName = videoName;
        this.rating = rating;
        this.checkOut = checkOut;
    }

    //Setter Method & Getter Method
    public String getVideoName() {
        return videoName;
    }

    public void setVideoName(String videoName) {
        this.videoName = videoName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isCheckOut() {
        return checkOut;
    }

    public void setCheckOut(boolean checkOut) {
        this.checkOut = checkOut;
    }
}

