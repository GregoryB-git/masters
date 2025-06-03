package com.google.android.gms.internal.fido;

final class zzcf
  extends zzcg
{
  private zzcf(zzcd paramzzcd, Character paramCharacter)
  {
    super(paramzzcd, paramCharacter);
    boolean bool;
    if (zzcd.zzd(paramzzcd).length == 64) {
      bool = true;
    } else {
      bool = false;
    }
    zzap.zzc(bool);
  }
  
  public zzcf(String paramString1, String paramString2, Character paramCharacter)
  {
    this(new zzcd(paramString1, paramString2.toCharArray()), paramCharacter);
  }
  
  public final zzch zza(zzcd paramzzcd, Character paramCharacter)
  {
    return new zzcf(paramzzcd, paramCharacter);
  }
  
  public final void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = paramArrayOfByte.length;
    int i = 0;
    zzap.zze(0, paramInt2, paramInt1);
    for (paramInt1 = paramInt2; paramInt1 >= 3; paramInt1 -= 3)
    {
      int j = i + 1;
      i = paramArrayOfByte[i];
      int k = paramArrayOfByte[j];
      j++;
      int m = paramArrayOfByte[j];
      zzcd localzzcd = zzb;
      i = (i & 0xFF) << 16 | (k & 0xFF) << 8 | m & 0xFF;
      paramAppendable.append(localzzcd.zza(i >>> 18));
      paramAppendable.append(zzb.zza(i >>> 12 & 0x3F));
      paramAppendable.append(zzb.zza(i >>> 6 & 0x3F));
      paramAppendable.append(zzb.zza(i & 0x3F));
      i = j + 1;
    }
    if (i < paramInt2) {
      zze(paramAppendable, paramArrayOfByte, i, paramInt2 - i);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */