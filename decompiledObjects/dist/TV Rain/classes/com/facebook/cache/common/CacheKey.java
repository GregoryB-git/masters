package com.facebook.cache.common;

import android.net.Uri;

public abstract interface CacheKey
{
  public abstract boolean containsUri(Uri paramUri);
  
  public abstract boolean equals(Object paramObject);
  
  public abstract String getUriString();
  
  public abstract int hashCode();
  
  public abstract String toString();
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.CacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */