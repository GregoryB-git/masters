package com.google.android.gms.internal.firebase_auth_api;

import b8.c0;
import b8.f;
import c8.p;
import c8.t;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzadm;
import com.google.android.gms.internal.firebase-auth-api.zzaen;
import com.google.android.gms.internal.firebase-auth-api.zzafw;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzags;
import com.google.android.gms.internal.firebase-auth-api.zzagt;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import com.google.android.gms.internal.firebase-auth-api.zzahg;
import com.google.android.gms.internal.firebase-auth-api.zzahh;
import com.google.android.gms.internal.firebase-auth-api.zzahs;
import com.google.android.gms.internal.firebase-auth-api.zzzs;
import java.util.concurrent.Executor;
import m6.j;

final class zzaei
  implements zzadm
{
  public zzaei(com.google.android.gms.internal.firebase-auth-api.zzaeg paramzzaeg) {}
  
  private final void zza(Status paramStatus, f paramf, String paramString1, String paramString2)
  {
    zzaeg.zza(zza, paramStatus);
    com.google.android.gms.internal.firebase-auth-api.zzaeg localzzaeg = zza;
    zzn = paramf;
    zzo = paramString1;
    zzp = paramString2;
    paramf = zzf;
    if (paramf != null) {
      paramf.zza(paramStatus);
    }
    zza.zza(paramStatus);
  }
  
  private final void zza(zzaen paramzzaen)
  {
    zza.zzi.execute(new zzaeo(this, paramzzaen));
  }
  
  public final void zza()
  {
    int i = zza.zza;
    boolean bool;
    if (i == 5) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zzaeg.zza(zza);
  }
  
  public final void zza(c0 paramc0)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 8) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zzaeg.zza(zza, true);
    zza(new zzaej(this, paramc0));
  }
  
  public final void zza(Status paramStatus)
  {
    String str = b;
    Status localStatus = paramStatus;
    if (str != null) {
      if (str.contains("MISSING_MFA_PENDING_CREDENTIAL"))
      {
        localStatus = new Status(17081, null, null, null);
      }
      else if (str.contains("MISSING_MFA_ENROLLMENT_ID"))
      {
        localStatus = new Status(17082, null, null, null);
      }
      else if (str.contains("INVALID_MFA_PENDING_CREDENTIAL"))
      {
        localStatus = new Status(17083, null, null, null);
      }
      else if (str.contains("MFA_ENROLLMENT_NOT_FOUND"))
      {
        localStatus = new Status(17084, null, null, null);
      }
      else if (str.contains("ADMIN_ONLY_OPERATION"))
      {
        localStatus = new Status(17085, null, null, null);
      }
      else if (str.contains("UNVERIFIED_EMAIL"))
      {
        localStatus = new Status(17086, null, null, null);
      }
      else if (str.contains("SECOND_FACTOR_EXISTS"))
      {
        localStatus = new Status(17087, null, null, null);
      }
      else if (str.contains("SECOND_FACTOR_LIMIT_EXCEEDED"))
      {
        localStatus = new Status(17088, null, null, null);
      }
      else if (str.contains("UNSUPPORTED_FIRST_FACTOR"))
      {
        localStatus = new Status(17089, null, null, null);
      }
      else
      {
        localStatus = paramStatus;
        if (str.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
          localStatus = new Status(17090, null, null, null);
        }
      }
    }
    paramStatus = zza;
    if (zza == 8)
    {
      zzaeg.zza(paramStatus, true);
      zza(new zzael(this, localStatus));
      return;
    }
    zzaeg.zza(paramStatus, localStatus);
    zza.zza(localStatus);
  }
  
  public final void zza(Status paramStatus, c0 paramc0)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 2) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zza(paramStatus, paramc0, null, null);
  }
  
  public final void zza(zzafw paramzzafw)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 3) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = new StringBuilder("Unexpected response type ");
    ((StringBuilder)localObject).append(i);
    j.k(bool, ((StringBuilder)localObject).toString());
    localObject = zza;
    zzl = paramzzafw;
    zzaeg.zza((com.google.android.gms.internal.firebase-auth-api.zzaeg)localObject);
  }
  
  public final void zza(zzags paramzzags)
  {
    com.google.android.gms.internal.firebase-auth-api.zzaeg localzzaeg = zza;
    zzs = paramzzags;
    zzaeg.zza(localzzaeg);
  }
  
  public final void zza(zzagt paramzzagt)
  {
    com.google.android.gms.internal.firebase-auth-api.zzaeg localzzaeg = zza;
    zzr = paramzzagt;
    zzaeg.zza(localzzaeg);
  }
  
  public final void zza(zzagw paramzzagw)
  {
    int i = zza.zza;
    boolean bool = true;
    if (i != 1) {
      bool = false;
    }
    Object localObject = new StringBuilder("Unexpected response type: ");
    ((StringBuilder)localObject).append(i);
    j.k(bool, ((StringBuilder)localObject).toString());
    localObject = zza;
    zzj = paramzzagw;
    zzaeg.zza((com.google.android.gms.internal.firebase-auth-api.zzaeg)localObject);
  }
  
  public final void zza(zzagw paramzzagw, zzagl paramzzagl)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 2) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = new StringBuilder("Unexpected response type: ");
    ((StringBuilder)localObject).append(i);
    j.k(bool, ((StringBuilder)localObject).toString());
    localObject = zza;
    zzj = paramzzagw;
    zzk = paramzzagl;
    zzaeg.zza((com.google.android.gms.internal.firebase-auth-api.zzaeg)localObject);
  }
  
  public final void zza(zzahg paramzzahg)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 4) {
      bool = true;
    } else {
      bool = false;
    }
    Object localObject = new StringBuilder("Unexpected response type ");
    ((StringBuilder)localObject).append(i);
    j.k(bool, ((StringBuilder)localObject).toString());
    localObject = zza;
    zzm = paramzzahg;
    zzaeg.zza((com.google.android.gms.internal.firebase-auth-api.zzaeg)localObject);
  }
  
  public final void zza(zzahh paramzzahh)
  {
    zzaeg.zza(zza);
  }
  
  public final void zza(zzahs paramzzahs)
  {
    com.google.android.gms.internal.firebase-auth-api.zzaeg localzzaeg = zza;
    zzt = paramzzahs;
    zzaeg.zza(localzzaeg);
  }
  
  public final void zza(zzzs paramzzzs)
  {
    com.google.android.gms.internal.firebase-auth-api.zzaeg localzzaeg = zza;
    zzq = paramzzzs;
    localzzaeg.zza(p.a("REQUIRES_SECOND_FACTOR_AUTH"));
  }
  
  public final void zza(com.google.android.gms.internal.firebase-auth-api.zzzt paramzzzt)
  {
    zza(paramzzzt.zza(), paramzzzt.zzb(), paramzzzt.zzc(), paramzzzt.zzd());
  }
  
  public final void zza(String paramString)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 8) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zzaeg.zza(zza, true);
    zza(new zzaem(this, paramString));
  }
  
  public final void zzb()
  {
    int i = zza.zza;
    boolean bool;
    if (i == 6) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zzaeg.zza(zza);
  }
  
  public final void zzb(String paramString)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 8) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zza(new zzaek(this, paramString));
  }
  
  public final void zzc()
  {
    int i = zza.zza;
    boolean bool;
    if (i == 9) {
      bool = true;
    } else {
      bool = false;
    }
    StringBuilder localStringBuilder = new StringBuilder("Unexpected response type ");
    localStringBuilder.append(i);
    j.k(bool, localStringBuilder.toString());
    zzaeg.zza(zza);
  }
  
  public final void zzc(String paramString)
  {
    int i = zza.zza;
    boolean bool;
    if (i == 7) {
      bool = true;
    } else {
      bool = false;
    }
    paramString = new StringBuilder("Unexpected response type ");
    paramString.append(i);
    j.k(bool, paramString.toString());
    zzaeg.zza(zza);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzaei
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */