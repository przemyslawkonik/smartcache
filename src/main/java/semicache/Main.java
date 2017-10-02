package semicache;

import semicache.api.Cache;
import semicache.impl.CacheImpl;
import semicache.impl.Item;

public class Main {

    public static void main(String[] args) {
        Cache cache = new CacheImpl(3);
        String[] tab = {"A", "B", "C", "D"};

        for(String t : tab) {
            cache.cacheItem(new Item(t,t),t);

            for(int i=0; i<cache.getView().size(); i++) {
                System.out.print(cache.getView().getItem(i).getValue() + "  ");
            }
            System.out.println();
        }
    }
}
