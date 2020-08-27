/*   Created by IntelliJ IDEA.
 *   Author: Suyash Srivastava (suyash0902)
 *   Date: 27-08-2020
 *   Time: 13:47
 *   File: videostore.java
 */

package defining;

public class videostore {
    private videos[] store;

    public videos[] getStore() {
        return store.clone();
    }

    public void setStore(videos[] store) {
        this.store = store;
    }

}

