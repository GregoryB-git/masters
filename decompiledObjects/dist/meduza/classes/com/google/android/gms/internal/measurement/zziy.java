package com.google.android.gms.internal.measurement;

import g;
import java.io.Serializable;
import java.util.Locale;

public abstract class zziy
  implements Serializable, Iterable<Byte>
{
  public static final zziy zza = new zzjf(zzkj.zzb);
  private static final zzjb zzb = new zzji(null);
  private int zzc = 0;
  
  static
  {
    new zzja();
  }
  
  public static int zza(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1) {
          throw new IndexOutOfBoundsException(g.c("Beginning index larger than ending index: ", paramInt1, ", ", paramInt2));
        }
        throw new IndexOutOfBoundsException(g.c("End index: ", paramInt2, " >= ", paramInt3));
      }
      StringBuilder localStringBuilder = new StringBuilder("Beginning index: ");
      localStringBuilder.append(paramInt1);
      localStringBuilder.append(" < 0");
      throw new IndexOutOfBoundsException(localStringBuilder.toString());
    }
    return i;
  }
  
  public static zziy zza(String paramString)
  {
    return new zzjf(paramString.getBytes(zzkj.zza));
  }
  
  public static zziy zza(byte[] paramArrayOfByte)
  {
    return zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static zziy zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zza(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new zzjf(zzb.zza(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static zziy zzb(byte[] paramArrayOfByte)
  {
    return new zzjf(paramArrayOfByte);
  }
  
  public static zzjd zzc(int paramInt)
  {
    return new zzjd(paramInt, null);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = zzc;
    int j = i;
    if (i == 0)
    {
      j = zzb();
      i = zzb(j, 0, j);
      j = i;
      if (i == 0) {
        j = 1;
      }
      zzc = j;
    }
    return j;
  }
  
  public final String toString()
  {
    Locale localLocale = Locale.ROOT;
    String str1 = Integer.toHexString(System.identityHashCode(this));
    int i = zzb();
    String str2;
    if (zzb() <= 50) {
      str2 = zzmq.zza(this);
    } else {
      str2 = g.d(zzmq.zza(zza(0, 47)), "...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), str2 });
  }
  
  public abstract byte zza(int paramInt);
  
  public final int zza()
  {
    return zzc;
  }
  
  public abstract zziy zza(int paramInt1, int paramInt2);
  
  public abstract void zza(zziv paramzziv);
  
  public abstract byte zzb(int paramInt);
  
  public abstract int zzb();
  
  public abstract int zzb(int paramInt1, int paramInt2, int paramInt3);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zziy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */