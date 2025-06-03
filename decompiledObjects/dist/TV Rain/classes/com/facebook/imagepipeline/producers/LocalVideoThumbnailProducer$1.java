package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.util.Map;

class LocalVideoThumbnailProducer$1
  extends StatefulProducerRunnable<CloseableReference<CloseableImage>>
{
  public LocalVideoThumbnailProducer$1(LocalVideoThumbnailProducer paramLocalVideoThumbnailProducer, Consumer paramConsumer, ProducerListener paramProducerListener1, String paramString1, String paramString2, ProducerListener paramProducerListener2, String paramString3, ImageRequest paramImageRequest)
  {
    super(paramConsumer, paramProducerListener1, paramString1, paramString2);
  }
  
  public void disposeResult(CloseableReference<CloseableImage> paramCloseableReference)
  {
    CloseableReference.closeSafely(paramCloseableReference);
  }
  
  public Map<String, String> getExtraMapOnSuccess(CloseableReference<CloseableImage> paramCloseableReference)
  {
    boolean bool;
    if (paramCloseableReference != null) {
      bool = true;
    } else {
      bool = false;
    }
    return ImmutableMap.of("createdThumbnail", String.valueOf(bool));
  }
  
  public CloseableReference<CloseableImage> getResult()
    throws Exception
  {
    Object localObject = LocalVideoThumbnailProducer.access$000(this$0, val$imageRequest);
    if (localObject == null) {
      return null;
    }
    localObject = ThumbnailUtils.createVideoThumbnail((String)localObject, LocalVideoThumbnailProducer.access$100(val$imageRequest));
    if (localObject == null) {
      return null;
    }
    return CloseableReference.of(new CloseableStaticBitmap((Bitmap)localObject, SimpleBitmapReleaser.getInstance(), ImmutableQualityInfo.FULL_QUALITY, 0));
  }
  
  public void onFailure(Exception paramException)
  {
    super.onFailure(paramException);
    val$listener.onUltimateProducerReached(val$requestId, "VideoThumbnailProducer", false);
  }
  
  public void onSuccess(CloseableReference<CloseableImage> paramCloseableReference)
  {
    super.onSuccess(paramCloseableReference);
    ProducerListener localProducerListener = val$listener;
    String str = val$requestId;
    boolean bool;
    if (paramCloseableReference != null) {
      bool = true;
    } else {
      bool = false;
    }
    localProducerListener.onUltimateProducerReached(str, "VideoThumbnailProducer", bool);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */