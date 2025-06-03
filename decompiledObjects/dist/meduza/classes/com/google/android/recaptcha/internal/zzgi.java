package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

public final class zzgi
  implements zzgx
{
  public static final zzgi zza = new zzgi();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 3)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof Object) {
        localObject2 = null;
      }
      if (localObject2 != null)
      {
        Object localObject3 = paramzzgd.zzc().zza(paramVarArgs[1]);
        localObject1 = localObject3;
        if (true != localObject3 instanceof Integer) {
          localObject1 = null;
        }
        localObject1 = (Integer)localObject1;
        if (localObject1 != null)
        {
          paramInt = ((Number)localObject1).intValue();
          paramVarArgs = paramzzgd.zzc().zza(paramVarArgs[2]);
          paramzzgd = paramVarArgs;
          if (true != paramVarArgs instanceof Object) {
            paramzzgd = null;
          }
          if (paramzzgd != null) {
            try
            {
              Array.set(localObject2, paramInt, paramzzgd);
              return;
            }
            catch (Exception paramzzgd)
            {
              if ((paramzzgd instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzce(4, 22, paramzzgd);
              }
              throw new zzce(4, 25, paramzzgd);
            }
          }
          throw new zzce(4, 5, null);
        }
        throw new zzce(4, 5, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgi
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */