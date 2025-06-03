package com.google.android.gms.internal.firebase_auth_api;

import java.util.Arrays;

public final class zzamy
{
  private static final com.google.android.gms.internal.firebase-auth-api.zzamy zza = new zzamy(0, new int[0], new Object[0], false);
  private int zzb;
  private int[] zzc;
  private Object[] zzd;
  private int zze = -1;
  private boolean zzf;
  
  private zzamy()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzamy(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    zzb = paramInt;
    zzc = paramArrayOfInt;
    zzd = paramArrayOfObject;
    zzf = paramBoolean;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamy zza(com.google.android.gms.internal.firebase-auth-api.zzamy paramzzamy1, com.google.android.gms.internal.firebase-auth-api.zzamy paramzzamy2)
  {
    int i = zzb + zzb;
    int[] arrayOfInt = Arrays.copyOf(zzc, i);
    System.arraycopy(zzc, 0, arrayOfInt, zzb, zzb);
    Object[] arrayOfObject = Arrays.copyOf(zzd, i);
    System.arraycopy(zzd, 0, arrayOfObject, zzb, zzb);
    return new zzamy(i, arrayOfInt, arrayOfObject, true);
  }
  
  private final void zza(int paramInt)
  {
    int[] arrayOfInt = zzc;
    if (paramInt > arrayOfInt.length)
    {
      int i = zzb;
      i = i / 2 + i;
      if (i >= paramInt) {
        paramInt = i;
      }
      i = paramInt;
      if (paramInt < 8) {
        i = 8;
      }
      zzc = Arrays.copyOf(arrayOfInt, i);
      zzd = Arrays.copyOf(zzd, i);
    }
  }
  
  private static void zza(int paramInt, Object paramObject, com.google.android.gms.internal.firebase-auth-api.zzanm paramzzanm)
  {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0)
    {
      if (paramInt != 1)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt == 5)
            {
              paramzzanm.zzb(i, ((Integer)paramObject).intValue());
              return;
            }
            throw new RuntimeException(zzakm.zza());
          }
          if (paramzzanm.zza() == 1)
          {
            paramzzanm.zzb(i);
            ((zzamy)paramObject).zzb(paramzzanm);
            paramzzanm.zza(i);
            return;
          }
          paramzzanm.zza(i);
          ((zzamy)paramObject).zzb(paramzzanm);
          paramzzanm.zzb(i);
          return;
        }
        paramzzanm.zza(i, (zzaiw)paramObject);
        return;
      }
      paramzzanm.zza(i, ((Long)paramObject).longValue());
      return;
    }
    paramzzanm.zzb(i, ((Long)paramObject).longValue());
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamy zzc()
  {
    return zza;
  }
  
  public static com.google.android.gms.internal.firebase-auth-api.zzamy zzd()
  {
    return new zzamy();
  }
  
  private final void zzf()
  {
    if (zzf) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof zzamy)) {
      return false;
    }
    paramObject = (zzamy)paramObject;
    int i = zzb;
    if (i == zzb)
    {
      int[] arrayOfInt = zzc;
      Object localObject = zzc;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] != localObject[j])
        {
          j = 0;
          break label87;
        }
      }
      j = 1;
      label87:
      if (j != 0)
      {
        localObject = zzd;
        paramObject = zzd;
        i = zzb;
        for (j = 0; j < i; j++) {
          if (!localObject[j].equals(paramObject[j]))
          {
            j = 0;
            break label147;
          }
        }
        j = 1;
        label147:
        if (j != 0) {
          return true;
        }
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int i = zzb;
    Object localObject = zzc;
    int j = 0;
    int k = 17;
    int m = 0;
    int n = 17;
    while (m < i)
    {
      n = n * 31 + localObject[m];
      m++;
    }
    localObject = zzd;
    int i1 = zzb;
    for (m = j; m < i1; m++) {
      k = k * 31 + localObject[m].hashCode();
    }
    return ((i + 527) * 31 + n) * 31 + k;
  }
  
  public final int zza()
  {
    int i = zze;
    if (i != -1) {
      return i;
    }
    int j = 0;
    for (int k = 0; j < zzb; k = i)
    {
      int m = zzc[j];
      i = m >>> 3;
      m &= 0x7;
      if (m != 0)
      {
        if (m != 1)
        {
          if (m != 2)
          {
            if (m != 3)
            {
              if (m == 5) {
                i = zzajo.zzb(i, ((Integer)zzd[j]).intValue());
              } else {
                throw new IllegalStateException(zzakm.zza());
              }
            }
            else
            {
              i = zzajo.zzg(i);
              i = ((zzamy)zzd[j]).zza() + (i << 1) + k;
              break label189;
            }
          }
          else {
            i = zzajo.zza(i, (zzaiw)zzd[j]);
          }
        }
        else {
          i = zzajo.zza(i, ((Long)zzd[j]).longValue());
        }
      }
      else {
        i = zzajo.zze(i, ((Long)zzd[j]).longValue());
      }
      i += k;
      label189:
      j++;
    }
    zze = k;
    return k;
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzamy zza(com.google.android.gms.internal.firebase-auth-api.zzamy paramzzamy)
  {
    if (paramzzamy.equals(zza)) {
      return this;
    }
    zzf();
    int i = zzb + zzb;
    zza(i);
    System.arraycopy(zzc, 0, zzc, zzb, zzb);
    System.arraycopy(zzd, 0, zzd, zzb, zzb);
    zzb = i;
    return this;
  }
  
  public final void zza(int paramInt, Object paramObject)
  {
    zzf();
    zza(zzb + 1);
    int[] arrayOfInt = zzc;
    int i = zzb;
    arrayOfInt[i] = paramInt;
    zzd[i] = paramObject;
    zzb = (i + 1);
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzanm paramzzanm)
  {
    if (paramzzanm.zza() == 2)
    {
      for (i = zzb - 1; i >= 0; i--) {
        paramzzanm.zza(zzc[i] >>> 3, zzd[i]);
      }
      return;
    }
    for (int i = 0; i < zzb; i++) {
      paramzzanm.zza(zzc[i] >>> 3, zzd[i]);
    }
  }
  
  public final void zza(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < zzb; i++) {
      zzalo.zza(paramStringBuilder, paramInt, String.valueOf(zzc[i] >>> 3), zzd[i]);
    }
  }
  
  public final int zzb()
  {
    int i = zze;
    if (i != -1) {
      return i;
    }
    i = 0;
    int j = 0;
    while (i < zzb)
    {
      j += zzajo.zzb(zzc[i] >>> 3, (zzaiw)zzd[i]);
      i++;
    }
    zze = j;
    return j;
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzanm paramzzanm)
  {
    if (zzb == 0) {
      return;
    }
    if (paramzzanm.zza() == 1)
    {
      for (i = 0; i < zzb; i++) {
        zza(zzc[i], zzd[i], paramzzanm);
      }
      return;
    }
    for (int i = zzb - 1; i >= 0; i--) {
      zza(zzc[i], zzd[i], paramzzanm);
    }
  }
  
  public final void zze()
  {
    if (zzf) {
      zzf = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzamy
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */