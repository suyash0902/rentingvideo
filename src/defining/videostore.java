/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 13:47
 *   File: videostore.java
 */

package defining;

import java.util.Arrays;

public class videostore {
    private videos[] store;

    public videostore() {
        this.store = new videos[5];
    }

    public videos[] getStore() {
        return store.clone();
    }

    public void setStore(videos[] store) {
        this.store = store;
    }

    @Override
    public String toString() {
        return Arrays.toString(store);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        videostore that = (videostore) o;
        return Arrays.equals(getStore(), that.getStore());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getStore());
    }

    /**
     * this methods all to add video to video-store.
     *
     * @param name the name of video we want to add
     */
    public void addVideo(String name) {
        System.out.println("\"" + name + "\"is now added to the video-store.");
    }

    /**
     * this will allow us to rent a video from the video-store.
     *
     * @param name the name of the video we want to rent
     */
    public void doCheckOut(String name) {
        System.out.println("Thank you for renting \"" + name + "\"");

    }
}

