package com.facebook.imagepipeline.cache;

import com.facebook.imagepipeline.image.CloseableImage;

final class BitmapCountingMemoryCacheFactory$1
  implements ValueDescriptor<CloseableImage>
{
  public int getSizeInBytes(CloseableImage paramCloseableImage)
  {
    return paramCloseableImage.getSizeInBytes();
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.cache.BitmapCountingMemoryCacheFactory.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */