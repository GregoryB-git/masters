package com.google.android.gms.internal.firebase_auth_api;

import g;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r.b;
import u7.f;
import u7.j;

public final class zzafm
{
  private static final Map<String, zzafl> zza = new b();
  private static final Map<String, List<WeakReference<zzafo>>> zzb = new b();
  
  public static String zza(String paramString)
  {
    synchronized (zza)
    {
      paramString = (zzafl)???.get(paramString);
      if (paramString != null) {
        return g.d(zza(paramString.zzb(), paramString.zza(), paramString.zzb().contains(":")), "emulator/auth/handler");
      }
      throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }
  }
  
  private static String zza(String paramString, int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    Object localObject2;
    if (paramBoolean)
    {
      localObject1 = new StringBuilder("http://[");
      ((StringBuilder)localObject1).append(paramString);
      localObject2 = "]:";
      paramString = (String)localObject1;
      localObject1 = localObject2;
    }
    for (;;)
    {
      paramString.append((String)localObject1);
      paramString.append(paramInt);
      paramString.append("/");
      return paramString.toString();
      localObject2 = new StringBuilder("http://");
      ((StringBuilder)localObject2).append(paramString);
      localObject1 = ":";
      paramString = (String)localObject2;
    }
  }
  
  public static void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzafo paramzzafo)
  {
    synchronized (zzb)
    {
      Object localObject;
      if (???.containsKey(paramString))
      {
        localObject = (List)???.get(paramString);
        paramString = new java/lang/ref/WeakReference;
        paramString.<init>(paramzzafo);
        ((List)localObject).add(paramString);
      }
      else
      {
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        localObject = new java/lang/ref/WeakReference;
        ((WeakReference)localObject).<init>(paramzzafo);
        localArrayList.add(localObject);
        ???.put(paramString, localArrayList);
      }
      return;
    }
  }
  
  public static void zza(f paramf, String arg1, int paramInt)
  {
    paramf.a();
    paramf = c.a;
    synchronized (zza)
    {
      Object localObject2 = new com/google/android/gms/internal/firebase_auth_api/zzafl;
      ((zzafl)localObject2).<init>(???, paramInt);
      ((Map)???).put(paramf, localObject2);
      synchronized (zzb)
      {
        if (???.containsKey(paramf))
        {
          paramInt = 0;
          localObject2 = ((List)???.get(paramf)).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            ??? = (zzafo)((WeakReference)((Iterator)localObject2).next()).get();
            if (??? != null)
            {
              paramInt = 1;
              ((zzafo)???).zza();
            }
          }
          if (paramInt == 0) {
            zza.remove(paramf);
          }
        }
        return;
      }
    }
  }
  
  public static boolean zza(f paramf)
  {
    Map localMap = zza;
    paramf.a();
    return localMap.containsKey(c.a);
  }
  
  public static String zzb(String paramString)
  {
    synchronized (zza)
    {
      paramString = (zzafl)???.get(paramString);
      if (paramString != null) {
        paramString = g.d("", zza(paramString.zzb(), paramString.zza(), paramString.zzb().contains(":")));
      } else {
        paramString = "https://";
      }
      return g.d(paramString, "www.googleapis.com/identitytoolkit/v3/relyingparty");
    }
  }
  
  public static String zzc(String paramString)
  {
    synchronized (zza)
    {
      paramString = (zzafl)???.get(paramString);
      if (paramString != null) {
        paramString = g.d("", zza(paramString.zzb(), paramString.zza(), paramString.zzb().contains(":")));
      } else {
        paramString = "https://";
      }
      return g.d(paramString, "identitytoolkit.googleapis.com/v2");
    }
  }
  
  public static String zzd(String paramString)
  {
    synchronized (zza)
    {
      paramString = (zzafl)???.get(paramString);
      if (paramString != null) {
        paramString = g.d("", zza(paramString.zzb(), paramString.zza(), paramString.zzb().contains(":")));
      } else {
        paramString = "https://";
      }
      return g.d(paramString, "securetoken.googleapis.com/v1");
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */