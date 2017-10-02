package semicache.impl;

import semicache.api.CacheItem;
import semicache.api.CacheView;

import java.util.HashMap;

public class CacheViewImpl implements CacheView {

    private HashMap<String, CacheItem> cache;

    public CacheViewImpl(HashMap<String, CacheItem> cache) {
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
