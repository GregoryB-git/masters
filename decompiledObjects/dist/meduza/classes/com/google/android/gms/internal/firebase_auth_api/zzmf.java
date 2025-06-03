package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import javax.crypto.KeyAgreement;

public final class zzmf
  implements com.google.android.gms.internal.firebase-auth-api.zzmd
{
  private static final byte[] zza = { 48, 46, 2, 1, 0, 48, 5, 6, 3, 43, 101, 110, 4, 34, 4, 32 };
  private static final byte[] zzb = { 48, 42, 48, 5, 6, 3, 43, 101, 110, 3, 33, 0 };
  private final Provider zzc;
  
  private zzmf(Provider paramProvider)
  {
    zzc = paramProvider;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzmd zzb()
  {
    Object localObject = zzmr.zza();
    if (localObject != null)
    {
      KeyFactory.getInstance("XDH", (Provider)localObject);
      KeyAgreement.getInstance("XDH", (Provider)localObject);
      localObject = new zzmf((Provider)localObject);
      ((zzmd)localObject).zza();
      return (com.google.android.gms.internal.firebase-auth-api.zzmd)localObject;
    }
    throw new GeneralSecurityException("Conscrypt is not available.");
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzmc zza()
  {
    Object localObject = KeyPairGenerator.getInstance("XDH", zzc);
    ((KeyPairGenerator)localObject).initialize(255);
    localObject = ((KeyPairGenerator)localObject).generateKeyPair();
    byte[] arrayOfByte1 = ((KeyPair)localObject).getPrivate().getEncoded();
    int i = arrayOfByte1.length;
    byte[] arrayOfByte2 = zza;
    if (i == arrayOfByte2.length + 32)
    {
      if (zzpy.zza(arrayOfByte2, arrayOfByte1))
      {
        arrayOfByte2 = Arrays.copyOfRange(arrayOfByte1, arrayOfByte2.length, arrayOfByte1.length);
        arrayOfByte1 = ((KeyPair)localObject).getPublic().getEncoded();
        i = arrayOfByte1.length;
        localObject = zzb;
        if (i == localObject.length + 32)
        {
          if (zzpy.zza((byte[])localObject, arrayOfByte1)) {
            return new zzmc(arrayOfByte2, Arrays.copyOfRange(arrayOfByte1, localObject.length, arrayOfByte1.length));
          }
          throw new GeneralSecurityException("Invalid encoded public key prefix");
        }
        throw new GeneralSecurityException("Invalid encoded public key length");
      }
      throw new GeneralSecurityException("Invalid encoded private key prefix");
    }
    throw new GeneralSecurityException("Invalid encoded private key length");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    Object localObject = KeyFactory.getInstance("XDH", zzc);
    if (paramArrayOfByte1.length == 32)
    {
      paramArrayOfByte1 = ((KeyFactory)localObject).generatePrivate(new PKCS8EncodedKeySpec(zzyc.zza(new byte[][] { zza, paramArrayOfByte1 })));
      if (paramArrayOfByte2.length == 32)
      {
        paramArrayOfByte2 = ((KeyFactory)localObject).generatePublic(new X509EncodedKeySpec(zzyc.zza(new byte[][] { zzb, paramArrayOfByte2 })));
        localObject = KeyAgreement.getInstance("XDH", zzc);
        ((KeyAgreement)localObject).init(paramArrayOfByte1);
        ((KeyAgreement)localObject).doPhase(paramArrayOfByte2, true);
        return ((KeyAgreement)localObject).generateSecret();
      }
      throw new InvalidKeyException("Invalid X25519 public key");
    }
    throw new InvalidKeyException("Invalid X25519 private key");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzmf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */