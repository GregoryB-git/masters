package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzfa
{
  public static final Charset zza = Charset.forName("US-ASCII");
  public static final Charset zzb = Charset.forName("UTF-8");
  public static final Charset zzc = Charset.forName("ISO-8859-1");
  public static final byte[] zzd;
  public static final ByteBuffer zze;
  public static final zzej zzf;
  
  static
  {
    Object localObject = new byte[0];
    zzd = (byte[])localObject;
    zze = ByteBuffer.wrap((byte[])localObject);
    int i = zzej.zza;
    localObject = new zzeh((byte[])localObject, 0, 0, false, null);
    try
    {
      ((zzeh)localObject).zza(0);
      zzf = (zzej)localObject;
      return;
    }
    catch (zzfb localzzfb)
    {
      throw new IllegalArgumentException(localzzfb);
    }
  }
  
  public static int zza(boolean paramBoolean)
  {
    if (paramBoolean) {
      return 1231;
    }
    return 1237;
  }
  
  public static int zzb(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    for (paramInt2 = 0; paramInt2 < paramInt3; paramInt2++) {
      paramInt1 = paramInt1 * 31 + paramArrayOfByte[paramInt2];
    }
    return paramInt1;
  }
  
  public static Object zzc(Object paramObject, String paramString)
  {
    if (paramObject != null) {
      return paramObject;
    }
    throw new NullPointerException("messageType");
  }
  
  public static String zzd(byte[] paramArrayOfByte)
  {
    return new String(paramArrayOfByte, zzb);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzfa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */