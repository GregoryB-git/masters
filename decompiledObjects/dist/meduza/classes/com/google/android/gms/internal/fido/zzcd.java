package com.google.android.gms.internal.fido;

import f;
import java.math.RoundingMode;
import java.util.Arrays;

final class zzcd
{
  public final int zza;
  public final int zzb;
  public final int zzc;
  public final int zzd;
  private final String zze;
  private final char[] zzf;
  private final byte[] zzg;
  private final boolean zzh;
  
  public zzcd(String paramString, char[] paramArrayOfChar)
  {
    this(paramString, paramArrayOfChar, arrayOfByte, false);
  }
  
  private zzcd(String paramString, char[] paramArrayOfChar, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    zze = paramString;
    paramArrayOfChar.getClass();
    zzf = paramArrayOfChar;
    try
    {
      int i = paramArrayOfChar.length;
      int j = zzcj.zzb(i, RoundingMode.UNNECESSARY);
      zzb = j;
      int k = Integer.numberOfTrailingZeros(j);
      int m = 1 << 3 - k;
      zzc = m;
      zzd = (j >> k);
      zza = (i - 1);
      zzg = paramArrayOfByte;
      paramString = new boolean[m];
      for (i = 0; i < zzd; i++) {
        paramString[zzcj.zza(i * 8, zzb, RoundingMode.CEILING)] = 1;
      }
      zzh = paramBoolean;
      return;
    }
    catch (ArithmeticException paramString)
    {
      throw new IllegalArgumentException(f.h("Illegal alphabet length ", paramArrayOfChar.length), paramString);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof zzcd))
    {
      paramObject = (zzcd)paramObject;
      if ((zzh == zzh) && (Arrays.equals(zzf, zzf))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = Arrays.hashCode(zzf);
    int j;
    if (true != zzh) {
      j = 1237;
    } else {
      j = 1231;
    }
    return i + j;
  }
  
  public final String toString()
  {
    return zze;
  }
  
  public final char zza(int paramInt)
  {
    return zzf[paramInt];
  }
  
  public final zzcd zzb()
  {
    Object localObject1 = zzf;
    int i = localObject1.length;
    for (int j = 0; j < i; j++) {
      if (zzad.zza(localObject1[j]))
      {
        localObject1 = zzf;
        int k = localObject1.length;
        int m;
        for (j = 0;; j++)
        {
          i = 65;
          if (j >= k) {
            break;
          }
          m = localObject1[j];
          if ((m >= 65) && (m <= 90))
          {
            j = 1;
            break label76;
          }
        }
        j = 0;
        label76:
        if ((j ^ 0x1) != 0)
        {
          Object localObject2 = new char[zzf.length];
          int n;
          for (j = 0;; j++)
          {
            localObject1 = zzf;
            if (j >= localObject1.length) {
              break;
            }
            n = localObject1[j];
            k = n;
            if (zzad.zza(n)) {
              k = n ^ 0x20;
            }
            localObject2[j] = ((char)(char)k);
          }
          localObject2 = new zzcd(zze.concat(".upperCase()"), (char[])localObject2);
          localObject1 = localObject2;
          if (zzh) {
            if (zzh)
            {
              localObject1 = localObject2;
            }
            else
            {
              localObject1 = zzg;
              localObject1 = Arrays.copyOf((byte[])localObject1, localObject1.length);
              j = i;
              while (j <= 90)
              {
                i = j | 0x20;
                localObject3 = zzg;
                k = localObject3[j];
                m = localObject3[i];
                char c;
                if (k == -1)
                {
                  localObject1[j] = ((byte)m);
                }
                else
                {
                  n = (char)j;
                  c = (char)i;
                  if (m != -1) {
                    break label272;
                  }
                  localObject1[i] = ((byte)k);
                }
                j++;
                continue;
                label272:
                throw new IllegalStateException(zzaq.zza("Can't ignoreCase() since '%s' and '%s' encode different values", new Object[] { Character.valueOf(n), Character.valueOf(c) }));
              }
              Object localObject3 = zze;
              localObject2 = zzf;
              localObject1 = new zzcd(((String)localObject3).concat(".ignoreCase()"), (char[])localObject2, (byte[])localObject1, true);
            }
          }
          return (zzcd)localObject1;
        }
        throw new IllegalStateException("Cannot call upperCase() on a mixed-case alphabet");
      }
    }
    return this;
  }
  
  public final boolean zzc(char paramChar)
  {
    byte[] arrayOfByte = zzg;
    return (arrayOfByte.length > 61) && (arrayOfByte[61] != -1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */