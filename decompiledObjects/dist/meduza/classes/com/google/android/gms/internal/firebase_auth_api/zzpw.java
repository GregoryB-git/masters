package com.google.android.gms.internal.firebase_auth_api;

public final class zzpw
  extends RuntimeException
{
  public zzpw(String paramString)
  {
    super(paramString);
  }
  
  public zzpw(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  private zzpw(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public static <T> T zza(zzpz<T> paramzzpz)
  {
    try
    {
      paramzzpz = paramzzpz.zza();
      return paramzzpz;
    }
    catch (Exception paramzzpz)
    {
      throw new zzpw(paramzzpz);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzpw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */