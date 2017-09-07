package semicache;

import semicache.api.CacheItem;
import semicache.impl.CacheImpl;
import semicache.impl.Item;

public class Main {
    public static void main(String[] args) {
        CacheImpl cache = new CacheImpl(3);

        cache.putItem("A",cache.cacheItem(null, "A"));

        cache.getCacheView();



    }
}
