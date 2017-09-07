SmartCacheImpl

This repo was made as a part of recruitment task I've got lately.

Given problem: app slows down because of repetitive requests which bring us same results for same set of parameters. Task is to write 'clever' cache which will remember x last requested elements. For example: Cache have got 3 free places, our sys has got objects A B C D.

Our cache is empty: Cache = [ ]

Request for A: Cache = [A]

Request for D: Cache = [A,D]

Request for B: Cache = [A,D,B]

Request for C: Cache = [D,B,C]

Request for D: Cache = [B,C,D]

We also have to use given interfaces:
```java

interface CacheItem {
    
// return key to object
String getKey();
    
// return object written in cache
Object getValue();      
}

```

```java
interface CacheView {
// return cache size
int size();         
    
// return object with given index                          
CacheItem getItem(int index);  
    
// return object with given key 
CacheItem getItem(String key);     
}
```

```java
interface Cache{
    
// save object in cache
CacheItem cacheItem(Object item, String key);
    
// remove all elements from cache   
void invalidateCache();
    
// return view of our cache
CacheView getView();

}
```
I decide to use LinkedHashMap for this task as it is [recommended](https://docs.oracle.com/javase/7/docs/api/java/util/LinkedHashMap.html) to implement LRUCache. Also it should give us proper time complexity which remains around O(1). Other thing is that implementation isn't synchronized.

I'm not sure why adding object have to be done by using: CacheItem cacheItem() method - I would rather like to do it by void method (same thing in getting 'the view' of cache).

Btw. if we know exact type of object we want to write in cache we don't have to use Object.

I'm glad for all comments or thoughts about this code so if you have some feel free to contact me:

filip.mastalerz@gmail.com