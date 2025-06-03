package com.google.android.gms.internal.firebase_auth_api;

import a0.j;

public final class zzw
{
  public static int zza(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 < paramInt2)) {
      return paramInt1;
    }
    String str;
    if (paramInt1 >= 0)
    {
      if (paramInt2 < 0) {
        throw new IllegalArgumentException(j.g("negative size: ", paramInt2));
      }
      str = zzae.zza("%s (%s) must be less than size (%s)", new Object[] { "index", Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    else
    {
      str = zzae.zza("%s (%s) must not be negative", new Object[] { "index", Integer.valueOf(paramInt1) });
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static int zza(int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(zzb(paramInt1, paramInt2, paramString));
  }
  
  public static <T> T zza(T paramT)
  {
    paramT.getClass();
    return paramT;
  }
  
  public static void zza(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = zzae.zza("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = zzb(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = zzb(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static int zzb(int paramInt1, int paramInt2)
  {
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt2)) {
      return paramInt1;
    }
    throw new IndexOutOfBoundsException(zzb(paramInt1, paramInt2, "index"));
  }
  
  private static String zzb(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return zzae.zza("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    if (paramInt2 >= 0) {
      return zzae.zza("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    }
    throw new IllegalArgumentException(j.g("negative size: ", paramInt2));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */