package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.File;

public class CacheSpan
  implements Comparable<CacheSpan>
{
  @Nullable
  public final File file;
  public final boolean isCached;
  public final String key;
  public final long lastAccessTimestamp;
  public final long length;
  public final long position;
  
  public CacheSpan(String paramString, long paramLong1, long paramLong2)
  {
    this(paramString, paramLong1, paramLong2, -9223372036854775807L, null);
  }
  
  public CacheSpan(String paramString, long paramLong1, long paramLong2, long paramLong3, @Nullable File paramFile)
  {
    key = paramString;
    position = paramLong1;
    length = paramLong2;
    boolean bool;
    if (paramFile != null) {
      bool = true;
    } else {
      bool = false;
    }
    isCached = bool;
    file = paramFile;
    lastAccessTimestamp = paramLong3;
  }
  
  public int compareTo(@NonNull CacheSpan paramCacheSpan)
  {
    if (!key.equals(key)) {
      return key.compareTo(key);
    }
    boolean bool = position - position < 0L;
    int i;
    if (!bool) {
      bool = false;
    } else if (bool) {
      i = -1;
    } else {
      i = 1;
    }
    return i;
  }
  
  public boolean isHoleSpan()
  {
    return isCached ^ true;
  }
  
  public boolean isOpenEnded()
  {
    boolean bool;
    if (length == -1L) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CacheSpan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */