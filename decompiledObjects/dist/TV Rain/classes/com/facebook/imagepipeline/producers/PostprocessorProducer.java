package com.facebook.imagepipeline.producers;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.Postprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import java.util.Map;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public class PostprocessorProducer
  implements Producer<CloseableReference<CloseableImage>>
{
  public static final String NAME = "PostprocessorProducer";
  @VisibleForTesting
  public static final String POSTPROCESSOR = "Postprocessor";
  private final PlatformBitmapFactory mBitmapFactory;
  private final Executor mExecutor;
  private final Producer<CloseableReference<CloseableImage>> mInputProducer;
  
  public PostprocessorProducer(Producer<CloseableReference<CloseableImage>> paramProducer, PlatformBitmapFactory paramPlatformBitmapFactory, Executor paramExecutor)
  {
    mInputProducer = ((Producer)Preconditions.checkNotNull(paramProducer));
    mBitmapFactory = paramPlatformBitmapFactory;
    mExecutor = ((Executor)Preconditions.checkNotNull(paramExecutor));
  }
  
  public void produceResults(Consumer<CloseableReference<CloseableImage>> paramConsumer, ProducerContext paramProducerContext)
  {
    ProducerListener localProducerListener = paramProducerContext.getListener();
    Postprocessor localPostprocessor = paramProducerContext.getImageRequest().getPostprocessor();
    paramConsumer = new PostprocessorConsumer(paramConsumer, localProducerListener, paramProducerContext.getId(), localPostprocessor, paramProducerContext);
    if ((localPostprocessor instanceof RepeatedPostprocessor)) {
      paramConsumer = new RepeatedPostprocessorConsumer(paramConsumer, (RepeatedPostprocessor)localPostprocessor, paramProducerContext, null);
    } else {
      paramConsumer = new SingleUsePostprocessorConsumer(paramConsumer, null);
    }
    mInputProducer.produceResults(paramConsumer, paramProducerContext);
  }
  
  public class PostprocessorConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  {
    @GuardedBy("PostprocessorConsumer.this")
    private boolean mIsClosed;
    @GuardedBy("PostprocessorConsumer.this")
    private boolean mIsDirty = false;
    @GuardedBy("PostprocessorConsumer.this")
    private boolean mIsPostProcessingRunning = false;
    private final ProducerListener mListener;
    private final Postprocessor mPostprocessor;
    private final String mRequestId;
    @Nullable
    @GuardedBy("PostprocessorConsumer.this")
    private CloseableReference<CloseableImage> mSourceImageRef = null;
    @GuardedBy("PostprocessorConsumer.this")
    private int mStatus = 0;
    
    public PostprocessorConsumer(ProducerListener paramProducerListener, String paramString, Postprocessor paramPostprocessor, ProducerContext paramProducerContext)
    {
      super();
      mListener = paramString;
      mRequestId = paramPostprocessor;
      mPostprocessor = paramProducerContext;
      Object localObject;
      ((ProducerContext)localObject).addCallbacks(new BaseProducerContextCallbacks()
      {
        public void onCancellationRequested()
        {
          PostprocessorProducer.PostprocessorConsumer.access$200(PostprocessorProducer.PostprocessorConsumer.this);
        }
      });
    }
    
    private void clearRunningAndStartIfDirty()
    {
      try
      {
        mIsPostProcessingRunning = false;
        boolean bool = setRunningIfDirtyAndNotRunning();
        if (bool) {
          submitPostprocessing();
        }
        return;
      }
      finally {}
    }
    
    private boolean close()
    {
      try
      {
        if (mIsClosed) {
          return false;
        }
        CloseableReference localCloseableReference = mSourceImageRef;
        mSourceImageRef = null;
        mIsClosed = true;
        CloseableReference.closeSafely(localCloseableReference);
        return true;
      }
      finally {}
    }
    
    /* Error */
    private void doPostprocessing(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      // Byte code:
      //   0: aload_1
      //   1: invokestatic 112	com/facebook/common/references/CloseableReference:isValid	(Lcom/facebook/common/references/CloseableReference;)Z
      //   4: invokestatic 118	com/facebook/common/internal/Preconditions:checkArgument	(Z)V
      //   7: aload_0
      //   8: aload_1
      //   9: invokevirtual 122	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
      //   12: checkcast 124	com/facebook/imagepipeline/image/CloseableImage
      //   15: invokespecial 128	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:shouldPostprocess	(Lcom/facebook/imagepipeline/image/CloseableImage;)Z
      //   18: ifne +10 -> 28
      //   21: aload_0
      //   22: aload_1
      //   23: iload_2
      //   24: invokespecial 131	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:maybeNotifyOnNewResult	(Lcom/facebook/common/references/CloseableReference;I)V
      //   27: return
      //   28: aload_0
      //   29: getfield 50	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   32: aload_0
      //   33: getfield 52	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mRequestId	Ljava/lang/String;
      //   36: ldc -123
      //   38: invokeinterface 139 3 0
      //   43: aconst_null
      //   44: astore_3
      //   45: aload_3
      //   46: astore 4
      //   48: aload_0
      //   49: aload_1
      //   50: invokevirtual 122	com/facebook/common/references/CloseableReference:get	()Ljava/lang/Object;
      //   53: checkcast 124	com/facebook/imagepipeline/image/CloseableImage
      //   56: invokespecial 143	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:postprocessInternal	(Lcom/facebook/imagepipeline/image/CloseableImage;)Lcom/facebook/common/references/CloseableReference;
      //   59: astore_1
      //   60: aload_1
      //   61: astore 4
      //   63: aload_0
      //   64: getfield 50	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   67: astore_3
      //   68: aload_1
      //   69: astore 4
      //   71: aload_0
      //   72: getfield 52	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mRequestId	Ljava/lang/String;
      //   75: astore 5
      //   77: aload_1
      //   78: astore 4
      //   80: aload_3
      //   81: aload 5
      //   83: ldc -123
      //   85: aload_0
      //   86: aload_3
      //   87: aload 5
      //   89: aload_0
      //   90: getfield 54	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mPostprocessor	Lcom/facebook/imagepipeline/request/Postprocessor;
      //   93: invokespecial 147	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:getExtraMap	(Lcom/facebook/imagepipeline/producers/ProducerListener;Ljava/lang/String;Lcom/facebook/imagepipeline/request/Postprocessor;)Ljava/util/Map;
      //   96: invokeinterface 151 4 0
      //   101: aload_1
      //   102: astore 4
      //   104: aload_0
      //   105: aload_1
      //   106: iload_2
      //   107: invokespecial 131	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:maybeNotifyOnNewResult	(Lcom/facebook/common/references/CloseableReference;I)V
      //   110: aload_1
      //   111: invokestatic 106	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   114: return
      //   115: astore_1
      //   116: goto +62 -> 178
      //   119: astore_1
      //   120: aload_3
      //   121: astore 4
      //   123: aload_0
      //   124: getfield 50	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mListener	Lcom/facebook/imagepipeline/producers/ProducerListener;
      //   127: astore 6
      //   129: aload_3
      //   130: astore 4
      //   132: aload_0
      //   133: getfield 52	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mRequestId	Ljava/lang/String;
      //   136: astore 5
      //   138: aload_3
      //   139: astore 4
      //   141: aload 6
      //   143: aload 5
      //   145: ldc -123
      //   147: aload_1
      //   148: aload_0
      //   149: aload 6
      //   151: aload 5
      //   153: aload_0
      //   154: getfield 54	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:mPostprocessor	Lcom/facebook/imagepipeline/request/Postprocessor;
      //   157: invokespecial 147	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:getExtraMap	(Lcom/facebook/imagepipeline/producers/ProducerListener;Ljava/lang/String;Lcom/facebook/imagepipeline/request/Postprocessor;)Ljava/util/Map;
      //   160: invokeinterface 155 5 0
      //   165: aload_3
      //   166: astore 4
      //   168: aload_0
      //   169: aload_1
      //   170: invokespecial 159	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:maybeNotifyOnFailure	(Ljava/lang/Throwable;)V
      //   173: aconst_null
      //   174: invokestatic 106	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   177: return
      //   178: aload 4
      //   180: invokestatic 106	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   183: aload_1
      //   184: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	185	0	this	PostprocessorConsumer
      //   0	185	1	paramCloseableReference	CloseableReference<CloseableImage>
      //   0	185	2	paramInt	int
      //   44	122	3	localProducerListener1	ProducerListener
      //   46	133	4	localObject	Object
      //   75	77	5	str	String
      //   127	23	6	localProducerListener2	ProducerListener
      // Exception table:
      //   from	to	target	type
      //   48	60	115	finally
      //   63	68	115	finally
      //   71	77	115	finally
      //   80	101	115	finally
      //   104	110	115	finally
      //   123	129	115	finally
      //   132	138	115	finally
      //   141	165	115	finally
      //   168	173	115	finally
      //   48	60	119	java/lang/Exception
    }
    
    private Map<String, String> getExtraMap(ProducerListener paramProducerListener, String paramString, Postprocessor paramPostprocessor)
    {
      if (!paramProducerListener.requiresExtraMap(paramString)) {
        return null;
      }
      return ImmutableMap.of("Postprocessor", paramPostprocessor.getName());
    }
    
    private boolean isClosed()
    {
      try
      {
        boolean bool = mIsClosed;
        return bool;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private void maybeNotifyOnCancellation()
    {
      if (close()) {
        getConsumer().onCancellation();
      }
    }
    
    private void maybeNotifyOnFailure(Throwable paramThrowable)
    {
      if (close()) {
        getConsumer().onFailure(paramThrowable);
      }
    }
    
    private void maybeNotifyOnNewResult(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      boolean bool = BaseConsumer.isLast(paramInt);
      if (((!bool) && (!isClosed())) || ((bool) && (close()))) {
        getConsumer().onNewResult(paramCloseableReference, paramInt);
      }
    }
    
    private CloseableReference<CloseableImage> postprocessInternal(CloseableImage paramCloseableImage)
    {
      CloseableStaticBitmap localCloseableStaticBitmap = (CloseableStaticBitmap)paramCloseableImage;
      Object localObject = localCloseableStaticBitmap.getUnderlyingBitmap();
      localObject = mPostprocessor.process((Bitmap)localObject, PostprocessorProducer.access$900(PostprocessorProducer.this));
      int i = localCloseableStaticBitmap.getRotationAngle();
      int j = localCloseableStaticBitmap.getExifOrientation();
      try
      {
        localCloseableStaticBitmap = new com/facebook/imagepipeline/image/CloseableStaticBitmap;
        localCloseableStaticBitmap.<init>((CloseableReference)localObject, paramCloseableImage.getQualityInfo(), i, j);
        paramCloseableImage = CloseableReference.of(localCloseableStaticBitmap);
        return paramCloseableImage;
      }
      finally
      {
        CloseableReference.closeSafely((CloseableReference)localObject);
      }
    }
    
    private boolean setRunningIfDirtyAndNotRunning()
    {
      try
      {
        if ((!mIsClosed) && (mIsDirty) && (!mIsPostProcessingRunning) && (CloseableReference.isValid(mSourceImageRef)))
        {
          mIsPostProcessingRunning = true;
          return true;
        }
        return false;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
    
    private boolean shouldPostprocess(CloseableImage paramCloseableImage)
    {
      return paramCloseableImage instanceof CloseableStaticBitmap;
    }
    
    private void submitPostprocessing()
    {
      PostprocessorProducer.access$800(PostprocessorProducer.this).execute(new Runnable()
      {
        /* Error */
        public void run()
        {
          // Byte code:
          //   0: aload_0
          //   1: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   4: astore_1
          //   5: aload_1
          //   6: monitorenter
          //   7: aload_0
          //   8: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   11: invokestatic 28	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$300	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;)Lcom/facebook/common/references/CloseableReference;
          //   14: astore_2
          //   15: aload_0
          //   16: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   19: invokestatic 32	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$400	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;)I
          //   22: istore_3
          //   23: aload_0
          //   24: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   27: aconst_null
          //   28: invokestatic 36	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$302	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;
          //   31: pop
          //   32: aload_0
          //   33: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   36: iconst_0
          //   37: invokestatic 40	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$502	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;Z)Z
          //   40: pop
          //   41: aload_1
          //   42: monitorexit
          //   43: aload_2
          //   44: invokestatic 46	com/facebook/common/references/CloseableReference:isValid	(Lcom/facebook/common/references/CloseableReference;)Z
          //   47: ifeq +26 -> 73
          //   50: aload_0
          //   51: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   54: aload_2
          //   55: iload_3
          //   56: invokestatic 50	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$600	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;Lcom/facebook/common/references/CloseableReference;I)V
          //   59: aload_2
          //   60: invokestatic 54	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
          //   63: goto +10 -> 73
          //   66: astore_1
          //   67: aload_2
          //   68: invokestatic 54	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
          //   71: aload_1
          //   72: athrow
          //   73: aload_0
          //   74: getfield 20	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer$2:this$1	Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;
          //   77: invokestatic 57	com/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer:access$700	(Lcom/facebook/imagepipeline/producers/PostprocessorProducer$PostprocessorConsumer;)V
          //   80: return
          //   81: astore_2
          //   82: aload_1
          //   83: monitorexit
          //   84: aload_2
          //   85: athrow
          // Local variable table:
          //   start	length	slot	name	signature
          //   0	86	0	this	2
          //   4	38	1	localPostprocessorConsumer	PostprocessorProducer.PostprocessorConsumer
          //   66	17	1	localObject1	Object
          //   14	54	2	localCloseableReference	CloseableReference
          //   81	4	2	localObject2	Object
          //   22	34	3	i	int
          // Exception table:
          //   from	to	target	type
          //   50	59	66	finally
          //   7	43	81	finally
          //   82	84	81	finally
        }
      });
    }
    
    private void updateSourceImageRef(@Nullable CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      try
      {
        if (mIsClosed) {
          return;
        }
        CloseableReference localCloseableReference = mSourceImageRef;
        mSourceImageRef = CloseableReference.cloneOrNull(paramCloseableReference);
        mStatus = paramInt;
        mIsDirty = true;
        boolean bool = setRunningIfDirtyAndNotRunning();
        CloseableReference.closeSafely(localCloseableReference);
        if (bool) {
          submitPostprocessing();
        }
        return;
      }
      finally {}
    }
    
    public void onCancellationImpl()
    {
      maybeNotifyOnCancellation();
    }
    
    public void onFailureImpl(Throwable paramThrowable)
    {
      maybeNotifyOnFailure(paramThrowable);
    }
    
    public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      if (!CloseableReference.isValid(paramCloseableReference))
      {
        if (BaseConsumer.isLast(paramInt)) {
          maybeNotifyOnNewResult(null, paramInt);
        }
        return;
      }
      updateSourceImageRef(paramCloseableReference, paramInt);
    }
  }
  
  public class RepeatedPostprocessorConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
    implements RepeatedPostprocessorRunner
  {
    @GuardedBy("RepeatedPostprocessorConsumer.this")
    private boolean mIsClosed = false;
    @Nullable
    @GuardedBy("RepeatedPostprocessorConsumer.this")
    private CloseableReference<CloseableImage> mSourceImageRef = null;
    
    private RepeatedPostprocessorConsumer(PostprocessorProducer.PostprocessorConsumer paramPostprocessorConsumer, RepeatedPostprocessor paramRepeatedPostprocessor, ProducerContext paramProducerContext)
    {
      super();
      paramRepeatedPostprocessor.setCallback(this);
      paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
      {
        public void onCancellationRequested()
        {
          if (PostprocessorProducer.RepeatedPostprocessorConsumer.access$1000(PostprocessorProducer.RepeatedPostprocessorConsumer.this)) {
            getConsumer().onCancellation();
          }
        }
      });
    }
    
    private boolean close()
    {
      try
      {
        if (mIsClosed) {
          return false;
        }
        CloseableReference localCloseableReference = mSourceImageRef;
        mSourceImageRef = null;
        mIsClosed = true;
        CloseableReference.closeSafely(localCloseableReference);
        return true;
      }
      finally {}
    }
    
    private void setSourceImageRef(CloseableReference<CloseableImage> paramCloseableReference)
    {
      try
      {
        if (mIsClosed) {
          return;
        }
        CloseableReference localCloseableReference = mSourceImageRef;
        mSourceImageRef = CloseableReference.cloneOrNull(paramCloseableReference);
        CloseableReference.closeSafely(localCloseableReference);
        return;
      }
      finally {}
    }
    
    /* Error */
    private void updateInternal()
    {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield 32	com/facebook/imagepipeline/producers/PostprocessorProducer$RepeatedPostprocessorConsumer:mIsClosed	Z
      //   6: ifeq +6 -> 12
      //   9: aload_0
      //   10: monitorexit
      //   11: return
      //   12: aload_0
      //   13: getfield 34	com/facebook/imagepipeline/producers/PostprocessorProducer$RepeatedPostprocessorConsumer:mSourceImageRef	Lcom/facebook/common/references/CloseableReference;
      //   16: invokestatic 70	com/facebook/common/references/CloseableReference:cloneOrNull	(Lcom/facebook/common/references/CloseableReference;)Lcom/facebook/common/references/CloseableReference;
      //   19: astore_1
      //   20: aload_0
      //   21: monitorexit
      //   22: aload_0
      //   23: invokevirtual 78	com/facebook/imagepipeline/producers/DelegatingConsumer:getConsumer	()Lcom/facebook/imagepipeline/producers/Consumer;
      //   26: aload_1
      //   27: iconst_0
      //   28: invokeinterface 84 3 0
      //   33: aload_1
      //   34: invokestatic 65	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   37: return
      //   38: astore_2
      //   39: aload_1
      //   40: invokestatic 65	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
      //   43: aload_2
      //   44: athrow
      //   45: astore_1
      //   46: aload_0
      //   47: monitorexit
      //   48: aload_1
      //   49: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	50	0	this	RepeatedPostprocessorConsumer
      //   19	21	1	localCloseableReference	CloseableReference
      //   45	4	1	localObject1	Object
      //   38	6	2	localObject2	Object
      // Exception table:
      //   from	to	target	type
      //   22	33	38	finally
      //   2	11	45	finally
      //   12	22	45	finally
      //   46	48	45	finally
    }
    
    public void onCancellationImpl()
    {
      if (close()) {
        getConsumer().onCancellation();
      }
    }
    
    public void onFailureImpl(Throwable paramThrowable)
    {
      if (close()) {
        getConsumer().onFailure(paramThrowable);
      }
    }
    
    public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      if (BaseConsumer.isNotLast(paramInt)) {
        return;
      }
      setSourceImageRef(paramCloseableReference);
      updateInternal();
    }
    
    public void update()
    {
      try
      {
        updateInternal();
        return;
      }
      finally
      {
        localObject = finally;
        throw ((Throwable)localObject);
      }
    }
  }
  
  public class SingleUsePostprocessorConsumer
    extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  {
    private SingleUsePostprocessorConsumer(PostprocessorProducer.PostprocessorConsumer paramPostprocessorConsumer)
    {
      super();
    }
    
    public void onNewResultImpl(CloseableReference<CloseableImage> paramCloseableReference, int paramInt)
    {
      if (BaseConsumer.isNotLast(paramInt)) {
        return;
      }
      getConsumer().onNewResult(paramCloseableReference, paramInt);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessorProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */