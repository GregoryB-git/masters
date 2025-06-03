package com.facebook.cache.disk;

import android.content.Context;
import com.facebook.common.internal.Supplier;
import java.io.File;

class DiskCacheConfig$Builder$1
  implements Supplier<File>
{
  public DiskCacheConfig$Builder$1(DiskCacheConfig.Builder paramBuilder) {}
  
  public File get()
  {
    return DiskCacheConfig.Builder.access$1000(this$0).getApplicationContext().getCacheDir();
  }
}

/* Location:
 * Qualified Name:     com.facebook.cache.disk.DiskCacheConfig.Builder.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */