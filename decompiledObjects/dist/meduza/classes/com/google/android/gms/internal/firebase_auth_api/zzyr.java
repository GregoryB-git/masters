package com.google.android.gms.internal.firebase_auth_api;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;
import java.util.List;

final class zzyr<JcePrimitiveT>
  implements zzyq<JcePrimitiveT>
{
  private final zzys<JcePrimitiveT> zza;
  
  private zzyr(zzys<JcePrimitiveT> paramzzys)
  {
    zza = paramzzys;
  }
  
  public final JcePrimitiveT zza(String paramString)
  {
    Iterator localIterator = zzym.zza(new String[] { "GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt" }).iterator();
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
    throw new GeneralSecurityException("No good Provider found.", (Throwable)localObject1);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzyr
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */