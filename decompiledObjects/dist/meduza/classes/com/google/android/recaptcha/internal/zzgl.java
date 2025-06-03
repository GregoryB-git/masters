package com.google.android.recaptcha.internal;

public final class zzgl
  implements zzgx
{
  public static final zzgl zza = new zzgl();
  
  public final void zza(int paramInt, zzgd paramzzgd, zzue... paramVarArgs)
  {
    if (paramVarArgs.length == 2)
    {
      Object localObject1 = paramzzgd.zzc().zza(paramVarArgs[0]);
      Object localObject2 = localObject1;
      if (true != localObject1 instanceof String) {
        localObject2 = null;
      }
      localObject2 = (String)localObject2;
      if (localObject2 != null)
      {
        paramVarArgs = paramzzgd.zzc().zza(paramVarArgs[1]);
        if (paramVarArgs != null)
        {
          if ((!(paramVarArgs instanceof Integer)) && (!(paramVarArgs instanceof Short)) && (!(paramVarArgs instanceof Byte)) && (!(paramVarArgs instanceof Long)) && (!(paramVarArgs instanceof Double)) && (!(paramVarArgs instanceof Float)) && (!(paramVarArgs instanceof Boolean)) && (!(paramVarArgs instanceof Character)) && (!(paramVarArgs instanceof String))) {
            throw new zzce(4, 7, null);
          }
          paramVarArgs = paramVarArgs.toString();
          paramzzgd.zzi().zzb((String)localObject2, new String[] { paramVarArgs });
          return;
        }
        throw new zzce(4, 4, null);
      }
      throw new zzce(4, 5, null);
    }
    throw new zzce(4, 3, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzgl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */