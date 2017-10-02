package semicache.impl;

import semicache.api.CacheItem;

public class Item implements CacheItem {

    private String key;
    private Object value;

    public Item(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
