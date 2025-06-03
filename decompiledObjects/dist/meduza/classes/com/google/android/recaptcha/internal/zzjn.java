package com.google.android.recaptcha.internal;

import java.util.Queue;

public abstract class zzjn
  extends zzjl
  implements Queue
{
  public final Object element()
  {
    return zzd().element();
  }
  
  public boolean offer(Object paramObject)
  {
    return zzd().offer(paramObject);
  }
  
  public final Object peek()
  {
    return zzd().peek();
  }
  
  public final Object poll()
  {
    return zzd().poll();
  }
  
  public final Object remove()
  {
    return zzd().remove();
  }
  
  public abstract Queue zzd();
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */