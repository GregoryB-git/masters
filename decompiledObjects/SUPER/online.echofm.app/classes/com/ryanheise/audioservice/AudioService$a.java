package com.ryanheise.audioservice;

import android.graphics.Bitmap;
import android.util.LruCache;

public class AudioService$a
  extends LruCache
{
  public AudioService$a(AudioService paramAudioService, int paramInt)
  {
    super(paramInt);
  }
  
  public int a(String paramString, Bitmap paramBitmap)
  {
    return paramBitmap.getByteCount() / 1024;
  }
}

/* Location:
 * Qualified Name:     com.ryanheise.audioservice.AudioService.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */