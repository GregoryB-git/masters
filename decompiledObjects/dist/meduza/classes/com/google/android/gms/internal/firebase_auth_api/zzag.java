package com.google.android.gms.internal.firebase_auth_api;

import a0.j;
import f;

final class zzag
{
  public static int zza(int paramInt, String paramString)
  {
    if (paramInt >= 0) {
      return paramInt;
    }
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(paramString);
    localStringBuilder.append(" cannot be negative but was: ");
    localStringBuilder.append(paramInt);
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public static void zza(Object paramObject1, Object paramObject2)
  {
    if (paramObject1 != null)
    {
      if (paramObject2 != null) {
        return;
      }
      throw new NullPointerException(j.j("null value in entry: ", String.valueOf(paramObject1), "=null"));
    }
    throw new NullPointerException(f.j("null key in entry: null=", String.valueOf(paramObject2)));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzag
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */