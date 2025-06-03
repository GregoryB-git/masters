package com.google.android.gms.internal.common;

import g;

final class zzo
  extends zzn
{
  private final char zza;
  
  public zzo(char paramChar)
  {
    zza = ((char)paramChar);
  }
  
  public final String toString()
  {
    char[] arrayOfChar = new char[6];
    char[] tmp6_5 = arrayOfChar;
    tmp6_5[0] = 92;
    char[] tmp11_6 = tmp6_5;
    tmp11_6[1] = 117;
    char[] tmp16_11 = tmp11_6;
    tmp16_11[2] = 0;
    char[] tmp21_16 = tmp16_11;
    tmp21_16[3] = 0;
    char[] tmp26_21 = tmp21_16;
    tmp26_21[4] = 0;
    char[] tmp31_26 = tmp26_21;
    tmp31_26[5] = 0;
    tmp31_26;
    int i = zza;
    for (int j = 0; j < 4; j++)
    {
      arrayOfChar[(5 - j)] = "0123456789ABCDEF".charAt(i & 0xF);
      i >>= 4;
    }
    return g.e("CharMatcher.is('", String.copyValueOf(arrayOfChar), "')");
  }
  
  public final boolean zza(char paramChar)
  {
    return paramChar == zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.common.zzo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */