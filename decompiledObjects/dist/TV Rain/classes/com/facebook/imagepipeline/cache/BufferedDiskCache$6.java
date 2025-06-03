package com.facebook.imagepipeline.cache;

import com.facebook.cache.common.WriterCallback;
import com.facebook.common.memory.PooledByteStreams;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.OutputStream;

class BufferedDiskCache$6
  implements WriterCallback
{
  public BufferedDiskCache$6(BufferedDiskCache paramBufferedDiskCache, EncodedImage paramEncodedImage) {}
  
  public void write(OutputStream paramOutputStream)
    throws IOException
  {
    BufferedDiskCache.access$700(this$0).copy(val$encodedImage.getInputStream(), paramOutputStream);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BufferedDiskCache.6
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */