package com.google.android.gms.internal.firebase_auth_api;

import java.io.OutputStream;

final class zzajo$zzc
  extends zzajo.zzb
{
  private final OutputStream zzf;
  
  public zzajo$zzc(OutputStream paramOutputStream, int paramInt)
  {
    super(paramInt);
    if (paramOutputStream != null)
    {
      zzf = paramOutputStream;
      return;
    }
    throw new NullPointerException("out");
  }
  
  private final void zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = zzc;
    int j = zzd;
    if (i - j >= paramInt2)
    {
      System.arraycopy(paramArrayOfByte, paramInt1, zzb, j, paramInt2);
      zzd += paramInt2;
    }
    else
    {
      i -= j;
      System.arraycopy(paramArrayOfByte, paramInt1, zzb, j, i);
      paramInt1 += i;
      paramInt2 -= i;
      zzd = zzc;
      zze += i;
      zze();
      if (paramInt2 <= zzc)
      {
        System.arraycopy(paramArrayOfByte, paramInt1, zzb, 0, paramInt2);
        zzd = paramInt2;
      }
      else
      {
        zzf.write(paramArrayOfByte, paramInt1, paramInt2);
      }
    }
    zze += paramInt2;
  }
  
  private final void zze()
  {
    zzf.write(zzb, 0, zzd);
    zzd = 0;
  }
  
  private final void zzo(int paramInt)
  {
    if (zzc - zzd < paramInt) {
      zze();
    }
  }
  
  public final void zza(byte paramByte)
  {
    if (zzd == zzc) {
      zze();
    }
    zzb(paramByte);
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzc(paramArrayOfByte, paramInt1, paramInt2);
  }
  
  public final void zzb(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    zzj(1, 3);
    zzk(2, paramInt);
    zzj(3, 2);
    zzc(paramzzaln);
    zzj(1, 4);
  }
  
  public final void zzb(int paramInt, String paramString)
  {
    zzj(paramInt, 2);
    zzb(paramString);
  }
  
  public final void zzb(int paramInt, boolean paramBoolean)
  {
    zzo(11);
    zzl(paramInt, 0);
    zzb((byte)paramBoolean);
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    zzl(paramzzaiw.zzb());
    paramzzaiw.zza(this);
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    zzl(((zzain)paramzzaln).zza(paramzzamc));
    paramzzamc.zza(paramzzaln, zza);
  }
  
  public final void zzb(String paramString)
  {
    try
    {
      int i = paramString.length() * 3;
      int j = zzajo.zzh(i);
      int k = j + i;
      int m = zzc;
      if (k > m)
      {
        byte[] arrayOfByte = new byte[i];
        j = zzanb.zza(paramString, arrayOfByte, 0, i);
        zzl(j);
        zza(arrayOfByte, 0, j);
        return;
      }
      if (k > m - zzd) {
        zze();
      }
      m = zzajo.zzh(paramString.length());
      k = zzd;
      if (m == j) {
        j = k + m;
      }
      try
      {
        zzd = j;
        i = zzanb.zza(paramString, zzb, j, zzc - j);
        zzd = k;
        j = i - k - m;
        zzn(j);
        zzd = i;
        break label176;
        j = zzanb.zza(paramString);
        zzn(j);
        zzd = zzanb.zza(paramString, zzb, zzd, j);
        label176:
        zze += j;
        return;
      }
      catch (ArrayIndexOutOfBoundsException localArrayIndexOutOfBoundsException)
      {
        zzajo.zzd localzzd = new com/google/android/gms/internal/firebase_auth_api/zzajo$zzd;
        localzzd.<init>(localArrayIndexOutOfBoundsException);
        throw localzzd;
      }
      catch (zzane localzzane1)
      {
        zze -= zzd - k;
        zzd = k;
        throw localzzane1;
      }
      return;
    }
    catch (zzane localzzane2)
    {
      zza(paramString, localzzane2);
    }
  }
  
  public final void zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    zzl(paramInt2);
    zzc(paramArrayOfByte, 0, paramInt2);
  }
  
  public final void zzc()
  {
    if (zzd > 0) {
      zze();
    }
  }
  
  public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    zzj(paramInt, 2);
    zzb(paramzzaiw);
  }
  
  public final void zzc(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln, com.google.android.gms.internal.firebase-auth-api.zzamc paramzzamc)
  {
    zzj(paramInt, 2);
    zzb(paramzzaln, paramzzamc);
  }
  
  public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzaln paramzzaln)
  {
    zzl(paramzzaln.zzl());
    paramzzaln.zza(this);
  }
  
  public final void zzd(int paramInt, com.google.android.gms.internal.firebase-auth-api.zzaiw paramzzaiw)
  {
    zzj(1, 3);
    zzk(2, paramInt);
    zzc(3, paramzzaiw);
    zzj(1, 4);
  }
  
  public final void zzf(int paramInt, long paramLong)
  {
    zzo(18);
    zzl(paramInt, 1);
    zzi(paramLong);
  }
  
  public final void zzf(long paramLong)
  {
    zzo(8);
    zzi(paramLong);
  }
  
  public final void zzg(int paramInt1, int paramInt2)
  {
    zzo(14);
    zzl(paramInt1, 5);
    zzm(paramInt2);
  }
  
  public final void zzh(int paramInt1, int paramInt2)
  {
    zzo(20);
    zzl(paramInt1, 0);
    if (paramInt2 >= 0)
    {
      zzn(paramInt2);
      return;
    }
    zzj(paramInt2);
  }
  
  public final void zzh(int paramInt, long paramLong)
  {
    zzo(20);
    zzl(paramInt, 0);
    zzj(paramLong);
  }
  
  public final void zzh(long paramLong)
  {
    zzo(10);
    zzj(paramLong);
  }
  
  public final void zzi(int paramInt)
  {
    zzo(4);
    zzm(paramInt);
  }
  
  public final void zzj(int paramInt)
  {
    if (paramInt >= 0)
    {
      zzl(paramInt);
      return;
    }
    zzh(paramInt);
  }
  
  public final void zzj(int paramInt1, int paramInt2)
  {
    zzl(paramInt1 << 3 | paramInt2);
  }
  
  public final void zzk(int paramInt1, int paramInt2)
  {
    zzo(20);
    zzl(paramInt1, 0);
    zzn(paramInt2);
  }
  
  public final void zzl(int paramInt)
  {
    zzo(5);
    zzn(paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzajo.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */