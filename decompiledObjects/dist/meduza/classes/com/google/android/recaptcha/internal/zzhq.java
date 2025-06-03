package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Collection;

public final class zzhq
  implements zzgx
{
  public static final zzhq zza = new zzhq();
  
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
          if ((localObject2 instanceof Integer))
          {
            paramVarArgs = Integer.valueOf(((Number)localObject2).intValue() - i);
          }
          else
          {
            if (!(localObject2 instanceof int[])) {
              break label191;
            }
            localObject2 = (int[])localObject2;
            int j = localObject2.length;
            paramVarArgs = new ArrayList(j);
            for (int k = 0; k < j; k++) {
              paramVarArgs.add(Integer.valueOf(localObject2[k] - i));
            }
            paramVarArgs = paramVarArgs.toArray(new Integer[0]);
          }
          paramzzgd.zzc().zze(paramInt, paramVarArgs);
          return;
          label191:
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
 * Qualified Name:     com.google.android.recaptcha.internal.zzhq
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */