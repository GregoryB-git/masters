package com.google.android.gms.internal.firebase_auth_api;

public final class zzbc
{
  public static long zza(long paramLong1, long paramLong2)
  {
    long l = paramLong1 + paramLong2;
    int i = 1;
    int j;
    if ((paramLong1 ^ paramLong2) < 0L) {
      j = 1;
    } else {
      j = 0;
    }
    if ((paramLong1 ^ l) < 0L) {
      i = 0;
    }
    zzbb.zza(j | i, "checkedAdd", paramLong1, paramLong2);
    return l;
  }
  
  public static long zzb(long paramLong1, long paramLong2)
  {
    paramLong2 = paramLong1 - 1L;
    int i = 1;
    int j;
    if ((1L ^ paramLong1) >= 0L) {
      j = 1;
    } else {
      j = 0;
    }
    if ((paramLong1 ^ paramLong2) < 0L) {
      i = 0;
    }
    zzbb.zza(j | i, "checkedSubtract", paramLong1, 1L);
    return paramLong2;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */