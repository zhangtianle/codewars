package five;

import java.util.List;

/**
 * Created by Tianle Zhang on 2016/6/18.
 */
public class PaginationHelper<I> {

    private List<I> collection;
    private int itemsPerPage;
    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    public PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    public int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    public int pageCount() {
        if (collection.size() % itemsPerPage != 0) {
            return collection.size() / itemsPerPage + 1;
        } else {
            return collection.size() / itemsPerPage;
        }
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    public int pageItemCount(int pageIndex) {
        int s = collection.size() / itemsPerPage;
        int y = collection.size() % itemsPerPage;
        if (pageIndex < 0 || pageIndex >= pageCount()) {
            return -1;
        }
        if (pageIndex+1 <= s) {
            return itemsPerPage;
        } else {
            return y;
        }
    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    public int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex > collection.size() - 1) {
            return -1;
        } else {
            return itemIndex / itemsPerPage;
        }
    }
}
