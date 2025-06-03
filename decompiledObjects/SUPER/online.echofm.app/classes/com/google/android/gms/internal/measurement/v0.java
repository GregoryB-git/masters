package com.google.android.gms.internal.measurement;

import android.os.BaseBundle;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicReference;

public final class v0
  extends B0
{
  public final AtomicReference b = new AtomicReference();
  public boolean c;
  
  public static Object v(Bundle paramBundle, Class paramClass)
  {
    if (paramBundle != null)
    {
      Object localObject = paramBundle.get("r");
      if (localObject != null) {
        try
        {
          paramBundle = paramClass.cast(localObject);
          return paramBundle;
        }
        catch (ClassCastException paramBundle)
        {
          paramClass = paramClass.getCanonicalName();
          localObject = localObject.getClass().getCanonicalName();
          StringBuilder localStringBuilder = new StringBuilder();
          localStringBuilder.append("Unexpected object type. Expected, Received");
          localStringBuilder.append(": %s, %s");
          Log.w("AM", String.format(localStringBuilder.toString(), new Object[] { paramClass, localObject }), paramBundle);
          throw paramBundle;
        }
      }
    }
    return null;
  }
  
  public final Long Z0(long paramLong)
  {
    return (Long)v(o(paramLong), Long.class);
  }
  
  public final String a1(long paramLong)
  {
    return (String)v(o(paramLong), String.class);
  }
  
  public final void l(Bundle paramBundle)
  {
    AtomicReference localAtomicReference = b;
    try
    {
      b.set(paramBundle);
      c = true;
      try
      {
        b.notify();
        return;
      }
      finally {}
      throw paramBundle;
    }
    finally
    {
      b.notify();
    }
  }
  
  public final Bundle o(long paramLong)
  {
    synchronized (b)
    {
      boolean bool = c;
      if (bool) {}
    }
    Bundle localBundle = (Bundle)b.get();
    return localBundle;
    throw localBundle;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.v0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */