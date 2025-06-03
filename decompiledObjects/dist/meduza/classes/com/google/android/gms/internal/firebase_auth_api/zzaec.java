package com.google.android.gms.internal.firebase_auth_api;

import android.text.TextUtils;
import android.util.Log;
import b8.c;
import com.google.android.gms.internal.firebase-auth-api.zzafo;
import g;
import u7.f;

final class zzaec
  extends zzaeu
  implements zzafo
{
  private com.google.android.gms.internal.firebase-auth-api.zzadw zza;
  private com.google.android.gms.internal.firebase-auth-api.zzadz zzb;
  private com.google.android.gms.internal.firebase-auth-api.zzaez zzc;
  private final com.google.android.gms.internal.firebase-auth-api.zzaed zzd;
  private final f zze;
  private String zzf;
  private com.google.android.gms.internal.firebase-auth-api.zzaef zzg;
  
  public zzaec(f paramf, com.google.android.gms.internal.firebase-auth-api.zzaed paramzzaed)
  {
    this(paramf, paramzzaed, null, null, null);
  }
  
  private zzaec(f paramf, com.google.android.gms.internal.firebase-auth-api.zzaed paramzzaed, com.google.android.gms.internal.firebase-auth-api.zzaez paramzzaez, com.google.android.gms.internal.firebase-auth-api.zzadw paramzzadw, com.google.android.gms.internal.firebase-auth-api.zzadz paramzzadz)
  {
    zze = paramf;
    paramf.a();
    zzf = c.a;
    m6.j.i(paramzzaed);
    zzd = paramzzaed;
    zza(null, null, null);
    zzafm.zza(zzf, this);
  }
  
  private final void zza(com.google.android.gms.internal.firebase-auth-api.zzaez paramzzaez, com.google.android.gms.internal.firebase-auth-api.zzadw paramzzadw, com.google.android.gms.internal.firebase-auth-api.zzadz paramzzadz)
  {
    zzc = null;
    zza = null;
    zzb = null;
    paramzzaez = zzafj.zza("firebear.secureToken");
    if (TextUtils.isEmpty(paramzzaez))
    {
      paramzzaez = zzafm.zzd(zzf);
    }
    else
    {
      paramzzadw = new StringBuilder("Found hermetic configuration for secureToken URL: ");
      paramzzadw.append(paramzzaez);
      Log.e("LocalClient", paramzzadw.toString());
    }
    if (zzc == null) {
      zzc = new zzaez(paramzzaez, zzb());
    }
    paramzzaez = zzafj.zza("firebear.identityToolkit");
    if (TextUtils.isEmpty(paramzzaez))
    {
      paramzzaez = zzafm.zzb(zzf);
    }
    else
    {
      paramzzadw = new StringBuilder("Found hermetic configuration for identityToolkit URL: ");
      paramzzadw.append(paramzzaez);
      Log.e("LocalClient", paramzzadw.toString());
    }
    if (zza == null) {
      zza = new zzadw(paramzzaez, zzb());
    }
    paramzzaez = zzafj.zza("firebear.identityToolkitV2");
    if (TextUtils.isEmpty(paramzzaez))
    {
      paramzzaez = zzafm.zzc(zzf);
    }
    else
    {
      paramzzadw = new StringBuilder("Found hermetic configuration for identityToolkitV2 URL: ");
      paramzzadw.append(paramzzaez);
      Log.e("LocalClient", paramzzadw.toString());
    }
    if (zzb == null) {
      zzb = new zzadz(paramzzaez, zzb());
    }
  }
  
  private final com.google.android.gms.internal.firebase-auth-api.zzaef zzb()
  {
    if (zzg == null) {
      zzg = new zzaef(zze, zzd.zzb());
    }
    return zzg;
  }
  
  public final void zza()
  {
    zza(null, null, null);
  }
  
  public final void zza(zzaft paramzzaft, zzaew<zzafw> paramzzaew)
  {
    m6.j.i(paramzzaft);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/createAuthUri", zzf), paramzzaft, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzafw.class, zza);
  }
  
  public final void zza(zzafv paramzzafv, zzaew<Void> paramzzaew)
  {
    m6.j.i(paramzzafv);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/deleteAccount", zzf), paramzzafv, paramzzaew, Void.class, zza);
  }
  
  public final void zza(zzafy paramzzafy, zzaew<zzafx> paramzzaew)
  {
    m6.j.i(paramzzafy);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/emailLinkSignin", zzf), paramzzafy, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzafx.class, zza);
  }
  
  public final void zza(zzaga paramzzaga, zzaew<zzafz> paramzzaew)
  {
    m6.j.i(paramzzaga);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    zzadz.zza(localzzadz.zza("/accounts/mfaEnrollment:finalize", zzf), paramzzaga, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzafz.class, zza);
  }
  
  public final void zza(zzagc paramzzagc, zzaew<zzagb> paramzzaew)
  {
    m6.j.i(paramzzagc);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    zzadz.zza(localzzadz.zza("/accounts/mfaSignIn:finalize", zzf), paramzzagc, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzagb.class, zza);
  }
  
  public final void zza(zzagj paramzzagj, zzaew<zzagm> paramzzaew)
  {
    m6.j.i(paramzzagj);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/getAccountInfo", zzf), paramzzagj, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzagm.class, zza);
  }
  
  public final void zza(zzagk paramzzagk, zzaew<zzagw> paramzzaew)
  {
    m6.j.i(paramzzagk);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzaez localzzaez = zzc;
    zzaev.zza(localzzaez.zza("/token", zzf), paramzzagk, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzagw.class, zza);
  }
  
  public final void zza(zzagn paramzzagn, zzaew<zzagq> paramzzaew)
  {
    m6.j.i(paramzzagn);
    m6.j.i(paramzzaew);
    if (paramzzagn.zzb() != null) {
      zzb().zzb(zzbp);
    }
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/getOobConfirmationCode", zzf), paramzzagn, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzagq.class, zza);
  }
  
  public final void zza(zzagp paramzzagp, zzaew<zzags> paramzzaew)
  {
    m6.j.i(paramzzagp);
    m6.j.i(paramzzaew);
    paramzzagp = zza;
    zzaev.zza(paramzzagp.zza("/getRecaptchaParam", zzf), paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzags.class, zza);
  }
  
  public final void zza(zzagu paramzzagu, zzaew<zzagt> paramzzaew)
  {
    m6.j.i(paramzzagu);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    String str1 = localzzadz.zza("/recaptchaConfig", zzf);
    Object localObject1 = paramzzagu.zzb();
    String str2 = paramzzagu.zzc();
    Object localObject2 = new StringBuilder();
    ((StringBuilder)localObject2).append(str1);
    ((StringBuilder)localObject2).append("&clientType=");
    ((StringBuilder)localObject2).append((String)localObject1);
    ((StringBuilder)localObject2).append("&version=");
    ((StringBuilder)localObject2).append(str2);
    localObject2 = ((StringBuilder)localObject2).toString();
    localObject1 = localObject2;
    if (!zzae.zzc(paramzzagu.zzd())) {
      localObject1 = g.e((String)localObject2, "&tenantId=", paramzzagu.zzd());
    }
    zzaev.zza((String)localObject1, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzagt.class, zza);
  }
  
  public final void zza(zzahd paramzzahd, zzaew<zzahg> paramzzaew)
  {
    m6.j.i(paramzzahd);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/resetPassword", zzf), paramzzahd, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahg.class, zza);
  }
  
  public final void zza(zzahf paramzzahf, zzaew<zzahh> paramzzaew)
  {
    m6.j.i(paramzzahf);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    zzadz.zza(localzzadz.zza("/accounts:revokeToken", zzf), paramzzahf, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahh.class, zza);
  }
  
  public final void zza(zzahk paramzzahk, zzaew<zzahj> paramzzaew)
  {
    m6.j.i(paramzzahk);
    m6.j.i(paramzzaew);
    if (!TextUtils.isEmpty(paramzzahk.zzc())) {
      zzb().zzb(paramzzahk.zzc());
    }
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/sendVerificationCode", zzf), paramzzahk, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahj.class, zza);
  }
  
  public final void zza(zzahm paramzzahm, zzaew<zzahl> paramzzaew)
  {
    m6.j.i(paramzzahm);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/setAccountInfo", zzf), paramzzahm, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahl.class, zza);
  }
  
  public final void zza(zzahn paramzzahn, zzaew<zzahq> paramzzaew)
  {
    m6.j.i(paramzzahn);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/signupNewUser", zzf), paramzzahn, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahq.class, zza);
  }
  
  public final void zza(zzahp paramzzahp, zzaew<zzahs> paramzzaew)
  {
    m6.j.i(paramzzahp);
    m6.j.i(paramzzaew);
    if ((paramzzahp instanceof zzaht))
    {
      localObject = (zzaht)paramzzahp;
      if (!TextUtils.isEmpty(((zzaht)localObject).zzb())) {
        zzb().zzb(((zzaht)localObject).zzb());
      }
    }
    Object localObject = zzb;
    zzadz.zza(((zzadx)localObject).zza("/accounts/mfaEnrollment:start", zzf), paramzzahp, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahs.class, zza);
  }
  
  public final void zza(zzahr paramzzahr, zzaew<zzahu> paramzzaew)
  {
    m6.j.i(paramzzahr);
    m6.j.i(paramzzaew);
    if (!TextUtils.isEmpty(paramzzahr.zzb())) {
      zzb().zzb(paramzzahr.zzb());
    }
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    zzadz.zza(localzzadz.zza("/accounts/mfaSignIn:start", zzf), paramzzahr, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzahu.class, zza);
  }
  
  public final void zza(zzaic paramzzaic, zzaew<zzaie> paramzzaew)
  {
    m6.j.i(paramzzaic);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/verifyAssertion", zzf), paramzzaic, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzaie.class, zza);
  }
  
  public final void zza(zzaid paramzzaid, zzaew<zzaig> paramzzaew)
  {
    m6.j.i(paramzzaid);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/verifyCustomToken", zzf), paramzzaid, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzaig.class, zza);
  }
  
  public final void zza(zzaif paramzzaif, zzaew<zzaii> paramzzaew)
  {
    m6.j.i(paramzzaif);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/verifyPassword", zzf), paramzzaif, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzaii.class, zza);
  }
  
  public final void zza(zzaih paramzzaih, zzaew<zzaik> paramzzaew)
  {
    m6.j.i(paramzzaih);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadw localzzadw = zza;
    zzaev.zza(localzzadw.zza("/verifyPhoneNumber", zzf), paramzzaih, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzaik.class, zza);
  }
  
  public final void zza(zzaij paramzzaij, zzaew<zzaim> paramzzaew)
  {
    m6.j.i(paramzzaij);
    m6.j.i(paramzzaew);
    com.google.android.gms.internal.firebase-auth-api.zzadz localzzadz = zzb;
    zzadz.zza(localzzadz.zza("/accounts/mfaEnrollment:withdraw", zzf), paramzzaij, paramzzaew, com.google.android.gms.internal.firebase-auth-api.zzaim.class, zza);
  }
  
  public final void zza(String paramString, zzaew<Void> paramzzaew)
  {
    m6.j.i(paramzzaew);
    zzb().zza(paramString);
    paramzzaew.zza(null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaec
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */