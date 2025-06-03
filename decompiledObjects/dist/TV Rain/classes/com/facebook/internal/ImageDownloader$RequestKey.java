package com.facebook.internal;

import android.net.Uri;

class ImageDownloader$RequestKey
{
  private static final int HASH_MULTIPLIER = 37;
  private static final int HASH_SEED = 29;
  public Object tag;
  public Uri uri;
  
  public ImageDownloader$RequestKey(Uri paramUri, Object paramObject)
  {
    uri = paramUri;
    tag = paramObject;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (paramObject != null)
    {
      bool2 = bool1;
      if ((paramObject instanceof RequestKey))
      {
        paramObject = (RequestKey)paramObject;
        bool2 = bool1;
        if (uri == uri)
        {
          bool2 = bool1;
          if (tag == tag) {
            bool2 = true;
          }
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    int i = uri.hashCode();
    return tag.hashCode() + (i + 1073) * 37;
  }
}

/* Location:
 * Qualified Name:     com.facebook.internal.ImageDownloader.RequestKey
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */