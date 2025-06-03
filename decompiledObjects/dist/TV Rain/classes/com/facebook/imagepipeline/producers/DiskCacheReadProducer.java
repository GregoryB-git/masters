package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.ImageRequest.RequestLevel;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class DiskCacheReadProducer
  implements Producer<EncodedImage>
{
  public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
  public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
  public static final String PRODUCER_NAME = "DiskCacheProducer";
  private final CacheKeyFactory mCacheKeyFactory;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final Producer<EncodedImage> mInputProducer;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  
  public DiskCacheReadProducer(BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory, Producer<EncodedImage> paramProducer)
  {
    mDefaultBufferedDiskCache = paramBufferedDiskCache1;
    mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    mCacheKeyFactory = paramCacheKeyFactory;
    mInputProducer = paramProducer;
  }
  
  @VisibleForTesting
  public static Map<String, String> getExtraMap(ProducerListener paramProducerListener, String paramString, boolean paramBoolean, int paramInt)
  {
    if (!paramProducerListener.requiresExtraMap(paramString)) {
      return null;
    }
    if (paramBoolean) {
      return ImmutableMap.of("cached_value_found", String.valueOf(paramBoolean), "encodedImageSize", String.valueOf(paramInt));
    }
    return ImmutableMap.of("cached_value_found", String.valueOf(paramBoolean));
  }
  
  private static boolean isTaskCancelled(Task<?> paramTask)
  {
    boolean bool;
    if ((!paramTask.isCancelled()) && ((!paramTask.isFaulted()) || (!(paramTask.getError() instanceof CancellationException)))) {
      bool = false;
    } else {
      bool = true;
    }
    return bool;
  }
  
  private void maybeStartInputProducer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    if (paramProducerContext.getLowestPermittedRequestLevel().getValue() >= ImageRequest.RequestLevel.DISK_CACHE.getValue())
    {
      paramConsumer.onNewResult(null, 1);
      return;
    }
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
  }
  
  private Continuation<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext)
  {
    final String str = paramProducerContext.getId();
    new Continuation()
    {
      public Void then(Task<EncodedImage> paramAnonymousTask)
        throws Exception
      {
        if (DiskCacheReadProducer.access$000(paramAnonymousTask))
        {
          val$listener.onProducerFinishWithCancellation(str, "DiskCacheProducer", null);
          paramConsumer.onCancellation();
        }
        else if (paramAnonymousTask.isFaulted())
        {
          val$listener.onProducerFinishWithFailure(str, "DiskCacheProducer", paramAnonymousTask.getError(), null);
          DiskCacheReadProducer.access$100(DiskCacheReadProducer.this).produceResults(paramConsumer, paramProducerContext);
        }
        else
        {
          Object localObject = (EncodedImage)paramAnonymousTask.getResult();
          if (localObject != null)
          {
            ProducerListener localProducerListener = val$listener;
            paramAnonymousTask = str;
            localProducerListener.onProducerFinishWithSuccess(paramAnonymousTask, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap(localProducerListener, paramAnonymousTask, true, ((EncodedImage)localObject).getSize()));
            val$listener.onUltimateProducerReached(str, "DiskCacheProducer", true);
            paramConsumer.onProgressUpdate(1.0F);
            paramConsumer.onNewResult(localObject, 1);
            ((EncodedImage)localObject).close();
          }
          else
          {
            localObject = val$listener;
            paramAnonymousTask = str;
            ((ProducerListener)localObject).onProducerFinishWithSuccess(paramAnonymousTask, "DiskCacheProducer", DiskCacheReadProducer.getExtraMap((ProducerListener)localObject, paramAnonymousTask, false, 0));
            DiskCacheReadProducer.access$100(DiskCacheReadProducer.this).produceResults(paramConsumer, paramProducerContext);
          }
        }
        return null;
      }
    };
  }
  
  private void subscribeTaskForRequestCancellation(final AtomicBoolean paramAtomicBoolean, ProducerContext paramProducerContext)
  {
    paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
    {
      public void onCancellationRequested()
      {
        paramAtomicBoolean.set(true);
      }
    });
  }
  
  public void produceResults(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    Object localObject = paramProducerContext.getImageRequest();
    if (!((ImageRequest)localObject).isDiskCacheEnabled())
    {
      maybeStartInputProducer(paramConsumer, paramProducerContext);
      return;
    }
    paramProducerContext.getListener().onProducerStart(paramProducerContext.getId(), "DiskCacheProducer");
    CacheKey localCacheKey = mCacheKeyFactory.getEncodedCacheKey((ImageRequest)localObject, paramProducerContext.getCallerContext());
    int i;
    if (((ImageRequest)localObject).getCacheChoice() == ImageRequest.CacheChoice.SMALL) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      localObject = mSmallImageBufferedDiskCache;
    } else {
      localObject = mDefaultBufferedDiskCache;
    }
    AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
    ((BufferedDiskCache)localObject).get(localCacheKey, localAtomicBoolean).continueWith(onFinishDiskReads(paramConsumer, paramProducerContext));
    subscribeTaskForRequestCancellation(localAtomicBoolean, paramProducerContext);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.DiskCacheReadProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */