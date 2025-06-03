package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.common.references.ResourceReleaser;

class BitmapCounter$1
  implements ResourceReleaser<Bitmap>
{
  public BitmapCounter$1(BitmapCounter paramBitmapCounter) {}
  
  public void release(Bitmap paramBitmap)
  {
    try
    {
      this$0.decrease(paramBitmap);
      return;
    }
    finally
    {
      paramBitmap.recycle();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.memory.BitmapCounter.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */