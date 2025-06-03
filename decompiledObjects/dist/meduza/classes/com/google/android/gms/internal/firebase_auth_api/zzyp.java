package com.google.android.gms.internal.firebase_auth_api;

import java.security.Provider;
import java.util.Iterator;
import java.util.List;

final class zzyp<JcePrimitiveT>
  implements zzyq<JcePrimitiveT>
{
  private final zzys<JcePrimitiveT> zza;
  
  private zzyp(zzys<JcePrimitiveT> paramzzys)
  {
    zza = paramzzys;
  }
  
  public final JcePrimitiveT zza(String paramString)
  {
    Iterator localIterator = zzym.zza(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL" }).iterator();
    Object localObject1 = null;
    while (localIterator.hasNext())
    {
      Object localObject2 = (Provider)localIterator.next();
      try
      {
        localObject2 = zza.zza(paramString, (Provider)localObject2);
        return (JcePrimitiveT)localObject2;
      }
      catch (Exception localException) {}
      if (localObject1 == null) {
        localObject1 = localException;
      }
    }
    return (JcePrimitiveT)zza.zza(paramString, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */