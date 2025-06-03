package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class zzkc
  extends zzjs
  implements Serializable
{
  private final MessageDigest zza;
  private final int zzb;
  private final boolean zzc;
  private final String zzd;
  
  public zzkc(String paramString1, String paramString2)
  {
    paramString1 = zzc("SHA-256");
    zza = paramString1;
    zzb = paramString1.getDigestLength();
    zzd = "Hashing.sha256()";
    zzc = zzd(paramString1);
  }
  
  private static MessageDigest zzc(String paramString)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new AssertionError(paramString);
    }
  }
  
  private static boolean zzd(MessageDigest paramMessageDigest)
  {
    try
    {
      paramMessageDigest.clone();
      return true;
    }
    catch (CloneNotSupportedException paramMessageDigest) {}
    return false;
  }
  
  public final String toString()
  {
    return zzd;
  }
  
  public final zzjx zzb()
  {
    if (zzc) {}
    try
    {
      zzka localzzka = new zzka((MessageDigest)zza.clone(), zzb, null);
      return localzzka;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      for (;;) {}
    }
    return new zzka(zzc(zza.getAlgorithm()), zzb, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */