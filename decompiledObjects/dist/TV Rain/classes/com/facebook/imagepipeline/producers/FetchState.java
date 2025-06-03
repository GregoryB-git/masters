package com.facebook.imagepipeline.producers;

import android.net.Uri;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import javax.annotation.Nullable;

public class FetchState
{
  private final Consumer<EncodedImage> mConsumer;
  private final ProducerContext mContext;
  private long mLastIntermediateResultTimeMs;
  private int mOnNewResultStatusFlags;
  @Nullable
  private BytesRange mResponseBytesRange;
  
  public FetchState(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    mConsumer = paramConsumer;
    mContext = paramProducerContext;
    mLastIntermediateResultTimeMs = 0L;
  }
  
  public Consumer<EncodedImage> getConsumer()
  {
    return mConsumer;
  }
  
  public ProducerContext getContext()
  {
    return mContext;
  }
  
  public String getId()
  {
    return mContext.getId();
  }
  
  public long getLastIntermediateResultTimeMs()
  {
    return mLastIntermediateResultTimeMs;
  }
  
  public ProducerListener getListener()
  {
    return mContext.getListener();
  }
  
  public int getOnNewResultStatusFlags()
  {
    return mOnNewResultStatusFlags;
  }
  
  @Nullable
  public BytesRange getResponseBytesRange()
  {
    return mResponseBytesRange;
  }
  
  public Uri getUri()
  {
    return mContext.getImageRequest().getSourceUri();
  }
  
  public void setLastIntermediateResultTimeMs(long paramLong)
  {
    mLastIntermediateResultTimeMs = paramLong;
  }
  
  public void setOnNewResultStatusFlags(int paramInt)
  {
    mOnNewResultStatusFlags = paramInt;
  }
  
  public void setResponseBytesRange(BytesRange paramBytesRange)
  {
    mResponseBytesRange = paramBytesRange;
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.FetchState
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */