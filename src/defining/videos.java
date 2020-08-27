/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 11:51
 *   File: videos.java
 */

package defining;

import java.util.Objects;

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

    //To-String methods
    public String toString() {
        return "Video Name : " + videoName + ", " + "Video Rating : " + rating + ", " + "Is video available : " + checkOut + ".";
    }

    //Equals & Hash-Code Methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        videos videos = (videos) o;
        return isCheckOut() == videos.isCheckOut() &&
                getRating() == videos.getRating() &&
                Objects.equals(getVideoName(), videos.getVideoName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getVideoName(), isCheckOut(), getRating());
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

    //Allows customers to rent a video.
    public void doCheckOut() {
        System.out.println("Thank you for renting.");

    }


}
