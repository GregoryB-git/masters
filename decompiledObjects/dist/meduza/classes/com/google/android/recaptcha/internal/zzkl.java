package com.google.android.recaptcha.internal;

final class zzkl
{
  public static void zza(boolean paramBoolean, String paramString, long paramLong1, long paramLong2)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("overflow: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(")");
    throw new ArithmeticException(localStringBuilder.toString());
  }
  
  public static void zzb(boolean paramBoolean)
  {
    if (paramBoolean) {
      return;
    }
    throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */