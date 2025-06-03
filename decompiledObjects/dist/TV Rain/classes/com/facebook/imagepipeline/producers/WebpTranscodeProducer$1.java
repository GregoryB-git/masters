package com.facebook.imagepipeline.producers;

import com.facebook.imagepipeline.image.EncodedImage;

class WebpTranscodeProducer$1
  extends StatefulProducerRunnable<EncodedImage>
{
  public WebpTranscodeProducer$1(WebpTranscodeProducer paramWebpTranscodeProducer, Consumer paramConsumer, ProducerListener paramProducerListener, String paramString1, String paramString2, EncodedImage paramEncodedImage)
  {
    super(paramConsumer, paramProducerListener, paramString1, paramString2);
  }
  
  public void disposeResult(EncodedImage paramEncodedImage)
  {
    EncodedImage.closeSafely(paramEncodedImage);
  }
  
  /* Error */
  public EncodedImage getResult()
    throws Exception
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 18	com/facebook/imagepipeline/producers/WebpTranscodeProducer$1:this$0	Lcom/facebook/imagepipeline/producers/WebpTranscodeProducer;
    //   4: invokestatic 42	com/facebook/imagepipeline/producers/WebpTranscodeProducer:access$200	(Lcom/facebook/imagepipeline/producers/WebpTranscodeProducer;)Lcom/facebook/common/memory/PooledByteBufferFactory;
    //   7: invokeinterface 48 1 0
    //   12: astore_1
    //   13: aload_0
    //   14: getfield 20	com/facebook/imagepipeline/producers/WebpTranscodeProducer$1:val$encodedImageCopy	Lcom/facebook/imagepipeline/image/EncodedImage;
    //   17: aload_1
    //   18: invokestatic 52	com/facebook/imagepipeline/producers/WebpTranscodeProducer:access$300	(Lcom/facebook/imagepipeline/image/EncodedImage;Lcom/facebook/common/memory/PooledByteBufferOutputStream;)V
    //   21: aload_1
    //   22: invokevirtual 58	com/facebook/common/memory/PooledByteBufferOutputStream:toByteBuffer	()Lcom/facebook/common/memory/PooledByteBuffer;
    //   25: invokestatic 64	com/facebook/common/references/CloseableReference:of	(Ljava/io/Closeable;)Lcom/facebook/common/references/CloseableReference;
    //   28: astore_2
    //   29: new 28	com/facebook/imagepipeline/image/EncodedImage
    //   32: astore_3
    //   33: aload_3
    //   34: aload_2
    //   35: invokespecial 67	com/facebook/imagepipeline/image/EncodedImage:<init>	(Lcom/facebook/common/references/CloseableReference;)V
    //   38: aload_3
    //   39: aload_0
    //   40: getfield 20	com/facebook/imagepipeline/producers/WebpTranscodeProducer$1:val$encodedImageCopy	Lcom/facebook/imagepipeline/image/EncodedImage;
    //   43: invokevirtual 70	com/facebook/imagepipeline/image/EncodedImage:copyMetaDataFrom	(Lcom/facebook/imagepipeline/image/EncodedImage;)V
    //   46: aload_2
    //   47: invokestatic 72	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   50: aload_1
    //   51: invokevirtual 76	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   54: aload_3
    //   55: areturn
    //   56: astore_3
    //   57: aload_2
    //   58: invokestatic 72	com/facebook/common/references/CloseableReference:closeSafely	(Lcom/facebook/common/references/CloseableReference;)V
    //   61: aload_3
    //   62: athrow
    //   63: astore_2
    //   64: aload_1
    //   65: invokevirtual 76	com/facebook/common/memory/PooledByteBufferOutputStream:close	()V
    //   68: aload_2
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	this	1
    //   12	53	1	localPooledByteBufferOutputStream	com.facebook.common.memory.PooledByteBufferOutputStream
    //   28	30	2	localCloseableReference	com.facebook.common.references.CloseableReference
    //   63	6	2	localObject1	Object
    //   32	23	3	localEncodedImage	EncodedImage
    //   56	6	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   29	46	56	finally
    //   13	29	63	finally
    //   46	50	63	finally
    //   57	63	63	finally
  }
  
  public void onCancellation()
  {
    EncodedImage.closeSafely(val$encodedImageCopy);
    super.onCancellation();
  }
  
  public void onFailure(Exception paramException)
  {
    EncodedImage.closeSafely(val$encodedImageCopy);
    super.onFailure(paramException);
  }
  
  public void onSuccess(EncodedImage paramEncodedImage)
  {
    EncodedImage.closeSafely(val$encodedImageCopy);
    super.onSuccess(paramEncodedImage);
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.WebpTranscodeProducer.1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */