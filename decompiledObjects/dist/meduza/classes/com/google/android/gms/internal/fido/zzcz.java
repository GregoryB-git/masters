package com.google.android.gms.internal.fido;

import a0.j;
import f;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Comparator;
import java.util.Locale;

public abstract class zzcz
  implements Iterable, Serializable
{
  private static final Comparator zza = new zzcr();
  public static final zzcz zzb = new zzcw(zzde.zzd);
  private static final zzcy zzd;
  private int zzc = 0;
  
  static
  {
    int i = zzcp.zza;
    zzd = new zzcy(null);
  }
  
  public static int zzj(int paramInt1, int paramInt2, int paramInt3)
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
  
  public static zzcz zzl(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzj(0, paramInt2, paramArrayOfByte.length);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramInt2);
    return new zzcw(arrayOfByte);
  }
  
  public abstract boolean equals(Object paramObject);
  
  public final int hashCode()
  {
    int i = zzc;
    int j = i;
    if (i == 0)
    {
      j = zzd();
      i = zzf(j, 0, j);
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
      str2 = zzdg.zza(this);
    } else {
      str2 = zzdg.zza(zzg(0, 47)).concat("...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), str2 });
  }
  
  public abstract byte zza(int paramInt);
  
  public abstract byte zzb(int paramInt);
  
  public abstract int zzd();
  
  public abstract void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract int zzf(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzcz zzg(int paramInt1, int paramInt2);
  
  public abstract InputStream zzh();
  
  public abstract ByteBuffer zzi();
  
  public final int zzk()
  {
    return zzc;
  }
  
  public final byte[] zzm()
  {
    int i = zzd();
    if (i == 0) {
      return zzde.zzd;
    }
    byte[] arrayOfByte = new byte[i];
    zze(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */