package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import z2;

final class SimpleCacheSpan
  extends CacheSpan
{
  private static final Pattern CACHE_FILE_PATTERN_V1 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
  private static final Pattern CACHE_FILE_PATTERN_V2 = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
  private static final Pattern CACHE_FILE_PATTERN_V3 = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);
  private static final String SUFFIX = ".v3.exo";
  
  private SimpleCacheSpan(String paramString, long paramLong1, long paramLong2, long paramLong3, @Nullable File paramFile)
  {
    super(paramString, paramLong1, paramLong2, paramLong3, paramFile);
  }
  
  @Nullable
  public static SimpleCacheSpan createCacheEntry(File paramFile, CachedContentIndex paramCachedContentIndex)
  {
    String str = paramFile.getName();
    boolean bool = str.endsWith(".v3.exo");
    Object localObject = null;
    File localFile = paramFile;
    if (!bool)
    {
      localFile = upgradeFile(paramFile, paramCachedContentIndex);
      if (localFile == null) {
        return null;
      }
      str = localFile.getName();
    }
    paramFile = CACHE_FILE_PATTERN_V3.matcher(str);
    if (!paramFile.matches()) {
      return null;
    }
    long l = localFile.length();
    paramCachedContentIndex = paramCachedContentIndex.getKeyForId(Integer.parseInt(paramFile.group(1)));
    if (paramCachedContentIndex == null) {
      paramFile = (File)localObject;
    } else {
      paramFile = new SimpleCacheSpan(paramCachedContentIndex, Long.parseLong(paramFile.group(2)), l, Long.parseLong(paramFile.group(3)), localFile);
    }
    return paramFile;
  }
  
  public static SimpleCacheSpan createClosedHole(String paramString, long paramLong1, long paramLong2)
  {
    return new SimpleCacheSpan(paramString, paramLong1, paramLong2, -9223372036854775807L, null);
  }
  
  public static SimpleCacheSpan createLookup(String paramString, long paramLong)
  {
    return new SimpleCacheSpan(paramString, paramLong, -1L, -9223372036854775807L, null);
  }
  
  public static SimpleCacheSpan createOpenHole(String paramString, long paramLong)
  {
    return new SimpleCacheSpan(paramString, paramLong, -1L, -9223372036854775807L, null);
  }
  
  public static File getCacheFile(File paramFile, int paramInt, long paramLong1, long paramLong2)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramInt);
    localStringBuilder.append(".");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(".");
    return new File(paramFile, z2.r(localStringBuilder, paramLong2, ".v3.exo"));
  }
  
  @Nullable
  private static File upgradeFile(File paramFile, CachedContentIndex paramCachedContentIndex)
  {
    Object localObject = paramFile.getName();
    Matcher localMatcher = CACHE_FILE_PATTERN_V2.matcher((CharSequence)localObject);
    if (localMatcher.matches())
    {
      String str = Util.unescapeFileName(localMatcher.group(1));
      localObject = str;
      if (str == null) {
        return null;
      }
    }
    else
    {
      localMatcher = CACHE_FILE_PATTERN_V1.matcher((CharSequence)localObject);
      if (!localMatcher.matches()) {
        return null;
      }
      localObject = localMatcher.group(1);
    }
    paramCachedContentIndex = getCacheFile(paramFile.getParentFile(), paramCachedContentIndex.assignIdForKey((String)localObject), Long.parseLong(localMatcher.group(2)), Long.parseLong(localMatcher.group(3)));
    if (!paramFile.renameTo(paramCachedContentIndex)) {
      return null;
    }
    return paramCachedContentIndex;
  }
  
  public SimpleCacheSpan copyWithUpdatedLastAccessTime(int paramInt)
  {
    Assertions.checkState(isCached);
    long l = System.currentTimeMillis();
    File localFile = getCacheFile(file.getParentFile(), paramInt, position, l);
    return new SimpleCacheSpan(key, position, length, l, localFile);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.SimpleCacheSpan
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */