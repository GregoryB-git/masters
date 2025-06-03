package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import java.util.Arrays;

public final class zzzn
{
  private final byte[] zza;
  
  private zzzn(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    zza = arrayOfByte;
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramInt2);
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzzn zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte != null)
    {
      int i = paramArrayOfByte.length;
      int j = i;
      if (i > paramArrayOfByte.length) {
        j = paramArrayOfByte.length;
      }
      return new zzzn(paramArrayOfByte, 0, j);
    }
    throw new NullPointerException("data must be non-null");
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof zzzn)) {
      return false;
    }
    return Arrays.equals(zza, zza);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(zza);
  }
  
  public final String toString()
  {
    return j.j("Bytes(", zzza.zza(zza), ")");
  }
  
  public final int zza()
  {
    return zza.length;
  }
  
  public final byte[] zzb()
  {
    byte[] arrayOfByte1 = zza;
    byte[] arrayOfByte2 = new byte[arrayOfByte1.length];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte2, 0, arrayOfByte1.length);
    return arrayOfByte2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzn
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */