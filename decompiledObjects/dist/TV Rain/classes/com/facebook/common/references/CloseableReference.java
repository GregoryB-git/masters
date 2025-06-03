package com.facebook.common.references;

import com.facebook.common.internal.Closeables;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.infer.annotation.PropagatesNullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public final class CloseableReference<T>
  implements Cloneable, Closeable
{
  private static final ResourceReleaser<Closeable> DEFAULT_CLOSEABLE_RELEASER = new ResourceReleaser()
  {
    public void release(Closeable paramAnonymousCloseable)
    {
      try
      {
        Closeables.close(paramAnonymousCloseable, true);
        return;
      }
      catch (IOException paramAnonymousCloseable)
      {
        for (;;) {}
      }
    }
  };
  private static Class<CloseableReference> TAG = CloseableReference.class;
  @GuardedBy("this")
  private boolean mIsClosed = false;
  private final SharedReference<T> mSharedReference;
  
  private CloseableReference(SharedReference<T> paramSharedReference)
  {
    mSharedReference = ((SharedReference)Preconditions.checkNotNull(paramSharedReference));
    paramSharedReference.addReference();
  }
  
  private CloseableReference(T paramT, ResourceReleaser<T> paramResourceReleaser)
  {
    mSharedReference = new SharedReference(paramT, paramResourceReleaser);
  }
  
  @Nullable
  public static <T> CloseableReference<T> cloneOrNull(@Nullable CloseableReference<T> paramCloseableReference)
  {
    if (paramCloseableReference != null) {
      paramCloseableReference = paramCloseableReference.cloneOrNull();
    } else {
      paramCloseableReference = null;
    }
    return paramCloseableReference;
  }
  
  public static <T> List<CloseableReference<T>> cloneOrNull(@PropagatesNullable Collection<CloseableReference<T>> paramCollection)
  {
    if (paramCollection == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext()) {
      localArrayList.add(cloneOrNull((CloseableReference)paramCollection.next()));
    }
    return localArrayList;
  }
  
  public static void closeSafely(@Nullable CloseableReference<?> paramCloseableReference)
  {
    if (paramCloseableReference != null) {
      paramCloseableReference.close();
    }
  }
  
  public static void closeSafely(@Nullable Iterable<? extends CloseableReference<?>> paramIterable)
  {
    if (paramIterable != null)
    {
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext()) {
        closeSafely((CloseableReference)paramIterable.next());
      }
    }
  }
  
  public static boolean isValid(@Nullable CloseableReference<?> paramCloseableReference)
  {
    boolean bool;
    if ((paramCloseableReference != null) && (paramCloseableReference.isValid())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public static <T extends Closeable> CloseableReference<T> of(@PropagatesNullable T paramT)
  {
    if (paramT == null) {
      return null;
    }
    return new CloseableReference(paramT, DEFAULT_CLOSEABLE_RELEASER);
  }
  
  public static <T> CloseableReference<T> of(@PropagatesNullable T paramT, ResourceReleaser<T> paramResourceReleaser)
  {
    if (paramT == null) {
      return null;
    }
    return new CloseableReference(paramT, paramResourceReleaser);
  }
  
  public CloseableReference<T> clone()
  {
    try
    {
      Preconditions.checkState(isValid());
      CloseableReference localCloseableReference = new CloseableReference(mSharedReference);
      return localCloseableReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  @Nullable
  public CloseableReference<T> cloneOrNull()
  {
    try
    {
      if (isValid())
      {
        CloseableReference localCloseableReference = clone();
        return localCloseableReference;
      }
      return null;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void close()
  {
    try
    {
      if (mIsClosed) {
        return;
      }
      mIsClosed = true;
      mSharedReference.deleteReference();
      return;
    }
    finally {}
  }
  
  /* Error */
  public void finalize()
    throws Throwable
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 39	com/facebook/common/references/CloseableReference:mIsClosed	Z
    //   6: ifeq +10 -> 16
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_0
    //   12: invokespecial 147	java/lang/Object:finalize	()V
    //   15: return
    //   16: aload_0
    //   17: monitorexit
    //   18: getstatic 29	com/facebook/common/references/CloseableReference:TAG	Ljava/lang/Class;
    //   21: ldc -107
    //   23: iconst_3
    //   24: anewarray 5	java/lang/Object
    //   27: dup
    //   28: iconst_0
    //   29: aload_0
    //   30: invokestatic 155	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   33: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: aload_0
    //   40: getfield 49	com/facebook/common/references/CloseableReference:mSharedReference	Lcom/facebook/common/references/SharedReference;
    //   43: invokestatic 155	java/lang/System:identityHashCode	(Ljava/lang/Object;)I
    //   46: invokestatic 161	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   49: aastore
    //   50: dup
    //   51: iconst_2
    //   52: aload_0
    //   53: getfield 49	com/facebook/common/references/CloseableReference:mSharedReference	Lcom/facebook/common/references/SharedReference;
    //   56: invokevirtual 164	com/facebook/common/references/SharedReference:get	()Ljava/lang/Object;
    //   59: invokevirtual 168	java/lang/Object:getClass	()Ljava/lang/Class;
    //   62: invokevirtual 174	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   65: aastore
    //   66: invokestatic 180	com/facebook/common/logging/FLog:w	(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   69: aload_0
    //   70: invokevirtual 107	com/facebook/common/references/CloseableReference:close	()V
    //   73: aload_0
    //   74: invokespecial 147	java/lang/Object:finalize	()V
    //   77: return
    //   78: astore_1
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_1
    //   82: athrow
    //   83: astore_1
    //   84: aload_0
    //   85: invokespecial 147	java/lang/Object:finalize	()V
    //   88: aload_1
    //   89: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	90	0	this	CloseableReference
    //   78	4	1	localObject1	Object
    //   83	6	1	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   2	11	78	finally
    //   16	18	78	finally
    //   79	81	78	finally
    //   0	2	83	finally
    //   18	73	83	finally
    //   81	83	83	finally
  }
  
  public T get()
  {
    try
    {
      boolean bool;
      if (!mIsClosed) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkState(bool);
      Object localObject1 = mSharedReference.get();
      return (T)localObject1;
    }
    finally {}
  }
  
  @VisibleForTesting
  public SharedReference<T> getUnderlyingReferenceTestOnly()
  {
    try
    {
      SharedReference localSharedReference = mSharedReference;
      return localSharedReference;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public int getValueHash()
  {
    int i;
    if (isValid()) {
      i = System.identityHashCode(mSharedReference.get());
    } else {
      i = 0;
    }
    return i;
  }
  
  public boolean isValid()
  {
    try
    {
      boolean bool = mIsClosed;
      return bool ^ true;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.references.CloseableReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */