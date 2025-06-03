package com.google.android.gms.internal.auth;

import f;
import java.nio.charset.Charset;

class zzec
  extends zzeb
{
  public final byte[] zza;
  
  public zzec(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzef)) {
      return false;
    }
    if (zzd() != ((zzef)paramObject).zzd()) {
      return false;
    }
    if (zzd() == 0) {
      return true;
    }
    if ((paramObject instanceof zzec))
    {
      zzec localzzec = (zzec)paramObject;
      int i = zzj();
      int j = localzzec.zzj();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      int k = zzd();
      if (k <= localzzec.zzd())
      {
        if (k <= localzzec.zzd())
        {
          paramObject = zza;
          byte[] arrayOfByte = zza;
          localzzec.zzc();
          j = 0;
          boolean bool2;
          for (i = j;; i++)
          {
            bool2 = bool1;
            if (j >= k) {
              break;
            }
            if (paramObject[j] != arrayOfByte[i])
            {
              bool2 = false;
              break;
            }
            j++;
          }
          return bool2;
        }
        throw new IllegalArgumentException(f.i("Ran off end of other: 0, ", k, ", ", localzzec.zzd()));
      }
      j = zzd();
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Length too large: ");
      ((StringBuilder)paramObject).append(k);
      ((StringBuilder)paramObject).append(j);
      throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    }
    return paramObject.equals(this);
  }
  
  public byte zza(int paramInt)
  {
    return zza[paramInt];
  }
  
  public byte zzb(int paramInt)
  {
    return zza[paramInt];
  }
  
  public int zzc()
  {
    return 0;
  }
  
  public int zzd()
  {
    return zza.length;
  }
  
  public final int zze(int paramInt1, int paramInt2, int paramInt3)
  {
    return zzfa.zzb(paramInt1, zza, 0, paramInt3);
  }
  
  public final zzef zzf(int paramInt1, int paramInt2)
  {
    paramInt1 = zzef.zzi(0, paramInt2, zzd());
    if (paramInt1 == 0) {
      return zzef.zzb;
    }
    return new zzdz(zza, 0, paramInt1);
  }
  
  public final String zzg(Charset paramCharset)
  {
    return new String(zza, 0, zzd(), paramCharset);
  }
  
  public final boolean zzh()
  {
    return zzhn.zzc(zza, 0, zzd());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */