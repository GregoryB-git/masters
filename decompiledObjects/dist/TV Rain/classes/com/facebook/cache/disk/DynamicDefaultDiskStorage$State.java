package com.facebook.cache.disk;

import com.facebook.common.internal.VisibleForTesting;
import java.io.File;
import javax.annotation.Nullable;

@VisibleForTesting
class DynamicDefaultDiskStorage$State
{
  @Nullable
  public final DiskStorage delegate;
  @Nullable
  public final File rootDirectory;
  
  @VisibleForTesting
  public DynamicDefaultDiskStorage$State(@Nullable File paramFile, @Nullable DiskStorage paramDiskStorage)
  {
    delegate = paramDiskStorage;
    rootDirectory = paramFile;
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DynamicDefaultDiskStorage.State
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */