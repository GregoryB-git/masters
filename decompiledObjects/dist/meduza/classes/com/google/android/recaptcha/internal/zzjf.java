package com.google.android.recaptcha.internal;

public final class zzjf
{
  public static void zza(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException();
  }
  
  public static void zzb(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException((String)paramObject);
  }
  
  public static void zzc(boolean paramBoolean, String paramString, char paramChar)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalArgumentException(zzji.zza(paramString, new Object[] { Character.valueOf(paramChar) }));
  }
  
  public static void zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 >= 0) && (paramInt2 >= paramInt1) && (paramInt2 <= paramInt3)) {
      return;
    }
    String str;
    if ((paramInt1 >= 0) && (paramInt1 <= paramInt3))
    {
      if ((paramInt2 >= 0) && (paramInt2 <= paramInt3)) {
        str = zzji.zza("end index (%s) must not be less than start index (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      } else {
        str = zzf(paramInt2, paramInt3, "end index");
      }
    }
    else {
      str = zzf(paramInt1, paramInt3, "start index");
    }
    throw new IndexOutOfBoundsException(str);
  }
  
  public static void zze(boolean paramBoolean, Object paramObject)
  {
    if (paramBoolean) {
      return;
    }
    throw new IllegalStateException((String)paramObject);
  }
  
  private static String zzf(int paramInt1, int paramInt2, String paramString)
  {
    if (paramInt1 < 0) {
      return zzji.zza("%s (%s) must not be negative", new Object[] { paramString, Integer.valueOf(paramInt1) });
    }
    return zzji.zza("%s (%s) must not be greater than size (%s)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzjf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */