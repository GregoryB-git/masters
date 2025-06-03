package com.google.android.gms.internal.firebase_auth_api;

import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class zzym<T_WRAPPER extends zzys<JcePrimitiveT>, JcePrimitiveT>
{
  public static final zzym<zzyv, Cipher> zza = new zzym(new zzyv());
  public static final zzym<zzyz, Mac> zzb = new zzym(new zzyz());
  public static final zzym<zzyu, KeyAgreement> zzc = new zzym(new zzyu());
  public static final zzym<zzyw, KeyPairGenerator> zzd = new zzym(new zzyw());
  public static final zzym<zzyx, KeyFactory> zze = new zzym(new zzyx());
  private final zzyq<JcePrimitiveT> zzf;
  
  static
  {
    new zzym(new zzzb());
    new zzym(new zzyy());
  }
  
  private zzym(T_WRAPPER paramT_WRAPPER)
  {
    if (zzij.zzb()) {
      paramT_WRAPPER = new zzyr(paramT_WRAPPER, null);
    }
    for (;;)
    {
      zzf = paramT_WRAPPER;
      return;
      if (zzzj.zza()) {
        paramT_WRAPPER = new zzyp(paramT_WRAPPER, null);
      } else {
        paramT_WRAPPER = new zzyo(paramT_WRAPPER, null);
      }
    }
  }
  
  public static List<Provider> zza(String... paramVarArgs)
  {
    ArrayList localArrayList = new ArrayList();
    int i = paramVarArgs.length;
    for (int j = 0; j < i; j++)
    {
      Provider localProvider = Security.getProvider(paramVarArgs[j]);
      if (localProvider != null) {
        localArrayList.add(localProvider);
      }
    }
    return localArrayList;
  }
  
  public final JcePrimitiveT zza(String paramString)
  {
    return (JcePrimitiveT)zzf.zza(paramString);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzym
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */