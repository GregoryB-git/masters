package com.google.android.gms.internal.fido;

import f;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

class zzcw
  extends zzcv
{
  public final byte[] zza;
  
  public zzcw(byte[] paramArrayOfByte)
  {
    paramArrayOfByte.getClass();
    zza = paramArrayOfByte;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzcz)) {
      return false;
    }
    if (zzd() != ((zzcz)paramObject).zzd()) {
      return false;
    }
    if (zzd() == 0) {
      return true;
    }
    if ((paramObject instanceof zzcw))
    {
      paramObject = (zzcw)paramObject;
      int i = zzk();
      int j = ((zzcz)paramObject).zzk();
      if ((i != 0) && (j != 0) && (i != j)) {
        return false;
      }
      int k = zzd();
      if (k <= ((zzcw)paramObject).zzd())
      {
        if (k <= ((zzcw)paramObject).zzd())
        {
          byte[] arrayOfByte1 = zza;
          byte[] arrayOfByte2 = zza;
          int m = zzc();
          j = zzc();
          boolean bool2;
          for (i = ((zzcw)paramObject).zzc();; i++)
          {
            bool2 = bool1;
            if (j >= m + k) {
              break;
            }
            if (arrayOfByte1[j] != arrayOfByte2[i])
            {
              bool2 = false;
              break;
            }
            j++;
          }
          return bool2;
        }
        throw new IllegalArgumentException(f.i("Ran off end of other: 0, ", k, ", ", ((zzcw)paramObject).zzd()));
      }
      i = zzd();
      paramObject = new StringBuilder();
      ((StringBuilder)paramObject).append("Length too large: ");
      ((StringBuilder)paramObject).append(k);
      ((StringBuilder)paramObject).append(i);
      throw new IllegalArgumentException(((StringBuilder)paramObject).toString());
    }
    return paramObject.equals(this);
  }
  
  public byte zza(int paramInt)
  {
    return zza[paramInt];
  }
  
  public byte zzb(int paramInt)
  {
    return zza[paramInt];
  }
  
  public int zzc()
  {
    return 0;
  }
  
  public int zzd()
  {
    return zza.length;
  }
  
  public void zze(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    System.arraycopy(zza, 0, paramArrayOfByte, 0, paramInt3);
  }
  
  public final int zzf(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = zza;
    int i = zzc();
    Charset localCharset = zzde.zza;
    for (paramInt2 = i; paramInt2 < i + paramInt3; paramInt2++) {
      paramInt1 = paramInt1 * 31 + arrayOfByte[paramInt2];
    }
    return paramInt1;
  }
  
  public final zzcz zzg(int paramInt1, int paramInt2)
  {
    paramInt2 = zzcz.zzj(paramInt1, paramInt2, zzd());
    if (paramInt2 == 0) {
      return zzcz.zzb;
    }
    return new zzct(zza, zzc() + paramInt1, paramInt2);
  }
  
  public final InputStream zzh()
  {
    return new ByteArrayInputStream(zza, zzc(), zzd());
  }
  
  public final ByteBuffer zzi()
  {
    return ByteBuffer.wrap(zza, zzc(), zzd()).asReadOnlyBuffer();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzcw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */