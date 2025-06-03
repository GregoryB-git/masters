package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;

public final class zzgv
  implements zzgx
{
  public static final zzgv zza = new zzgv();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        localObject1 = paramzzgd.zzc().zza(paramVarArgs[1]);
        paramVarArgs = (zzue[])localObject1;
        if (true != localObject1 instanceof Integer) {
          paramVarArgs = null;
        }
        paramVarArgs = (Integer)paramVarArgs;
        if (paramVarArgs != null)
        {
          int i = paramVarArgs.intValue();
          try
          {
            if ((localObject2 instanceof Integer))
            {
              paramVarArgs = Integer.valueOf(((Number)localObject2).intValue() / i);
            }
            else
            {
              if (!(localObject2 instanceof int[])) {
                break label192;
              }
              paramVarArgs = (int[])localObject2;
              localObject2 = new java/util/ArrayList;
              int j = paramVarArgs.length;
              ((ArrayList)localObject2).<init>(j);
              for (int k = 0; k < j; k++) {
                ((Collection)localObject2).add(Integer.valueOf(paramVarArgs[k] / i));
              }
              paramVarArgs = ((Collection)localObject2).toArray(new Integer[0]);
            }
            paramzzgd.zzc().zze(paramInt, paramVarArgs);
            return;
            label192:
            paramzzgd = new com/google/android/recaptcha/internal/zzce;
            paramzzgd.<init>(4, 5, null);
            throw paramzzgd;
          }
          catch (ArithmeticException paramzzgd)
          {
            throw new zzce(4, 6, paramzzgd);
          }
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */