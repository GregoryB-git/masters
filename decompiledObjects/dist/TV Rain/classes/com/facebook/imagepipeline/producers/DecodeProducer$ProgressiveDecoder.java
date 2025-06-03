package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Supplier;
import com.facebook.common.logging.FLog;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.ExceptionWithNoStacktrace;
import com.facebook.common.util.UriUtil;
import com.facebook.imageformat.DefaultImageFormats;
import com.facebook.imageformat.ImageFormat;
import com.facebook.imagepipeline.common.ImageDecodeOptions;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.decoder.DecodeException;
import com.facebook.imagepipeline.decoder.ImageDecoder;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.image.QualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

abstract class DecodeProducer$ProgressiveDecoder
  extends DelegatingConsumer<EncodedImage, CloseableReference<CloseableImage>>
{
  private static final int DECODE_EXCEPTION_MESSAGE_NUM_HEADER_BYTES = 10;
  private final String TAG = "ProgressiveDecoder";
  private final ImageDecodeOptions mImageDecodeOptions;
  @GuardedBy("this")
  private boolean mIsFinished;
  private final JobScheduler mJobScheduler;
  private final ProducerContext mProducerContext;
  private final ProducerListener mProducerListener;
  
  public DecodeProducer$ProgressiveDecoder(final Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext, final boolean paramBoolean)
  {
    super(paramProducerContext);
    mProducerContext = paramBoolean;
    mProducerListener = paramBoolean.getListener();
    paramProducerContext = paramBoolean.getImageRequest().getImageDecodeOptions();
    mImageDecodeOptions = paramProducerContext;
    mIsFinished = false;
    JobScheduler.JobRunnable local1 = new JobScheduler.JobRunnable()
    {
      public void run(EncodedImage paramAnonymousEncodedImage, int paramAnonymousInt)
      {
        if (paramAnonymousEncodedImage != null)
        {
          if ((DecodeProducer.access$000(this$0)) || ((((Boolean)DecodeProducer.access$100(this$0).get()).booleanValue()) && (!BaseConsumer.statusHasFlag(paramAnonymousInt, 16))))
          {
            ImageRequest localImageRequest = paramBoolean.getImageRequest();
            if ((DecodeProducer.access$200(this$0)) || (!UriUtil.isNetworkUri(localImageRequest.getSourceUri()))) {
              paramAnonymousEncodedImage.setSampleSize(DownsampleUtil.determineSampleSize(localImageRequest, paramAnonymousEncodedImage));
            }
          }
          DecodeProducer.ProgressiveDecoder.access$300(DecodeProducer.ProgressiveDecoder.this, paramAnonymousEncodedImage, paramAnonymousInt);
        }
      }
    };
    mJobScheduler = new JobScheduler(DecodeProducer.access$400(paramConsumer), local1, minDecodeIntervalMs);
    final boolean bool;
    paramBoolean.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        if (bool) {
          DecodeProducer.ProgressiveDecoder.access$700(DecodeProducer.ProgressiveDecoder.this);
        }
      }
      
      public void onIsIntermediateResultExpectedChanged()
      {
        if (DecodeProducer.ProgressiveDecoder.access$500(DecodeProducer.ProgressiveDecoder.this).isIntermediateResultExpected()) {
          DecodeProducer.ProgressiveDecoder.access$600(DecodeProducer.ProgressiveDecoder.this).scheduleJob();
        }
      }
    });
  }
  
  private void doDecode(EncodedImage paramEncodedImage, int paramInt)
  {
    int i = paramInt;
    if ((paramEncodedImage.getImageFormat() != DefaultImageFormats.JPEG) && (BaseConsumer.isNotLast(paramInt))) {
      return;
    }
    if ((!isFinished()) && (EncodedImage.isValid(paramEncodedImage)))
    {
      Object localObject1 = paramEncodedImage.getImageFormat();
      Object localObject3 = "unknown";
      if (localObject1 != null) {
        localObject1 = ((ImageFormat)localObject1).getName();
      } else {
        localObject1 = "unknown";
      }
      Object localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append(paramEncodedImage.getWidth());
      ((StringBuilder)localObject4).append("x");
      ((StringBuilder)localObject4).append(paramEncodedImage.getHeight());
      String str1 = ((StringBuilder)localObject4).toString();
      String str2 = String.valueOf(paramEncodedImage.getSampleSize());
      boolean bool1 = BaseConsumer.isLast(paramInt);
      if ((bool1) && (!BaseConsumer.statusHasFlag(i, 8))) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      boolean bool2 = BaseConsumer.statusHasFlag(i, 4);
      localObject4 = mProducerContext.getImageRequest().getResizeOptions();
      if (localObject4 != null)
      {
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append(width);
        ((StringBuilder)localObject3).append("x");
        ((StringBuilder)localObject3).append(height);
        localObject3 = ((StringBuilder)localObject3).toString();
      }
      try
      {
        long l = mJobScheduler.getQueuedTime();
        String str3 = String.valueOf(mProducerContext.getImageRequest().getSourceUri());
        int j;
        if ((paramInt == 0) && (!bool2)) {
          j = getIntermediateImageEndOffset(paramEncodedImage);
        } else {
          j = paramEncodedImage.getSize();
        }
        if ((paramInt == 0) && (!bool2)) {
          localObject4 = getQualityInfo();
        } else {
          localObject4 = ImmutableQualityInfo.FULL_QUALITY;
        }
        mProducerListener.onProducerStart(mProducerContext.getId(), "DecodeProducer");
        try
        {
          Object localObject5 = DecodeProducer.access$800(this$0).decode(paramEncodedImage, j, (QualityInfo)localObject4, mImageDecodeOptions);
          try
          {
            j = paramEncodedImage.getSampleSize();
            paramInt = i;
            if (j != 1) {
              paramInt = i | 0x10;
            }
            localObject1 = getExtraMap((CloseableImage)localObject5, l, (QualityInfo)localObject4, bool1, (String)localObject1, str1, (String)localObject3, str2);
            mProducerListener.onProducerFinishWithSuccess(mProducerContext.getId(), "DecodeProducer", (Map)localObject1);
            handleResult((CloseableImage)localObject5, paramInt);
            return;
          }
          catch (Exception localException1) {}
          localObject1 = getExtraMap((CloseableImage)localObject5, l, (QualityInfo)localObject4, bool1, (String)localObject1, str1, (String)localObject3, str2);
        }
        catch (Exception localException2)
        {
          localObject5 = null;
        }
        catch (DecodeException localDecodeException)
        {
          localObject5 = localDecodeException.getEncodedImage();
          FLog.w("ProgressiveDecoder", "%s, {uri: %s, firstEncodedBytes: %s, length: %d}", new Object[] { localDecodeException.getMessage(), localException2, ((EncodedImage)localObject5).getFirstBytesAsHexString(10), Integer.valueOf(((EncodedImage)localObject5).getSize()) });
          throw localDecodeException;
        }
        mProducerListener.onProducerFinishWithFailure(mProducerContext.getId(), "DecodeProducer", localException2, (Map)localObject1);
        handleError(localException2);
        return;
      }
      finally
      {
        EncodedImage.closeSafely(paramEncodedImage);
      }
    }
  }
  
  private Map<String, String> getExtraMap(@Nullable CloseableImage paramCloseableImage, long paramLong, QualityInfo paramQualityInfo, boolean paramBoolean, String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (!mProducerListener.requiresExtraMap(mProducerContext.getId())) {
      return null;
    }
    String str1 = String.valueOf(paramLong);
    String str2 = String.valueOf(paramQualityInfo.isOfGoodEnoughQuality());
    paramQualityInfo = String.valueOf(paramBoolean);
    if ((paramCloseableImage instanceof CloseableStaticBitmap))
    {
      paramCloseableImage = ((CloseableStaticBitmap)paramCloseableImage).getUnderlyingBitmap();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(paramCloseableImage.getWidth());
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(paramCloseableImage.getHeight());
      paramCloseableImage = ((StringBuilder)localObject).toString();
      localObject = new HashMap(8);
      ((HashMap)localObject).put("bitmapSize", paramCloseableImage);
      ((HashMap)localObject).put("queueTime", str1);
      ((HashMap)localObject).put("hasGoodQuality", str2);
      ((HashMap)localObject).put("isFinal", paramQualityInfo);
      ((HashMap)localObject).put("encodedImageSize", paramString2);
      ((HashMap)localObject).put("imageFormat", paramString1);
      ((HashMap)localObject).put("requestedImageSize", paramString3);
      ((HashMap)localObject).put("sampleSize", paramString4);
      return ImmutableMap.copyOf((Map)localObject);
    }
    paramCloseableImage = new HashMap(7);
    paramCloseableImage.put("queueTime", str1);
    paramCloseableImage.put("hasGoodQuality", str2);
    paramCloseableImage.put("isFinal", paramQualityInfo);
    paramCloseableImage.put("encodedImageSize", paramString2);
    paramCloseableImage.put("imageFormat", paramString1);
    paramCloseableImage.put("requestedImageSize", paramString3);
    paramCloseableImage.put("sampleSize", paramString4);
    return ImmutableMap.copyOf(paramCloseableImage);
  }
  
  private void handleCancellation()
  {
    maybeFinish(true);
    getConsumer().onCancellation();
  }
  
  private void handleError(Throwable paramThrowable)
  {
    maybeFinish(true);
    getConsumer().onFailure(paramThrowable);
  }
  
  private void handleResult(CloseableImage paramCloseableImage, int paramInt)
  {
    CloseableReference localCloseableReference = CloseableReference.of(paramCloseableImage);
    try
    {
      maybeFinish(BaseConsumer.isLast(paramInt));
      getConsumer().onNewResult(localCloseableReference, paramInt);
      return;
    }
    finally
    {
      CloseableReference.closeSafely(localCloseableReference);
    }
  }
  
  private boolean isFinished()
  {
    try
    {
      boolean bool = mIsFinished;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  private void maybeFinish(boolean paramBoolean)
  {
    if (paramBoolean) {}
    try
    {
      if (!mIsFinished)
      {
        getConsumer().onProgressUpdate(1.0F);
        mIsFinished = true;
        mJobScheduler.clearJob();
        return;
      }
      return;
    }
    finally {}
  }
  
  public abstract int getIntermediateImageEndOffset(EncodedImage paramEncodedImage);
  
  public abstract QualityInfo getQualityInfo();
  
  public void onCancellationImpl()
  {
    handleCancellation();
  }
  
  public void onFailureImpl(Throwable paramThrowable)
  {
    handleError(paramThrowable);
  }
  
  public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
  {
    boolean bool1 = BaseConsumer.isLast(paramInt);
    if ((bool1) && (!EncodedImage.isValid(paramEncodedImage)))
    {
      handleError(new ExceptionWithNoStacktrace("Encoded image is not valid."));
      return;
    }
    if (!updateDecodeJob(paramEncodedImage, paramInt)) {
      return;
    }
    boolean bool2 = BaseConsumer.statusHasFlag(paramInt, 4);
    if ((bool1) || (bool2) || (mProducerContext.isIntermediateResultExpected())) {
      mJobScheduler.scheduleJob();
    }
  }
  
  public void onProgressUpdateImpl(float paramFloat)
  {
    super.onProgressUpdateImpl(paramFloat * 0.99F);
  }
  
  public boolean updateDecodeJob(EncodedImage paramEncodedImage, int paramInt)
  {
    return mJobScheduler.updateJob(paramEncodedImage, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DecodeProducer.ProgressiveDecoder
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */