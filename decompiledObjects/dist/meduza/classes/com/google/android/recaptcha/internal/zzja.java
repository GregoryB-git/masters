package com.google.android.recaptcha.internal;

import android.app.Application;
import android.webkit.WebView;
import b.z;
import dc.p;
import ec.i;
import java.util.LinkedHashMap;
import java.util.Map;
import nc.d0;
import nc.d2;
import nc.j0;
import nc.r;
import nc.s;
import rb.c;
import rb.f;
import rb.h;
import sb.q;
import ub.e;
import vb.a;
import x6.b;

public final class zzja
  extends zze
{
  public r zza;
  public zzfo zzb;
  private final zzek zzc;
  private final Map zzd;
  private final Map zze;
  private zzsc zzf;
  private final zzcb zzg;
  private final zzjh zzh;
  private final zzij zzi;
  private final zzek zzj;
  private final c zzk;
  private final c zzl;
  private final c zzm;
  private final c zzn;
  private final c zzo;
  private zzen zzp;
  private final zzbi zzq;
  
  public zzja(zzek paramzzek, zzbi paramzzbi)
  {
    zzc = paramzzek;
    zzq = paramzzbi;
    zzd = zzjb.zza();
    zze = new LinkedHashMap();
    zzg = new zzcb(zzje.zza);
    zzh = zzjh.zzc();
    zzi = new zzij(this);
    paramzzbi = paramzzek.zza();
    paramzzbi.zzc(paramzzek.zzd());
    zzj = paramzzbi;
    int i = zzav.zza;
    zzk = z.n(zzis.zza);
    zzl = z.n(zzit.zza);
    zzm = z.n(zziu.zza);
    zzn = z.n(zziv.zza);
    zzo = z.n(zziw.zza);
  }
  
  private final Application zzD()
  {
    return (Application)zzo.getValue();
  }
  
  private final Object zzE(zzsc paramzzsc, e parame)
  {
    if ((parame instanceof zzim))
    {
      localObject1 = (zzim)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzim(this, parame);
    label50:
    Object localObject1 = zza;
    Object localObject2 = a.a;
    int i = zzc;
    if (i != 0) {
      if (i == 1)
      {
        parame = zzd;
        paramzzsc = parame;
      }
    }
    try
    {
      f.b(localObject1);
    }
    catch (zzbd parame)
    {
      try
      {
        Object localObject3 = (zzff)zzn.getValue();
        localObject1 = zzj;
        zzd = this;
        zzc = 1;
        localObject1 = ((zzff)localObject3).zzd(paramzzsc, (zzek)localObject1, parame);
        if (localObject1 == localObject2) {
          return localObject2;
        }
        parame = this;
        paramzzsc = parame;
        localObject1 = (String)localObject1;
        paramzzsc = parame;
        localObject3 = zzq.zzb();
        paramzzsc = parame;
        localObject2 = new com/google/android/recaptcha/internal/zzin;
        paramzzsc = parame;
        ((zzin)localObject2).<init>(parame, (String)localObject1, null);
        paramzzsc = parame;
        b.g0((d0)localObject3, null, (p)localObject2, 3);
      }
      catch (zzbd parame)
      {
        paramzzsc = this;
      }
      parame = parame;
      paramzzsc.zzA().h0(parame);
    }
    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    f.b(localObject1);
    return h.a;
  }
  
  private final Object zzF(String paramString, e parame)
  {
    if ((parame instanceof zzio))
    {
      localObject1 = (zzio)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzio(this, parame);
    label50:
    Object localObject2 = zza;
    Object localObject1 = a.a;
    int i = zzc;
    String str;
    if (i != 0)
    {
      if (i == 1)
      {
        str = zzf;
        localObject1 = zze;
        parame = zzd;
        paramString = parame;
        try
        {
          f.b(localObject2);
          paramString = parame;
          parame = (e)localObject2;
        }
        catch (Exception parame)
        {
          break label218;
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
      zzp = zzj.zzf(26);
    }
    try
    {
      str = ((zzbr)zzl.getValue()).zza();
      zzd = this;
      zze = paramString;
      zzf = str;
      zzc = 1;
      parame = zzw(parame);
      if (parame != localObject1)
      {
        localObject1 = paramString;
        paramString = this;
        ((WebView)parame).loadDataWithBaseURL(str, (String)localObject1, "text/html", "utf-8", null);
        break label266;
      }
      return localObject1;
    }
    catch (Exception parame)
    {
      paramString = this;
    }
    label218:
    parame = new zzbd(zzbb.zzb, zzba.zzU, parame.getMessage());
    localObject1 = zzp;
    if (localObject1 != null) {
      ((zzen)localObject1).zzb(parame);
    }
    zzp = null;
    paramString.zzA().h0(parame);
    label266:
    return h.a;
  }
  
  private final Object zzG(String paramString, e parame)
  {
    if ((parame instanceof zzix))
    {
      localObject1 = (zzix)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    Object localObject1 = new zzix(this, parame);
    label48:
    Object localObject2 = zza;
    a locala = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2)
        {
          parame = zze;
          paramString = zzd;
          f.b(localObject2);
          break label266;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
      }
      paramString = zze;
      parame = zzd;
      f.b(localObject2);
    }
    else
    {
      f.b(localObject2);
      localObject3 = zzg;
      parame = zzje.zzd;
      zzje localzzje = zzje.zzc;
      localObject2 = zzje.zzb;
      zzd = this;
      zze = paramString;
      zzc = 1;
      localObject2 = ((zzcb)localObject3).zzb(new zzje[] { parame, localzzje, localObject2 }, (e)localObject1);
      if (localObject2 == locala) {
        break label318;
      }
      parame = this;
    }
    if (((Boolean)localObject2).booleanValue()) {
      return h.a;
    }
    localObject2 = zzg;
    Object localObject3 = zzje.zzb;
    zzd = parame;
    zze = paramString;
    zzc = 2;
    if (((zzcb)localObject2).zzc(localObject3, (e)localObject1) != locala)
    {
      localObject1 = parame;
      parame = paramString;
      paramString = (String)localObject1;
      label266:
      zza = z.b();
      localObject1 = zzj;
      ((zzek)localObject1).zzc(parame);
      parame = ((zzek)localObject1).zzf(42);
      b.g0(zzq.zza(), null, new zziz(paramString, parame, null), 3);
      return h.a;
    }
    label318:
    return locala;
  }
  
  public final r zzA()
  {
    r localr = zza;
    if (localr != null) {
      return localr;
    }
    return null;
  }
  
  public final zzft zzC(zzsc paramzzsc, zzcg paramzzcg, WebView paramWebView)
  {
    zzfw localzzfw = new zzfw(paramWebView, zzq.zzb());
    paramWebView = new zzhy();
    paramWebView.zzb(q.v(paramzzsc.zzP()));
    paramzzsc = new zzgf(localzzfw, paramzzcg, new zzbo());
    paramzzcg = new zzhz(paramWebView, new zzhw());
    paramzzsc.zze(3, zzD());
    paramzzsc.zze(5, zzig.zza());
    paramzzsc.zze(6, new zzia(zzD()));
    paramzzsc.zze(7, new zzic());
    paramzzsc.zze(8, new zzii(zzD()));
    paramzzsc.zze(9, new zzid(zzD()));
    paramzzsc.zze(10, new zzib(zzD()));
    return new zzft(zzq.zzd(), paramzzsc, paramzzcg, zzfn.zza());
  }
  
  public final zzen zza(String paramString)
  {
    zzek localzzek = zzc;
    localzzek.zzc(paramString);
    return localzzek.zzf(33);
  }
  
  public final zzen zzb()
  {
    zzek localzzek = zzc;
    localzzek.zzc(localzzek.zzd());
    return localzzek.zzf(32);
  }
  
  public final Object zzd(String paramString, e parame)
  {
    parame = zzsi.zzf();
    parame.zze(paramString);
    return parame.zzi();
  }
  
  public final Object zzf(String paramString, e parame)
  {
    if ((parame instanceof zzip))
    {
      localObject1 = (zzip)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        break label48;
      }
    }
    Object localObject1 = new zzip(this, parame);
    label48:
    Object localObject2 = zza;
    Object localObject4 = a.a;
    int i = zzc;
    Object localObject5;
    Object localObject6;
    if (i != 0) {
      if (i != 1) {
        if (i != 2) {
          if (i != 3)
          {
            if (i != 4)
            {
              if (i == 5)
              {
                localObject5 = zze;
                localObject1 = zzd;
                parame = (e)localObject1;
                paramString = (String)localObject5;
                try
                {
                  f.b(localObject2);
                  localObject6 = localObject2;
                }
                catch (Exception localException1)
                {
                  break label848;
                }
              }
              throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            localObject6 = zze;
            localObject5 = zzd;
            parame = (e)localObject5;
            paramString = (String)localObject6;
          }
        }
      }
    }
    try
    {
      f.b(localException1);
      Object localObject3 = localObject6;
      break label483;
      paramString = zze;
      localObject5 = zzd;
      f.b(localObject3);
      localObject3 = paramString;
      break label416;
      parame = zze;
      paramString = zzd;
      f.b(localObject3);
      localObject6 = localObject3;
      break label361;
      parame = zze;
      paramString = zzd;
      f.b(localObject3);
      break label289;
      f.b(localObject3);
      parame = zzg;
      localObject3 = zzje.zzd;
      zzd = this;
      zze = paramString;
      zzc = 1;
      localObject3 = parame.zza(localObject3, (e)localObject1);
      if (localObject3 == localObject4) {
        break label919;
      }
      localObject5 = this;
      parame = paramString;
      paramString = (String)localObject5;
      label289:
      if (((Boolean)localObject3).booleanValue()) {
        return f.a(new zzbd(zzbb.zzb, zzba.zzav, null));
      }
      localObject5 = zzg;
      localObject3 = zzje.zzc;
      zzd = paramString;
      zze = parame;
      zzc = 2;
      localObject6 = ((zzcb)localObject5).zza(localObject3, (e)localObject1);
      if (localObject6 == localObject4) {
        break label919;
      }
      label361:
      localObject5 = paramString;
      localObject3 = parame;
      if (!((Boolean)localObject6).booleanValue())
      {
        zzd = paramString;
        zze = parame;
        zzc = 3;
        if (paramString.zzG(parame, (e)localObject1) != localObject4)
        {
          localObject5 = paramString;
          localObject3 = parame;
        }
        else
        {
          return localObject4;
        }
      }
      label416:
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localObject6 = ((zzja)localObject5).zzA();
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zzd = ((zzja)localObject5);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zze = ((String)localObject3);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zzc = 4;
      parame = (e)localObject5;
      paramString = (String)localObject3;
      if (((j0)localObject6).await((e)localObject1) == localObject4) {
        break label856;
      }
      label483:
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localObject6 = z.b();
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zze.put(localObject3, localObject6);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      Object localObject7 = zztq.zzf();
      parame = (e)localObject5;
      paramString = (String)localObject3;
      ((zztp)localObject7).zze((String)localObject3);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localObject7 = ((zztq)((zzmx)localObject7).zzi()).zzd();
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localObject7 = zzkh.zzh().zzi((byte[])localObject7, 0, localObject7.length);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      d0 locald0 = zzq.zzb();
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zziq localzziq = new com/google/android/recaptcha/internal/zziq;
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localzziq.<init>((zzja)localObject5, (String)localObject7, null);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      b.g0(locald0, null, localzziq, 3);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zzd = ((zzja)localObject5);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zze = ((String)localObject3);
      parame = (e)localObject5;
      paramString = (String)localObject3;
      zzc = 5;
      parame = (e)localObject5;
      paramString = (String)localObject3;
      localObject6 = ((s)localObject6).await((e)localObject1);
      if (localObject6 == localObject4) {
        break label856;
      }
      localObject1 = localObject5;
      localObject5 = localObject3;
      parame = (e)localObject1;
      paramString = (String)localObject5;
      localObject3 = (zzsi)localObject6;
      parame = (e)localObject1;
      paramString = (String)localObject5;
      localObject6 = zzsi.zzf();
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsh)localObject6).zze((String)localObject5);
      parame = (e)localObject1;
      paramString = (String)localObject5;
      localObject4 = zzsm.zzf();
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsl)localObject4).zze(((zzsi)localObject3).zzl());
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsh)localObject6).zzq((zzsl)localObject4);
      parame = (e)localObject1;
      paramString = (String)localObject5;
      localObject4 = zzsk.zzf();
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsj)localObject4).zze(((zzsi)localObject3).zzj());
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsj)localObject4).zzf(((zzsi)localObject3).zzM());
      parame = (e)localObject1;
      paramString = (String)localObject5;
      ((zzsh)localObject6).zzr((zzsj)localObject4);
      parame = (e)localObject1;
      paramString = (String)localObject5;
      localObject3 = ((zzmx)localObject6).zzi();
      paramString = (String)localObject3;
    }
    catch (Exception localException2)
    {
      label848:
      break label859;
    }
    break label859;
    label856:
    return localObject4;
    label859:
    zzbd localzzbd = zzf.zza(localException2, new zzbd(zzbb.zzb, zzba.zzW, localException2.getMessage()));
    paramString = (r)zze.remove(paramString);
    if (paramString != null) {
      paramString.h0(localzzbd);
    }
    paramString = f.a(localzzbd);
    return paramString;
    label919:
    return localObject4;
  }
  
  public final Object zzg(zzbd paramzzbd, e parame)
  {
    if (i.a(paramzzbd.zza(), zzba.zzb))
    {
      parame = zzp;
      if (parame != null) {
        parame.zzb(paramzzbd);
      }
      zzp = null;
    }
    return h.a;
  }
  
  public final Object zzh(zzsc paramzzsc, e parame)
  {
    if ((parame instanceof zzir))
    {
      localObject1 = (zzir)parame;
      i = zzc;
      if ((i & 0x80000000) != 0)
      {
        zzc = (i + Integer.MIN_VALUE);
        parame = (e)localObject1;
        break label50;
      }
    }
    parame = new zzir(this, parame);
    label50:
    Object localObject2 = zza;
    Object localObject1 = a.a;
    int i = zzc;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i == 2) {
          f.b(localObject2);
        } else {
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
      }
      else
      {
        f.b(localObject2);
        break label198;
      }
    }
    else
    {
      f.b(localObject2);
      if ((!paramzzsc.zzT()) || (!paramzzsc.zzR()) || (!paramzzsc.zzQ())) {
        break label170;
      }
      zzf = paramzzsc;
      paramzzsc = zzc.zzd();
      zzc = 2;
      if (zzG(paramzzsc, parame) == localObject1) {
        break label196;
      }
    }
    return h.a;
    label170:
    paramzzsc = zzg;
    localObject2 = zzje.zzd;
    zzc = 1;
    if (paramzzsc.zzc(localObject2, parame) == localObject1) {
      label196:
      return localObject1;
    }
    label198:
    return f.a(new zzbd(zzbb.zzb, zzba.zzav, null));
  }
  
  public final Object zzi(String paramString, long paramLong, Exception paramException, e parame)
  {
    paramException.getMessage();
    paramString = (r)zze.remove(paramString);
    if (paramString != null) {
      paramString.h0(paramException);
    }
    return h.a;
  }
  
  public final Object zzj(Exception paramException, e parame)
  {
    parame = zzi.zza();
    if (((paramException instanceof d2)) && (parame == null)) {
      paramException = new zzbd(zzbb.zzc, zzba.zzH, null);
    } else {
      paramException = zzf.zza(paramException, new zzbd(zzbb.zzb, zzba.zzV, paramException.getMessage()));
    }
    return paramException;
  }
  
  public final zzcb zzm()
  {
    return zzg;
  }
  
  public final zzij zzq()
  {
    return zzi;
  }
  
  public final Object zzw(e parame)
  {
    zzjd localzzjd = (zzjd)zzk.getValue();
    Application localApplication = zzD();
    return b.z0(parame, zzq.zzb().f(), new zzjc(localzzjd, localApplication, null));
  }
  
  public final Object zzx(e parame)
  {
    parame = b.z0(parame, zzq.zzb().f(), new zzil(this, null));
    if (parame == a.a) {
      return parame;
    }
    return h.a;
  }
}

/* Location:
 * Qualified Name:     com.google.android.recaptcha.internal.zzja
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */