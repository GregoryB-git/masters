package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class zzxw
  implements zzbe
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzij.zza zza = zzij.zza.zza;
  private static final ThreadLocal<Cipher> zzb = new zzxz();
  private static final ThreadLocal<Cipher> zzc = new zzxy();
  private final byte[] zzd;
  private final byte[] zze;
  private final byte[] zzf;
  private final SecretKeySpec zzg;
  private final int zzh;
  
  private zzxw(byte[] paramArrayOfByte1, int paramInt, byte[] paramArrayOfByte2)
  {
    if (zza.zza())
    {
      if ((paramInt != 12) && (paramInt != 16)) {
        throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
      }
      zzh = paramInt;
      zzzi.zza(paramArrayOfByte1.length);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramArrayOfByte1, "AES");
      zzg = localSecretKeySpec;
      paramArrayOfByte1 = (Cipher)zzb.get();
      paramArrayOfByte1.init(1, localSecretKeySpec);
      paramArrayOfByte1 = zza(paramArrayOfByte1.doFinal(new byte[16]));
      zzd = paramArrayOfByte1;
      zze = zza(paramArrayOfByte1);
      zzf = paramArrayOfByte2;
      return;
    }
    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzdf paramzzdf)
  {
    if (zza.zza())
    {
      if (paramzzdf.zzc().zzd() == 16) {
        return new zzxw(paramzzdf.zze().zza(zzbl.zza()), paramzzdf.zzc().zzb(), paramzzdf.zzd().zzb());
      }
      throw new GeneralSecurityException(j.g("AesEaxJce only supports 16 byte tag size, not ", paramzzdf.zzc().zzd()));
    }
    throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
  }
  
  private final byte[] zza(Cipher paramCipher, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    Object localObject1 = new byte[16];
    localObject1[15] = ((byte)(byte)paramInt1);
    if (paramInt3 == 0)
    {
      zzc((byte[])localObject1, zzd);
      return paramCipher.doFinal((byte[])localObject1);
    }
    Object localObject2 = new byte[16];
    paramCipher.doFinal((byte[])localObject1, 0, 16, (byte[])localObject2);
    paramInt1 = 0;
    Object localObject3;
    for (;;)
    {
      localObject3 = localObject1;
      if (paramInt3 - paramInt1 <= 16) {
        break;
      }
      for (int i = 0; i < 16; i++) {
        localObject2[i] = ((byte)(byte)(localObject2[i] ^ paramArrayOfByte[(paramInt2 + paramInt1 + i)]));
      }
      paramCipher.doFinal((byte[])localObject2, 0, 16, (byte[])localObject3);
      paramInt1 += 16;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
    paramArrayOfByte = Arrays.copyOfRange(paramArrayOfByte, paramInt1 + paramInt2, paramInt2 + paramInt3);
    if (paramArrayOfByte.length == 16)
    {
      zzc(paramArrayOfByte, zzd);
    }
    else
    {
      localObject1 = Arrays.copyOf(zze, 16);
      for (paramInt1 = 0; paramInt1 < paramArrayOfByte.length; paramInt1++) {
        localObject1[paramInt1] = ((byte)(byte)(localObject1[paramInt1] ^ paramArrayOfByte[paramInt1]));
      }
      localObject1[paramArrayOfByte.length] = ((byte)(byte)(localObject1[paramArrayOfByte.length] ^ 0x80));
      paramArrayOfByte = (byte[])localObject1;
    }
    zzc((byte[])localObject2, paramArrayOfByte);
    paramCipher.doFinal((byte[])localObject2, 0, 16, (byte[])localObject3);
    return (byte[])localObject3;
  }
  
  private static byte[] zza(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte = new byte[16];
    int k;
    for (int i = 0; i < 15; i = k)
    {
      int j = paramArrayOfByte[i];
      k = i + 1;
      arrayOfByte[i] = ((byte)(byte)(j << 1 ^ (paramArrayOfByte[k] & 0xFF) >>> 7));
    }
    i = paramArrayOfByte[15];
    arrayOfByte[15] = ((byte)(byte)(paramArrayOfByte[0] >> 7 & 0x87 ^ i << 1));
    return arrayOfByte;
  }
  
  private static void zzc(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    for (int j = 0; j < i; j++) {
      paramArrayOfByte1[j] = ((byte)(byte)(paramArrayOfByte1[j] ^ paramArrayOfByte2[j]));
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    byte[] arrayOfByte1 = zzf;
    int j = i - arrayOfByte1.length - zzh - 16;
    if (j >= 0)
    {
      if (zzpy.zza(arrayOfByte1, paramArrayOfByte1))
      {
        Cipher localCipher = (Cipher)zzb.get();
        localCipher.init(1, zzg);
        byte[] arrayOfByte2 = zza(localCipher, 0, paramArrayOfByte1, zzf.length, zzh);
        i = 0;
        arrayOfByte1 = paramArrayOfByte2;
        if (paramArrayOfByte2 == null) {
          arrayOfByte1 = new byte[0];
        }
        paramArrayOfByte2 = zza(localCipher, 1, arrayOfByte1, 0, arrayOfByte1.length);
        arrayOfByte1 = zza(localCipher, 2, paramArrayOfByte1, zzf.length + zzh, j);
        int k = paramArrayOfByte1.length;
        int m = 0;
        while (i < 16)
        {
          m = (byte)(m | paramArrayOfByte1[(k - 16 + i)] ^ paramArrayOfByte2[i] ^ arrayOfByte2[i] ^ arrayOfByte1[i]);
          i++;
        }
        if (m == 0)
        {
          paramArrayOfByte2 = (Cipher)zzc.get();
          paramArrayOfByte2.init(1, zzg, new IvParameterSpec(arrayOfByte2));
          return paramArrayOfByte2.doFinal(paramArrayOfByte1, zzf.length + zzh, j);
        }
        throw new AEADBadTagException("tag mismatch");
      }
      throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
    throw new GeneralSecurityException("ciphertext too short");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = paramArrayOfByte1.length;
    byte[] arrayOfByte1 = zzf;
    int j = arrayOfByte1.length;
    int k = zzh;
    if (i <= Integer.MAX_VALUE - j - k - 16)
    {
      arrayOfByte1 = Arrays.copyOf(arrayOfByte1, arrayOfByte1.length + k + paramArrayOfByte1.length + 16);
      byte[] arrayOfByte2 = zzpp.zza(zzh);
      i = zzf.length;
      j = zzh;
      k = 0;
      System.arraycopy(arrayOfByte2, 0, arrayOfByte1, i, j);
      Object localObject = (Cipher)zzb.get();
      ((Cipher)localObject).init(1, zzg);
      arrayOfByte2 = zza((Cipher)localObject, 0, arrayOfByte2, 0, arrayOfByte2.length);
      if (paramArrayOfByte2 == null) {
        paramArrayOfByte2 = new byte[0];
      }
      paramArrayOfByte2 = zza((Cipher)localObject, 1, paramArrayOfByte2, 0, paramArrayOfByte2.length);
      Cipher localCipher = (Cipher)zzc.get();
      localCipher.init(1, zzg, new IvParameterSpec(arrayOfByte2));
      localCipher.doFinal(paramArrayOfByte1, 0, paramArrayOfByte1.length, arrayOfByte1, zzf.length + zzh);
      localObject = zza((Cipher)localObject, 2, arrayOfByte1, zzf.length + zzh, paramArrayOfByte1.length);
      j = zzf.length;
      int m = paramArrayOfByte1.length;
      i = zzh;
      while (k < 16)
      {
        arrayOfByte1[(j + m + i + k)] = ((byte)(byte)(paramArrayOfByte2[k] ^ arrayOfByte2[k] ^ localObject[k]));
        k++;
      }
      return arrayOfByte1;
    }
    throw new GeneralSecurityException("plaintext too long");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzxw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */