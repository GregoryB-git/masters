package com.google.android.gms.internal.fido;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

public final class zzde
{
  public static final Charset zza = Charset.forName("US-ASCII");
  public static final Charset zzb = Charset.forName("UTF-8");
  public static final Charset zzc = Charset.forName("ISO-8859-1");
  public static final byte[] zzd;
  public static final ByteBuffer zze;
  public static final zzdd zzf;
  
  static
  {
    Object localObject = new byte[0];
    zzd = (byte[])localObject;
    zze = ByteBuffer.wrap((byte[])localObject);
    int i = zzdd.zza;
    localObject = new zzdb((byte[])localObject, 0, 0, false, null);
    try
    {
      ((zzdb)localObject).zza(0);
      zzf = (zzdd)localObject;
      return;
    }
    catch (zzdf localzzdf)
    {
      throw new IllegalArgumentException(localzzdf);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzde
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */