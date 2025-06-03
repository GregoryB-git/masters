package com.facebook.imagepipeline.producers;

import android.util.Pair;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.Sets;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.imagepipeline.common.Priority;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.ThreadSafe;

@ThreadSafe
public abstract class MultiplexProducer<K, T extends Closeable>
  implements Producer<T>
{
  private final Producer<T> mInputProducer;
  @VisibleForTesting
  @GuardedBy("this")
  public final Map<K, MultiplexProducer<K, T>.Multiplexer> mMultiplexers;
  
  public MultiplexProducer(Producer<T> paramProducer)
  {
    mInputProducer = paramProducer;
    mMultiplexers = new HashMap();
  }
  
  private MultiplexProducer<K, T>.Multiplexer createAndPutNewMultiplexer(K paramK)
  {
    try
    {
      Multiplexer localMultiplexer = new com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer;
      localMultiplexer.<init>(this, paramK);
      mMultiplexers.put(paramK, localMultiplexer);
      return localMultiplexer;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  private MultiplexProducer<K, T>.Multiplexer getExistingMultiplexer(K paramK)
  {
    try
    {
      paramK = (Multiplexer)mMultiplexers.get(paramK);
      return paramK;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  private void removeMultiplexer(K paramK, MultiplexProducer<K, T>.Multiplexer paramMultiplexProducer)
  {
    try
    {
      if (mMultiplexers.get(paramK) == paramMultiplexProducer) {
        mMultiplexers.remove(paramK);
      }
      return;
    }
    finally
    {
      paramK = finally;
      throw paramK;
    }
  }
  
  public abstract T cloneOrNull(T paramT);
  
  public abstract K getKey(ProducerContext paramProducerContext);
  
  public void produceResults(Consumer<T> paramConsumer, ProducerContext paramProducerContext)
  {
    Object localObject = getKey(paramProducerContext);
    for (;;)
    {
      int i = 0;
      try
      {
        Multiplexer localMultiplexer1 = getExistingMultiplexer(localObject);
        Multiplexer localMultiplexer2 = localMultiplexer1;
        if (localMultiplexer1 == null)
        {
          localMultiplexer2 = createAndPutNewMultiplexer(localObject);
          i = 1;
        }
        if (!localMultiplexer2.addNewConsumer(paramConsumer, paramProducerContext)) {
          continue;
        }
        if (i != 0) {
          Multiplexer.access$000(localMultiplexer2);
        }
        return;
      }
      finally {}
    }
  }
  
  @VisibleForTesting
  public class Multiplexer
  {
    private final CopyOnWriteArraySet<Pair<Consumer<T>, ProducerContext>> mConsumerContextPairs = Sets.newCopyOnWriteArraySet();
    @Nullable
    @GuardedBy("Multiplexer.this")
    private MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer mForwardingConsumer;
    private final K mKey;
    @Nullable
    @GuardedBy("Multiplexer.this")
    private T mLastIntermediateResult;
    @GuardedBy("Multiplexer.this")
    private float mLastProgress;
    @GuardedBy("Multiplexer.this")
    private int mLastStatus;
    @Nullable
    @GuardedBy("Multiplexer.this")
    private BaseProducerContext mMultiplexProducerContext;
    
    public Multiplexer()
    {
      Object localObject;
      mKey = localObject;
    }
    
    private void addCallbacks(final Pair<Consumer<T>, ProducerContext> paramPair, ProducerContext paramProducerContext)
    {
      paramProducerContext.addCallbacks(new BaseProducerContextCallbacks()
      {
        public void onCancellationRequested()
        {
          synchronized (MultiplexProducer.Multiplexer.this)
          {
            boolean bool = MultiplexProducer.Multiplexer.access$200(MultiplexProducer.Multiplexer.this).remove(paramPair);
            Object localObject1 = null;
            if (bool)
            {
              if (MultiplexProducer.Multiplexer.access$200(MultiplexProducer.Multiplexer.this).isEmpty())
              {
                localObject2 = MultiplexProducer.Multiplexer.access$300(MultiplexProducer.Multiplexer.this);
              }
              else
              {
                localObject2 = MultiplexProducer.Multiplexer.access$400(MultiplexProducer.Multiplexer.this);
                localList1 = MultiplexProducer.Multiplexer.access$500(MultiplexProducer.Multiplexer.this);
                localList2 = MultiplexProducer.Multiplexer.access$600(MultiplexProducer.Multiplexer.this);
                localObject4 = null;
                break label102;
              }
            }
            else {
              localObject2 = null;
            }
            List localList1 = null;
            List localList2 = null;
            Object localObject4 = localObject2;
            Object localObject2 = localObject1;
            label102:
            BaseProducerContext.callOnIsPrefetchChanged((List)localObject2);
            BaseProducerContext.callOnPriorityChanged(localList1);
            BaseProducerContext.callOnIsIntermediateResultExpectedChanged(localList2);
            if (localObject4 != null) {
              ((BaseProducerContext)localObject4).cancel();
            }
            if (bool) {
              ((Consumer)paramPairfirst).onCancellation();
            }
            return;
          }
        }
        
        public void onIsIntermediateResultExpectedChanged()
        {
          BaseProducerContext.callOnIsIntermediateResultExpectedChanged(MultiplexProducer.Multiplexer.access$600(MultiplexProducer.Multiplexer.this));
        }
        
        public void onIsPrefetchChanged()
        {
          BaseProducerContext.callOnIsPrefetchChanged(MultiplexProducer.Multiplexer.access$400(MultiplexProducer.Multiplexer.this));
        }
        
        public void onPriorityChanged()
        {
          BaseProducerContext.callOnPriorityChanged(MultiplexProducer.Multiplexer.access$500(MultiplexProducer.Multiplexer.this));
        }
      });
    }
    
    private void closeSafely(Closeable paramCloseable)
    {
      if (paramCloseable != null) {
        try
        {
          paramCloseable.close();
        }
        catch (IOException paramCloseable)
        {
          throw new RuntimeException(paramCloseable);
        }
      }
    }
    
    private boolean computeIsIntermediateResultExpected()
    {
      try
      {
        Iterator localIterator = mConsumerContextPairs.iterator();
        while (localIterator.hasNext())
        {
          boolean bool = ((ProducerContext)nextsecond).isIntermediateResultExpected();
          if (bool) {
            return true;
          }
        }
        return false;
      }
      finally {}
    }
    
    private boolean computeIsPrefetch()
    {
      try
      {
        Iterator localIterator = mConsumerContextPairs.iterator();
        while (localIterator.hasNext())
        {
          boolean bool = ((ProducerContext)nextsecond).isPrefetch();
          if (!bool) {
            return false;
          }
        }
        return true;
      }
      finally {}
    }
    
    private Priority computePriority()
    {
      try
      {
        Priority localPriority = Priority.LOW;
        Iterator localIterator = mConsumerContextPairs.iterator();
        while (localIterator.hasNext()) {
          localPriority = Priority.getHigherPriority(localPriority, ((ProducerContext)nextsecond).getPriority());
        }
        return localPriority;
      }
      finally {}
    }
    
    private void startInputProducerIfHasAttachedConsumers()
    {
      try
      {
        Object localObject1 = mMultiplexProducerContext;
        boolean bool1 = true;
        boolean bool2;
        if (localObject1 == null) {
          bool2 = true;
        } else {
          bool2 = false;
        }
        Preconditions.checkArgument(bool2);
        if (mForwardingConsumer == null) {
          bool2 = bool1;
        } else {
          bool2 = false;
        }
        Preconditions.checkArgument(bool2);
        if (mConsumerContextPairs.isEmpty())
        {
          MultiplexProducer.access$700(MultiplexProducer.this, mKey, this);
          return;
        }
        localObject1 = (ProducerContext)mConsumerContextPairs.iterator().next()).second;
        Object localObject3 = new com/facebook/imagepipeline/producers/BaseProducerContext;
        ((BaseProducerContext)localObject3).<init>(((ProducerContext)localObject1).getImageRequest(), ((ProducerContext)localObject1).getId(), ((ProducerContext)localObject1).getListener(), ((ProducerContext)localObject1).getCallerContext(), ((ProducerContext)localObject1).getLowestPermittedRequestLevel(), computeIsPrefetch(), computeIsIntermediateResultExpected(), computePriority());
        mMultiplexProducerContext = ((BaseProducerContext)localObject3);
        localObject3 = new com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer$ForwardingConsumer;
        ((ForwardingConsumer)localObject3).<init>(this, null);
        mForwardingConsumer = ((ForwardingConsumer)localObject3);
        localObject1 = mMultiplexProducerContext;
        MultiplexProducer.access$900(MultiplexProducer.this).produceResults((Consumer)localObject3, (ProducerContext)localObject1);
        return;
      }
      finally {}
    }
    
    @Nullable
    private List<ProducerContextCallbacks> updateIsIntermediateResultExpected()
    {
      try
      {
        Object localObject1 = mMultiplexProducerContext;
        if (localObject1 == null) {
          return null;
        }
        localObject1 = ((BaseProducerContext)localObject1).setIsIntermediateResultExpectedNoCallbacks(computeIsIntermediateResultExpected());
        return (List<ProducerContextCallbacks>)localObject1;
      }
      finally {}
    }
    
    @Nullable
    private List<ProducerContextCallbacks> updateIsPrefetch()
    {
      try
      {
        Object localObject1 = mMultiplexProducerContext;
        if (localObject1 == null) {
          return null;
        }
        localObject1 = ((BaseProducerContext)localObject1).setIsPrefetchNoCallbacks(computeIsPrefetch());
        return (List<ProducerContextCallbacks>)localObject1;
      }
      finally {}
    }
    
    @Nullable
    private List<ProducerContextCallbacks> updatePriority()
    {
      try
      {
        Object localObject1 = mMultiplexProducerContext;
        if (localObject1 == null) {
          return null;
        }
        localObject1 = ((BaseProducerContext)localObject1).setPriorityNoCallbacks(computePriority());
        return (List<ProducerContextCallbacks>)localObject1;
      }
      finally {}
    }
    
    /* Error */
    public boolean addNewConsumer(Consumer<T> paramConsumer, ProducerContext paramProducerContext)
    {
      // Byte code:
      //   0: aload_1
      //   1: aload_2
      //   2: invokestatic 228	android/util/Pair:create	(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
      //   5: astore_3
      //   6: aload_0
      //   7: monitorenter
      //   8: aload_0
      //   9: getfield 41	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:this$0	Lcom/facebook/imagepipeline/producers/MultiplexProducer;
      //   12: aload_0
      //   13: getfield 54	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mKey	Ljava/lang/Object;
      //   16: invokestatic 232	com/facebook/imagepipeline/producers/MultiplexProducer:access$100	(Lcom/facebook/imagepipeline/producers/MultiplexProducer;Ljava/lang/Object;)Lcom/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer;
      //   19: aload_0
      //   20: if_acmpeq +7 -> 27
      //   23: aload_0
      //   24: monitorexit
      //   25: iconst_0
      //   26: ireturn
      //   27: aload_0
      //   28: getfield 52	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mConsumerContextPairs	Ljava/util/concurrent/CopyOnWriteArraySet;
      //   31: aload_3
      //   32: invokevirtual 236	java/util/concurrent/CopyOnWriteArraySet:add	(Ljava/lang/Object;)Z
      //   35: pop
      //   36: aload_0
      //   37: invokespecial 74	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:updateIsPrefetch	()Ljava/util/List;
      //   40: astore 4
      //   42: aload_0
      //   43: invokespecial 78	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:updatePriority	()Ljava/util/List;
      //   46: astore 5
      //   48: aload_0
      //   49: invokespecial 82	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:updateIsIntermediateResultExpected	()Ljava/util/List;
      //   52: astore 6
      //   54: aload_0
      //   55: getfield 238	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mLastIntermediateResult	Ljava/io/Closeable;
      //   58: astore 7
      //   60: aload_0
      //   61: getfield 240	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mLastProgress	F
      //   64: fstore 8
      //   66: aload_0
      //   67: getfield 242	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mLastStatus	I
      //   70: istore 9
      //   72: aload_0
      //   73: monitorexit
      //   74: aload 4
      //   76: invokestatic 246	com/facebook/imagepipeline/producers/BaseProducerContext:callOnIsPrefetchChanged	(Ljava/util/List;)V
      //   79: aload 5
      //   81: invokestatic 249	com/facebook/imagepipeline/producers/BaseProducerContext:callOnPriorityChanged	(Ljava/util/List;)V
      //   84: aload 6
      //   86: invokestatic 252	com/facebook/imagepipeline/producers/BaseProducerContext:callOnIsIntermediateResultExpectedChanged	(Ljava/util/List;)V
      //   89: aload_3
      //   90: monitorenter
      //   91: aload_0
      //   92: monitorenter
      //   93: aload 7
      //   95: aload_0
      //   96: getfield 238	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:mLastIntermediateResult	Ljava/io/Closeable;
      //   99: if_acmpeq +9 -> 108
      //   102: aconst_null
      //   103: astore 4
      //   105: goto +23 -> 128
      //   108: aload 7
      //   110: astore 4
      //   112: aload 7
      //   114: ifnull +14 -> 128
      //   117: aload_0
      //   118: getfield 41	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:this$0	Lcom/facebook/imagepipeline/producers/MultiplexProducer;
      //   121: aload 7
      //   123: invokevirtual 256	com/facebook/imagepipeline/producers/MultiplexProducer:cloneOrNull	(Ljava/io/Closeable;)Ljava/io/Closeable;
      //   126: astore 4
      //   128: aload_0
      //   129: monitorexit
      //   130: aload 4
      //   132: ifnull +34 -> 166
      //   135: fload 8
      //   137: fconst_0
      //   138: fcmpl
      //   139: ifle +11 -> 150
      //   142: aload_1
      //   143: fload 8
      //   145: invokeinterface 262 2 0
      //   150: aload_1
      //   151: aload 4
      //   153: iload 9
      //   155: invokeinterface 266 3 0
      //   160: aload_0
      //   161: aload 4
      //   163: invokespecial 268	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:closeSafely	(Ljava/io/Closeable;)V
      //   166: aload_3
      //   167: monitorexit
      //   168: aload_0
      //   169: aload_3
      //   170: aload_2
      //   171: invokespecial 270	com/facebook/imagepipeline/producers/MultiplexProducer$Multiplexer:addCallbacks	(Landroid/util/Pair;Lcom/facebook/imagepipeline/producers/ProducerContext;)V
      //   174: iconst_1
      //   175: ireturn
      //   176: astore_1
      //   177: aload_0
      //   178: monitorexit
      //   179: aload_1
      //   180: athrow
      //   181: astore_1
      //   182: aload_3
      //   183: monitorexit
      //   184: aload_1
      //   185: athrow
      //   186: astore_1
      //   187: aload_0
      //   188: monitorexit
      //   189: aload_1
      //   190: athrow
      // Local variable table:
      //   start	length	slot	name	signature
      //   0	191	0	this	Multiplexer
      //   0	191	1	paramConsumer	Consumer<T>
      //   0	191	2	paramProducerContext	ProducerContext
      //   5	178	3	localPair	Pair
      //   40	122	4	localObject	Object
      //   46	34	5	localList1	List
      //   52	33	6	localList2	List
      //   58	64	7	localCloseable	Closeable
      //   64	80	8	f	float
      //   70	84	9	i	int
      // Exception table:
      //   from	to	target	type
      //   93	102	176	finally
      //   117	128	176	finally
      //   128	130	176	finally
      //   177	179	176	finally
      //   91	93	181	finally
      //   142	150	181	finally
      //   150	166	181	finally
      //   166	168	181	finally
      //   179	181	181	finally
      //   182	184	181	finally
      //   8	25	186	finally
      //   27	74	186	finally
      //   187	189	186	finally
    }
    
    public void onCancelled(MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer paramMultiplexProducer)
    {
      try
      {
        if (mForwardingConsumer != paramMultiplexProducer) {
          return;
        }
        mForwardingConsumer = null;
        mMultiplexProducerContext = null;
        closeSafely(mLastIntermediateResult);
        mLastIntermediateResult = null;
        startInputProducerIfHasAttachedConsumers();
        return;
      }
      finally {}
    }
    
    public void onFailure(MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer arg1, Throwable paramThrowable)
    {
      try
      {
        if (mForwardingConsumer != ???) {
          return;
        }
        Iterator localIterator = mConsumerContextPairs.iterator();
        mConsumerContextPairs.clear();
        MultiplexProducer.access$700(MultiplexProducer.this, mKey, this);
        closeSafely(mLastIntermediateResult);
        mLastIntermediateResult = null;
        while (localIterator.hasNext()) {
          synchronized ((Pair)localIterator.next())
          {
            ((Consumer)first).onFailure(paramThrowable);
          }
        }
        return;
      }
      finally {}
    }
    
    public void onNextResult(MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer arg1, T paramT, int paramInt)
    {
      try
      {
        if (mForwardingConsumer != ???) {
          return;
        }
        closeSafely(mLastIntermediateResult);
        mLastIntermediateResult = null;
        Iterator localIterator = mConsumerContextPairs.iterator();
        if (BaseConsumer.isNotLast(paramInt))
        {
          mLastIntermediateResult = cloneOrNull(paramT);
          mLastStatus = paramInt;
        }
        else
        {
          mConsumerContextPairs.clear();
          MultiplexProducer.access$700(MultiplexProducer.this, mKey, this);
        }
        while (localIterator.hasNext()) {
          synchronized ((Pair)localIterator.next())
          {
            ((Consumer)first).onNewResult(paramT, paramInt);
          }
        }
        return;
      }
      finally {}
    }
    
    public void onProgressUpdate(MultiplexProducer<K, T>.Multiplexer.ForwardingConsumer arg1, float paramFloat)
    {
      try
      {
        if (mForwardingConsumer != ???) {
          return;
        }
        mLastProgress = paramFloat;
        Iterator localIterator = mConsumerContextPairs.iterator();
        while (localIterator.hasNext()) {
          synchronized ((Pair)localIterator.next())
          {
            ((Consumer)first).onProgressUpdate(paramFloat);
          }
        }
        return;
      }
      finally {}
    }
    
    public class ForwardingConsumer
      extends BaseConsumer<T>
    {
      private ForwardingConsumer() {}
      
      public void onCancellationImpl()
      {
        onCancelled(this);
      }
      
      public void onFailureImpl(Throwable paramThrowable)
      {
        onFailure(this, paramThrowable);
      }
      
      public void onNewResultImpl(T paramT, int paramInt)
      {
        onNextResult(this, paramT, paramInt);
      }
      
      public void onProgressUpdateImpl(float paramFloat)
      {
        onProgressUpdate(this, paramFloat);
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.imagepipeline.producers.MultiplexProducer
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */