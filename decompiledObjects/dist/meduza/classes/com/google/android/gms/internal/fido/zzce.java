package com.google.android.gms.internal.fido;

final class zzce
  extends zzcg
{
  public final char[] zza = new char['Ȁ'];
  
  private zzce(zzcd paramzzcd)
  {
    super(paramzzcd, null);
    int i = zzcd.zzd(paramzzcd).length;
    int j = 0;
    boolean bool;
    if (i == 16) {
      bool = true;
    } else {
      bool = false;
    }
    zzap.zzc(bool);
    while (j < 256)
    {
      zza[j] = paramzzcd.zza(j >>> 4);
      zza[(j | 0x100)] = paramzzcd.zza(j & 0xF);
      j++;
    }
  }
  
  public zzce(String paramString1, String paramString2)
  {
    this(new zzcd("base16()", "0123456789ABCDEF".toCharArray()));
  }
  
  public final zzch zza(zzcd paramzzcd, Character paramCharacter)
  {
    return new zzce(paramzzcd);
  }
  
  public final void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    paramInt1 = 0;
    zzap.zze(0, paramInt2, i);
    while (paramInt1 < paramInt2)
    {
      i = paramArrayOfByte[paramInt1] & 0xFF;
      paramAppendable.append(zza[i]);
      paramAppendable.append(zza[(i | 0x100)]);
      paramInt1++;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzce
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */