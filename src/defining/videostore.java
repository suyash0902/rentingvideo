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
}

