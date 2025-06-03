package androidx.appcompat.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import androidx.collection.LruCache;

class ResourceManagerInternal$ColorFilterLruCache
  extends LruCache<Integer, PorterDuffColorFilter>
{
  public ResourceManagerInternal$ColorFilterLruCache(int paramInt)
  {
    super(paramInt);
  }
  
  private static int generateCacheKey(int paramInt, PorterDuff.Mode paramMode)
  {
    return paramMode.hashCode() + (paramInt + 31) * 31;
  }
  
  public PorterDuffColorFilter get(int paramInt, PorterDuff.Mode paramMode)
  {
    return (PorterDuffColorFilter)get(Integer.valueOf(generateCacheKey(paramInt, paramMode)));
  }
  
  public PorterDuffColorFilter put(int paramInt, PorterDuff.Mode paramMode, PorterDuffColorFilter paramPorterDuffColorFilter)
  {
    return (PorterDuffColorFilter)put(Integer.valueOf(generateCacheKey(paramInt, paramMode)), paramPorterDuffColorFilter);
  }
}

/* Location:
 * Qualified Name:     androidx.appcompat.widget.ResourceManagerInternal.ColorFilterLruCache
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */