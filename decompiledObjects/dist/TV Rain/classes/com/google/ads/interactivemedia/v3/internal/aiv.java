package com.google.ads.interactivemedia.v3.internal;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class aiv
  extends WeakReference<Throwable>
{
  private final int a;
  
  public aiv(Throwable paramThrowable, ReferenceQueue<Throwable> paramReferenceQueue)
  {
    super(paramThrowable, paramReferenceQueue);
    if (paramThrowable != null)
    {
      a = System.identityHashCode(paramThrowable);
      return;
    }
    throw new NullPointerException("The referent cannot be null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == aiv.class))
    {
      if (this == paramObject) {
        return true;
      }
      paramObject = (aiv)paramObject;
      if ((a == a) && (get() == ((Reference)paramObject).get())) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return a;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.interactivemedia.v3.internal.aiv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */