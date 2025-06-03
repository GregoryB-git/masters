package com.google.android.recaptcha.internal;

import java.math.RoundingMode;

public final class zzkj
{
  public static int zza(int paramInt1, int paramInt2, RoundingMode paramRoundingMode)
  {
    paramRoundingMode.getClass();
    if (paramInt2 != 0)
    {
      int i = paramInt1 / paramInt2;
      int j = paramInt1 - paramInt2 * i;
      if (j != 0)
      {
        int k = zzki.zza[paramRoundingMode.ordinal()];
        int m = 1;
        int n = (paramInt1 ^ paramInt2) >> 31 | 0x1;
        switch (k)
        {
        default: 
          throw new AssertionError();
        case 6: 
        case 7: 
        case 8: 
          paramInt1 = Math.abs(j);
          paramInt1 -= Math.abs(paramInt2) - paramInt1;
          if (paramInt1 == 0)
          {
            paramInt1 = m;
            if (paramRoundingMode == RoundingMode.HALF_UP) {
              break label199;
            }
            if (paramRoundingMode == RoundingMode.HALF_EVEN) {
              paramInt1 = 1;
            } else {
              paramInt1 = 0;
            }
            if ((paramInt1 & i & 0x1) != 0)
            {
              paramInt1 = m;
              break label199;
            }
          }
          else if (paramInt1 > 0)
          {
            paramInt1 = m;
          }
          break;
        case 5: 
          if (n > 0) {
            paramInt1 = m;
          }
          break;
        case 3: 
          if (n < 0) {
            paramInt1 = m;
          } else {
            paramInt1 = 0;
          }
          if (paramInt1 == 0) {}
          break;
        case 4: 
          return i + n;
        case 1: 
          label199:
          zzkl.zzb(false);
        }
      }
      return i;
    }
    throw new ArithmeticException("/ by zero");
  }
  
  public static int zzb(int paramInt, RoundingMode paramRoundingMode)
  {
    if (paramInt > 0)
    {
      switch (zzki.zza[paramRoundingMode.ordinal()])
      {
      default: 
        throw new AssertionError();
      case 6: 
      case 7: 
      case 8: 
        int i = Integer.numberOfLeadingZeros(paramInt);
        return 31 - i + ((-1257966797 >>> i) - paramInt >>> 31);
      case 4: 
      case 5: 
        return 32 - Integer.numberOfLeadingZeros(paramInt - 1);
      case 1: 
        boolean bool;
        if ((paramInt - 1 & paramInt) == 0) {
          bool = true;
        } else {
          bool = false;
        }
        zzkl.zzb(bool);
      }
      return 31 - Integer.numberOfLeadingZeros(paramInt);
    }
    throw new IllegalArgumentException("x (0) must be > 0");
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzkj
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */