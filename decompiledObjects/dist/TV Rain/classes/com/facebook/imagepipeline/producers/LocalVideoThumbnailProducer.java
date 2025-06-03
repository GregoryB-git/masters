package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.provider.MediaStore.Video.Media;
import androidx.annotation.Nullable;
import com.facebook.common.executors.StatefulRunnable;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.common.util.UriUtil;
import com.facebook.imagepipeline.bitmaps.SimpleBitmapReleaser;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.image.ImmutableQualityInfo;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.util.Map;
import java.util.concurrent.Executor;

public class LocalVideoThumbnailProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  @VisibleForTesting
  public static final String CREATED_THUMBNAIL = "createdThumbnail";
  public static final String PRODUCER_NAME = "VideoThumbnailProducer";
  private final ContentResolver mContentResolver;
  private final Executor mExecutor;
  
  public LocalVideoThumbnailProducer(Executor paramExecutor, ContentResolver paramContentResolver)
  {
    mExecutor = paramExecutor;
    mContentResolver = paramContentResolver;
  }
  
  private static int calculateKind(ImageRequest paramImageRequest)
  {
    if ((paramImageRequest.getPreferredWidth() <= 96) && (paramImageRequest.getPreferredHeight() <= 96)) {
      return 3;
    }
    return 1;
  }
  
  @Nullable
  private String getLocalFilePath(ImageRequest paramImageRequest)
  {
    Object localObject1 = paramImageRequest.getSourceUri();
    if (UriUtil.isLocalFileUri((Uri)localObject1)) {
      return paramImageRequest.getSourceFile().getPath();
    }
    if (UriUtil.isLocalContentUri((Uri)localObject1))
    {
      Object localObject3;
      if ("com.android.providers.media.documents".equals(((Uri)localObject1).getAuthority()))
      {
        localObject1 = DocumentsContract.getDocumentId((Uri)localObject1);
        paramImageRequest = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        localObject3 = localObject1.split(":")[1];
        localObject1 = "_id=?";
        localObject3 = new String[] { localObject3 };
      }
      else
      {
        paramImageRequest = (ImageRequest)localObject1;
        localObject1 = null;
        localObject3 = localObject1;
      }
      paramImageRequest = mContentResolver.query(paramImageRequest, new String[] { "_data" }, (String)localObject1, (String[])localObject3, null);
      if (paramImageRequest != null) {
        try
        {
          if (paramImageRequest.moveToFirst())
          {
            localObject1 = paramImageRequest.getString(paramImageRequest.getColumnIndexOrThrow("_data"));
            return (String)localObject1;
          }
        }
        finally
        {
          paramImageRequest.close();
        }
      }
      if (paramImageRequest != null) {
        paramImageRequest.close();
      }
    }
    return null;
  }
  
  public void produceResults(final Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    final ProducerListener localProducerListener = paramProducerContext.getListener();
    final String str = paramProducerContext.getId();
    paramConsumer = new StatefulProducerRunnable(paramConsumer, localProducerListener, "VideoThumbnailProducer", str)
    {
      public void disposeResult(CloseableReference<CloseableImage> paramAnonymousCloseableReference)
      {
        CloseableReference.closeSafely(paramAnonymousCloseableReference);
      }
      
      public Map<String, String> getExtraMapOnSuccess(CloseableReference<CloseableImage> paramAnonymousCloseableReference)
      {
        boolean bool;
        if (paramAnonymousCloseableReference != null) {
          bool = true;
        } else {
          bool = false;
        }
        return ImmutableMap.of("createdThumbnail", String.valueOf(bool));
      }
      
      public CloseableReference<CloseableImage> getResult()
        throws Exception
      {
        Object localObject = LocalVideoThumbnailProducer.access$000(LocalVideoThumbnailProducer.this, val$imageRequest);
        if (localObject == null) {
          return null;
        }
        localObject = ThumbnailUtils.createVideoThumbnail((String)localObject, LocalVideoThumbnailProducer.access$100(val$imageRequest));
        if (localObject == null) {
          return null;
        }
        return CloseableReference.of(new CloseableStaticBitmap((Bitmap)localObject, SimpleBitmapReleaser.getInstance(), ImmutableQualityInfo.FULL_QUALITY, 0));
      }
      
      public void onFailure(Exception paramAnonymousException)
      {
        super.onFailure(paramAnonymousException);
        localProducerListener.onUltimateProducerReached(str, "VideoThumbnailProducer", false);
      }
      
      public void onSuccess(CloseableReference<CloseableImage> paramAnonymousCloseableReference)
      {
        super.onSuccess(paramAnonymousCloseableReference);
        ProducerListener localProducerListener = localProducerListener;
        String str = str;
        boolean bool;
        if (paramAnonymousCloseableReference != null) {
          bool = true;
        } else {
          bool = false;
        }
        localProducerListener.onUltimateProducerReached(str, "VideoThumbnailProducer", bool);
      }
    };
    paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        paramConsumer.cancel();
      }
    });
    mExecutor.execute(paramConsumer);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.LocalVideoThumbnailProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */