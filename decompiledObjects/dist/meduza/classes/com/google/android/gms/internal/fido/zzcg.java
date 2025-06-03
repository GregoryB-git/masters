package com.google.android.gms.internal.fido;

import java.math.RoundingMode;

class zzcg
  extends zzch
{
  private volatile zzch zza;
  public final zzcd zzb;
  public final Character zzc;
  
  public zzcg(zzcd paramzzcd, Character paramCharacter)
  {
    zzb = paramzzcd;
    if (paramCharacter != null)
    {
      paramCharacter.charValue();
      if (paramzzcd.zzc('='))
      {
        i = 0;
        break label37;
      }
    }
    int i = 1;
    label37:
    if (i != 0)
    {
      zzc = paramCharacter;
      return;
    }
    throw new IllegalArgumentException(zzaq.zza("Padding character %s was already in alphabet", new Object[] { paramCharacter }));
  }
  
  public zzcg(String paramString1, String paramString2, Character paramCharacter)
  {
    this(new zzcd(paramString1, paramString2.toCharArray()), paramCharacter);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzcg))
    {
      Object localObject = (zzcg)paramObject;
      if (zzb.equals(zzb))
      {
        paramObject = zzc;
        localObject = zzc;
        if ((paramObject == localObject) || ((paramObject != null) && (paramObject.equals(localObject)))) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = zzb.hashCode();
    Character localCharacter = zzc;
    int j;
    if (localCharacter == null) {
      j = 0;
    } else {
      j = localCharacter.hashCode();
    }
    return i ^ j;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BaseEncoding.");
    localStringBuilder.append(zzb);
    if (8 % zzb.zzb != 0)
    {
      String str;
      if (zzc == null)
      {
        str = ".omitPadding()";
      }
      else
      {
        localStringBuilder.append(".withPadChar('");
        localStringBuilder.append(zzc);
        str = "')";
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public zzch zza(zzcd paramzzcd, Character paramCharacter)
  {
    return new zzcg(paramzzcd, paramCharacter);
  }
  
  public void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    paramInt1 = 0;
    zzap.zze(0, paramInt2, i);
    while (paramInt1 < paramInt2)
    {
      zze(paramAppendable, paramArrayOfByte, paramInt1, Math.min(zzb.zzd, paramInt2 - paramInt1));
      paramInt1 += zzb.zzd;
    }
  }
  
  public final int zzc(int paramInt)
  {
    zzcd localzzcd = zzb;
    int i = zzc;
    return zzcj.zza(paramInt, zzd, RoundingMode.CEILING) * i;
  }
  
  public final zzch zzd()
  {
    zzch localzzch = zza;
    Object localObject = localzzch;
    if (localzzch == null)
    {
      localObject = zzb.zzb();
      if (localObject == zzb) {
        localObject = this;
      } else {
        localObject = zza((zzcd)localObject, zzc);
      }
      zza = ((zzch)localObject);
    }
    return (zzch)localObject;
  }
  
  public final void zze(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzap.zze(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    int i = zzb.zzd;
    int j = 0;
    boolean bool;
    if (paramInt2 <= i) {
      bool = true;
    } else {
      bool = false;
    }
    zzap.zzc(bool);
    long l = 0L;
    for (i = 0; i < paramInt2; i++) {
      l = (l | paramArrayOfByte[(paramInt1 + i)] & 0xFF) << 8;
    }
    i = zzb.zzb;
    paramInt1 = j;
    while (paramInt1 < paramInt2 * 8)
    {
      paramArrayOfByte = zzb;
      paramAppendable.append(paramArrayOfByte.zza(zza & (int)(l >>> (paramInt2 + 1) * 8 - i - paramInt1)));
      paramInt1 += zzb.zzb;
    }
    if (zzc != null) {
      while (paramInt1 < zzb.zzd * 8)
      {
        zzc.charValue();
        paramAppendable.append('=');
        paramInt1 += zzb.zzb;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */