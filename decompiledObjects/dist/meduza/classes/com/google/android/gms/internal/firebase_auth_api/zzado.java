package com.google.android.gms.internal.firebase_auth_api;

import android.content.Context;
import b8.c0;
import b8.g0;
import b8.h0;
import b8.k0;
import b8.m0;
import b8.p0;
import b8.w;
import com.google.android.gms.internal.firebase-auth-api.zzadm;
import com.google.android.gms.internal.firebase-auth-api.zzagp;
import com.google.android.gms.internal.firebase-auth-api.zzagu;
import com.google.android.gms.internal.firebase-auth-api.zzahf;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.android.gms.internal.firebase-auth-api.zzaic;
import com.google.android.gms.internal.firebase-auth-api.zzaid;
import java.util.concurrent.ScheduledExecutorService;
import m6.j;
import p6.a;
import u7.f;

public final class zzado
{
  private static final a zza = new a("FirebaseAuth", new String[] { "FirebaseAuthFallback:" });
  private final com.google.android.gms.internal.firebase-auth-api.zzzv zzb;
  private final com.google.android.gms.internal.firebase-auth-api.zzafd zzc;
  
  public zzado(f paramf, ScheduledExecutorService paramScheduledExecutorService)
  {
    j.i(paramf);
    paramf.a();
    Context localContext = a;
    j.i(localContext);
    zzb = new zzzv(new zzaec(paramf, zzaed.zza()));
    zzc = new zzafd(localContext, paramScheduledExecutorService);
  }
  
  private static boolean zza(long paramLong, boolean paramBoolean)
  {
    if ((paramLong > 0L) && (paramBoolean)) {
      return true;
    }
    zza.f("App hash will not be appended to the request.", new Object[0]);
    return false;
  }
  
  public final void zza(w paramw, String paramString1, String paramString2, String paramString3, zzadm paramzzadm)
  {
    j.i(paramw);
    j.f("cachedTokenState should not be empty.", paramString1);
    j.i(paramzzadm);
    Object localObject;
    if ((paramw instanceof g0))
    {
      localObject = a;
      paramw = a;
      j.i(paramw);
      localObject = b;
      j.i(localObject);
      paramw = zzage.zza(paramString1, paramw, (String)localObject, paramString2, paramString3);
    }
    else
    {
      if (!(paramw instanceof k0)) {
        break label150;
      }
      paramw = (k0)paramw;
      localObject = b;
      j.i(localObject);
      j.e(paramString2);
      localObject = ((m0)localObject).j();
      j.e((String)localObject);
      paramw = a;
      j.e(paramw);
      paramw = zzagg.zza(paramString1, paramString2, (String)localObject, paramw, paramString3);
    }
    zzb.zza(paramw, paramString1, new zzadp(paramzzadm, zza));
    return;
    label150:
    throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzafy paramzzafy, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    j.i(paramzzafy.zzb());
    zzb.zza(paramzzafy.zzb(), paramzzafy.zzc(), new zzadp(paramzzadm, zza));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, zzadm paramzzadm)
  {
    j.i(paramzzagn);
    j.e(paramzzagn.zzd());
    j.i(paramzzadm);
    zzb.zza(paramzzagn, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(zzagp paramzzagp, zzadm paramzzadm)
  {
    j.i(paramzzagp);
    zzb.zza(paramzzagp, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(zzagu paramzzagu, zzadm paramzzadm)
  {
    j.i(paramzzagu);
    zzb.zza(paramzzagu, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaha paramzzaha, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    j.i(paramzzaha);
    String str = paramzzaha.zzb();
    j.e(str);
    zzb.zza(str, paramzzaha.zza(), new zzadp(paramzzadm, zza));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahd paramzzahd, zzadm paramzzadm)
  {
    j.i(paramzzahd);
    j.e(paramzzahd.zzb());
    j.i(paramzzadm);
    zzb.zza(paramzzahd, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(zzahf paramzzahf, zzadm paramzzadm)
  {
    j.i(paramzzahf);
    zzb.zza(paramzzahf, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahk paramzzahk, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    j.i(paramzzahk);
    String str = paramzzahk.zzd();
    paramzzadm = new zzadp(paramzzadm, zza);
    if (zzc.zzc(str)) {
      if (paramzzahk.zze())
      {
        zzc.zzb(str);
      }
      else
      {
        zzc.zzb(paramzzadm, str);
        return;
      }
    }
    long l = paramzzahk.zzb();
    boolean bool = paramzzahk.zzf();
    if (zza(l, bool)) {
      paramzzahk.zza(new zzafn(zzc.zzb()));
    }
    zzc.zza(str, paramzzadm, l, bool);
    zzb.zza(paramzzahk, zzc.zza(paramzzadm, str));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaho paramzzaho, zzadm paramzzadm)
  {
    j.i(paramzzaho);
    j.i(paramzzadm);
    zzb.zzd(paramzzaho.zza(), new zzadp(paramzzadm, zza));
  }
  
  public final void zza(zzahv paramzzahv, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    paramzzadm = new zzadp(paramzzadm, zza);
    zzb.zza(paramzzahv, paramzzadm);
  }
  
  public final void zza(zzaic paramzzaic, zzadm paramzzadm)
  {
    j.i(paramzzaic);
    j.i(paramzzadm);
    zzb.zza(paramzzaic, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(zzaid paramzzaid, zzadm paramzzadm)
  {
    j.i(paramzzaid);
    j.i(paramzzadm);
    zzb.zza(paramzzaid, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzzq paramzzzq, zzadm paramzzadm)
  {
    j.i(paramzzzq);
    j.i(paramzzadm);
    String str = zzbd;
    paramzzadm = new zzadp(paramzzadm, zza);
    if (zzc.zzc(str)) {
      if (paramzzzq.zzh())
      {
        zzc.zzb(str);
      }
      else
      {
        zzc.zzb(paramzzadm, str);
        return;
      }
    }
    long l = paramzzzq.zza();
    boolean bool = paramzzzq.zzi();
    paramzzzq = zzahr.zza(paramzzzq.zze(), zzba, zzbd, paramzzzq.zzd(), paramzzzq.zzg(), paramzzzq.zzf(), paramzzzq.zzc());
    if (zza(l, bool)) {
      paramzzzq.zza(new zzafn(zzc.zzb()));
    }
    zzc.zza(str, paramzzadm, l, bool);
    zzb.zza(paramzzzq, zzc.zza(paramzzadm, str));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzzr paramzzzr, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    j.i(paramzzzr);
    paramzzzr = paramzzzr.zza();
    j.i(paramzzzr);
    zzb.zza(zzaex.zza(paramzzzr), new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString, p0 paramp0, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramp0);
    j.i(paramzzadm);
    zzb.zza(paramString, paramp0, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString1, w paramw, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.i(paramw);
    j.i(paramzzadm);
    Object localObject1;
    Object localObject2;
    if ((paramw instanceof g0))
    {
      localObject1 = a;
      paramw = zzb;
      localObject2 = a;
      j.i(localObject2);
      localObject1 = b;
      j.i(localObject1);
      paramString1 = zzagd.zza(paramString1, (String)localObject2, (String)localObject1, paramString2);
      paramzzadm = new zzadp(paramzzadm, zza);
      paramString2 = paramw;
      paramw = paramzzadm;
    }
    else
    {
      if (!(paramw instanceof k0)) {
        break label163;
      }
      localObject1 = (k0)paramw;
      localObject2 = zzb;
      paramw = a;
      j.e(paramw);
      localObject1 = c;
      j.e((String)localObject1);
      paramString1 = zzagf.zza(paramString1, paramw, paramString2, (String)localObject1);
      paramw = new zzadp(paramzzadm, zza);
      paramString2 = (String)localObject2;
    }
    paramString2.zza(paramString1, paramw);
    return;
    label163:
    throw new IllegalArgumentException("multiFactorAssertion must be either PhoneMultiFactorAssertion or TotpMultiFactorAssertion.");
  }
  
  public final void zza(String paramString, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramzzadm);
    zzb.zza(paramString, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString, zzaic paramzzaic, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramzzaic);
    j.i(paramzzadm);
    zzb.zza(paramString, paramzzaic, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.i(paramzzadm);
    zzb.zza(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, long paramLong, boolean paramBoolean1, boolean paramBoolean2, String paramString4, String paramString5, String paramString6, boolean paramBoolean3, zzadm paramzzadm)
  {
    j.f("idToken should not be empty.", paramString1);
    j.i(paramzzadm);
    paramzzadm = new zzadp(paramzzadm, zza);
    if (zzc.zzc(paramString2))
    {
      com.google.android.gms.internal.firebase-auth-api.zzafd localzzafd = zzc;
      if (paramBoolean1)
      {
        localzzafd.zzb(paramString2);
      }
      else
      {
        localzzafd.zzb(paramzzadm, paramString2);
        return;
      }
    }
    paramString1 = zzaht.zza(paramString1, paramString2, paramString3, paramString4, paramString5, paramString6, null);
    if (zza(paramLong, paramBoolean3)) {
      paramString1.zza(new zzafn(zzc.zzb()));
    }
    zzc.zza(paramString2, paramzzadm, paramLong, paramBoolean3);
    zzb.zza(paramString1, zzc.zza(paramzzadm, paramString2));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, zzadm paramzzadm)
  {
    j.f("cachedTokenState should not be empty.", paramString1);
    j.f("uid should not be empty.", paramString2);
    j.i(paramzzadm);
    zzb.zza(paramString1, paramString2, paramString3, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, String paramString4, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadm);
    zzb.zza(paramString1, paramString2, paramString3, paramString4, new zzadp(paramzzadm, zza));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.e(paramString3);
    j.i(paramzzadm);
    zzb.zza(paramString1, paramString2, paramString3, paramString4, paramString5, new zzadp(paramzzadm, zza));
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, zzadm paramzzadm)
  {
    j.i(paramzzagn);
    j.e(paramzzagn.zzc());
    j.i(paramzzadm);
    zzb.zzb(paramzzagn, new zzadp(paramzzadm, zza));
  }
  
  public final void zzb(String paramString, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramzzadm);
    zzb.zzb(paramString, new zzadp(paramzzadm, zza));
  }
  
  public final void zzb(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadm);
    zzb.zzb(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
  
  public final void zzb(String paramString1, String paramString2, String paramString3, String paramString4, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadm);
    zzb.zzb(paramString1, paramString2, paramString3, paramString4, new zzadp(paramzzadm, zza));
  }
  
  public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, zzadm paramzzadm)
  {
    j.i(paramzzagn);
    zzb.zzc(paramzzagn, new zzadp(paramzzadm, zza));
  }
  
  public final void zzc(String paramString, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramzzadm);
    zzb.zzc(paramString, new zzadp(paramzzadm, zza));
  }
  
  public final void zzc(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadm);
    zzb.zzc(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
  
  public final void zzd(String paramString, zzadm paramzzadm)
  {
    j.i(paramzzadm);
    zzb.zze(paramString, new zzadp(paramzzadm, zza));
  }
  
  public final void zzd(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.i(paramzzadm);
    zzb.zzd(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
  
  public final void zze(String paramString, zzadm paramzzadm)
  {
    j.e(paramString);
    j.i(paramzzadm);
    zzb.zzf(paramString, new zzadp(paramzzadm, zza));
  }
  
  public final void zze(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    zzb.zze(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
  
  public final void zzf(String paramString1, String paramString2, zzadm paramzzadm)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadm);
    zzb.zzf(paramString1, paramString2, new zzadp(paramzzadm, zza));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzado
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */