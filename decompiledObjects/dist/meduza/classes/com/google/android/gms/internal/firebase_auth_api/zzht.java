package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbe;
import java.security.GeneralSecurityException;
import java.util.Arrays;

public final class zzht
  implements zzbe
{
  private final byte[] zza;
  private final int zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzrx zzc;
  
  private zzht(byte[] paramArrayOfByte, com.google.android.gms.internal.firebase-auth-api.zzzn paramzzzn, int paramInt)
  {
    zzc = new zzzc(paramArrayOfByte);
    zza = paramzzzn.zzb();
    zzb = paramInt;
  }
  
  public static zzbe zza(com.google.android.gms.internal.firebase-auth-api.zzfq paramzzfq)
  {
    if ((paramzzfq.zzb().zzb() >= 8) && (paramzzfq.zzb().zzb() <= 12)) {
      return new zzht(paramzzfq.zzd().zza(zzbl.zza()), paramzzfq.zzc(), paramzzfq.zzb().zzb());
    }
    throw new GeneralSecurityException("invalid salt size");
  }
  
  private final byte[] zza(byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte1 = new byte[16];
    byte[] tmp6_5 = arrayOfByte1;
    tmp6_5[0] = 0;
    byte[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 1;
    byte[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 88;
    byte[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 0;
    byte[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 0;
    byte[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 0;
    byte[] tmp36_31 = tmp31_26;
    tmp36_31[6] = 0;
    byte[] tmp42_36 = tmp36_31;
    tmp42_36[7] = 0;
    byte[] tmp48_42 = tmp42_36;
    tmp48_42[8] = 0;
    byte[] tmp54_48 = tmp48_42;
    tmp54_48[9] = 0;
    byte[] tmp60_54 = tmp54_48;
    tmp60_54[10] = 0;
    byte[] tmp66_60 = tmp60_54;
    tmp66_60[11] = 0;
    byte[] tmp72_66 = tmp66_60;
    tmp72_66[12] = 0;
    byte[] tmp78_72 = tmp72_66;
    tmp78_72[13] = 0;
    byte[] tmp84_78 = tmp78_72;
    tmp84_78[14] = 0;
    byte[] tmp90_84 = tmp84_78;
    tmp90_84[15] = 0;
    tmp90_84;
    byte[] arrayOfByte2 = new byte[16];
    byte[] tmp103_102 = arrayOfByte2;
    tmp103_102[0] = 0;
    byte[] tmp108_103 = tmp103_102;
    tmp108_103[1] = 2;
    byte[] tmp113_108 = tmp108_103;
    tmp113_108[2] = 88;
    byte[] tmp118_113 = tmp113_108;
    tmp118_113[3] = 0;
    byte[] tmp123_118 = tmp118_113;
    tmp123_118[4] = 0;
    byte[] tmp128_123 = tmp123_118;
    tmp128_123[5] = 0;
    byte[] tmp133_128 = tmp128_123;
    tmp133_128[6] = 0;
    byte[] tmp139_133 = tmp133_128;
    tmp139_133[7] = 0;
    byte[] tmp145_139 = tmp139_133;
    tmp145_139[8] = 0;
    byte[] tmp151_145 = tmp145_139;
    tmp151_145[9] = 0;
    byte[] tmp157_151 = tmp151_145;
    tmp157_151[10] = 0;
    byte[] tmp163_157 = tmp157_151;
    tmp163_157[11] = 0;
    byte[] tmp169_163 = tmp163_157;
    tmp169_163[12] = 0;
    byte[] tmp175_169 = tmp169_163;
    tmp175_169[13] = 0;
    byte[] tmp181_175 = tmp175_169;
    tmp181_175[14] = 0;
    byte[] tmp187_181 = tmp181_175;
    tmp187_181[15] = 0;
    tmp187_181;
    if ((paramArrayOfByte.length <= 12) && (paramArrayOfByte.length >= 8))
    {
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte1, 4, paramArrayOfByte.length);
      System.arraycopy(paramArrayOfByte, 0, arrayOfByte2, 4, paramArrayOfByte.length);
      paramArrayOfByte = new byte[32];
      System.arraycopy(zzc.zza(arrayOfByte1, 16), 0, paramArrayOfByte, 0, 16);
      System.arraycopy(zzc.zza(arrayOfByte2, 16), 0, paramArrayOfByte, 16, 16);
      return paramArrayOfByte;
    }
    throw new GeneralSecurityException("invalid salt size");
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      int i = paramArrayOfByte1.length;
      Object localObject = zza;
      if (i >= localObject.length + zzb + 12 + 16)
      {
        if (zzpy.zza((byte[])localObject, paramArrayOfByte1))
        {
          i = zza.length + zzb;
          localObject = new zzhk(zza(Arrays.copyOfRange(paramArrayOfByte1, zza.length, i)));
          int j = i + 12;
          return ((zzhk)localObject).zza(Arrays.copyOfRange(paramArrayOfByte1, i, j), paramArrayOfByte1, j, paramArrayOfByte2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
      }
      throw new GeneralSecurityException("ciphertext too short");
    }
    throw new NullPointerException("ciphertext is null");
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    if (paramArrayOfByte1 != null)
    {
      byte[] arrayOfByte1 = zzpp.zza(zzb + 12);
      byte[] arrayOfByte2 = Arrays.copyOf(arrayOfByte1, zzb);
      int i = zzb;
      byte[] arrayOfByte3 = Arrays.copyOfRange(arrayOfByte1, i, i + 12);
      paramArrayOfByte1 = new zzhk(zza(arrayOfByte2)).zzb(arrayOfByte3, paramArrayOfByte1, zza.length + zzb + arrayOfByte3.length, paramArrayOfByte2);
      paramArrayOfByte2 = zza;
      System.arraycopy(paramArrayOfByte2, 0, paramArrayOfByte1, 0, paramArrayOfByte2.length);
      System.arraycopy(arrayOfByte1, 0, paramArrayOfByte1, zza.length, arrayOfByte1.length);
      return paramArrayOfByte1;
    }
    throw new NullPointerException("plaintext is null");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzht
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */