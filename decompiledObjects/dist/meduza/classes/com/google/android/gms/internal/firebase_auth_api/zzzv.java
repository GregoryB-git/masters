package com.google.android.gms.internal.firebase_auth_api;

import b8.c1;
import b8.h;
import b8.p0;
import c8.p;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzaet;
import com.google.android.gms.internal.firebase-auth-api.zzaga;
import com.google.android.gms.internal.firebase-auth-api.zzagc;
import com.google.android.gms.internal.firebase-auth-api.zzagp;
import com.google.android.gms.internal.firebase-auth-api.zzagu;
import com.google.android.gms.internal.firebase-auth-api.zzahf;
import com.google.android.gms.internal.firebase-auth-api.zzahp;
import com.google.android.gms.internal.firebase-auth-api.zzahr;
import com.google.android.gms.internal.firebase-auth-api.zzaid;
import com.google.android.gms.internal.firebase-auth-api.zzaih;
import m6.j;

public final class zzzv
{
  private final com.google.android.gms.internal.firebase-auth-api.zzaeu zza;
  
  public zzzv(com.google.android.gms.internal.firebase-auth-api.zzaeu paramzzaeu)
  {
    j.i(paramzzaeu);
    zza = paramzzaeu;
  }
  
  private final void zza(com.google.android.gms.internal.firebase-auth-api.zzafy paramzzafy, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzafy);
    j.i(paramzzadp);
    zza.zza(paramzzafy, new zzzy(this, paramzzadp));
  }
  
  private final void zza(com.google.android.gms.internal.firebase-auth-api.zzagw paramzzagw, String paramString1, String paramString2, Boolean paramBoolean, c1 paramc1, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, zzaet paramzzaet)
  {
    j.i(paramzzagw);
    j.i(paramzzaet);
    j.i(paramzzadp);
    zzagj localzzagj = new zzagj(paramzzagw.zzc());
    zza.zza(localzzagj, new zzaad(this, paramzzaet, paramString2, paramString1, paramBoolean, paramc1, paramzzadp, paramzzagw));
  }
  
  public static void zza(com.google.android.gms.internal.firebase-auth-api.zzzv paramzzzv, com.google.android.gms.internal.firebase-auth-api.zzaie paramzzaie, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp, zzaet paramzzaet)
  {
    if (paramzzaie.zzo())
    {
      c1 localc1 = paramzzaie.zzb();
      String str = paramzzaie.zzc();
      paramzzaet = paramzzaie.zzj();
      if (paramzzaie.zzm()) {
        paramzzzv = new Status(17012, null, null, null);
      } else {
        paramzzzv = p.a(paramzzaie.zzd());
      }
      paramzzadp.zza(new zzzt(paramzzzv, localc1, str, paramzzaet));
      return;
    }
    paramzzzv.zza(new zzagw(paramzzaie.zzi(), paramzzaie.zze(), Long.valueOf(paramzzaie.zza()), "Bearer"), paramzzaie.zzh(), paramzzaie.zzg(), Boolean.valueOf(paramzzaie.zzn()), paramzzaie.zzb(), paramzzadp, paramzzaet);
  }
  
  private final void zza(String paramString, zzaew<zzagw> paramzzaew)
  {
    j.i(paramzzaew);
    j.e(paramString);
    paramString = zzagw.zzb(paramString);
    if (paramString.zzg())
    {
      paramzzaew.zza(paramString);
      return;
    }
    paramString = new zzagk(paramString.zzd());
    zza.zza(paramString, new zzabo(this, paramzzaew));
  }
  
  private final void zzd(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzagn);
    j.i(paramzzadp);
    zza.zza(paramzzagn, new zzabj(this, paramzzadp));
  }
  
  public final void zza(h paramh, String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramh);
    j.i(paramzzadp);
    if (e)
    {
      zza(d, new zzzz(this, paramh, paramString, paramzzadp));
      return;
    }
    zza(new zzafy(paramh, null, paramString), paramzzadp);
  }
  
  public final void zza(zzaga paramzzaga, String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzaga);
    j.i(paramzzadp);
    zza(paramString, new zzaaw(this, paramzzaga, paramzzadp));
  }
  
  public final void zza(zzagc paramzzagc, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzagc);
    j.i(paramzzadp);
    zza.zza(paramzzagc, new zzaay(this, paramzzadp));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramzzagn.zzd());
    j.i(paramzzadp);
    zzd(paramzzagn, paramzzadp);
  }
  
  public final void zza(zzagp paramzzagp, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzagp);
    j.i(paramzzadp);
    zza.zza(paramzzagp, new zzabd(this, paramzzadp));
  }
  
  public final void zza(zzagu paramzzagu, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzagu);
    j.i(paramzzadp);
    zza.zza(paramzzagu, new zzaba(this, paramzzadp));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahd paramzzahd, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramzzahd.zzb());
    j.i(paramzzadp);
    zza.zza(paramzzahd, new zzaag(this, paramzzadp));
  }
  
  public final void zza(zzahf paramzzahf, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    zza.zza(paramzzahf, new zzabl(this, paramzzadp));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzahk paramzzahk, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramzzahk.zzd());
    j.i(paramzzadp);
    zza.zza(paramzzahk, new zzaaj(this, paramzzadp));
  }
  
  public final void zza(zzahp paramzzahp, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzahp);
    j.i(paramzzadp);
    zza.zza(paramzzahp, new zzaax(this, paramzzahp, paramzzadp));
  }
  
  public final void zza(zzahr paramzzahr, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzahr);
    j.i(paramzzadp);
    zza.zza(paramzzahr, new zzabb(this, paramzzadp));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzaic paramzzaic, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzaic);
    j.i(paramzzadp);
    paramzzaic.zzb(true);
    zza.zza(paramzzaic, new zzaau(this, paramzzadp));
  }
  
  public final void zza(zzaid paramzzaid, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzaid);
    j.i(paramzzadp);
    zza.zza(paramzzaid, new zzaah(this, paramzzadp));
  }
  
  public final void zza(zzaih paramzzaih, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzaih);
    j.i(paramzzadp);
    zza.zza(paramzzaih, new zzaai(this, paramzzadp));
  }
  
  public final void zza(String paramString, p0 paramp0, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramp0);
    j.i(paramzzadp);
    zza(paramString, new zzabk(this, paramp0, paramzzadp));
  }
  
  public final void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzadp);
    zza(paramString, new zzabe(this, paramzzadp));
  }
  
  public final void zza(String paramString, com.google.android.gms.internal.firebase-auth-api.zzaic paramzzaic, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzaic);
    j.i(paramzzadp);
    zza(paramString, new zzaap(this, paramzzaic, paramzzadp));
  }
  
  public final void zza(String paramString, zzaih paramzzaih, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzaih);
    j.i(paramzzadp);
    zza(paramString, new zzaan(this, paramzzaih, paramzzadp));
  }
  
  public final void zza(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.i(paramzzadp);
    zzahm localzzahm = new zzahm();
    localzzahm.zze(paramString1);
    localzzahm.zzh(paramString2);
    zza.zza(localzzahm, new zzabp(this, paramzzadp));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    zza(paramString1, new zzaas(this, paramString2, paramString3, paramzzadp));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, String paramString4, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    paramString1 = new zzahn(paramString1, paramString2, null, paramString3, paramString4, null);
    zza.zza(paramString1, new zzzx(this, paramzzadp));
  }
  
  public final void zza(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.e(paramString3);
    j.i(paramzzadp);
    zza(paramString3, new zzaal(this, paramString1, paramString2, paramString4, paramString5, paramzzadp));
  }
  
  public final void zzb(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramzzagn.zzc());
    j.i(paramzzadp);
    zza.zza(paramzzagn, new zzaaf(this, paramzzadp));
  }
  
  public final void zzb(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzadp);
    paramString = new zzagk(paramString);
    zza.zza(paramString, new zzzu(this, paramzzadp));
  }
  
  public final void zzb(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    zza(paramString1, new zzabn(this, paramString2, paramzzadp));
  }
  
  public final void zzb(String paramString1, String paramString2, String paramString3, String paramString4, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    paramString1 = new zzaif(paramString1, paramString2, paramString3, paramString4);
    zza.zza(paramString1, new zzzw(this, paramzzadp));
  }
  
  public final void zzc(com.google.android.gms.internal.firebase-auth-api.zzagn paramzzagn, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    zzd(paramzzagn, paramzzadp);
  }
  
  public final void zzc(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzadp);
    zza(paramString, new zzabc(this, paramzzadp));
  }
  
  public final void zzc(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    zza(paramString1, new zzabm(this, paramString2, paramzzadp));
  }
  
  public final void zzd(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzadp);
    zza.zza(paramString, new zzabg(this, paramzzadp));
  }
  
  public final void zzd(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.i(paramzzadp);
    paramString1 = new zzahd(paramString1, null, paramString2);
    zza.zza(paramString1, new zzaae(this, paramzzadp));
  }
  
  public final void zze(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.i(paramzzadp);
    paramString = new zzahn(paramString);
    zza.zza(paramString, new zzabi(this, paramzzadp));
  }
  
  public final void zze(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.i(paramzzadp);
    paramString1 = new zzaft(paramString1, paramString2);
    zza.zza(paramString1, new zzaac(this, paramzzadp));
  }
  
  public final void zzf(String paramString, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString);
    j.i(paramzzadp);
    zza(paramString, new zzaar(this, paramzzadp));
  }
  
  public final void zzf(String paramString1, String paramString2, com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    j.e(paramString1);
    j.e(paramString2);
    j.i(paramzzadp);
    zza(paramString2, new zzaaq(this, paramString1, paramzzadp));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzzv
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */