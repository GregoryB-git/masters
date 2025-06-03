package com.google.android.gms.internal.auth;

import java.util.Arrays;

public final class zzha
{
  private static final zzha zza = new zzha(0, new int[0], new Object[0], false);
  private int zzb;
  private int[] zzc;
  private Object[] zzd;
  private boolean zze;
  
  private zzha()
  {
    this(0, new int[8], new Object[8], true);
  }
  
  private zzha(int paramInt, int[] paramArrayOfInt, Object[] paramArrayOfObject, boolean paramBoolean)
  {
    zzb = paramInt;
    zzc = paramArrayOfInt;
    zzd = paramArrayOfObject;
    zze = paramBoolean;
  }
  
  public static zzha zza()
  {
    return zza;
  }
  
  public static zzha zzc(zzha paramzzha1, zzha paramzzha2)
  {
    int i = zzb + zzb;
    int[] arrayOfInt = Arrays.copyOf(zzc, i);
    System.arraycopy(zzc, 0, arrayOfInt, zzb, zzb);
    Object[] arrayOfObject = Arrays.copyOf(zzd, i);
    System.arraycopy(zzd, 0, arrayOfObject, zzb, zzb);
    return new zzha(i, arrayOfInt, arrayOfObject, true);
  }
  
  public static zzha zzd()
  {
    return new zzha(0, new int[8], new Object[8], true);
  }
  
  private final void zzi(int paramInt)
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
    if (!(paramObject instanceof zzha)) {
      return false;
    }
    paramObject = (zzha)paramObject;
    int i = zzb;
    if (i == zzb)
    {
      int[] arrayOfInt = zzc;
      Object localObject = zzc;
      for (int j = 0; j < i; j++) {
        if (arrayOfInt[j] != localObject[j]) {
          break label129;
        }
      }
      localObject = zzd;
      paramObject = zzd;
      i = zzb;
      for (j = 0; j < i; j++) {
        if (!localObject[j].equals(paramObject[j])) {
          break label129;
        }
      }
      return true;
    }
    label129:
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
  
  public final zzha zzb(zzha paramzzha)
  {
    if (paramzzha.equals(zza)) {
      return this;
    }
    zze();
    int i = zzb + zzb;
    zzi(i);
    System.arraycopy(zzc, 0, zzc, zzb, zzb);
    System.arraycopy(zzd, 0, zzd, zzb, zzb);
    zzb = i;
    return this;
  }
  
  public final void zze()
  {
    if (zze) {
      return;
    }
    throw new UnsupportedOperationException();
  }
  
  public final void zzf()
  {
    if (zze) {
      zze = false;
    }
  }
  
  public final void zzg(StringBuilder paramStringBuilder, int paramInt)
  {
    for (int i = 0; i < zzb; i++) {
      zzfz.zzb(paramStringBuilder, paramInt, String.valueOf(zzc[i] >>> 3), zzd[i]);
    }
  }
  
  public final void zzh(int paramInt, Object paramObject)
  {
    zze();
    zzi(zzb + 1);
    int[] arrayOfInt = zzc;
    int i = zzb;
    arrayOfInt[i] = paramInt;
    zzd[i] = paramObject;
    zzb = (i + 1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.auth.zzha
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */