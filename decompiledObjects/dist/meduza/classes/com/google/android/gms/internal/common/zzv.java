package com.google.android.gms.internal.common;

import f;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class zzv
{
  public static int zza(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    if (paramInt1 >= 0)
    {
      if (paramInt2 < 0) {
        throw new IllegalArgumentException(f.h("negative size: ", paramInt2));
      }
      paramString = zzab.zza("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    else
    {
      paramString = zzab.zza("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
    }
    throw new IndexOutOfBoundsException(paramString);
  }
  
  public static int zzb(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(zzd(paramInt1, paramInt2, "index"));
  }
  
  public static void zzc(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = zzab.zza("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = zzd(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = zzd(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  private static String zzd(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return zzab.zza("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return zzab.zza("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(f.h("negative size: ", paramInt2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */