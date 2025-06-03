package com.google.android.gms.internal.fido;

import java.io.IOException;

public abstract class zzch
{
  private static final zzch zza;
  private static final zzch zzb;
  private static final zzch zzc;
  private static final zzch zzd;
  private static final zzch zze = new zzce("base16()", "0123456789ABCDEF");
  
  static
  {
    Character localCharacter = Character.valueOf('=');
    zza = new zzcf("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", localCharacter);
    zzb = new zzcf("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", localCharacter);
    zzc = new zzcg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", localCharacter);
    zzd = new zzcg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", localCharacter);
  }
  
  public static zzch zzf()
  {
    return zze;
  }
  
  public abstract void zzb(Appendable paramAppendable, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public abstract int zzc(int paramInt);
  
  public abstract zzch zzd();
  
  public final String zzg(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzap.zze(0, paramInt2, paramArrayOfByte.length);
    StringBuilder localStringBuilder = new StringBuilder(zzc(paramInt2));
    try
    {
      zzb(localStringBuilder, paramArrayOfByte, 0, paramInt2);
      return localStringBuilder.toString();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzch
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */