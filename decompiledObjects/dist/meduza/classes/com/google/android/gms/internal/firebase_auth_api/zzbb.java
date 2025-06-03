package com.google.android.gms.internal.firebase_auth_api;

final class zzbb
{
  public static void zza(boolean paramBoolean, String paramString, long paramLong1, long paramLong2)
  {
    if (paramBoolean) {
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("overflow: ");
    localStringBuilder.append(paramString);
    localStringBuilder.append("(");
    localStringBuilder.append(paramLong1);
    localStringBuilder.append(", ");
    localStringBuilder.append(paramLong2);
    localStringBuilder.append(")");
    throw new ArithmeticException(localStringBuilder.toString());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */