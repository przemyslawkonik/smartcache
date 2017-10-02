package semicache.impl;

import semicache.api.Cache;
import semicache.api.CacheItem;
import semicache.api.CacheView;

import java.util.*;

public class CacheImpl implements Cache {

    private HashMap<String, CacheItem> cache;
    private CacheView cacheView;

    public CacheImpl(int size) {
        final int maxSize = size;

        cache = new LinkedHashMap<String, CacheItem>(size) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, CacheItem> eldest) {
                return size() > maxSize;
            }
        };

        cacheView = new CacheViewImpl(cache);
    }

    public CacheItem cacheItem(Object item, String key) {
        CacheItem cacheItem = (CacheItem) item;
        return cache.put(key, cacheItem);
    }

    public void invalidateCache() {
        cache.clear();
    }

    public CacheView getView() {
        return cacheView;
    }
}
