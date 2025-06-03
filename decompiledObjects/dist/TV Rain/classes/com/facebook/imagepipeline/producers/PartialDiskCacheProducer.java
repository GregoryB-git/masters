package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.net.Uri.Builder;
import bolts.Continuation;
import bolts.Task;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.Pool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.cache.BufferedDiskCache;
import com.facebook.imagepipeline.cache.CacheKeyFactory;
import com.facebook.imagepipeline.common.BytesRange;
import com.facebook.imagepipeline.image.EncodedImage;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.Nullable;

public class PartialDiskCacheProducer
  implements Producer<EncodedImage>
{
  public static final String ENCODED_IMAGE_SIZE = "encodedImageSize";
  public static final String EXTRA_CACHED_VALUE_FOUND = "cached_value_found";
  public static final String PRODUCER_NAME = "PartialDiskCacheProducer";
  private final ByteArrayPool mByteArrayPool;
  private final CacheKeyFactory mCacheKeyFactory;
  private final BufferedDiskCache mDefaultBufferedDiskCache;
  private final Producer<EncodedImage> mInputProducer;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  
  public PartialDiskCacheProducer(BufferedDiskCache paramBufferedDiskCache, CacheKeyFactory paramCacheKeyFactory, PooledByteBufferFactory paramPooledByteBufferFactory, ByteArrayPool paramByteArrayPool, Producer<EncodedImage> paramProducer)
  {
    mDefaultBufferedDiskCache = paramBufferedDiskCache;
    mCacheKeyFactory = paramCacheKeyFactory;
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
    mByteArrayPool = paramByteArrayPool;
    mInputProducer = paramProducer;
  }
  
  private static Uri createUriForPartialCacheKey(ImageRequest paramImageRequest)
  {
    return paramImageRequest.getSourceUri().buildUpon().appendQueryParameter("fresco_partial", "true").build();
  }
  
  @Nullable
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
  
  private Continuation<EncodedImage, Void> onFinishDiskReads(final Consumer<EncodedImage> paramConsumer, final ProducerContext paramProducerContext, final CacheKey paramCacheKey)
  {
    final String str = paramProducerContext.getId();
    new Continuation()
    {
      public Void then(Task<EncodedImage> paramAnonymousTask)
        throws Exception
      {
        if (PartialDiskCacheProducer.access$000(paramAnonymousTask))
        {
          val$listener.onProducerFinishWithCancellation(str, "PartialDiskCacheProducer", null);
          paramConsumer.onCancellation();
        }
        else if (paramAnonymousTask.isFaulted())
        {
          val$listener.onProducerFinishWithFailure(str, "PartialDiskCacheProducer", paramAnonymousTask.getError(), null);
          PartialDiskCacheProducer.access$100(PartialDiskCacheProducer.this, paramConsumer, paramProducerContext, paramCacheKey, null);
        }
        else
        {
          paramAnonymousTask = (EncodedImage)paramAnonymousTask.getResult();
          Object localObject1;
          Object localObject2;
          if (paramAnonymousTask != null)
          {
            localObject1 = val$listener;
            localObject2 = str;
            ((ProducerListener)localObject1).onProducerFinishWithSuccess((String)localObject2, "PartialDiskCacheProducer", PartialDiskCacheProducer.getExtraMap((ProducerListener)localObject1, (String)localObject2, true, paramAnonymousTask.getSize()));
            localObject2 = BytesRange.toMax(paramAnonymousTask.getSize() - 1);
            paramAnonymousTask.setBytesRange((BytesRange)localObject2);
            int i = paramAnonymousTask.getSize();
            localObject1 = paramProducerContext.getImageRequest();
            if (((BytesRange)localObject2).contains(((ImageRequest)localObject1).getBytesRange()))
            {
              val$listener.onUltimateProducerReached(str, "PartialDiskCacheProducer", true);
              paramConsumer.onNewResult(paramAnonymousTask, 9);
            }
            else
            {
              paramConsumer.onNewResult(paramAnonymousTask, 8);
              localObject2 = new SettableProducerContext(ImageRequestBuilder.fromRequest((ImageRequest)localObject1).setBytesRange(BytesRange.from(i - 1)).build(), paramProducerContext);
              PartialDiskCacheProducer.access$100(PartialDiskCacheProducer.this, paramConsumer, (ProducerContext)localObject2, paramCacheKey, paramAnonymousTask);
            }
          }
          else
          {
            localObject2 = val$listener;
            localObject1 = str;
            ((ProducerListener)localObject2).onProducerFinishWithSuccess((String)localObject1, "PartialDiskCacheProducer", PartialDiskCacheProducer.getExtraMap((ProducerListener)localObject2, (String)localObject1, false, 0));
            PartialDiskCacheProducer.access$100(PartialDiskCacheProducer.this, paramConsumer, paramProducerContext, paramCacheKey, paramAnonymousTask);
          }
        }
        return null;
      }
    };
  }
  
  private void startInputProducer(Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext, CacheKey paramCacheKey, @Nullable EncodedImage paramEncodedImage)
  {
    paramConsumer = new PartialDiskCacheConsumer(paramConsumer, mDefaultBufferedDiskCache, paramCacheKey, mPooledByteBufferFactory, mByteArrayPool, paramEncodedImage, null);
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
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
    Object localObject1 = paramProducerContext.getImageRequest();
    if (!((ImageRequest)localObject1).isDiskCacheEnabled())
    {
      mInputProducer.produceResults(paramConsumer, paramProducerContext);
      return;
    }
    paramProducerContext.getListener().onProducerStart(paramProducerContext.getId(), "PartialDiskCacheProducer");
    Object localObject2 = createUriForPartialCacheKey((ImageRequest)localObject1);
    localObject2 = mCacheKeyFactory.getEncodedCacheKey((ImageRequest)localObject1, (Uri)localObject2, paramProducerContext.getCallerContext());
    localObject1 = new AtomicBoolean(false);
    mDefaultBufferedDiskCache.get((CacheKey)localObject2, (AtomicBoolean)localObject1).continueWith(onFinishDiskReads(paramConsumer, paramProducerContext, (CacheKey)localObject2));
    subscribeTaskForRequestCancellation((AtomicBoolean)localObject1, paramProducerContext);
  }
  
  public static class PartialDiskCacheConsumer
    extends DelegatingConsumer<EncodedImage, EncodedImage>
  {
    private static final int READ_SIZE = 16384;
    private final ByteArrayPool mByteArrayPool;
    private final BufferedDiskCache mDefaultBufferedDiskCache;
    @Nullable
    private final EncodedImage mPartialEncodedImageFromCache;
    private final CacheKey mPartialImageCacheKey;
    private final PooledByteBufferFactory mPooledByteBufferFactory;
    
    private PartialDiskCacheConsumer(Consumer<EncodedImage> paramConsumer, BufferedDiskCache paramBufferedDiskCache, CacheKey paramCacheKey, PooledByteBufferFactory paramPooledByteBufferFactory, ByteArrayPool paramByteArrayPool, @Nullable EncodedImage paramEncodedImage)
    {
      super();
      mDefaultBufferedDiskCache = paramBufferedDiskCache;
      mPartialImageCacheKey = paramCacheKey;
      mPooledByteBufferFactory = paramPooledByteBufferFactory;
      mByteArrayPool = paramByteArrayPool;
      mPartialEncodedImageFromCache = paramEncodedImage;
    }
    
    private void copy(InputStream paramInputStream, OutputStream paramOutputStream, int paramInt)
      throws IOException
    {
      byte[] arrayOfByte = (byte[])mByteArrayPool.get(16384);
      int i = paramInt;
      while (i > 0) {
        try
        {
          int j = paramInputStream.read(arrayOfByte, 0, Math.min(16384, i));
          if (j >= 0)
          {
            if (j <= 0) {
              continue;
            }
            paramOutputStream.write(arrayOfByte, 0, j);
            i -= j;
          }
        }
        finally
        {
          mByteArrayPool.release(arrayOfByte);
        }
      }
      mByteArrayPool.release(arrayOfByte);
      if (i <= 0) {
        return;
      }
      throw new IOException(String.format(null, "Failed to read %d bytes - finished %d short", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) }));
    }
    
    private PooledByteBufferOutputStream merge(EncodedImage paramEncodedImage1, EncodedImage paramEncodedImage2)
      throws IOException
    {
      int i = paramEncodedImage2.getSize();
      int j = getBytesRangefrom;
      PooledByteBufferOutputStream localPooledByteBufferOutputStream = mPooledByteBufferFactory.newOutputStream(i + j);
      j = getBytesRangefrom;
      copy(paramEncodedImage1.getInputStream(), localPooledByteBufferOutputStream, j);
      copy(paramEncodedImage2.getInputStream(), localPooledByteBufferOutputStream, paramEncodedImage2.getSize());
      return localPooledByteBufferOutputStream;
    }
    
    /* Error */
    private void sendFinalResultToConsumer(PooledByteBufferOutputStream paramPooledByteBufferOutputStream)
    {
      // Byte code:
      //   0: aload_1
      //   1: invokevirtual 135	com/facebook/common/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/common/memory/PooledByteBuffer;
      //   4: invokestatic 141	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
      //   7: astore_2
      //   8: new 102	com/facebook/imagepipeline/image/EncodedImage
      //   11: astore_3
      //   12: aload_3
      //   13: aload_2
      //   14: invokespecial 144	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
      //   17: aload_3
      //   18: invokevirtual 148	com/facebook/imagepipeline/image/EncodedImage:parseMetaData	()V
      //   21: aload_0
      //   22: invokevirtual 152	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   25: aload_3
      //   26: iconst_1
      //   27: invokeinterface 158 3 0
      //   32: aload_3
      //   33: invokestatic 162	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   36: aload_2
      //   37: invokestatic 164	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   40: return
      //   41: astore_1
      //   42: goto +6 -> 48
      //   45: astore_1
      //   46: aconst_null
      //   47: astore_3
      //   48: aload_3
      //   49: invokestatic 162	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   52: aload_2
      //   53: invokestatic 164	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   56: aload_1
      //   57: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	58	0	this	PartialDiskCacheConsumer
      //   0	58	1	paramPooledByteBufferOutputStream	PooledByteBufferOutputStream
      //   7	46	2	localCloseableReference	com.facebook.common.references.CloseableReference
      //   11	38	3	localEncodedImage	EncodedImage
      // Exception table:
      //   from	to	target	type
      //   17	32	41	finally
      //   8	17	45	finally
    }
    
    /* Error */
    public void onNewResultImpl(EncodedImage paramEncodedImage, int paramInt)
    {
      // Byte code:
      //   0: iload_2
      //   1: invokestatic 172	com/facebook/imagepipeline/producers/BaseConsumer:isNotLast	(I)Z
      //   4: ifeq +4 -> 8
      //   7: return
      //   8: aload_0
      //   9: getfield 37	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialEncodedImageFromCache	Lcom/facebook/imagepipeline/image/EncodedImage;
      //   12: ifnull +91 -> 103
      //   15: aload_1
      //   16: invokevirtual 110	com/facebook/imagepipeline/image/EncodedImage:getBytesRange	()Lcom/facebook/imagepipeline/common/BytesRange;
      //   19: ifnull +84 -> 103
      //   22: aload_0
      //   23: aload_0
      //   24: aload_0
      //   25: getfield 37	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialEncodedImageFromCache	Lcom/facebook/imagepipeline/image/EncodedImage;
      //   28: aload_1
      //   29: invokespecial 174	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:merge	(Lcom/facebook/imagepipeline/image/EncodedImage;Lcom/facebook/imagepipeline/image/EncodedImage;)Lcom/facebook/common/memory/PooledByteBufferOutputStream;
      //   32: invokespecial 176	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:sendFinalResultToConsumer	(Lcom/facebook/common/memory/PooledByteBufferOutputStream;)V
      //   35: aload_1
      //   36: invokevirtual 179	com/facebook/imagepipeline/image/EncodedImage:close	()V
      //   39: aload_0
      //   40: getfield 37	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialEncodedImageFromCache	Lcom/facebook/imagepipeline/image/EncodedImage;
      //   43: invokevirtual 179	com/facebook/imagepipeline/image/EncodedImage:close	()V
      //   46: goto +29 -> 75
      //   49: astore_3
      //   50: goto +40 -> 90
      //   53: astore_3
      //   54: ldc -75
      //   56: ldc -73
      //   58: aload_3
      //   59: invokestatic 189	com/facebook/common/logging/FLog:e	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
      //   62: aload_0
      //   63: invokevirtual 152	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   66: aload_3
      //   67: invokeinterface 193 2 0
      //   72: goto -37 -> 35
      //   75: aload_0
      //   76: getfield 29	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mDefaultBufferedDiskCache	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
      //   79: aload_0
      //   80: getfield 31	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialImageCacheKey	Lcom/facebook/cache/common/CacheKey;
      //   83: invokevirtual 199	com/facebook/imagepipeline/cache/BufferedDiskCache:remove	(Lcom/facebook/cache/common/CacheKey;)Lbolts/Task;
      //   86: pop
      //   87: goto +69 -> 156
      //   90: aload_1
      //   91: invokevirtual 179	com/facebook/imagepipeline/image/EncodedImage:close	()V
      //   94: aload_0
      //   95: getfield 37	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialEncodedImageFromCache	Lcom/facebook/imagepipeline/image/EncodedImage;
      //   98: invokevirtual 179	com/facebook/imagepipeline/image/EncodedImage:close	()V
      //   101: aload_3
      //   102: athrow
      //   103: iload_2
      //   104: bipush 8
      //   106: invokestatic 203	com/facebook/imagepipeline/producers/BaseConsumer:statusHasFlag	(II)Z
      //   109: ifeq +36 -> 145
      //   112: iload_2
      //   113: invokestatic 206	com/facebook/imagepipeline/producers/BaseConsumer:isLast	(I)Z
      //   116: ifeq +29 -> 145
      //   119: aload_0
      //   120: getfield 29	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mDefaultBufferedDiskCache	Lcom/facebook/imagepipeline/cache/BufferedDiskCache;
      //   123: aload_0
      //   124: getfield 31	com/facebook/imagepipeline/producers/PartialDiskCacheProducer$PartialDiskCacheConsumer:mPartialImageCacheKey	Lcom/facebook/cache/common/CacheKey;
      //   127: aload_1
      //   128: invokevirtual 210	com/facebook/imagepipeline/cache/BufferedDiskCache:put	(Lcom/facebook/cache/common/CacheKey;Lcom/facebook/imagepipeline/image/EncodedImage;)V
      //   131: aload_0
      //   132: invokevirtual 152	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   135: aload_1
      //   136: iload_2
      //   137: invokeinterface 158 3 0
      //   142: goto +14 -> 156
      //   145: aload_0
      //   146: invokevirtual 152	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   149: aload_1
      //   150: iload_2
      //   151: invokeinterface 158 3 0
      //   156: return
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	157	0	this	PartialDiskCacheConsumer
      //   0	157	1	paramEncodedImage	EncodedImage
      //   0	157	2	paramInt	int
      //   49	1	3	localObject	Object
      //   53	49	3	localIOException	IOException
      // Exception table:
      //   from	to	target	type
      //   22	35	49	finally
      //   54	72	49	finally
      //   22	35	53	java/io/IOException
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PartialDiskCacheProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */