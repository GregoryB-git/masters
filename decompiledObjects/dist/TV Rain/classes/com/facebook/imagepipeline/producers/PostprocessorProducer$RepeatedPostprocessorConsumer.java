package com.facebook.imagepipeline.producers;

import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.image.CloseableImage;
import com.facebook.imagepipeline.request.RepeatedPostprocessor;
import com.facebook.imagepipeline.request.RepeatedPostprocessorRunner;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

class PostprocessorProducer$RepeatedPostprocessorConsumer
  extends DelegatingConsumer<CloseableReference<CloseableImage>, CloseableReference<CloseableImage>>
  implements RepeatedPostprocessorRunner
{
  @GuardedBy("RepeatedPostprocessorConsumer.this")
  private boolean mIsClosed = false;
  @Nullable
  @GuardedBy("RepeatedPostprocessorConsumer.this")
  private CloseableReference<CloseableImage> mSourceImageRef = null;
  
  private PostprocessorProducer$RepeatedPostprocessorConsumer(final PostprocessorProducer paramPostprocessorProducer, PostprocessorProducer.PostprocessorConsumer paramPostprocessorConsumer, RepeatedPostprocessor paramRepeatedPostprocessor, ProducerContext paramProducerContext)
  {
    super(paramPostprocessorConsumer);
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

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessorProducer.RepeatedPostprocessorConsumer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */