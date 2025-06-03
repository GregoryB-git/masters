package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzaix;
import com.google.android.gms.internal.firebase-auth-api.zzaji;
import g;
import java.io.Serializable;
import java.util.Locale;

public abstract class zzaiw
  implements Serializable, Iterable<Byte>
{
  public static final com.google.android.gms.internal.firebase-auth-api.zzaiw zza = new zzajh(zzaki.zzb);
  private static final com.google.android.gms.internal.firebase-auth-api.zzajd zzb = new zzajg(null);
  private int zzc = 0;
  
  static
  {
    new zzaiy();
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
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaiw zza(String paramString)
  {
    return new zzajh(paramString.getBytes(zzaki.zza));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaiw zza(byte[] paramArrayOfByte)
  {
    return zza(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaiw zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zza(paramInt1, paramInt1 + paramInt2, paramArrayOfByte.length);
    return new zzajh(zzb.zza(paramArrayOfByte, paramInt1, paramInt2));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzaiw zzb(byte[] paramArrayOfByte)
  {
    return new zzajh(paramArrayOfByte);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzajf zzc(int paramInt)
  {
    return new zzajf(paramInt, null);
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
      str2 = zzamo.zza(this);
    } else {
      str2 = g.d(zzamo.zza(zza(0, 47)), "...");
    }
    return String.format(localLocale, "<ByteString@%s size=%d contents=\"%s\">", new Object[] { str1, Integer.valueOf(i), str2 });
  }
  
  public abstract byte zza(int paramInt);
  
  public final int zza()
  {
    return zzc;
  }
  
  public abstract com.google.android.gms.internal.firebase-auth-api.zzaiw zza(int paramInt1, int paramInt2);
  
  public abstract void zza(zzaix paramzzaix);
  
  public abstract void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3);
  
  public abstract byte zzb(int paramInt);
  
  public abstract int zzb();
  
  public abstract int zzb(int paramInt1, int paramInt2, int paramInt3);
  
  public abstract zzaji zzc();
  
  public final byte[] zzd()
  {
    int i = zzb();
    if (i == 0) {
      return zzaki.zzb;
    }
    byte[] arrayOfByte = new byte[i];
    zza(arrayOfByte, 0, 0, i);
    return arrayOfByte;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaiw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */