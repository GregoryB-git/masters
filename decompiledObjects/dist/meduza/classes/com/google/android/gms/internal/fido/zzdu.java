package com.google.android.gms.internal.fido;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public final class zzdu
  implements Closeable
{
  private final InputStream zza;
  private zzdt zzb;
  private final byte[] zzc = new byte[8];
  private final zzdv zzd = zzdv.zza();
  
  public zzdu(InputStream paramInputStream)
  {
    zza = paramInputStream;
  }
  
  private final long zzh()
  {
    long l1;
    if (zzb.zza() < 24)
    {
      l1 = zzb.zza();
      zzb = null;
      return l1;
    }
    if (zzb.zza() == 24)
    {
      int i = zza.read();
      if (i != -1)
      {
        zzb = null;
        return i & 0xFF;
      }
      throw new EOFException();
    }
    byte[] arrayOfByte;
    if (zzb.zza() == 25)
    {
      zzk(zzc, 2);
      arrayOfByte = zzc;
      return (arrayOfByte[0] & 0xFF) << 8 | arrayOfByte[1] & 0xFF;
    }
    long l2;
    long l3;
    if (zzb.zza() == 26)
    {
      zzk(zzc, 4);
      arrayOfByte = zzc;
      l1 = arrayOfByte[0];
      l2 = arrayOfByte[1];
      l3 = arrayOfByte[2];
      return arrayOfByte[3] & 0xFF | (l2 & 0xFF) << 16 | (l1 & 0xFF) << 24 | (l3 & 0xFF) << 8;
    }
    if (zzb.zza() == 27)
    {
      zzk(zzc, 8);
      arrayOfByte = zzc;
      long l4 = arrayOfByte[0];
      long l5 = arrayOfByte[1];
      long l6 = arrayOfByte[2];
      l1 = arrayOfByte[3];
      long l7 = arrayOfByte[4];
      l2 = arrayOfByte[5];
      l3 = arrayOfByte[6];
      return arrayOfByte[7] & 0xFF | (l3 & 0xFF) << 8 | (l6 & 0xFF) << 40 | (l4 & 0xFF) << 56 | (l5 & 0xFF) << 48 | (l1 & 0xFF) << 32 | (l7 & 0xFF) << 24 | (l2 & 0xFF) << 16;
    }
    throw new IOException(String.format("invalid additional information %s for major type %s", new Object[] { Byte.valueOf(zzb.zza()), Integer.valueOf(zzb.zzc()) }));
  }
  
  private final void zzi()
  {
    zzd();
    if (zzb.zza() != 31) {
      return;
    }
    throw new IllegalStateException(String.format("expected definite length but found %s", new Object[] { Byte.valueOf(zzb.zza()) }));
  }
  
  private final void zzj(byte paramByte)
  {
    zzd();
    if (zzb.zzb() == paramByte) {
      return;
    }
    throw new IllegalStateException(String.format("expected major type %s but found %s", new Object[] { Integer.valueOf(paramByte >> 5 & 0x7), Integer.valueOf(zzb.zzc()) }));
  }
  
  private final void zzk(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    while (i != paramInt)
    {
      int j = zza.read(paramArrayOfByte, i, paramInt - i);
      if (j != -1) {
        i += j;
      } else {
        throw new EOFException();
      }
    }
    zzb = null;
  }
  
  private final byte[] zzl()
  {
    zzi();
    long l = zzh();
    if ((l >= 0L) && (l <= 2147483647L))
    {
      if (zza.available() >= l)
      {
        int i = (int)l;
        byte[] arrayOfByte = new byte[i];
        zzk(arrayOfByte, i);
        return arrayOfByte;
      }
      throw new EOFException();
    }
    throw new UnsupportedOperationException(String.format("the maximum supported byte/text string length is %s bytes", new Object[] { Integer.valueOf(Integer.MAX_VALUE) }));
  }
  
  public final void close()
  {
    zza.close();
    zzd.zzb();
  }
  
  public final long zza()
  {
    zzj((byte)Byte.MIN_VALUE);
    zzi();
    long l = zzh();
    boolean bool = l < 0L;
    if (!bool)
    {
      if (bool) {
        zzd.zzg(l);
      }
      return l;
    }
    throw new UnsupportedOperationException(String.format("the maximum supported array length is %s", new Object[] { Long.valueOf(Long.MAX_VALUE) }));
  }
  
  public final long zzb()
  {
    zzd();
    int i;
    if (zzb.zzb() == 0)
    {
      i = 1;
    }
    else
    {
      if (zzb.zzb() != 32) {
        break label79;
      }
      i = 0;
    }
    long l = zzh();
    if (l >= 0L)
    {
      if (i != 0) {
        return l;
      }
      return l;
    }
    throw new UnsupportedOperationException(String.format("the maximum supported unsigned/negative integer is %s", new Object[] { Long.valueOf(Long.MAX_VALUE) }));
    label79:
    throw new IllegalStateException(String.format("expected major type 0 or 1 but found %s", new Object[] { Integer.valueOf(zzb.zzc()) }));
  }
  
  public final long zzc()
  {
    zzj((byte)-96);
    zzi();
    long l = zzh();
    boolean bool = l < 0L;
    if ((!bool) && (l <= 4611686018427387903L))
    {
      if (bool) {
        zzd.zzg(l + l);
      }
      return l;
    }
    throw new UnsupportedOperationException("the maximum supported map length is 4611686018427387903L");
  }
  
  public final zzdt zzd()
  {
    if (zzb == null)
    {
      int i = zza.read();
      if (i == -1)
      {
        zzd.zzb();
        return null;
      }
      Object localObject = new zzdt(i);
      zzb = ((zzdt)localObject);
      i = ((zzdt)localObject).zzb();
      if ((i != -128) && (i != -96) && (i != -64)) {
        if (i != -32)
        {
          if ((i != 0) && (i != 32))
          {
            long l;
            if (i != 64)
            {
              if (i == 96)
              {
                localObject = zzd;
                l = -2L;
              }
              else
              {
                throw new IllegalStateException(String.format("invalid major type: %s", new Object[] { Integer.valueOf(zzb.zzc()) }));
              }
            }
            else
            {
              localObject = zzd;
              l = -1L;
            }
            ((zzdv)localObject).zze(l);
            break label182;
          }
        }
        else if (zzb.zza() == 31)
        {
          zzd.zzc();
          break label189;
        }
      }
      zzd.zzd();
      label182:
      zzd.zzf();
    }
    label189:
    return zzb;
  }
  
  public final String zze()
  {
    zzj((byte)96);
    return new String(zzl(), StandardCharsets.UTF_8);
  }
  
  public final boolean zzf()
  {
    zzj((byte)-32);
    if (zzb.zza() <= 24)
    {
      int i = (int)zzh();
      if (i == 20) {
        return false;
      }
      if (i == 21) {
        return true;
      }
      throw new IllegalStateException(String.format("expected FALSE or TRUE", new Object[0]));
    }
    throw new IllegalStateException("expected simple value");
  }
  
  public final byte[] zzg()
  {
    zzj((byte)64);
    return zzl();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.fido.zzdu
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */