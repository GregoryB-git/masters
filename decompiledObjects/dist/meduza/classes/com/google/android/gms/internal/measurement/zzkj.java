package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzkj
{
  public static final Charset zza;
  public static final byte[] zzb;
  
  static
  {
    Charset.forName("US-ASCII");
    zza = Charset.forName("UTF-8");
    Charset.forName("ISO-8859-1");
    byte[] arrayOfByte = new byte[0];
    zzb = arrayOfByte;
    ByteBuffer.wrap(arrayOfByte);
    zzjk.zza(arrayOfByte, 0, arrayOfByte.length, false);
  }
  
  public static int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (int i = paramInt2; i < paramInt2 + paramInt3; i++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[i];
    }
    return paramInt1;
  }
  
  public static int zza(long paramLong)
  {
    return (int)(paramLong ^ paramLong >>> 32);
  }
  
  public static int zza(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static int zza(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    int j = zza(i, paramArrayOfByte, 0, i);
    i = j;
    if (j == 0) {
      i = 1;
    }
    return i;
  }
  
  public static <T> T zza(T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  public static <T> T zza(T paramT, String paramString)
  {
    if (paramT != null) {
      return paramT;
    }
    throw new NullPointerException(paramString);
  }
  
  public static boolean zza(zzlm paramzzlm)
  {
    if ((paramzzlm instanceof zziq)) {
      paramzzlm = (zziq)paramzzlm;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.measurement.zzkj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */