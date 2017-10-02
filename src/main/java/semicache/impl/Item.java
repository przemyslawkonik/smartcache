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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Item item = (Item) o;

        if (key != null ? !key.equals(item.key) : item.key != null) return false;
        return value != null ? value.equals(item.value) : item.value == null;
    }

    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
