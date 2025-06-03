package com.google.android.gms.internal.fido;

import java.util.Arrays;

public final class zzdj
  extends zzdr
{
  private final boolean zza;
  
  public zzdj(boolean paramBoolean)
  {
    zza = paramBoolean;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (zzdj.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (zzdj)paramObject;
    return zza == zza;
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(zzdr.zzd(-32)), Boolean.valueOf(zza) });
  }
  
  public final String toString()
  {
    return Boolean.toString(zza);
  }
  
  public final int zza()
  {
    return zzdr.zzd();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */