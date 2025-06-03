package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class X4
{
  public Map a = new HashMap();
  
  public final s a(String paramString)
  {
    if (a.containsKey(paramString))
    {
      Object localObject = (Callable)a.get(paramString);
      try
      {
        localObject = (s)((Callable)localObject).call();
        return (s)localObject;
      }
      catch (Exception localException)
      {
        StringBuilder localStringBuilder = new StringBuilder("Failed to create API implementation: ");
        localStringBuilder.append(paramString);
        throw new IllegalStateException(localStringBuilder.toString());
      }
    }
    return s.d;
  }
  
  public final void b(String paramString, Callable paramCallable)
  {
    a.put(paramString, paramCallable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.X4
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */