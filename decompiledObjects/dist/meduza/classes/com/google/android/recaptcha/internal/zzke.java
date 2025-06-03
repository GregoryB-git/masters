package com.google.android.recaptcha.internal;

import f;

final class zzke
  extends zzkg
{
  public zzke(String paramString1, String paramString2, Character paramCharacter)
  {
    super(paramString1, paramCharacter);
    boolean bool;
    if (zzkd.zze(paramString1).length == 64) {
      bool = true;
    } else {
      bool = false;
    }
    zzjf.zza(bool);
  }
  
  public final int zza(byte[] paramArrayOfByte, CharSequence paramCharSequence)
  {
    paramCharSequence = zze(paramCharSequence);
    int i = paramCharSequence.length();
    if (zza.zzc(i))
    {
      int j = 0;
      i = 0;
      while (j < paramCharSequence.length())
      {
        zzkd localzzkd = zza;
        int k = j + 1;
        int m = localzzkd.zzb(paramCharSequence.charAt(j));
        j = zza.zzb(paramCharSequence.charAt(k));
        int n = i + 1;
        m = m << 18 | j << 12;
        paramArrayOfByte[i] = ((byte)(byte)(m >>> 16));
        i = k + 1;
        if (i < paramCharSequence.length())
        {
          localzzkd = zza;
          j = i + 1;
          k = m | localzzkd.zzb(paramCharSequence.charAt(i)) << 6;
          i = n + 1;
          paramArrayOfByte[n] = ((byte)(byte)(k >>> 8 & 0xFF));
          if (j < paramCharSequence.length())
          {
            paramArrayOfByte[i] = ((byte)(byte)((k | zza.zzb(paramCharSequence.charAt(j))) & 0xFF));
            i++;
            j++;
          }
        }
        else
        {
          j = i;
          i = n;
        }
      }
      return i;
    }
    throw new zzkf(f.h("Invalid input length ", paramCharSequence.length()));
  }
  
  public final void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    paramInt1 = paramArrayOfByte.length;
    int i = 0;
    zzjf.zzd(0, paramInt2, paramInt1);
    for (paramInt1 = paramInt2; paramInt1 >= 3; paramInt1 -= 3)
    {
      int j = i + 1;
      i = paramArrayOfByte[i];
      int k = paramArrayOfByte[j];
      j++;
      int m = paramArrayOfByte[j];
      zzkd localzzkd = zza;
      i = (i & 0xFF) << 16 | (k & 0xFF) << 8 | m & 0xFF;
      paramAppendable.append(localzzkd.zza(i >>> 18));
      paramAppendable.append(zza.zza(i >>> 12 & 0x3F));
      paramAppendable.append(zza.zza(i >>> 6 & 0x3F));
      paramAppendable.append(zza.zza(i & 0x3F));
      i = j + 1;
    }
    if (i < paramInt2) {
      zzf(paramAppendable, paramArrayOfByte, i, paramInt2 - i);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzke
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */