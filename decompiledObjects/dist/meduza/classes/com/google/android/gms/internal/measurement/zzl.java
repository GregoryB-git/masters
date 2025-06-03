package com.google.android.gms.internal.measurement;

import f;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

public final class zzl
{
  private Map<String, Callable<? extends zzal>> zza = new HashMap();
  
  public final zzaq zza(String paramString)
  {
    if (zza.containsKey(paramString))
    {
      Object localObject = (Callable)zza.get(paramString);
      try
      {
        localObject = (zzaq)((Callable)localObject).call();
        return (zzaq)localObject;
      }
      catch (Exception localException)
      {
        throw new IllegalStateException(f.j("Failed to create API implementation: ", paramString));
      }
    }
    return zzaq.zzc;
  }
  
  public final void zza(String paramString, Callable<? extends zzal> paramCallable)
  {
    zza.put(paramString, paramCallable);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */