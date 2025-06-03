package com.facebook.imagepipeline.cache;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory.BitmapCreationObserver;
import java.util.Map;

class CountingMemoryCache$1
  implements PlatformBitmapFactory.BitmapCreationObserver
{
  public CountingMemoryCache$1(CountingMemoryCache paramCountingMemoryCache) {}
  
  public void onBitmapCreated(Bitmap paramBitmap, Object paramObject)
  {
    this$0.mOtherEntries.put(paramBitmap, paramObject);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.CountingMemoryCache.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */