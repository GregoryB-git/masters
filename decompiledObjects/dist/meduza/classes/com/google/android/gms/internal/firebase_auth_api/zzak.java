package com.google.android.gms.internal.firebase_auth_api;

public class zzak<E>
{
  public static int zza(int paramInt1, int paramInt2)
  {
    if (paramInt2 >= 0)
    {
      if (paramInt2 <= paramInt1) {
        return paramInt1;
      }
      int i = paramInt1 + (paramInt1 >> 1) + 1;
      paramInt1 = i;
      if (i < paramInt2) {
        paramInt1 = Integer.highestOneBit(paramInt2 - 1) << 1;
      }
      paramInt2 = paramInt1;
      if (paramInt1 < 0) {
        paramInt2 = Integer.MAX_VALUE;
      }
      return paramInt2;
    }
    throw new IllegalArgumentException("cannot store more than Integer.MAX_VALUE elements");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzak
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */