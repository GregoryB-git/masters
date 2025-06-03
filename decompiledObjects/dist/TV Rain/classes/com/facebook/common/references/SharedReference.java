package com.facebook.common.references;

import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import java.util.IdentityHashMap;
import java.util.Map;
import javax.annotation.concurrent.GuardedBy;

@VisibleForTesting
public class SharedReference<T>
{
  @GuardedBy("itself")
  private static final Map<Object, Integer> sLiveObjects = new IdentityHashMap();
  @GuardedBy("this")
  private int mRefCount;
  private final ResourceReleaser<T> mResourceReleaser;
  @GuardedBy("this")
  private T mValue;
  
  public SharedReference(T paramT, ResourceReleaser<T> paramResourceReleaser)
  {
    mValue = Preconditions.checkNotNull(paramT);
    mResourceReleaser = ((ResourceReleaser)Preconditions.checkNotNull(paramResourceReleaser));
    mRefCount = 1;
    addLiveReference(paramT);
  }
  
  private static void addLiveReference(Object paramObject)
  {
    synchronized (sLiveObjects)
    {
      Integer localInteger = (Integer)???.get(paramObject);
      if (localInteger == null) {
        ???.put(paramObject, Integer.valueOf(1));
      } else {
        ???.put(paramObject, Integer.valueOf(localInteger.intValue() + 1));
      }
      return;
    }
  }
  
  private int decreaseRefCount()
  {
    try
    {
      ensureValid();
      boolean bool;
      if (mRefCount > 0) {
        bool = true;
      } else {
        bool = false;
      }
      Preconditions.checkArgument(bool);
      int i = mRefCount - 1;
      mRefCount = i;
      return i;
    }
    finally {}
  }
  
  private void ensureValid()
  {
    if (isValid(this)) {
      return;
    }
    throw new NullReferenceException();
  }
  
  public static boolean isValid(SharedReference<?> paramSharedReference)
  {
    boolean bool;
    if ((paramSharedReference != null) && (paramSharedReference.isValid())) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  private static void removeLiveReference(Object paramObject)
  {
    synchronized (sLiveObjects)
    {
      Integer localInteger = (Integer)???.get(paramObject);
      if (localInteger == null) {
        FLog.wtf("SharedReference", "No entry in sLiveObjects for value of type %s", new Object[] { paramObject.getClass() });
      } else if (localInteger.intValue() == 1) {
        ???.remove(paramObject);
      } else {
        ???.put(paramObject, Integer.valueOf(localInteger.intValue() - 1));
      }
      return;
    }
  }
  
  public void addReference()
  {
    try
    {
      ensureValid();
      mRefCount += 1;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void deleteReference()
  {
    if (decreaseRefCount() == 0) {
      try
      {
        Object localObject1 = mValue;
        mValue = null;
        mResourceReleaser.release(localObject1);
        removeLiveReference(localObject1);
      }
      finally {}
    }
  }
  
  public T get()
  {
    try
    {
      Object localObject1 = mValue;
      return (T)localObject1;
    }
    finally
    {
      localObject2 = finally;
      throw ((Throwable)localObject2);
    }
  }
  
  public int getRefCountTestOnly()
  {
    try
    {
      int i = mRefCount;
      return i;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public boolean isValid()
  {
    try
    {
      int i = mRefCount;
      boolean bool;
      if (i > 0) {
        bool = true;
      } else {
        bool = false;
      }
      return bool;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public static class NullReferenceException
    extends RuntimeException
  {
    public NullReferenceException()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.common.references.SharedReference
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */