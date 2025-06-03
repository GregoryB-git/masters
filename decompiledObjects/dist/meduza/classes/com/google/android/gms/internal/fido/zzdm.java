package com.google.android.gms.internal.fido;

import java.util.Arrays;

public final class zzdm
  extends zzdr
{
  private final long zza;
  
  public zzdm(long paramLong)
  {
    zza = paramLong;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (zzdm.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (zzdm)paramObject;
    return zza == zza;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(zza()), Long.valueOf(zza) });
  }
  
  public final String toString()
  {
    return Long.toString(zza);
  }
  
  public final int zza()
  {
    byte b1;
    byte b2;
    if (zza >= 0L)
    {
      b1 = 0;
      b2 = b1;
    }
    else
    {
      b1 = 32;
      b2 = b1;
    }
    return zzdr.zzd(b2);
  }
  
  public final long zzc()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */