package com.google.android.gms.internal.auth;

import a0.j;
import f;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Locale;

public abstract class zzef
  implements Iterable, Serializable
{
  private static final Comparator zza = new zzdx();
  public static final zzef zzb = new zzec(zzfa.zzd);
  private static final zzee zzd;
  private int zzc = 0;
  
  static
  {
    int i = zzds.zza;
    zzd = new zzee(null);
  }
  
  public static int zzi(int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2 - paramInt1;
    if ((paramInt1 | paramInt2 | i | paramInt3 - paramInt2) < 0)
    {
      if (paramInt1 >= 0)
      {
        if (paramInt2 < paramInt1) {
          throw new IndexOutOfBoundsException(f.i("Beginning index larger than ending index: ", paramInt1, ", ", paramInt2));
        }
        throw new IndexOutOfBoundsException(f.i("End index: ", paramInt2, " >= ", paramInt3));
      }
      throw new IndexOutOfBoundsException(j.h("Beginning index: ", paramInt1, " < 0"));
    }
    return i;
  }
  
  public static zzef zzk(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzi(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return new zzec(arrayOfByte);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = zzc;
    int j = i;
    if (i == 0)
    {
      j = zzd();
      i = zze(j, 0, j);
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
    int i = zzd();
    String str2;
    if (zzd() <= 50) {
      str2 = zzgx.zza(this);
    } else {
      str2 = zzgx.zza(zzf(0, 47)).concat("...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), str2 });
  }
  
  public abstract byte zza(int paramInt);
  
  public abstract byte zzb(int paramInt);
  
  public abstract int zzd();
  
  public abstract int zze(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzef zzf(int paramInt1, int paramInt2);
  
  public abstract String zzg(Charset paramCharset);
  
  public abstract boolean zzh();
  
  public final int zzj()
  {
    return zzc;
  }
  
  public final String zzl(Charset paramCharset)
  {
    if (zzd() == 0) {
      paramCharset = "";
    } else {
      paramCharset = zzg(paramCharset);
    }
    return paramCharset;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzef
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */