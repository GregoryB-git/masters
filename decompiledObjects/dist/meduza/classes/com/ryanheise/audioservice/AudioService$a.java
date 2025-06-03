package com.ryanheise.audioservice;

import android.graphics.Bitmap;
import android.util.LruCache;

public final class AudioService$a
  extends LruCache<String, Bitmap>
{
  public AudioService$a(int paramInt)
  {
    super(paramInt);
  }
  
  public final int sizeOf(Object paramObject1, Object paramObject2)
  {
    paramObject1 = (String)paramObject1;
    return ((Bitmap)paramObject2).getByteCount() / 1024;
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */