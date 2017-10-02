package semicache.impl;

import semicache.api.CacheItem;
import semicache.api.CacheView;

import java.util.Map;

public class CacheViewImpl implements CacheView {

    private Map<String, CacheItem> cache;

    public CacheViewImpl(Map<String, CacheItem> cache) {
        this.cache = cache;
    }

    public int size() {
        return cache.size();
    }

    public CacheItem getItem(int index) {
        return (CacheItem) cache.values().toArray()[index];
    }

    public CacheItem getItem(String key) {
        return cache.get(key);
    }
}
