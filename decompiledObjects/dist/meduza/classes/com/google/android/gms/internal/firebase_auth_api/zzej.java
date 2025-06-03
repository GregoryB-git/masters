package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import com.google.android.gms.internal.firebase-auth-api.zzbo;
import com.google.android.gms.internal.firebase-auth-api.zzcg;
import com.google.android.gms.internal.firebase-auth-api.zzcr;
import com.google.android.gms.internal.firebase-auth-api.zzpq;
import java.nio.Buffer;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public final class zzej
  implements com.google.android.gms.internal.firebase-auth-api.zzbe
{
  private static final byte[] zza = new byte[0];
  private static final Set<String> zzb;
  private final String zzc;
  private final zzcg zzd;
  private final com.google.android.gms.internal.firebase-auth-api.zzbe zze;
  
  static
  {
    HashSet localHashSet = new HashSet();
    localHashSet.add("type.googleapis.com/google.crypto.tink.AesGcmKey");
    localHashSet.add("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
    localHashSet.add("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    localHashSet.add("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
    localHashSet.add("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
    localHashSet.add("type.googleapis.com/google.crypto.tink.AesEaxKey");
    zzb = Collections.unmodifiableSet(localHashSet);
  }
  
  @Deprecated
  private zzej(com.google.android.gms.internal.firebase-auth-api.zzwf paramzzwf, com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe)
  {
    String str = paramzzwf.zzf();
    if (zzb.contains(str))
    {
      zzc = paramzzwf.zzf();
      zzd = zzco.zza(((zzwf)zzwf.zza(paramzzwf).zza(zzxd.zzd).zze()).zzk());
      zze = paramzzbe;
      return;
    }
    throw new IllegalArgumentException(j.j("Unsupported DEK key type: ", paramzzwf.zzf(), ". Only Tink AEAD key types are supported."));
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzbe zza(zzcr paramzzcr, com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe)
  {
    try
    {
      paramzzcr = zzwf.zza(zzco.zza(paramzzcr), zzajv.zza());
      return new zzej(paramzzcr, paramzzbe);
    }
    catch (zzakm paramzzcr)
    {
      throw new GeneralSecurityException(paramzzcr);
    }
  }
  
  public final byte[] zza(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      Object localObject = ByteBuffer.wrap(paramArrayOfByte1);
      int i = ((ByteBuffer)localObject).getInt();
      if ((i > 0) && (i <= 4096) && (i <= paramArrayOfByte1.length - 4))
      {
        byte[] arrayOfByte = new byte[i];
        ((ByteBuffer)localObject).get(arrayOfByte, 0, i);
        paramArrayOfByte1 = new byte[((Buffer)localObject).remaining()];
        ((ByteBuffer)localObject).get(paramArrayOfByte1, 0, ((Buffer)localObject).remaining());
        localObject = zze.zza(arrayOfByte, zza);
        localObject = zzpn.zza(zzc, zzaiw.zza((byte[])localObject), zzwb.zza.zzb, zzxd.zzd, null);
        localObject = zzom.zza().zza((zzpq)localObject, zzbl.zza());
        return ((zzbe)zzon.zza().zza((zzbo)localObject, com.google.android.gms.internal.firebase-auth-api.zzbe.class)).zza(paramArrayOfByte1, paramArrayOfByte2);
      }
      paramArrayOfByte1 = new java/security/GeneralSecurityException;
      paramArrayOfByte1.<init>("length of encrypted DEK too large");
      throw paramArrayOfByte1;
    }
    catch (NegativeArraySizeException paramArrayOfByte1) {}catch (BufferUnderflowException paramArrayOfByte1) {}catch (IndexOutOfBoundsException paramArrayOfByte1) {}
    throw new GeneralSecurityException("invalid ciphertext", paramArrayOfByte1);
  }
  
  public final byte[] zzb(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    zzbo localzzbo = zzoc.zza().zza(zzd, null);
    byte[] arrayOfByte = ((zzpn)zzom.zza().zza(localzzbo, com.google.android.gms.internal.firebase-auth-api.zzpn.class, zzbl.zza())).zzd().zzd();
    arrayOfByte = zze.zzb(arrayOfByte, zza);
    if (arrayOfByte.length <= 4096)
    {
      paramArrayOfByte1 = ((zzbe)zzon.zza().zza(localzzbo, com.google.android.gms.internal.firebase-auth-api.zzbe.class)).zzb(paramArrayOfByte1, paramArrayOfByte2);
      return ByteBuffer.allocate(arrayOfByte.length + 4 + paramArrayOfByte1.length).putInt(arrayOfByte.length).put(arrayOfByte).put(paramArrayOfByte1).array();
    }
    throw new GeneralSecurityException("length of encrypted DEK too large");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzej
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */