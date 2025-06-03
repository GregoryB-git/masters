package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.memory.ByteArrayPool;
import com.facebook.common.memory.Pool;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.imagepipeline.image.EncodedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Map;
import javax.annotation.Nullable;

public class NetworkFetchProducer
  implements Producer<EncodedImage>
{
  public static final String INTERMEDIATE_RESULT_PRODUCER_EVENT = "intermediate_result";
  public static final String PRODUCER_NAME = "NetworkFetchProducer";
  private static final int READ_SIZE = 16384;
  @VisibleForTesting
  public static final long TIME_BETWEEN_PARTIAL_RESULTS_MS = 100L;
  private final ByteArrayPool mByteArrayPool;
  private final NetworkFetcher mNetworkFetcher;
  private final PooledByteBufferFactory mPooledByteBufferFactory;
  
  public NetworkFetchProducer(PooledByteBufferFactory paramPooledByteBufferFactory, ByteArrayPool paramByteArrayPool, NetworkFetcher paramNetworkFetcher)
  {
    mPooledByteBufferFactory = paramPooledByteBufferFactory;
    mByteArrayPool = paramByteArrayPool;
    mNetworkFetcher = paramNetworkFetcher;
  }
  
  public static float calculateProgress(int paramInt1, int paramInt2)
  {
    if (paramInt2 > 0) {
      return paramInt1 / paramInt2;
    }
    return 1.0F - (float)Math.exp(-paramInt1 / 50000.0D);
  }
  
  @Nullable
  private Map<String, String> getExtraMap(FetchState paramFetchState, int paramInt)
  {
    if (!paramFetchState.getListener().requiresExtraMap(paramFetchState.getId())) {
      return null;
    }
    return mNetworkFetcher.getExtraMap(paramFetchState, paramInt);
  }
  
  /* Error */
  private void notifyConsumer(PooledByteBufferOutputStream paramPooledByteBufferOutputStream, int paramInt, @Nullable com.facebook.imagepipeline.common.BytesRange paramBytesRange, Consumer<EncodedImage> paramConsumer)
  {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual 98	com/facebook/common/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/common/memory/PooledByteBuffer;
    //   4: invokestatic 104	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
    //   7: astore 5
    //   9: aconst_null
    //   10: astore 6
    //   12: new 106	com/facebook/imagepipeline/image/EncodedImage
    //   15: astore 7
    //   17: aload 7
    //   19: aload 5
    //   21: invokespecial 109	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
    //   24: aload 7
    //   26: aload_3
    //   27: invokevirtual 113	com/facebook/imagepipeline/image/EncodedImage:setBytesRange	(Lcom/facebook/imagepipeline/common/BytesRange;)V
    //   30: aload 7
    //   32: invokevirtual 116	com/facebook/imagepipeline/image/EncodedImage:parseMetaData	()V
    //   35: aload 4
    //   37: aload 7
    //   39: iload_2
    //   40: invokeinterface 122 3 0
    //   45: aload 7
    //   47: invokestatic 126	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   50: aload 5
    //   52: invokestatic 128	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   55: return
    //   56: astore_1
    //   57: aload 7
    //   59: astore_3
    //   60: goto +7 -> 67
    //   63: astore_1
    //   64: aload 6
    //   66: astore_3
    //   67: aload_3
    //   68: invokestatic 126	com/facebook/imagepipeline/image/EncodedImage:closeSafely	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   71: aload 5
    //   73: invokestatic 128	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   76: aload_1
    //   77: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	78	0	this	NetworkFetchProducer
    //   0	78	1	paramPooledByteBufferOutputStream	PooledByteBufferOutputStream
    //   0	78	2	paramInt	int
    //   0	78	3	paramBytesRange	com.facebook.imagepipeline.common.BytesRange
    //   0	78	4	paramConsumer	Consumer<EncodedImage>
    //   7	65	5	localCloseableReference	com.facebook.common.references.CloseableReference
    //   10	55	6	localObject	Object
    //   15	43	7	localEncodedImage	EncodedImage
    // Exception table:
    //   from	to	target	type
    //   24	45	56	finally
    //   12	24	63	finally
  }
  
  private void onCancellation(FetchState paramFetchState)
  {
    paramFetchState.getListener().onProducerFinishWithCancellation(paramFetchState.getId(), "NetworkFetchProducer", null);
    paramFetchState.getConsumer().onCancellation();
  }
  
  private void onFailure(FetchState paramFetchState, Throwable paramThrowable)
  {
    paramFetchState.getListener().onProducerFinishWithFailure(paramFetchState.getId(), "NetworkFetchProducer", paramThrowable, null);
    paramFetchState.getListener().onUltimateProducerReached(paramFetchState.getId(), "NetworkFetchProducer", false);
    paramFetchState.getConsumer().onFailure(paramThrowable);
  }
  
  private boolean shouldPropagateIntermediateResults(FetchState paramFetchState)
  {
    if (!paramFetchState.getContext().isIntermediateResultExpected()) {
      return false;
    }
    return mNetworkFetcher.shouldPropagate(paramFetchState);
  }
  
  public void handleFinalResult(PooledByteBufferOutputStream paramPooledByteBufferOutputStream, FetchState paramFetchState)
  {
    Map localMap = getExtraMap(paramFetchState, paramPooledByteBufferOutputStream.size());
    ProducerListener localProducerListener = paramFetchState.getListener();
    localProducerListener.onProducerFinishWithSuccess(paramFetchState.getId(), "NetworkFetchProducer", localMap);
    localProducerListener.onUltimateProducerReached(paramFetchState.getId(), "NetworkFetchProducer", true);
    notifyConsumer(paramPooledByteBufferOutputStream, paramFetchState.getOnNewResultStatusFlags() | 0x1, paramFetchState.getResponseBytesRange(), paramFetchState.getConsumer());
  }
  
  public void maybeHandleIntermediateResult(PooledByteBufferOutputStream paramPooledByteBufferOutputStream, FetchState paramFetchState)
  {
    long l = SystemClock.uptimeMillis();
    if ((shouldPropagateIntermediateResults(paramFetchState)) && (l - paramFetchState.getLastIntermediateResultTimeMs() >= 100L))
    {
      paramFetchState.setLastIntermediateResultTimeMs(l);
      paramFetchState.getListener().onProducerEvent(paramFetchState.getId(), "NetworkFetchProducer", "intermediate_result");
      notifyConsumer(paramPooledByteBufferOutputStream, paramFetchState.getOnNewResultStatusFlags(), paramFetchState.getResponseBytesRange(), paramFetchState.getConsumer());
    }
  }
  
  public void onResponse(FetchState paramFetchState, InputStream paramInputStream, int paramInt)
    throws IOException
  {
    PooledByteBufferOutputStream localPooledByteBufferOutputStream;
    if (paramInt > 0) {
      localPooledByteBufferOutputStream = mPooledByteBufferFactory.newOutputStream(paramInt);
    } else {
      localPooledByteBufferOutputStream = mPooledByteBufferFactory.newOutputStream();
    }
    byte[] arrayOfByte = (byte[])mByteArrayPool.get(16384);
    try
    {
      for (;;)
      {
        int i = paramInputStream.read(arrayOfByte);
        if (i < 0) {
          break;
        }
        if (i > 0)
        {
          localPooledByteBufferOutputStream.write(arrayOfByte, 0, i);
          maybeHandleIntermediateResult(localPooledByteBufferOutputStream, paramFetchState);
          float f = calculateProgress(localPooledByteBufferOutputStream.size(), paramInt);
          paramFetchState.getConsumer().onProgressUpdate(f);
        }
      }
      mNetworkFetcher.onFetchCompletion(paramFetchState, localPooledByteBufferOutputStream.size());
      handleFinalResult(localPooledByteBufferOutputStream, paramFetchState);
      return;
    }
    finally
    {
      mByteArrayPool.release(arrayOfByte);
      localPooledByteBufferOutputStream.close();
    }
  }
  
  public void produceResults(final Consumer<EncodedImage> paramConsumer, ProducerContext paramProducerContext)
  {
    paramProducerContext.getListener().onProducerStart(paramProducerContext.getId(), "NetworkFetchProducer");
    paramConsumer = mNetworkFetcher.createFetchState(paramConsumer, paramProducerContext);
    mNetworkFetcher.fetch(paramConsumer, new NetworkFetcher.Callback()
    {
      public void onCancellation()
      {
        NetworkFetchProducer.access$100(NetworkFetchProducer.this, paramConsumer);
      }
      
      public void onFailure(Throwable paramAnonymousThrowable)
      {
        NetworkFetchProducer.access$000(NetworkFetchProducer.this, paramConsumer, paramAnonymousThrowable);
      }
      
      public void onResponse(InputStream paramAnonymousInputStream, int paramAnonymousInt)
        throws IOException
      {
        onResponse(paramConsumer, paramAnonymousInputStream, paramAnonymousInt);
      }
    });
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.NetworkFetchProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */