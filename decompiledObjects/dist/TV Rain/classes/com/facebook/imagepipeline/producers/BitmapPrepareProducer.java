package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

public class BitmapPrepareProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  public static final String PRODUCER_NAME = "BitmapPrepareProducer";
  private final Producer<CloseableReference<CloseableImage>> mInputProducer;
  private final int mMaxBitmapSizeBytes;
  private final int mMinBitmapSizeBytes;
  private final boolean mPreparePrefetch;
  
  public BitmapPrepareProducer(Producer<CloseableReference<CloseableImage>> paramProducer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    boolean bool;
    if (paramInt1 <= paramInt2) {
      bool = true;
    } else {
      bool = false;
    }
    Preconditions.checkArgument(bool);
    mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
    mMinBitmapSizeBytes = paramInt1;
    mMaxBitmapSizeBytes = paramInt2;
    mPreparePrefetch = paramBoolean;
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    if ((paramProducerContext.isPrefetch()) && (!mPreparePrefetch)) {
      mInputProducer.produceResults(paramConsumer, paramProducerContext);
    } else {
      mInputProducer.produceResults(new BitmapPrepareConsumer(paramConsumer, mMinBitmapSizeBytes, mMaxBitmapSizeBytes), paramProducerContext);
    }
  }
  
  public static class BitmapPrepareConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  {
    private final int mMaxBitmapSizeBytes;
    private final int mMinBitmapSizeBytes;
    
    public BitmapPrepareConsumer(Consumer<CloseableReference<CloseableImage>> paramConsumer, int paramInt1, int paramInt2)
    {
      super();
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
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.BitmapPrepareProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */