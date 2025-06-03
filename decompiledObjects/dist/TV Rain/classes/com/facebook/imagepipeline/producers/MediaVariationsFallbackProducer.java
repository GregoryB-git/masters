package com.facebook.imagepipeline.producers;

import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.cache.MediaVariationsIndex;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequest.CacheChoice;
import com.facebook.imagepipeline.request.MediaVariations;
import com.facebook.imagepipeline.request.MediaVariations.Builder;
import com.facebook.imagepipeline.request.MediaVariations.Variant;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

public class MediaVariationsFallbackProducer
  implements Producer<EncodedImage>
{
  public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
  public static final String EXTRA_CACHED_VALUE_USED_AS_LAST = "cached_value_used_as_last";
  public static final String EXTRA_VARIANTS_COUNT = "variants_count";
  public static final String EXTRA_VARIANTS_SOURCE = "variants_source";
  public static final String PRODUCER_NAME = "MediaVariationsFallbackProducer";
  private final CacheKeyFactory mCacheKeyFactory;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final Producer<EncodedImage> mInputProducer;
  private final MediaVariationsIndex mMediaVariationsIndex;
  private final BufferedDiskCache mSmallImageBufferedDiskCache;
  
  public MediaVariationsFallbackProducer(BufferedDiskCache paramBufferedDiskCache1, BufferedDiskCache paramBufferedDiskCache2, CacheKeyFactory paramCacheKeyFactory, MediaVariationsIndex paramMediaVariationsIndex, Producer<EncodedImage> paramProducer)
  {
    mDefaultBufferedDiskCache = paramBufferedDiskCache1;
    mSmallImageBufferedDiskCache = paramBufferedDiskCache2;
    mCacheKeyFactory = paramCacheKeyFactory;
    mMediaVariationsIndex = paramMediaVariationsIndex;
    mInputProducer = paramProducer;
  }
  
  private Task attemptCacheReadForVariant(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, ImageRequest paramImageRequest, MediaVariations paramMediaVariations, List<MediaVariations.Variant> paramList, int paramInt, AtomicBoolean paramAtomicBoolean)
  {
    Object localObject = (MediaVariations.Variant)paramList.get(paramInt);
    CacheKey localCacheKey = mCacheKeyFactory.getEncodedCacheKey(paramImageRequest, ((MediaVariations.Variant)localObject).getUri(), paramProducerContext.getCallerContext());
    if (((MediaVariations.Variant)localObject).getCacheChoice() == null) {
      localObject = paramImageRequest.getCacheChoice();
    } else {
      localObject = ((MediaVariations.Variant)localObject).getCacheChoice();
    }
    if (localObject == ImageRequest.CacheChoice.SMALL) {
      localObject = mSmallImageBufferedDiskCache;
    } else {
      localObject = mDefaultBufferedDiskCache;
    }
    return ((BufferedDiskCache)localObject).get(localCacheKey, paramAtomicBoolean).continueWith(onFinishDiskReads(paramConsumer, paramProducerContext, paramImageRequest, paramMediaVariations, paramList, paramInt, paramAtomicBoolean));
  }
  
  private Task chooseFromVariants(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, ImageRequest paramImageRequest, MediaVariations paramMediaVariations, ResizeOptions paramResizeOptions, AtomicBoolean paramAtomicBoolean)
  {
    if (paramMediaVariations.getVariantsCount() == 0)
    {
      paramConsumer = onFinishDiskReads(paramConsumer, paramProducerContext, paramImageRequest, paramMediaVariations, Collections.emptyList(), 0, paramAtomicBoolean);
      return Task.forResult(null).continueWith(paramConsumer);
    }
    return attemptCacheReadForVariant(paramConsumer, paramProducerContext, paramImageRequest, paramMediaVariations, paramMediaVariations.getSortedVariants(new VariantComparator(paramResizeOptions)), 0, paramAtomicBoolean);
  }
  
  @VisibleForTesting
  public static Map<String, String> getExtraMap(ProducerListener paramProducerListener, String paramString1, boolean paramBoolean1, int paramInt, String paramString2, boolean paramBoolean2)
  {
    if (!paramProducerListener.requiresExtraMap(paramString1)) {
      return null;
    }
    if (paramBoolean1) {
      return ImmutableMap.of("cached_value_found", String.valueOf(true), "cached_value_used_as_last", String.valueOf(paramBoolean2), "variants_count", String.valueOf(paramInt), "variants_source", paramString2);
    }
    return ImmutableMap.of("cached_value_found", String.valueOf(false), "variants_count", String.valueOf(paramInt), "variants_source", paramString2);
  }
  
  private static boolean isBigEnoughForRequestedSize(MediaVariations.Variant paramVariant, ResizeOptions paramResizeOptions)
  {
    boolean bool;
    if ((paramVariant.getWidth() >= width) && (paramVariant.getHeight() >= height)) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
  
  private Continuation<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext, final ImageRequest paramImageRequest, final MediaVariations paramMediaVariations, final List<MediaVariations.Variant> paramList, final int paramInt, final AtomicBoolean paramAtomicBoolean)
  {
    final String str = paramProducerContext.getId();
    new Continuation()
    {
      public Void then(Task<EncodedImage> paramAnonymousTask)
        throws Exception
      {
        boolean bool = MediaVariationsFallbackProducer.access$200(paramAnonymousTask);
        int i = 1;
        int j;
        if (bool)
        {
          val$listener.onProducerFinishWithCancellation(str, "MediaVariationsFallbackProducer", null);
          paramConsumer.onCancellation();
          j = 0;
          i = j;
        }
        else
        {
          if (paramAnonymousTask.isFaulted())
          {
            val$listener.onProducerFinishWithFailure(str, "MediaVariationsFallbackProducer", paramAnonymousTask.getError(), null);
            MediaVariationsFallbackProducer.access$000(MediaVariationsFallbackProducer.this, paramConsumer, paramProducerContext, paramMediaVariations.getMediaId());
          }
          for (;;)
          {
            j = 1;
            break label393;
            EncodedImage localEncodedImage = (EncodedImage)paramAnonymousTask.getResult();
            if (localEncodedImage != null)
            {
              if ((!paramMediaVariations.shouldForceRequestForSpecifiedUri()) && (MediaVariationsFallbackProducer.access$300((MediaVariations.Variant)paramList.get(paramInt), paramImageRequest.getResizeOptions()))) {
                bool = true;
              } else {
                bool = false;
              }
              paramAnonymousTask = val$listener;
              str = str;
              paramAnonymousTask.onProducerFinishWithSuccess(str, "MediaVariationsFallbackProducer", MediaVariationsFallbackProducer.getExtraMap(paramAnonymousTask, str, true, paramList.size(), paramMediaVariations.getSource(), bool));
              if (bool)
              {
                val$listener.onUltimateProducerReached(str, "MediaVariationsFallbackProducer", true);
                paramConsumer.onProgressUpdate(1.0F);
              }
              i = BaseConsumer.turnOnStatusFlag(BaseConsumer.simpleStatusForIsLast(bool), 2);
              j = i;
              if (!bool) {
                j = BaseConsumer.turnOnStatusFlag(i, 4);
              }
              paramConsumer.onNewResult(localEncodedImage, j);
              localEncodedImage.close();
              i = true ^ bool;
              j = 0;
              break label393;
            }
            if (paramInt < paramList.size() - 1)
            {
              MediaVariationsFallbackProducer.access$400(MediaVariationsFallbackProducer.this, paramConsumer, paramProducerContext, paramImageRequest, paramMediaVariations, paramList, paramInt + 1, paramAtomicBoolean);
              break;
            }
            paramAnonymousTask = val$listener;
            String str = str;
            paramAnonymousTask.onProducerFinishWithSuccess(str, "MediaVariationsFallbackProducer", MediaVariationsFallbackProducer.getExtraMap(paramAnonymousTask, str, false, paramList.size(), paramMediaVariations.getSource(), false));
          }
        }
        label393:
        if (i != 0)
        {
          if ((paramProducerContext.isIntermediateResultExpected()) && (j == 0))
          {
            paramAnonymousTask = new SettableProducerContext(paramProducerContext);
            paramAnonymousTask.setIsIntermediateResultExpected(false);
          }
          else
          {
            paramAnonymousTask = paramProducerContext;
          }
          MediaVariationsFallbackProducer.access$000(MediaVariationsFallbackProducer.this, paramConsumer, paramAnonymousTask, paramMediaVariations.getMediaId());
        }
        return null;
      }
    };
  }
  
  private void startInputProducerWithExistingConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
  }
  
  private void startInputProducerWithWrappedConsumer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, String paramString)
  {
    mInputProducer.produceResults(new MediaVariationsConsumer(paramConsumer, paramProducerContext, paramString), paramProducerContext);
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
  
  public void produceResults(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext)
  {
    final ImageRequest localImageRequest = paramProducerContext.getImageRequest();
    final ResizeOptions localResizeOptions = localImageRequest.getResizeOptions();
    final MediaVariations localMediaVariations = localImageRequest.getMediaVariations();
    if ((localImageRequest.isDiskCacheEnabled()) && (localResizeOptions != null) && (height > 0) && (width > 0) && (localImageRequest.getBytesRange() == null))
    {
      if (localMediaVariations == null)
      {
        startInputProducerWithExistingConsumer(paramConsumer, paramProducerContext);
        return;
      }
      paramProducerContext.getListener().onProducerStart(paramProducerContext.getId(), "MediaVariationsFallbackProducer");
      final AtomicBoolean localAtomicBoolean = new AtomicBoolean(false);
      if (localMediaVariations.getVariantsCount() > 0)
      {
        chooseFromVariants(paramConsumer, paramProducerContext, localImageRequest, localMediaVariations, localResizeOptions, localAtomicBoolean);
      }
      else
      {
        MediaVariations.Builder localBuilder = MediaVariations.newBuilderForMediaId(localMediaVariations.getMediaId()).setForceRequestForSpecifiedUri(localMediaVariations.shouldForceRequestForSpecifiedUri()).setSource("index_db");
        mMediaVariationsIndex.getCachedVariants(localMediaVariations.getMediaId(), localBuilder).continueWith(new Continuation()
        {
          public Object then(Task<MediaVariations> paramAnonymousTask)
            throws Exception
          {
            if ((!paramAnonymousTask.isCancelled()) && (!paramAnonymousTask.isFaulted())) {
              try
              {
                if (paramAnonymousTask.getResult() == null)
                {
                  MediaVariationsFallbackProducer.access$000(MediaVariationsFallbackProducer.this, paramConsumer, paramProducerContext, localMediaVariations.getMediaId());
                  return null;
                }
                paramAnonymousTask = MediaVariationsFallbackProducer.access$100(MediaVariationsFallbackProducer.this, paramConsumer, paramProducerContext, localImageRequest, (MediaVariations)paramAnonymousTask.getResult(), localResizeOptions, localAtomicBoolean);
                return paramAnonymousTask;
              }
              catch (Exception paramAnonymousTask)
              {
                return null;
              }
            }
            return paramAnonymousTask;
          }
        });
      }
      subscribeTaskForRequestCancellation(localAtomicBoolean, paramProducerContext);
      return;
    }
    startInputProducerWithExistingConsumer(paramConsumer, paramProducerContext);
  }
  
  @VisibleForTesting
  public class MediaVariationsConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private final String mMediaId;
    private final ProducerContext mProducerContext;
    
    public MediaVariationsConsumer(ProducerContext paramProducerContext, String paramString)
    {
      super();
      mProducerContext = paramString;
      String str;
      mMediaId = str;
    }
    
    private void storeResultInDatabase(EncodedImage paramEncodedImage)
    {
      Object localObject = mProducerContext.getImageRequest();
      if ((((ImageRequest)localObject).isDiskCacheEnabled()) && (mMediaId != null))
      {
        ImageRequest.CacheChoice localCacheChoice;
        if (((ImageRequest)localObject).getCacheChoice() == null) {
          localCacheChoice = ImageRequest.CacheChoice.DEFAULT;
        } else {
          localCacheChoice = ((ImageRequest)localObject).getCacheChoice();
        }
        localObject = MediaVariationsFallbackProducer.access$500(MediaVariationsFallbackProducer.this).getEncodedCacheKey((ImageRequest)localObject, mProducerContext.getCallerContext());
        MediaVariationsFallbackProducer.access$600(MediaVariationsFallbackProducer.this).saveCachedVariant(mMediaId, localCacheChoice, (CacheKey)localObject, paramEncodedImage);
      }
    }
    
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      if ((BaseConsumer.isLast(paramInt)) && (paramEncodedImage != null) && (!BaseConsumer.statusHasFlag(paramInt, 8))) {
        storeResultInDatabase(paramEncodedImage);
      }
      getConsumer().onNewResult(paramEncodedImage, paramInt);
    }
  }
  
  @VisibleForTesting
  public static class VariantComparator
    implements Comparator<MediaVariations.Variant>
  {
    private final ResizeOptions mResizeOptions;
    
    public VariantComparator(ResizeOptions paramResizeOptions)
    {
      mResizeOptions = paramResizeOptions;
    }
    
    public int compare(MediaVariations.Variant paramVariant1, MediaVariations.Variant paramVariant2)
    {
      boolean bool1 = MediaVariationsFallbackProducer.access$300(paramVariant1, mResizeOptions);
      boolean bool2 = MediaVariationsFallbackProducer.access$300(paramVariant2, mResizeOptions);
      if ((bool1) && (bool2)) {
        return paramVariant1.getWidth() - paramVariant2.getWidth();
      }
      if (bool1) {
        return -1;
      }
      if (bool2) {
        return 1;
      }
      return paramVariant2.getWidth() - paramVariant1.getWidth();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MediaVariationsFallbackProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */