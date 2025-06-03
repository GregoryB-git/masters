package com.facebook.imagepipeline.producers;

class PostprocessorProducer$PostprocessorConsumer$2
  implements Runnable
{
  public PostprocessorProducer$PostprocessorConsumer$2(PostprocessorProducer.PostprocessorConsumer paramPostprocessorConsumer) {}
  
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
    //   14	54	2	localCloseableReference	com.facebook.common.references.CloseableReference
    //   81	4	2	localObject2	Object
    //   22	34	3	i	int
    // Exception table:
    //   from	to	target	type
    //   50	59	66	finally
    //   7	43	81	finally
    //   82	84	81	finally
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.PostprocessorProducer.PostprocessorConsumer.2
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */