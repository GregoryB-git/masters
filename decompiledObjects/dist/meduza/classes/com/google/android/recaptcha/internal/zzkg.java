package com.google.android.recaptcha.internal;

import f;
import java.math.RoundingMode;
import java.util.Objects;

class zzkg
  extends zzkh
{
  public final zzkd zza;
  public final Character zzb;
  
  public zzkg(zzkd paramzzkd, Character paramCharacter)
  {
    zza = paramzzkd;
    if (paramCharacter != null)
    {
      paramCharacter.charValue();
      if (paramzzkd.zzd('=')) {
        throw new IllegalArgumentException(zzji.zza("Padding character %s was already in alphabet", new Object[] { paramCharacter }));
      }
    }
    zzb = paramCharacter;
  }
  
  public zzkg(String paramString1, String paramString2, Character paramCharacter)
  {
    this(new zzkd(paramString1, paramString2.toCharArray()), paramCharacter);
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzkg))
    {
      paramObject = (zzkg)paramObject;
      if ((zza.equals(zza)) && (Objects.equals(zzb, zzb))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    Character localCharacter = zzb;
    int i = zza.hashCode();
    return Objects.hashCode(localCharacter) ^ i;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("BaseEncoding.");
    localStringBuilder.append(zza);
    if (8 % zza.zzb != 0)
    {
      String str;
      if (zzb == null)
      {
        str = ".omitPadding()";
      }
      else
      {
        localStringBuilder.append(".withPadChar('");
        localStringBuilder.append(zzb);
        str = "')";
      }
      localStringBuilder.append(str);
    }
    return localStringBuilder.toString();
  }
  
  public int zza(byte[] paramArrayOfByte, CharSequence paramCharSequence)
  {
    CharSequence localCharSequence = zze(paramCharSequence);
    int i = localCharSequence.length();
    if (zza.zzc(i))
    {
      i = 0;
      int j = i;
      while (i < localCharSequence.length())
      {
        long l1 = 0L;
        int k = 0;
        for (int m = k;; m = n)
        {
          paramCharSequence = zza;
          if (k >= zzc) {
            break;
          }
          long l2 = l1 << zzb;
          l1 = l2;
          n = m;
          if (i + k < localCharSequence.length())
          {
            l1 = l2 | zza.zzb(localCharSequence.charAt(m + i));
            n = m + 1;
          }
          k++;
        }
        k = zzd;
        int i1 = zzb;
        int n = (k - 1) * 8;
        while (n >= k * 8 - m * i1)
        {
          paramArrayOfByte[j] = ((byte)(byte)(int)(l1 >>> n & 0xFF));
          n -= 8;
          j++;
        }
        i += zza.zzc;
      }
      return j;
    }
    throw new zzkf(f.h("Invalid input length ", localCharSequence.length()));
  }
  
  public void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = paramArrayOfByte.length;
    paramInt1 = 0;
    zzjf.zzd(0, paramInt2, i);
    while (paramInt1 < paramInt2)
    {
      zzf(paramAppendable, paramArrayOfByte, paramInt1, Math.min(zza.zzd, paramInt2 - paramInt1));
      paramInt1 += zza.zzd;
    }
  }
  
  public final int zzc(int paramInt)
  {
    return (int)((zza.zzb * paramInt + 7L) / 8L);
  }
  
  public final int zzd(int paramInt)
  {
    zzkd localzzkd = zza;
    paramInt = zzkj.zza(paramInt, zzd, RoundingMode.CEILING);
    return zzc * paramInt;
  }
  
  public final CharSequence zze(CharSequence paramCharSequence)
  {
    paramCharSequence.getClass();
    Character localCharacter = zzb;
    if (localCharacter == null) {
      return paramCharSequence;
    }
    localCharacter.charValue();
    int i = paramCharSequence.length();
    int j;
    do
    {
      j = i - 1;
      if (j < 0) {
        break;
      }
      i = j;
    } while (paramCharSequence.charAt(j) == '=');
    return paramCharSequence.subSequence(0, j + 1);
  }
  
  public final void zzf(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzjf.zzd(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    int i = zza.zzd;
    int j = 0;
    boolean bool;
    if (paramInt2 <= i) {
      bool = true;
    } else {
      bool = false;
    }
    zzjf.zza(bool);
    long l = 0L;
    for (i = 0; i < paramInt2; i++) {
      l = (l | paramArrayOfByte[(paramInt1 + i)] & 0xFF) << 8;
    }
    paramArrayOfByte = zza;
    paramInt1 = j;
    while (paramInt1 < paramInt2 * 8)
    {
      i = zzb;
      zzkd localzzkd = zza;
      paramAppendable.append(localzzkd.zza((int)(l >>> (paramInt2 + 1) * 8 - i - paramInt1) & zza));
      paramInt1 += zza.zzb;
    }
    if (zzb != null) {
      while (paramInt1 < zza.zzd * 8)
      {
        zzb.charValue();
        paramAppendable.append('=');
        paramInt1 += zza.zzb;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */