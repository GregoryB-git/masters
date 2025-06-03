package com.google.android.gms.internal.firebase_auth_api;

import a0.j;

final class zzh
  extends zzi
{
  private final char zza;
  
  public zzh(char paramChar)
  {
    zza = ((char)paramChar);
  }
  
  public final String toString()
  {
    int i = zza;
    char[] arrayOfChar = new char[6];
    char[] tmp11_10 = arrayOfChar;
    tmp11_10[0] = 92;
    char[] tmp16_11 = tmp11_10;
    tmp16_11[1] = 117;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[2] = 0;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[3] = 0;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[4] = 0;
    char[] tmp36_31 = tmp31_26;
    tmp36_31[5] = 0;
    tmp36_31;
    for (int j = 0; j < 4; j++)
    {
      arrayOfChar[(5 - j)] = "0123456789ABCDEF".charAt(i & 0xF);
      i = (char)(i >> 4);
    }
    return j.j("CharMatcher.is('", String.copyValueOf(arrayOfChar), "')");
  }
  
  public final boolean zza(char paramChar)
  {
    return paramChar == zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */