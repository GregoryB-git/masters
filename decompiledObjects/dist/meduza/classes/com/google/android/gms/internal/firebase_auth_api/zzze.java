package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzrx;
import f;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.Mac;

public final class zzze
  implements zzrx
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zzb;
  private final ThreadLocal<Mac> zzb;
  private final String zzc;
  private final Key zzd;
  private final int zze;
  
  public zzze(String paramString, Key paramKey)
  {
    zzzh localzzzh = new zzzh(this);
    zzb = localzzzh;
    if (zza.zza())
    {
      zzc = paramString;
      zzd = paramKey;
      if (paramKey.getEncoded().length >= 16)
      {
        paramString.getClass();
        paramString.hashCode();
        int i = -1;
        switch (paramString.hashCode())
        {
        default: 
          break;
        case 392317873: 
          if (paramString.equals("HMACSHA512")) {
            i = 4;
          }
          break;
        case 392316170: 
          if (paramString.equals("HMACSHA384")) {
            i = 3;
          }
          break;
        case 392315118: 
          if (paramString.equals("HMACSHA256")) {
            i = 2;
          }
          break;
        case 392315023: 
          if (paramString.equals("HMACSHA224")) {
            i = 1;
          }
          break;
        case -1823053428: 
          if (paramString.equals("HMACSHA1")) {
            i = 0;
          }
          break;
        }
        switch (i)
        {
        default: 
          throw new NoSuchAlgorithmException(f.j("unknown Hmac algorithm: ", paramString));
        case 4: 
          i = 64;
          break;
        case 3: 
          i = 48;
          break;
        case 2: 
          i = 32;
          break;
        case 1: 
          i = 28;
          break;
        case 0: 
          i = 20;
        }
        zze = i;
        localzzzh.get();
        return;
      }
      throw new InvalidAlgorithmParameterException("key size too small, need at least 16 bytes");
    }
    throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte, int paramInt)
  {
    if (paramInt <= zze)
    {
      ((Mac)zzb.get()).update(paramArrayOfByte);
      return Arrays.copyOf(((Mac)zzb.get()).doFinal(), paramInt);
    }
    throw new InvalidAlgorithmParameterException("tag size too big");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */