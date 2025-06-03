package com.google.android.recaptcha.internal;

import f;

class zzlc
  extends zzlb
{
  public final byte[] zza;
  
  public zzlc(byte[] paramArrayOfByte)
  {
    super(null);
    paramArrayOfByte.getClass();
    zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzle)) {
      return false;
    }
    if (zzd() != ((zzle)paramObject).zzd()) {
      return false;
    }
    if (zzd() == 0) {
      return true;
    }
    if ((paramObject instanceof zzlc))
    {
      zzlc localzzlc = (zzlc)paramObject;
      int i = zzj();
      int j = localzzlc.zzj();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      int k = zzd();
      if (k <= localzzlc.zzd())
      {
        if (k <= localzzlc.zzd())
        {
          byte[] arrayOfByte = zza;
          paramObject = zza;
          localzzlc.zzc();
          i = 0;
          boolean bool2;
          for (j = i;; j++)
          {
            bool2 = bool1;
            if (i >= k) {
              break;
            }
            if (arrayOfByte[i] != paramObject[j])
            {
              bool2 = false;
              break;
            }
            i++;
          }
          return bool2;
        }
        throw new IllegalArgumentException(f.i("Ran off end of other: 0, ", k, ", ", localzzlc.zzd()));
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
  
  public void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zza, 0, paramArrayOfByte, 0, paramInt3);
  }
  
  public final int zzf(int paramInt1, int paramInt2, int paramInt3)
  {
    return zznl.zzb(paramInt1, zza, 0, paramInt3);
  }
  
  public final zzle zzg(int paramInt1, int paramInt2)
  {
    paramInt1 = zzle.zzi(0, paramInt2, zzd());
    if (paramInt1 == 0) {
      return zzle.zzb;
    }
    return new zzkz(zza, 0, paramInt1);
  }
  
  public final void zzh(zzkw paramzzkw)
  {
    int i = zzd();
    ((zzlk)paramzzkw).zzc(zza, 0, i);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzlc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */