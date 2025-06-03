package com.google.android.exoplayer2.upstream.cache;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;
import z2;

final class CachedContent
{
  private static final int VERSION_MAX = Integer.MAX_VALUE;
  private static final int VERSION_METADATA_INTRODUCED = 2;
  private final TreeSet<SimpleCacheSpan> cachedSpans;
  public final int id;
  public final String key;
  private boolean locked;
  private DefaultContentMetadata metadata;
  
  public CachedContent(int paramInt, String paramString)
  {
    id = paramInt;
    key = paramString;
    metadata = DefaultContentMetadata.EMPTY;
    cachedSpans = new TreeSet();
  }
  
  public static CachedContent readFromStream(int paramInt, DataInputStream paramDataInputStream)
    throws IOException
  {
    CachedContent localCachedContent = new CachedContent(paramDataInputStream.readInt(), paramDataInputStream.readUTF());
    if (paramInt < 2)
    {
      long l = paramDataInputStream.readLong();
      paramDataInputStream = new ContentMetadataMutations();
      ContentMetadataInternal.setContentLength(paramDataInputStream, l);
      localCachedContent.applyMetadataMutations(paramDataInputStream);
    }
    else
    {
      metadata = DefaultContentMetadata.readFromStream(paramDataInputStream);
    }
    return localCachedContent;
  }
  
  public void addSpan(SimpleCacheSpan paramSimpleCacheSpan)
  {
    cachedSpans.add(paramSimpleCacheSpan);
  }
  
  public boolean applyMetadataMutations(ContentMetadataMutations paramContentMetadataMutations)
  {
    DefaultContentMetadata localDefaultContentMetadata = metadata;
    paramContentMetadataMutations = localDefaultContentMetadata.copyWithMutationsApplied(paramContentMetadataMutations);
    metadata = paramContentMetadataMutations;
    return paramContentMetadataMutations.equals(localDefaultContentMetadata) ^ true;
  }
  
  public boolean equals(@Nullable Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (CachedContent.class == paramObject.getClass()))
    {
      paramObject = (CachedContent)paramObject;
      if ((id != id) || (!key.equals(key)) || (!cachedSpans.equals(cachedSpans)) || (!metadata.equals(metadata))) {
        bool = false;
      }
      return bool;
    }
    return false;
  }
  
  public long getCachedBytesLength(long paramLong1, long paramLong2)
  {
    SimpleCacheSpan localSimpleCacheSpan = getSpan(paramLong1);
    if (localSimpleCacheSpan.isHoleSpan())
    {
      if (localSimpleCacheSpan.isOpenEnded()) {
        paramLong1 = Long.MAX_VALUE;
      } else {
        paramLong1 = length;
      }
      return -Math.min(paramLong1, paramLong2);
    }
    long l1 = paramLong1 + paramLong2;
    long l2 = position + length;
    long l3 = l2;
    if (l2 < l1)
    {
      Iterator localIterator = cachedSpans.tailSet(localSimpleCacheSpan, false).iterator();
      do
      {
        l3 = l2;
        if (!localIterator.hasNext()) {
          break;
        }
        localSimpleCacheSpan = (SimpleCacheSpan)localIterator.next();
        l3 = position;
        if (l3 > l2)
        {
          l3 = l2;
          break;
        }
        l3 = Math.max(l2, l3 + length);
        l2 = l3;
      } while (l3 < l1);
    }
    return Math.min(l3 - paramLong1, paramLong2);
  }
  
  public ContentMetadata getMetadata()
  {
    return metadata;
  }
  
  public SimpleCacheSpan getSpan(long paramLong)
  {
    SimpleCacheSpan localSimpleCacheSpan1 = SimpleCacheSpan.createLookup(key, paramLong);
    SimpleCacheSpan localSimpleCacheSpan2 = (SimpleCacheSpan)cachedSpans.floor(localSimpleCacheSpan1);
    if ((localSimpleCacheSpan2 != null) && (position + length > paramLong)) {
      return localSimpleCacheSpan2;
    }
    localSimpleCacheSpan1 = (SimpleCacheSpan)cachedSpans.ceiling(localSimpleCacheSpan1);
    if (localSimpleCacheSpan1 == null) {
      localSimpleCacheSpan1 = SimpleCacheSpan.createOpenHole(key, paramLong);
    } else {
      localSimpleCacheSpan1 = SimpleCacheSpan.createClosedHole(key, paramLong, position - paramLong);
    }
    return localSimpleCacheSpan1;
  }
  
  public TreeSet<SimpleCacheSpan> getSpans()
  {
    return cachedSpans;
  }
  
  public int hashCode()
  {
    int i = headerHashCode(Integer.MAX_VALUE);
    return cachedSpans.hashCode() + i * 31;
  }
  
  public int headerHashCode(int paramInt)
  {
    int i = id;
    i = key.hashCode() + i * 31;
    if (paramInt < 2)
    {
      long l = ContentMetadataInternal.getContentLength(metadata);
      paramInt = i * 31 + (int)(l ^ l >>> 32);
    }
    else
    {
      paramInt = i * 31 + metadata.hashCode();
    }
    return paramInt;
  }
  
  public boolean isEmpty()
  {
    return cachedSpans.isEmpty();
  }
  
  public boolean isLocked()
  {
    return locked;
  }
  
  public boolean removeSpan(CacheSpan paramCacheSpan)
  {
    if (cachedSpans.remove(paramCacheSpan))
    {
      file.delete();
      return true;
    }
    return false;
  }
  
  public void setLocked(boolean paramBoolean)
  {
    locked = paramBoolean;
  }
  
  public SimpleCacheSpan touch(SimpleCacheSpan paramSimpleCacheSpan)
    throws Cache.CacheException
  {
    SimpleCacheSpan localSimpleCacheSpan = paramSimpleCacheSpan.copyWithUpdatedLastAccessTime(id);
    if (file.renameTo(file))
    {
      Assertions.checkState(cachedSpans.remove(paramSimpleCacheSpan));
      cachedSpans.add(localSimpleCacheSpan);
      return localSimpleCacheSpan;
    }
    StringBuilder localStringBuilder = z2.t("Renaming of ");
    localStringBuilder.append(file);
    localStringBuilder.append(" to ");
    localStringBuilder.append(file);
    localStringBuilder.append(" failed.");
    throw new Cache.CacheException(localStringBuilder.toString());
  }
  
  public void writeToStream(DataOutputStream paramDataOutputStream)
    throws IOException
  {
    paramDataOutputStream.writeInt(id);
    paramDataOutputStream.writeUTF(key);
    metadata.writeToStream(paramDataOutputStream);
  }
}

/* Location:
 * Qualified Name:     com.google.android.exoplayer2.upstream.cache.CachedContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */