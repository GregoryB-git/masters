package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;

public class SimpleCacheKey
  implements CacheKey
{
  public final String mKey;
  
  public SimpleCacheKey(String paramString)
  {
    mKey = ((String)Preconditions.checkNotNull(paramString));
  }
  
  public boolean containsUri(Uri paramUri)
  {
    return mKey.contains(paramUri.toString());
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof SimpleCacheKey))
    {
      paramObject = (SimpleCacheKey)paramObject;
      return mKey.equals(mKey);
    }
    return false;
  }
  
  public String getUriString()
  {
    return mKey;
  }
  
  public int hashCode()
  {
    return mKey.hashCode();
  }
  
  public String toString()
  {
    return mKey;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.SimpleCacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */