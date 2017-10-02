package semicache.impl;

import semicache.api.Cache;
import semicache.api.CacheItem;
import semicache.api.CacheView;

import java.util.*;

public class CacheImpl implements Cache {

    private Map<String, CacheItem> cache;
    private CacheView cacheView;
    private final int size;

    public CacheImpl(int size) {
        this.size = size;
        initializeMap();
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

    private void initializeMap() {
        cache = new LinkedHashMap<String, CacheItem>(size) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<String, CacheItem> eldest) {
                return size() > size;
            }
        };
    }
}
