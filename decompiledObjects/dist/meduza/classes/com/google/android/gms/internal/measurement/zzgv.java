package com.google.android.gms.internal.measurement;

public final class zzgv
{
  private static zzgy zza;
  
  public static zzgy zza()
  {
    try
    {
      if (zza == null)
      {
        localObject1 = new com/google/android/gms/internal/measurement/zzgx;
        ((zzgx)localObject1).<init>();
        zza((zzgy)localObject1);
      }
      Object localObject1 = zza;
      return (zzgy)localObject1;
    }
    finally {}
  }
  
  private static void zza(zzgy paramzzgy)
  {
    try
    {
      if (zza == null)
      {
        zza = paramzzgy;
        return;
      }
      paramzzgy = new java/lang/IllegalStateException;
      paramzzgy.<init>("init() already called");
      throw paramzzgy;
    }
    finally {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzgv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */