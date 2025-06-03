package com.google.android.gms.internal.firebase_auth_api;

import com.google.android.gms.internal.firebase-auth-api.zzbo;
import f;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class zzbs
{
  private final com.google.android.gms.internal.firebase-auth-api.zzwl zza;
  private final List<zzbv> zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zznr zzc;
  
  private zzbs(zzwl paramzzwl, List<zzbv> paramList)
  {
    zza = paramzzwl;
    zzb = paramList;
    zzc = zznr.zza;
  }
  
  private zzbs(zzwl paramzzwl, List<zzbv> paramList, zznr paramzznr)
  {
    zza = paramzzwl;
    zzb = paramList;
    zzc = paramzznr;
  }
  
  private static zzbo zza(com.google.android.gms.internal.firebase-auth-api.zzwl.zza paramzza)
  {
    int i = paramzza.zza();
    if (paramzza.zzf() == zzxd.zzd) {
      localObject = null;
    } else {
      localObject = Integer.valueOf(i);
    }
    com.google.android.gms.internal.firebase-auth-api.zzpn localzzpn = zzpn.zza(paramzza.zzb().zzf(), paramzza.zzb().zze(), paramzza.zzb().zzb(), paramzza.zzf(), (Integer)localObject);
    paramzza = zzom.zza();
    Object localObject = zzcm.zza();
    if (!paramzza.zzb(localzzpn)) {
      return new zznn(localzzpn, (com.google.android.gms.internal.firebase-auth-api.zzcm)localObject);
    }
    return paramzza.zza(localzzpn, (com.google.android.gms.internal.firebase-auth-api.zzcm)localObject);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzbq zza(com.google.android.gms.internal.firebase-auth-api.zzwc paramzzwc)
  {
    int i = zzbr.zza[paramzzwc.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i == 3) {
          return zzbq.zzc;
        }
        throw new GeneralSecurityException("Unknown key status");
      }
      return zzbq.zzb;
    }
    return zzbq.zza;
  }
  
  public static final com.google.android.gms.internal.firebase-auth-api.zzbs zza(com.google.android.gms.internal.firebase-auth-api.zzbp paramzzbp)
  {
    paramzzbp = paramzzbp.zza();
    return new zzbu().zza(new zzbt(paramzzbp, null).zzb().zza()).zza();
  }
  
  @Deprecated
  public static final com.google.android.gms.internal.firebase-auth-api.zzbs zza(com.google.android.gms.internal.firebase-auth-api.zzca paramzzca, com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe, byte[] paramArrayOfByte)
  {
    paramzzca = paramzzca.zza();
    if ((paramzzca != null) && (paramzzca.zzc().zzb() != 0)) {
      return zza(zza(paramzzca, paramzzbe, paramArrayOfByte));
    }
    throw new GeneralSecurityException("empty keyset");
  }
  
  public static final com.google.android.gms.internal.firebase-auth-api.zzbs zza(com.google.android.gms.internal.firebase-auth-api.zzwl paramzzwl)
  {
    zzd(paramzzwl);
    return new zzbs(paramzzwl, zzc(paramzzwl));
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzwl zza(com.google.android.gms.internal.firebase-auth-api.zzuz paramzzuz, com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe, byte[] paramArrayOfByte)
  {
    try
    {
      paramzzuz = zzwl.zza(paramzzbe.zza(paramzzuz.zzc().zzd(), paramArrayOfByte), zzajv.zza());
      zzd(paramzzuz);
      return paramzzuz;
    }
    catch (zzakm paramzzuz)
    {
      throw new GeneralSecurityException("invalid keyset, corrupted key material");
    }
  }
  
  private final <B, P> P zza(zzmz paramzzmz, Class<P> paramClass, Class<B> paramClass1)
  {
    zzcn.zzb(zza);
    com.google.android.gms.internal.firebase-auth-api.zzpj localzzpj = zzpg.zza(paramClass1);
    localzzpj.zza(zzc);
    for (int i = 0; i < zzb.size(); i++)
    {
      Object localObject1 = zza.zza(i);
      if (((zzwl.zza)localObject1).zzc().equals(zzwc.zzb))
      {
        Object localObject2 = (zzbv)zzb.get(i);
        if (localObject2 != null)
        {
          zzbo localzzbo = ((zzbv)localObject2).zzb();
          try
          {
            localObject2 = paramzzmz.zza(localzzbo, paramClass1);
            if (((zzwl.zza)localObject1).zza() == zza.zzb()) {
              localzzpj.zzb(localObject2, localzzbo, (com.google.android.gms.internal.firebase-auth-api.zzwl.zza)localObject1);
            } else {
              localzzpj.zza(localObject2, localzzbo, (com.google.android.gms.internal.firebase-auth-api.zzwl.zza)localObject1);
            }
          }
          catch (GeneralSecurityException paramzzmz)
          {
            paramClass = String.valueOf(paramClass1);
            paramClass1 = ((zzwl.zza)localObject1).zzb().zzf();
            localObject1 = new StringBuilder("Unable to get primitive ");
            ((StringBuilder)localObject1).append(paramClass);
            ((StringBuilder)localObject1).append(" for key of type ");
            ((StringBuilder)localObject1).append(paramClass1);
            ((StringBuilder)localObject1).append(", see https://developers.google.com/tink/faq/registration_errors");
            throw new GeneralSecurityException(((StringBuilder)localObject1).toString(), paramzzmz);
          }
        }
        paramClass = ((zzwl.zza)localObject1).zzb().zzf();
        paramzzmz = new StringBuilder("Key parsing of key with index ");
        paramzzmz.append(i);
        paramzzmz.append(" and type_url ");
        paramzzmz.append(paramClass);
        paramzzmz.append(" failed, unable to get primitive");
        throw new GeneralSecurityException(paramzzmz.toString());
      }
    }
    return (P)paramzzmz.zza(localzzpj.zza(), paramClass);
  }
  
  private static com.google.android.gms.internal.firebase-auth-api.zzwl.zza zzb(zzbo paramzzbo, com.google.android.gms.internal.firebase-auth-api.zzbq paramzzbq, int paramInt)
  {
    zzpn localzzpn = (zzpn)zzom.zza().zza(paramzzbo, com.google.android.gms.internal.firebase-auth-api.zzpn.class, zzcm.zza());
    paramzzbo = localzzpn.zze();
    if ((paramzzbo != null) && (paramzzbo.intValue() != paramInt)) {
      throw new GeneralSecurityException("Wrong ID set for key with ID requirement");
    }
    if (zzbq.zza.equals(paramzzbq))
    {
      paramzzbo = zzwc.zzb;
    }
    else if (zzbq.zzb.equals(paramzzbq))
    {
      paramzzbo = zzwc.zzc;
    }
    else
    {
      if (!zzbq.zzc.equals(paramzzbq)) {
        break label151;
      }
      paramzzbo = zzwc.zzd;
    }
    return (zzwl.zza)zzwl.zza.zzd().zza(zzwb.zza().zza(localzzpn.zzf()).zza(localzzpn.zzd()).zza(localzzpn.zza())).zza(paramzzbo).zza(paramInt).zza(localzzpn.zzc()).zze();
    label151:
    throw new IllegalStateException("Unknown key status");
  }
  
  private static List<zzbv> zzc(zzwl paramzzwl)
  {
    ArrayList localArrayList = new ArrayList(paramzzwl.zza());
    Iterator localIterator = paramzzwl.zze().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (zzwl.zza)localIterator.next();
      int i = ((zzwl.zza)localObject).zza();
      try
      {
        zzbo localzzbo = zza((com.google.android.gms.internal.firebase-auth-api.zzwl.zza)localObject);
        zzbv localzzbv = new com/google/android/gms/internal/firebase_auth_api/zzbv;
        localObject = zza(((zzwl.zza)localObject).zzc());
        boolean bool;
        if (i == paramzzwl.zzb()) {
          bool = true;
        } else {
          bool = false;
        }
        localzzbv.<init>(localzzbo, (com.google.android.gms.internal.firebase-auth-api.zzbq)localObject, i, bool, null);
        localArrayList.add(localzzbv);
      }
      catch (GeneralSecurityException localGeneralSecurityException)
      {
        localArrayList.add(null);
      }
    }
    return Collections.unmodifiableList(localArrayList);
  }
  
  private static void zzd(com.google.android.gms.internal.firebase-auth-api.zzwl paramzzwl)
  {
    if ((paramzzwl != null) && (paramzzwl.zza() > 0)) {
      return;
    }
    throw new GeneralSecurityException("empty keyset");
  }
  
  public final String toString()
  {
    return zzcn.zza(zza).toString();
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzbs zza()
  {
    if (zza != null)
    {
      com.google.android.gms.internal.firebase-auth-api.zzwl.zzb localzzb = zzwl.zzc();
      ArrayList localArrayList = new ArrayList(zzb.size());
      Iterator localIterator = zzb.iterator();
      int i = 0;
      while (localIterator.hasNext())
      {
        Object localObject1 = (zzbv)localIterator.next();
        Object localObject2;
        Object localObject3;
        Object localObject4;
        if ((localObject1 != null) && ((((zzbv)localObject1).zzb() instanceof zzcf)))
        {
          localObject2 = ((zzcf)((zzbv)localObject1).zzb()).zzb();
          localObject3 = new zzbv((zzbo)localObject2, ((zzbv)localObject1).zzc(), ((zzbv)localObject1).zza(), ((zzbv)localObject1).zzd(), null);
          localObject1 = zzb((zzbo)localObject2, ((zzbv)localObject1).zzc(), ((zzbv)localObject1).zza());
        }
        else
        {
          localObject3 = zza.zza(i);
          localObject1 = ((zzwl.zza)localObject3).zzb();
          if (((zzwb)localObject1).zzb() != zzwb.zza.zzc) {
            break label299;
          }
          localObject1 = zzcj.zza(((zzwb)localObject1).zzf(), ((zzwb)localObject1).zze());
          localObject1 = (zzwl.zza)((zzwl.zza.zza)((zzakg)localObject3).zzn()).zza((com.google.android.gms.internal.firebase-auth-api.zzwb)localObject1).zze();
          try
          {
            zzbo localzzbo = zza((com.google.android.gms.internal.firebase-auth-api.zzwl.zza)localObject1);
            int j = ((zzwl.zza)localObject1).zza();
            localObject3 = new com/google/android/gms/internal/firebase_auth_api/zzbv;
            localObject2 = zza(((zzwl.zza)localObject1).zzc());
            boolean bool;
            if (j == zza.zzb()) {
              bool = true;
            } else {
              bool = false;
            }
            ((zzbv)localObject3).<init>(localzzbo, (com.google.android.gms.internal.firebase-auth-api.zzbq)localObject2, j, bool, null);
          }
          catch (GeneralSecurityException localGeneralSecurityException)
          {
            localObject4 = null;
          }
        }
        localzzb.zza((com.google.android.gms.internal.firebase-auth-api.zzwl.zza)localObject1);
        localArrayList.add(localObject4);
        i++;
        continue;
        label299:
        throw new GeneralSecurityException("The keyset contains a non-private key");
      }
      localzzb.zza(zza.zzb());
      return new zzbs((zzwl)localzzb.zze(), localArrayList, zzc);
    }
    throw new GeneralSecurityException("cleartext keyset is not available");
  }
  
  public final <P> P zza(zzbf paramzzbf, Class<P> paramClass)
  {
    if ((paramzzbf instanceof zzmz))
    {
      paramzzbf = (zzmz)paramzzbf;
      Class localClass = paramzzbf.zza(paramClass);
      if (localClass != null) {
        return (P)zza(paramzzbf, paramClass, localClass);
      }
      throw new GeneralSecurityException(f.j("No wrapper found for ", paramClass.getName()));
    }
    throw new GeneralSecurityException("Currently only subclasses of InternalConfiguration are accepted");
  }
  
  @Deprecated
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzbz paramzzbz)
  {
    Iterator localIterator = zza.zze().iterator();
    while (localIterator.hasNext())
    {
      zzwl.zza localzza = (zzwl.zza)localIterator.next();
      if ((localzza.zzb().zzb() == zzwb.zza.zza) || (localzza.zzb().zzb() == zzwb.zza.zzb) || (localzza.zzb().zzb() == zzwb.zza.zzc)) {
        throw new GeneralSecurityException(String.format("keyset contains key material of type %s for type url %s", new Object[] { localzza.zzb().zzb().name(), localzza.zzb().zzf() }));
      }
    }
    paramzzbz.zza(zza);
  }
  
  @Deprecated
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzbz paramzzbz, com.google.android.gms.internal.firebase-auth-api.zzbe paramzzbe, byte[] paramArrayOfByte)
  {
    com.google.android.gms.internal.firebase-auth-api.zzwl localzzwl = zza;
    paramzzbe = paramzzbe.zzb(localzzwl.zzk(), paramArrayOfByte);
    paramzzbz.zza((zzuz)zzuz.zza().zza(zzaiw.zza(paramzzbe)).zza(zzcn.zza(localzzwl)).zze());
  }
  
  public final com.google.android.gms.internal.firebase-auth-api.zzwl zzb()
  {
    return zza;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzbs
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */