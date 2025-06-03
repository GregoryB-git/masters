package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.cache.common.CacheErrorLogger;
import com.facebook.cache.common.CacheEventListener;
import com.facebook.common.disk.DiskTrimmableRegistry;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Supplier;
import com.facebook.common.internal.Suppliers;
import java.io.File;
import javax.annotation.Nullable;

public class DiskCacheConfig$Builder
{
  private String mBaseDirectoryName = "image_cache";
  private Supplier<File> mBaseDirectoryPathSupplier;
  private CacheErrorLogger mCacheErrorLogger;
  private CacheEventListener mCacheEventListener;
  @Nullable
  private final Context mContext;
  private DiskTrimmableRegistry mDiskTrimmableRegistry;
  private EntryEvictionComparatorSupplier mEntryEvictionComparatorSupplier = new DefaultEntryEvictionComparatorSupplier();
  private boolean mIndexPopulateAtStartupEnabled;
  private long mMaxCacheSize = 41943040L;
  private long mMaxCacheSizeOnLowDiskSpace = 10485760L;
  private long mMaxCacheSizeOnVeryLowDiskSpace = 2097152L;
  private int mVersion = 1;
  
  private DiskCacheConfig$Builder(@Nullable Context paramContext)
  {
    mContext = paramContext;
  }
  
  public DiskCacheConfig build()
  {
    boolean bool;
    if ((mBaseDirectoryPathSupplier == null) && (mContext == null)) {
      bool = false;
    } else {
      bool = true;
    }
    Preconditions.checkState(bool, "Either a non-null context or a base directory path or supplier must be provided.");
    if ((mBaseDirectoryPathSupplier == null) && (mContext != null)) {
      mBaseDirectoryPathSupplier = new Supplier()
      {
        public File get()
        {
          return DiskCacheConfig.Builder.access$1000(DiskCacheConfig.Builder.this).getApplicationContext().getCacheDir();
        }
      };
    }
    return new DiskCacheConfig(this, null);
  }
  
  public Builder setBaseDirectoryName(String paramString)
  {
    mBaseDirectoryName = paramString;
    return this;
  }
  
  public Builder setBaseDirectoryPath(File paramFile)
  {
    mBaseDirectoryPathSupplier = Suppliers.of(paramFile);
    return this;
  }
  
  public Builder setBaseDirectoryPathSupplier(Supplier<File> paramSupplier)
  {
    mBaseDirectoryPathSupplier = paramSupplier;
    return this;
  }
  
  public Builder setCacheErrorLogger(CacheErrorLogger paramCacheErrorLogger)
  {
    mCacheErrorLogger = paramCacheErrorLogger;
    return this;
  }
  
  public Builder setCacheEventListener(CacheEventListener paramCacheEventListener)
  {
    mCacheEventListener = paramCacheEventListener;
    return this;
  }
  
  public Builder setDiskTrimmableRegistry(DiskTrimmableRegistry paramDiskTrimmableRegistry)
  {
    mDiskTrimmableRegistry = paramDiskTrimmableRegistry;
    return this;
  }
  
  public Builder setEntryEvictionComparatorSupplier(EntryEvictionComparatorSupplier paramEntryEvictionComparatorSupplier)
  {
    mEntryEvictionComparatorSupplier = paramEntryEvictionComparatorSupplier;
    return this;
  }
  
  public Builder setIndexPopulateAtStartupEnabled(boolean paramBoolean)
  {
    mIndexPopulateAtStartupEnabled = paramBoolean;
    return this;
  }
  
  public Builder setMaxCacheSize(long paramLong)
  {
    mMaxCacheSize = paramLong;
    return this;
  }
  
  public Builder setMaxCacheSizeOnLowDiskSpace(long paramLong)
  {
    mMaxCacheSizeOnLowDiskSpace = paramLong;
    return this;
  }
  
  public Builder setMaxCacheSizeOnVeryLowDiskSpace(long paramLong)
  {
    mMaxCacheSizeOnVeryLowDiskSpace = paramLong;
    return this;
  }
  
  public Builder setVersion(int paramInt)
  {
    mVersion = paramInt;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskCacheConfig.Builder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */