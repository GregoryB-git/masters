package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbk;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzya
  implements zzbk
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private static final Collection<Integer> zzb = Arrays.asList(new Integer[] { Integer.valueOf(64) });
  private static final byte[] zzc = new byte[16];
  private static final ThreadLocal<Cipher> zzd = new zzyd();
  private final com.google.android.gms.internal.firebase-auth-api.zzzc zze;
  private final byte[] zzf;
  private final byte[] zzg;
  
  private zzya(byte[] paramArrayOfByte, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn)
  {
    if (zza.zza())
    {
      if (zzb.contains(Integer.valueOf(paramArrayOfByte.length)))
      {
        byte[] arrayOfByte = Arrays.copyOfRange(paramArrayOfByte, 0, paramArrayOfByte.length / 2);
        zzf = Arrays.copyOfRange(paramArrayOfByte, paramArrayOfByte.length / 2, paramArrayOfByte.length);
        zze = new zzzc(arrayOfByte);
        zzg = paramzzzn.zzb();
        return;
      }
      int i = paramArrayOfByte.length;
      paramArrayOfByte = new StringBuilder("invalid key size: ");
      paramArrayOfByte.append(i);
      paramArrayOfByte.append(" bytes; key must have 64 bytes");
      throw new InvalidKeyException(paramArrayOfByte.toString());
    }
    throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
  }
  
  public static zzbk zza(com.google.android.gms.internal.firebase-auth-api.zzio paramzzio)
  {
    return new zzya(paramzzio.zze().zza(zzbl.zza()), paramzzio.zzd());
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    Object localObject = zzg;
    if (i >= localObject.length + 16)
    {
      if (zzpy.zza((byte[])localObject, paramArrayOfByte1))
      {
        localObject = (Cipher)zzd.get();
        byte[] arrayOfByte1 = zzg;
        byte[] arrayOfByte2 = Arrays.copyOfRange(paramArrayOfByte1, arrayOfByte1.length, arrayOfByte1.length + 16);
        arrayOfByte1 = (byte[])arrayOfByte2.clone();
        arrayOfByte1[8] = ((byte)(byte)(arrayOfByte1[8] & 0x7F));
        arrayOfByte1[12] = ((byte)(byte)(arrayOfByte1[12] & 0x7F));
        ((Cipher)localObject).init(2, new SecretKeySpec(zzf, "AES"), new IvParameterSpec(arrayOfByte1));
        int j = zzg.length + 16;
        i = paramArrayOfByte1.length - j;
        localObject = ((Cipher)localObject).doFinal(paramArrayOfByte1, j, i);
        j = 0;
        paramArrayOfByte1 = (byte[])localObject;
        if (i == 0)
        {
          paramArrayOfByte1 = (byte[])localObject;
          if (localObject == null)
          {
            paramArrayOfByte1 = (byte[])localObject;
            if (zzzj.zza()) {
              paramArrayOfByte1 = new byte[0];
            }
          }
        }
        byte[][] arrayOfByte = new byte[2][];
        arrayOfByte[0] = paramArrayOfByte2;
        arrayOfByte[1] = paramArrayOfByte1;
        paramArrayOfByte2 = zze.zza(zzc, 16);
        for (i = 0; i <= 0; i++)
        {
          arrayOfByte1 = arrayOfByte[i];
          localObject = arrayOfByte1;
          if (arrayOfByte1 == null) {
            localObject = new byte[0];
          }
          paramArrayOfByte2 = zzyc.zza(zzrn.zzb(paramArrayOfByte2), zze.zza((byte[])localObject, 16));
        }
        localObject = arrayOfByte[1];
        if (localObject.length >= 16)
        {
          if (localObject.length >= paramArrayOfByte2.length)
          {
            int k = localObject.length;
            int m = paramArrayOfByte2.length;
            arrayOfByte1 = Arrays.copyOf((byte[])localObject, localObject.length);
            for (i = j;; i++)
            {
              localObject = arrayOfByte1;
              if (i >= paramArrayOfByte2.length) {
                break;
              }
              j = k - m + i;
              arrayOfByte1[j] = ((byte)(byte)(arrayOfByte1[j] ^ paramArrayOfByte2[i]));
            }
          }
          throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
        }
        localObject = zzyc.zza(zzrn.zza((byte[])localObject), zzrn.zzb(paramArrayOfByte2));
        if (MessageDigest.isEqual(arrayOfByte2, zze.zza((byte[])localObject, 16))) {
          return paramArrayOfByte1;
        }
        throw new AEADBadTagException("Integrity check failed.");
      }
      throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
    throw new GeneralSecurityException("Ciphertext too short.");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzya
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */