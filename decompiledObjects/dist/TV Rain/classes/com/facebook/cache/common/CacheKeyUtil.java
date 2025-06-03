package com.facebook.cache.common;

import com.facebook.common.util.SecureHashUtil;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class CacheKeyUtil
{
  public static String getFirstResourceId(CacheKey paramCacheKey)
  {
    try
    {
      if ((paramCacheKey instanceof MultiCacheKey)) {
        return secureHashKey((CacheKey)((MultiCacheKey)paramCacheKey).getCacheKeys().get(0));
      }
      paramCacheKey = secureHashKey(paramCacheKey);
      return paramCacheKey;
    }
    catch (UnsupportedEncodingException paramCacheKey)
    {
      throw new RuntimeException(paramCacheKey);
    }
  }
  
  public static List<String> getResourceIds(CacheKey paramCacheKey)
  {
    try
    {
      if ((paramCacheKey instanceof MultiCacheKey))
      {
        List localList = ((MultiCacheKey)paramCacheKey).getCacheKeys();
        localArrayList = new java/util/ArrayList;
        localArrayList.<init>(localList.size());
        for (int i = 0;; i++)
        {
          paramCacheKey = localArrayList;
          if (i >= localList.size()) {
            break;
          }
          localArrayList.add(secureHashKey((CacheKey)localList.get(i)));
        }
      }
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>(1);
      localArrayList.add(secureHashKey(paramCacheKey));
      paramCacheKey = localArrayList;
      return paramCacheKey;
    }
    catch (UnsupportedEncodingException paramCacheKey)
    {
      throw new RuntimeException(paramCacheKey);
    }
  }
  
  private static String secureHashKey(CacheKey paramCacheKey)
    throws UnsupportedEncodingException
  {
    return SecureHashUtil.makeSHA1HashBase64(paramCacheKey.getUriString().getBytes("UTF-8"));
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.common.CacheKeyUtil
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */