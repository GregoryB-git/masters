package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

class BitmapPrepareProducer$BitmapPrepareConsumer
  extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
{
  private final int mMaxBitmapSizeBytes;
  private final int mMinBitmapSizeBytes;
  
  public BitmapPrepareProducer$BitmapPrepareConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, int paramInt1, int paramInt2)
  {
    super(paramConsumer);
    mMinBitmapSizeBytes = paramInt1;
    mMaxBitmapSizeBytes = paramInt2;
  }
  
  private void internalPrepareBitmap(CloseableReference<CloseableImage> paramCloseableReference)
  {
    if ((paramCloseableReference != null) && (paramCloseableReference.isValid()))
    {
      paramCloseableReference = (CloseableImage)paramCloseableReference.get();
      if ((paramCloseableReference != null) && (!paramCloseableReference.isClosed()) && ((paramCloseableReference instanceof CloseableStaticBitmap)))
      {
        paramCloseableReference = ((CloseableStaticBitmap)paramCloseableReference).getUnderlyingBitmap();
        if (paramCloseableReference == null) {
          return;
        }
        int i = paramCloseableReference.getRowBytes();
        i = paramCloseableReference.getHeight() * i;
        if (i < mMinBitmapSizeBytes) {
          return;
        }
        if (i > mMaxBitmapSizeBytes) {
          return;
        }
        paramCloseableReference.prepareToDraw();
      }
    }
  }
  
  public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
  {
    internalPrepareBitmap(paramCloseableReference);
    getConsumer().onNewResult(paramCloseableReference, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapPrepareProducer.BitmapPrepareConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */