package com.facebook.cache.common;

import android.net.Uri;
import com.facebook.common.internal.Preconditions;
import java.util.List;
import z2;

public class MultiCacheKey
  implements CacheKey
{
  public final List<CacheKey> mCacheKeys;
  
  public MultiCacheKey(List<CacheKey> paramList)
  {
    mCacheKeys = ((List)Preconditions.checkNotNull(paramList));
  }
  
  public boolean containsUri(Uri paramUri)
  {
    for (int i = 0; i < mCacheKeys.size(); i++) {
      if (((CacheKey)mCacheKeys.get(i)).containsUri(paramUri)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if ((paramObject instanceof MultiCacheKey))
    {
      paramObject = (MultiCacheKey)paramObject;
      return mCacheKeys.equals(mCacheKeys);
    }
    return false;
  }
  
  public List<CacheKey> getCacheKeys()
  {
    return mCacheKeys;
  }
  
  public String getUriString()
  {
    return ((CacheKey)mCacheKeys.get(0)).getUriString();
  }
  
  public int hashCode()
  {
    return mCacheKeys.hashCode();
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = z2.t("MultiCacheKey:");
    localStringBuilder.append(mCacheKeys.toString());
    return localStringBuilder.toString();
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.MultiCacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */