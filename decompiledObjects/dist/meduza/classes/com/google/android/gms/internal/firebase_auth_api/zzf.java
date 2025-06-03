package com.google.android.gms.internal.firebase_auth_api;

public abstract class zzf
{
  public int zza(CharSequence paramCharSequence, int paramInt)
  {
    int i = paramCharSequence.length();
    zzw.zza(paramInt, i, "index");
    while (paramInt < i)
    {
      if (zza(paramCharSequence.charAt(paramInt))) {
        return paramInt;
      }
      paramInt++;
    }
    return -1;
  }
  
  public abstract boolean zza(char paramChar);
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */