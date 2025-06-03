package com.google.android.gms.internal.fido;

import g;
import java.util.Arrays;

public final class zzdk
  extends zzdr
{
  private final zzcz zza;
  
  public zzdk(zzcz paramzzcz)
  {
    zza = paramzzcz;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (zzdk.class != paramObject.getClass()) {
      return false;
    }
    paramObject = (zzdk)paramObject;
    return zza.equals(zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(new Object[] { Integer.valueOf(zzdr.zzd(64)), zza });
  }
  
  public final String toString()
  {
    zzch localzzch = zzch.zzf().zzd();
    byte[] arrayOfByte = zza.zzm();
    return g.e("h'", localzzch.zzg(arrayOfByte, 0, arrayOfByte.length), "'");
  }
  
  public final int zza()
  {
    return zzdr.zzd();
  }
  
  public final zzcz zzc()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdk
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */