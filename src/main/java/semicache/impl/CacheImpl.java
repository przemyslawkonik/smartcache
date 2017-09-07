package semicache.impl;

import semicache.api.Cache;
import semicache.api.CacheItem;
import semicache.api.CacheView;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CacheImpl implements Cache {
    private int size;
    private LinkedHashMap<String, CacheItem> cache;

    public CacheImpl(int size) {
        this.size = size;
    }

    public CacheItem cacheItem(Object item, String key) {
        return new Item(key, item);
    }

    public void putItem(String key, CacheItem item){
        cache.put(key, item);
    }

    public void invalidateCache() {
        cache.clear();
    }

    public CacheView getView() {
        return null;
    }

    public void getCacheView(){
        Set set = cache.entrySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            Map.Entry mapEntry = (Map.Entry) iterator.next();
            System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());

        }


    }
}
