package com.google.android.recaptcha.internal;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import b.a0;
import b.z;
import com.google.android.recaptcha.RecaptchaAction;
import dc.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nc.d;
import nc.d0;
import nc.d2;
import nc.j1;
import nc.j1.b;
import rb.c;
import rb.f;
import rb.g;
import sb.m;
import sb.q;
import sb.y;
import vb.a;

public final class zzdt
{
  private final String zza;
  private final zzek zzb;
  private final zzl zzc;
  private final c zzd;
  private final c zze;
  private final c zzf;
  private final c zzg;
  private final c zzh;
  private final zzbi zzi;
  
  public zzdt(String paramString, zzbi paramzzbi, zzek paramzzek, zzl paramzzl)
  {
    zza = paramString;
    zzi = paramzzbi;
    zzb = paramzzek;
    zzc = paramzzl;
    int i = zzav.zza;
    zzd = z.n(zzdm.zza);
    zze = z.n(zzdn.zza);
    zzf = z.n(zzdo.zza);
    zzg = z.n(zzdp.zza);
    zzh = z.n(zzdq.zza);
  }
  
  private final Application zzr()
  {
    return (Application)zzh.getValue();
  }
  
  private final zzbd zzs(Exception paramException, zzbd paramzzbd)
  {
    if (!zzx()) {
      paramzzbd = new zzbd(zzbb.zzc, zzba.zzao, paramException.getMessage());
    }
    return paramzzbd;
  }
  
  private final zzbf zzt()
  {
    return (zzbf)zzf.getValue();
  }
  
  private final zzek zzu(String paramString)
  {
    zzek localzzek = zzb.zza();
    localzzek.zzc(paramString);
    return localzzek;
  }
  
  private final Object zzv(zzsc paramzzsc, long paramLong, ub.e parame)
  {
    if ((parame instanceof zzdj))
    {
      localObject1 = (zzdj)parame;
      i = zzd;
      if ((i & 0x80000000) != 0)
      {
        zzd = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label59;
      }
    }
    parame = new zzdj(this, parame);
    label59:
    Object localObject1 = zzb;
    a locala = a.a;
    int i = zzd;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        paramzzsc = (Throwable)zza;
        f.b(localObject1);
        break label433;
      }
      paramzzsc = (zzdt)zza;
      f.b(localObject1);
      localObject1 = a;
    }
    else
    {
      f.b(localObject1);
      zzy(paramzzsc.zzO());
      localObject1 = zzw().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zze)((Iterator)localObject1).next();
        zzc.zzf(new zze[] { localObject2 });
      }
      localObject1 = zzc;
      localObject2 = zzb;
      zza = this;
      zzd = 1;
      localObject1 = ((zzl)localObject1).zzc(paramLong, paramzzsc, (zzek)localObject2, parame);
      if (localObject1 == locala) {
        break label427;
      }
      paramzzsc = this;
    }
    localObject1 = rb.e.a(localObject1);
    if (localObject1 == null) {
      return rb.h.a;
    }
    Object localObject2 = (j1)zzi.zzd().f().get(j1.b.a);
    if (localObject2 != null)
    {
      localObject2 = ((j1)localObject2).getChildren();
      if (localObject2 != null)
      {
        localObject2 = ((kc.b)localObject2).iterator();
        while (((Iterator)localObject2).hasNext()) {
          ((j1)((Iterator)localObject2).next()).cancel(null);
        }
      }
    }
    paramzzsc = zzi.zzd().f();
    localObject2 = (j1)paramzzsc.get(j1.b.a);
    if (localObject2 != null)
    {
      paramzzsc = kc.i.N(((j1)localObject2).getChildren());
      zza = localObject1;
      zzd = 2;
      if (d.b(paramzzsc, parame) == locala) {
        label427:
        return locala;
      }
      paramzzsc = (zzsc)localObject1;
      label433:
      throw paramzzsc;
    }
    parame = new StringBuilder();
    parame.append("Current context doesn't contain Job in it: ");
    parame.append(paramzzsc);
    throw new IllegalStateException(parame.toString().toString());
  }
  
  private final List zzw()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new zzv(zzr(), zzb.zza(), zzi, null, 8, null));
    localArrayList.add(new zzja(zzb, zzi));
    return q.u(localArrayList);
  }
  
  private final boolean zzx()
  {
    int i = zzav.zza;
    Object localObject = (zzbe)z.n(zzdi.zza).getValue();
    localObject = zzr();
    try
    {
      localObject = ((Context)localObject).getSystemService("connectivity");
      ec.i.c(localObject, "null cannot be cast to non-null type android.net.ConnectivityManager");
      ConnectivityManager localConnectivityManager = (ConnectivityManager)localObject;
      localObject = localConnectivityManager.getActiveNetwork();
      if (localObject != null)
      {
        localObject = localConnectivityManager.getNetworkCapabilities((Network)localObject);
        if (localObject != null)
        {
          boolean bool = ((NetworkCapabilities)localObject).hasCapability(16);
          if (bool) {
            return true;
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    return false;
  }
  
  private static final void zzy(String paramString)
  {
    try
    {
      paramString = zzrv.zzj(zzbt.zza(paramString));
      int i = zzav.zza;
      ((zzfu)z.n(zzde.zza).getValue()).zza(paramString);
      return;
    }
    catch (Exception paramString)
    {
      throw new zzbd(zzbb.zzl, zzba.zzan, paramString.getMessage());
    }
  }
  
  public final zzsp zzi(RecaptchaAction paramRecaptchaAction, zzsi paramzzsi, zzsc paramzzsc)
  {
    zzso localzzso = zzsp.zzf();
    localzzso.zzs(zza);
    localzzso.zze(paramRecaptchaAction.getAction());
    localzzso.zzf(paramzzsc.zzN());
    localzzso.zzq(paramzzsc.zzM());
    localzzso.zzr(paramzzsi);
    return (zzsp)localzzso.zzi();
  }
  
  public final Object zzl(String paramString, long paramLong, ub.e parame)
  {
    if ((parame instanceof zzdd))
    {
      localObject1 = (zzdd)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label55;
      }
    }
    Object localObject1 = new zzdd(this, parame);
    label55:
    Object localObject2 = zza;
    Object localObject3 = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1)
      {
        paramString = zzd;
        localObject1 = paramString;
        localObject3 = paramString;
        parame = paramString;
        try
        {
          f.b(localObject2);
        }
        catch (Exception paramString)
        {
          break label227;
        }
        catch (d2 paramString)
        {
          break label258;
        }
        catch (zzbd paramString)
        {
          break label285;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      parame = zzu(paramString).zzf(27);
    }
    try
    {
      localObject2 = zzc;
      zzd = parame;
      zzc = 1;
      localObject2 = ((zzl)localObject2).zzb(paramString, paramLong, (ub.e)localObject1);
      if (localObject2 != localObject3)
      {
        paramString = parame;
        localObject1 = paramString;
        localObject3 = paramString;
        parame = paramString;
        localObject2 = (zzsi)localObject2;
        localObject1 = paramString;
        localObject3 = paramString;
        parame = paramString;
        paramString.zza();
        return localObject2;
      }
      return localObject3;
    }
    catch (Exception paramString)
    {
      localObject1 = parame;
      paramString = new zzbd(zzbb.zzb, zzba.zzaa, paramString.getMessage());
      ((zzen)localObject1).zzb(paramString);
      throw paramString;
    }
    catch (d2 paramString)
    {
      label227:
      localObject3 = parame;
      label258:
      paramString = new zzbd(zzbb.zzb, zzba.zzb, paramString.getMessage());
      ((zzen)localObject3).zzb(paramString);
      throw paramString;
    }
    catch (zzbd paramString) {}
    label285:
    parame.zzb(paramString);
    throw paramString;
  }
  
  public final Object zzm(zzsp paramzzsp, String paramString, long paramLong, ub.e parame)
  {
    return x6.b.z0(parame, zzi.zza().f(), new zzdg(this, paramString, paramLong, paramzzsp, null));
  }
  
  public final Object zzn(zzsc paramzzsc, long paramLong, ub.e parame)
  {
    if ((parame instanceof zzdk))
    {
      localObject1 = (zzdk)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (ub.e)localObject1;
        break label59;
      }
    }
    parame = new zzdk(this, parame);
    label59:
    Object localObject2 = zza;
    Object localObject1 = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i == 1) {
        try
        {
          f.b(localObject2);
        }
        catch (Exception paramzzsc)
        {
          break label166;
        }
        catch (d2 paramzzsc)
        {
          break label184;
        }
        catch (zzbd paramzzsc)
        {
          break label202;
        }
      } else {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      localObject2 = new com/google/android/recaptcha/internal/zzdl;
      ((zzdl)localObject2).<init>(this, paramzzsc, paramLong, null);
      zzc = 1;
      paramzzsc = a0.M(paramLong, (p)localObject2, parame);
      if (paramzzsc == localObject1) {
        return localObject1;
      }
    }
    return rb.h.a;
    label166:
    throw new zzbd(zzbb.zzb, zzba.zzap, paramzzsc.getMessage());
    label184:
    throw new zzbd(zzbb.zzb, zzba.zzb, paramzzsc.getMessage());
    label202:
    throw paramzzsc;
  }
  
  public final Object zzo(long paramLong, ub.e parame)
  {
    if ((parame instanceof zzdr))
    {
      localObject1 = (zzdr)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label52;
      }
    }
    Object localObject1 = new zzdr(this, parame);
    label52:
    Object localObject2 = zza;
    Object localObject3 = a.a;
    int i = zzc;
    Object localObject5;
    Object localObject6;
    Object localObject7;
    Object localObject8;
    Object localObject9;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject3 = zze;
        parame = zzd;
        localObject5 = localObject3;
        localObject6 = parame;
        localObject7 = localObject3;
        localObject1 = parame;
        localObject8 = localObject3;
        localObject9 = parame;
        try
        {
          f.b(localObject2);
        }
        catch (Exception parame)
        {
          localObject3 = localObject6;
          break label273;
        }
        catch (d2 parame)
        {
          localObject3 = localObject1;
          break label316;
        }
        catch (zzbd parame)
        {
          break label359;
        }
      }
      else
      {
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
    }
    else
    {
      f.b(localObject2);
      parame = zzb.zzf(22);
    }
    try
    {
      localObject6 = new com/google/android/recaptcha/internal/zzds;
      ((zzds)localObject6).<init>(this, parame, null);
      zzd = this;
      zze = parame;
      zzc = 1;
      localObject2 = a0.M(paramLong, (p)localObject6, (ub.e)localObject1);
      if (localObject2 != localObject3)
      {
        localObject3 = this;
        localObject1 = parame;
        parame = (ub.e)localObject3;
        localObject3 = localObject1;
        localObject5 = localObject3;
        localObject6 = parame;
        localObject7 = localObject3;
        localObject1 = parame;
        localObject8 = localObject3;
        localObject9 = parame;
        parame = (zzsc)localObject2;
        return parame;
      }
      return localObject3;
    }
    catch (Exception localException)
    {
      localObject3 = this;
      localObject5 = parame;
      parame = localException;
      parame = ((zzdt)localObject3).zzs(parame, new zzbd(zzbb.zzc, zzba.zzaw, parame.getMessage()));
      ((zzen)localObject5).zzb(parame);
      throw parame;
    }
    catch (d2 locald2)
    {
      localObject3 = this;
      localObject7 = parame;
      parame = locald2;
      parame = ((zzdt)localObject3).zzs(parame, new zzbd(zzbb.zzc, zzba.zzb, parame.getMessage()));
      ((zzen)localObject7).zzb(parame);
      throw parame;
    }
    catch (zzbd localzzbd)
    {
      label273:
      label316:
      localObject9 = this;
      localObject8 = parame;
      parame = localzzbd;
    }
    label359:
    Object localObject4 = parame;
    if (ec.i.a(parame.zzb(), zzbb.zzc)) {
      localObject4 = ((zzdt)localObject9).zzs(parame, parame);
    }
    ((zzen)localObject8).zzb((zzbd)localObject4);
    throw ((Throwable)localObject4);
  }
  
  public final void zzq(String paramString, zzsr paramzzsr)
  {
    paramString = zzu(paramString).zzf(29);
    try
    {
      Object localObject = paramzzsr.zzk();
      int i = y.H0(m.j((Iterable)localObject));
      int j = i;
      if (i < 16) {
        j = 16;
      }
      LinkedHashMap localLinkedHashMap = new java/util/LinkedHashMap;
      localLinkedHashMap.<init>(j);
      localObject = ((Iterable)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        zzst localzzst = (zzst)((Iterator)localObject).next();
        localLinkedHashMap.put(localzzst.zzg(), localzzst.zzi());
      }
      zzt().zzb(localLinkedHashMap);
      zzc.zzg(paramzzsr);
      paramString.zza();
      return;
    }
    catch (Exception paramzzsr)
    {
      paramString.zzb(new zzbd(zzbb.zzb, zzba.zzas, paramzzsr.getMessage()));
      return;
    }
    catch (zzbd paramzzsr)
    {
      paramString.zzb(paramzzsr);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzdt
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */