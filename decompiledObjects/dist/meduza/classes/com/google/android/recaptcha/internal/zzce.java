package com.google.android.recaptcha.internal;

public final class zzce
  extends Exception
{
  private final Throwable zza;
  private final zztd zzb;
  private final int zzc;
  private final int zzd;
  
  public zzce(int paramInt1, int paramInt2, Throwable paramThrowable)
  {
    zzc = paramInt1;
    zzd = paramInt2;
    zza = paramThrowable;
    paramThrowable = zzte.zzf();
    paramThrowable.zzq(paramInt2);
    paramThrowable.zzr(paramInt1);
    zzb = paramThrowable;
  }
  
  public final Throwable getCause()
  {
    return zza;
  }
  
  public final zztd zza()
  {
    return zzb;
  }
  
  public final int zzb()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */