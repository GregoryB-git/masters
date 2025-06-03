package com.google.android.recaptcha.internal;

import java.util.Arrays;

public final class zzpm
{
  private static final zzpm zza = new zzpm(0, new int[0], new Object[0], false);
  private int zzb;
  private int[] zzc;
  private Object[] zzd;
  private int zze = -1;
  private boolean zzf;
  
  private zzpm()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzpm(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    zzb = paramInt;
    zzc = paramArrayOfInt;
    zzd = paramArrayOfObject;
    zzf = paramBoolean;
  }
  
  public static zzpm zzc()
  {
    return zza;
  }
  
  public static zzpm zze(zzpm paramzzpm1, zzpm paramzzpm2)
  {
    int i = zzb + zzb;
    int[] arrayOfInt = Arrays.copyOf(zzc, i);
    System.arraycopy(zzc, 0, arrayOfInt, zzb, zzb);
    Object[] arrayOfObject = Arrays.copyOf(zzd, i);
    System.arraycopy(zzd, 0, arrayOfObject, zzb, zzb);
    return new zzpm(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static zzpm zzf()
  {
    return new zzpm(0, new int[8], new Object[8], true);
  }
  
  private final void zzm(int paramInt)
  {
    int[] arrayOfInt = zzc;
    if (paramInt > arrayOfInt.length)
    {
      int i = zzb;
      int j = i / 2 + i;
      i = paramInt;
      if (j >= paramInt) {
        i = j;
      }
      paramInt = i;
      if (i < 8) {
        paramInt = 8;
      }
      zzc = Arrays.copyOf(arrayOfInt, paramInt);
      zzd = Arrays.copyOf(zzd, paramInt);
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof zzpm)) {
      return false;
    }
    paramObject = (zzpm)paramObject;
    int i = zzb;
    if (i == zzb)
    {
      Object localObject = zzc;
      int[] arrayOfInt = zzc;
      for (int j = 0; j < i; j++) {
        if (localObject[j] != arrayOfInt[j]) {
          break label127;
        }
      }
      localObject = zzd;
      paramObject = zzd;
      i = zzb;
      for (j = 0; j < i; j++) {
        if (!localObject[j].equals(paramObject[j])) {
          break label127;
        }
      }
      return true;
    }
    label127:
    return false;
  }
  
  public final int hashCode()
  {
    int i = zzb;
    Object localObject = zzc;
    int j = 17;
    int k = 0;
    int m = 17;
    for (int n = 0; n < i; n++) {
      m = m * 31 + localObject[n];
    }
    localObject = zzd;
    int i1 = zzb;
    for (n = k; n < i1; n++) {
      j = j * 31 + localObject[n].hashCode();
    }
    return ((i + 527) * 31 + m) * 31 + j;
  }
  
  public final int zza()
  {
    int i = zze;
    if (i == -1)
    {
      int j = 0;
      i = 0;
      while (j < zzb)
      {
        int k = zzc[j];
        int m = k >>> 3;
        k &= 0x7;
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (k != 3)
              {
                if (k == 5)
                {
                  ((Integer)zzd[j]).intValue();
                  m = zzln.zzA(m << 3) + 4;
                }
                else
                {
                  throw new IllegalStateException(new zznm("Protocol message tag had invalid wire type."));
                }
              }
              else
              {
                m = zzln.zzA(m << 3);
                k = m + m;
                m = ((zzpm)zzd[j]).zza();
                break label242;
              }
            }
            else
            {
              zzle localzzle = (zzle)zzd[j];
              m = zzln.zzA(m << 3);
              k = localzzle.zzd();
              i = zzln.zzA(k) + k + m + i;
              break label249;
            }
          }
          else
          {
            ((Long)zzd[j]).longValue();
            m = zzln.zzA(m << 3) + 8;
          }
          i = m + i;
          break label249;
        }
        else
        {
          long l = ((Long)zzd[j]).longValue();
          k = zzln.zzA(m << 3);
          m = zzln.zzB(l);
        }
        label242:
        i = m + k + i;
        label249:
        j++;
      }
      zze = i;
      return i;
    }
    return i;
  }
  
  public final int zzb()
  {
    int i = zze;
    if (i == -1)
    {
      i = 0;
      int j = 0;
      while (i < zzb)
      {
        int k = zzc[i];
        zzle localzzle = (zzle)zzd[i];
        int m = zzln.zzA(8);
        int n = zzln.zzA(16);
        int i1 = zzln.zzA(k >>> 3);
        k = zzln.zzA(24);
        int i2 = localzzle.zzd();
        j += m + m + (i1 + n) + (zzln.zzA(i2) + i2 + k);
        i++;
      }
      zze = j;
      return j;
    }
    return i;
  }
  
  public final zzpm zzd(zzpm paramzzpm)
  {
    if (paramzzpm.equals(zza)) {
      return this;
    }
    zzg();
    int i = zzb + zzb;
    zzm(i);
    System.arraycopy(zzc, 0, zzc, zzb, zzb);
    System.arraycopy(zzd, 0, zzd, zzb, zzb);
    zzb = i;
    return this;
  }
  
  public final void zzg()
  {
    if (zzf) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzh()
  {
    if (zzf) {
      zzf = false;
    }
  }
  
  public final void zzi(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < zzb; i++) {
      zzok.zzb(paramStringBuilder, paramInt, String.valueOf(zzc[i] >>> 3), zzd[i]);
    }
  }
  
  public final void zzj(int paramInt, Object paramObject)
  {
    zzg();
    zzm(zzb + 1);
    int[] arrayOfInt = zzc;
    int i = zzb;
    arrayOfInt[i] = paramInt;
    zzd[i] = paramObject;
    zzb = (i + 1);
  }
  
  public final void zzk(zzpy paramzzpy)
  {
    for (int i = 0; i < zzb; i++) {
      paramzzpy.zzw(zzc[i] >>> 3, zzd[i]);
    }
  }
  
  public final void zzl(zzpy paramzzpy)
  {
    if (zzb != 0) {
      for (int i = 0; i < zzb; i++)
      {
        int j = zzc[i];
        Object localObject = zzd[i];
        int k = j & 0x7;
        j >>>= 3;
        if (k != 0)
        {
          if (k != 1)
          {
            if (k != 2)
            {
              if (k != 3)
              {
                if (k == 5) {
                  paramzzpy.zzk(j, ((Integer)localObject).intValue());
                } else {
                  throw new RuntimeException(new zznm("Protocol message tag had invalid wire type."));
                }
              }
              else
              {
                paramzzpy.zzF(j);
                ((zzpm)localObject).zzl(paramzzpy);
                paramzzpy.zzh(j);
              }
            }
            else {
              paramzzpy.zzd(j, (zzle)localObject);
            }
          }
          else {
            paramzzpy.zzm(j, ((Long)localObject).longValue());
          }
        }
        else {
          paramzzpy.zzt(j, ((Long)localObject).longValue());
        }
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzpm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */