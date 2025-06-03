package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.MemoryTrimmableRegistry;
import javax.annotation.concurrent.ThreadSafe;

@TargetApi(21)
@ThreadSafe
public class BitmapPool
  extends BasePool<Bitmap>
{
  public BitmapPool(MemoryTrimmableRegistry paramMemoryTrimmableRegistry, PoolParams paramPoolParams, PoolStatsTracker paramPoolStatsTracker)
  {
    super(paramMemoryTrimmableRegistry, paramPoolParams, paramPoolStatsTracker);
    initialize();
  }
  
  public Bitmap alloc(int paramInt)
  {
    return Bitmap.createBitmap(1, (int)Math.ceil(paramInt / 2.0D), Bitmap.Config.RGB_565);
  }
  
  public void free(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    paramBitmap.recycle();
  }
  
  public int getBucketedSize(int paramInt)
  {
    return paramInt;
  }
  
  public int getBucketedSizeForValue(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    return paramBitmap.getAllocationByteCount();
  }
  
  public int getSizeInBytes(int paramInt)
  {
    return paramInt;
  }
  
  public boolean isReusable(Bitmap paramBitmap)
  {
    Preconditions.checkNotNull(paramBitmap);
    boolean bool;
    if ((!paramBitmap.isRecycled()) && (paramBitmap.isMutable())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BitmapPool
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */