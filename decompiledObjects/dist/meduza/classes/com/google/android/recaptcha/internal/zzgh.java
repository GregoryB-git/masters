package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;
import java.util.List;

public final class zzgh
  implements zzgx
{
  public static final zzgh zza = new zzgh();
  
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
            if ((localObject2 instanceof String)) {
              paramVarArgs = String.valueOf(((String)localObject2).charAt(i));
            } else if ((localObject2 instanceof List)) {
              paramVarArgs = ((List)localObject2).get(i);
            } else {
              paramVarArgs = Array.get(localObject2, i);
            }
            paramzzgd.zzc().zze(paramInt, paramVarArgs);
            return;
          }
          catch (Exception paramzzgd)
          {
            if ((paramzzgd instanceof ArrayIndexOutOfBoundsException)) {
              throw new zzce(4, 22, paramzzgd);
            }
            throw new zzce(4, 23, paramzzgd);
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzgh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */