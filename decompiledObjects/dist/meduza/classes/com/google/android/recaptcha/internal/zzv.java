package com.google.android.recaptcha.internal;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import n7.w;
import nc.e0;
import rb.f;
import sb.m;
import sb.t;
import sb.y;
import vb.a;

public final class zzv
  extends zze
{
  private final zzek zza;
  private final List zzb;
  private zzle zzc;
  private final Map zzd;
  
  public zzv(Context paramContext, zzek paramzzek, zzbi paramzzbi, List paramList, int paramInt, ec.e parame)
  {
    zza = paramzzek;
    zzb = paramContext;
    zzd = new LinkedHashMap();
  }
  
  private final zzsi zzq(String paramString)
  {
    Object localObject1 = (List)zzd.remove(paramString);
    if (localObject1 != null)
    {
      int i = y.H0(m.j((Iterable)localObject1));
      j = i;
      if (i < 16) {
        j = 16;
      }
      localObject2 = new LinkedHashMap(j);
      Iterator localIterator = ((Iterable)localObject1).iterator();
      for (;;)
      {
        localObject1 = localObject2;
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (zzaa)localIterator.next();
        ((Map)localObject2).put(Integer.valueOf(((zzaa)localObject1).zzb()), localObject1);
      }
    }
    localObject1 = t.a;
    Object localObject2 = zzs((Map)localObject1, paramString);
    localObject1 = zzsi.zzf();
    ((zzsh)localObject1).zze(paramString);
    paramString = zzsg.zzf();
    localObject2 = ((zzko)localObject2).zzd();
    int j = localObject2.length;
    paramString.zze(zzkh.zzh().zzi((byte[])localObject2, 0, j));
    ((zzsh)localObject1).zzf(paramString);
    return (zzsi)((zzmx)localObject1).zzi();
  }
  
  private final zzsx zzr(zzaa paramzzaa)
  {
    zzsv localzzsv = zzsx.zzf();
    localzzsv.zzq(3);
    boolean bool = paramzzaa instanceof zzx;
    zzti localzzti = null;
    Object localObject = null;
    int i;
    if (bool)
    {
      localzzti = ((zzx)paramzzaa).zza();
      paramzzaa = zzc;
      if (paramzzaa == null) {
        paramzzaa = (zzaa)localObject;
      }
      localObject = localzzti.zzd();
      i = localObject.length;
      localzzsv.zzf(zzcf.zza(zzkh.zzh().zzi((byte[])localObject, 0, i), paramzzaa));
    }
    else
    {
      if (!(paramzzaa instanceof zzw)) {
        break label155;
      }
      localObject = ((zzw)paramzzaa).zza();
      paramzzaa = zzc;
      if (paramzzaa == null) {
        paramzzaa = localzzti;
      }
      localObject = ((zzko)localObject).zzd();
      i = localObject.length;
      localzzsv.zze(zzcf.zza(zzkh.zzh().zzi((byte[])localObject, 0, i), paramzzaa));
    }
    return (zzsx)localzzsv.zzi();
    label155:
    throw new w();
  }
  
  private final zzsz zzs(Map paramMap, String paramString)
  {
    zzsy localzzsy = zzsz.zzf();
    localzzsy.zzq(paramString);
    Object localObject1 = zzb;
    paramString = new ArrayList();
    localObject1 = ((Iterable)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = ((Iterator)localObject1).next();
      if (((zzy)localObject2).zzf()) {
        paramString.add(localObject2);
      }
    }
    paramString = paramString.iterator();
    while (paramString.hasNext())
    {
      localObject1 = (zzy)paramString.next();
      if (!paramMap.containsKey(Integer.valueOf(((zzy)localObject1).zza())))
      {
        int i = ((zzy)localObject1).zza();
        localObject1 = zzte.zzf();
        ((zztd)localObject1).zzf(i);
        ((zztd)localObject1).zzr(13);
        ((zztd)localObject1).zzq(27);
        localzzsy.zzf(zzr(new zzw(i, (zzte)((zzmx)localObject1).zzi())));
      }
    }
    paramString = paramMap.values();
    paramMap = new ArrayList(m.j(paramString));
    paramString = paramString.iterator();
    while (paramString.hasNext()) {
      paramMap.add(zzr((zzaa)paramString.next()));
    }
    localzzsy.zze(paramMap);
    return (zzsz)localzzsy.zzi();
  }
  
  public final zzen zza(String paramString)
  {
    zzek localzzek = zza;
    localzzek.zzc(paramString);
    return localzzek.zzf(35);
  }
  
  public final zzen zzb()
  {
    zzek localzzek = zza;
    localzzek.zzc(localzzek.zzd());
    return localzzek.zzf(34);
  }
  
  public final Object zzd(String paramString, ub.e parame)
  {
    return zzq(paramString);
  }
  
  public final Object zzf(String paramString, ub.e parame)
  {
    if ((parame instanceof zzq))
    {
      localObject = (zzq)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject;
        break label52;
      }
    }
    parame = new zzq(this, parame);
    label52:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject);
        paramString = (String)localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      paramString = new zzs(this, paramString, null);
      zzc = 1;
      parame = e0.b(paramString, parame);
      paramString = parame;
      if (parame == locala) {
        return locala;
      }
    }
    return a;
  }
  
  public final Object zzh(zzsc paramzzsc, ub.e parame)
  {
    if ((parame instanceof zzt))
    {
      localObject = (zzt)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject;
        break label52;
      }
    }
    parame = new zzt(this, parame);
    label52:
    Object localObject = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        f.b(localObject);
        paramzzsc = (zzsc)localObject;
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject);
      paramzzsc = new zzu(paramzzsc, this, null);
      zzc = 1;
      parame = e0.b(paramzzsc, parame);
      paramzzsc = parame;
      if (parame == locala) {
        return locala;
      }
    }
    return a;
  }
  
  public final void zzk(zzsr paramzzsr)
  {
    Iterator localIterator = zzb.iterator();
    while (localIterator.hasNext()) {
      ((zzy)localIterator.next()).zze(paramzzsr);
    }
  }
  
  public final Map zzo()
  {
    return zzd;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */