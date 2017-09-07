package semicache.api;

public interface Cache {
    CacheItem cacheItem(Object item, String key);
    void invalidateCache();
    CacheView getView();
}
