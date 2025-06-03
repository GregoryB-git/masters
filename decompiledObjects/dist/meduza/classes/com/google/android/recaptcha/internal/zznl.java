package com.google.android.recaptcha.internal;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zznl
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
    zzli.zzH(arrayOfByte, 0, 0, false);
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
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zznl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */