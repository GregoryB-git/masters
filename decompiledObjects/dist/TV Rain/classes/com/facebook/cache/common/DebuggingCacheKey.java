package com.facebook.cache.common;

import android.net.Uri;
import javax.annotation.Nullable;

public class DebuggingCacheKey
  extends SimpleCacheKey
{
  private final Object mCallerContext;
  private final Uri mSourceUri;
  
  public DebuggingCacheKey(String paramString, @Nullable Object paramObject, Uri paramUri)
  {
    super(paramString);
    mCallerContext = paramObject;
    mSourceUri = paramUri;
  }
  
  @Nullable
  public Object getCallerContext()
  {
    return mCallerContext;
  }
  
  public Uri getSourceUri()
  {
    return mSourceUri;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.DebuggingCacheKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */