package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class V7
  extends n
{
  public final Callable q;
  
  public V7(String paramString, Callable paramCallable)
  {
    super(paramString);
    q = paramCallable;
  }
  
  public final s b(f3 paramf3, List paramList)
  {
    try
    {
      paramf3 = b4.b(q.call());
      return paramf3;
    }
    catch (Exception paramf3) {}
    return s.d;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.V7
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */