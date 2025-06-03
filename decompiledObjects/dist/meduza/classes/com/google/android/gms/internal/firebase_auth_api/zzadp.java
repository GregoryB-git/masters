package com.google.android.gms.internal.firebase_auth_api;

import android.os.RemoteException;
import b8.c0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzafw;
import com.google.android.gms.internal.firebase-auth-api.zzagl;
import com.google.android.gms.internal.firebase-auth-api.zzags;
import com.google.android.gms.internal.firebase-auth-api.zzagt;
import com.google.android.gms.internal.firebase-auth-api.zzagw;
import com.google.android.gms.internal.firebase-auth-api.zzahg;
import com.google.android.gms.internal.firebase-auth-api.zzahh;
import com.google.android.gms.internal.firebase-auth-api.zzahs;
import com.google.android.gms.internal.firebase-auth-api.zzzs;
import com.google.android.gms.internal.firebase-auth-api.zzzt;
import m6.j;
import p6.a;

public class zzadp
{
  private final com.google.android.gms.internal.firebase-auth-api.zzadm zza;
  private final a zzb;
  
  public zzadp(com.google.android.gms.internal.firebase-auth-api.zzadm paramzzadm, a parama)
  {
    j.i(paramzzadm);
    zza = paramzzadm;
    j.i(parama);
    zzb = parama;
  }
  
  public zzadp(com.google.android.gms.internal.firebase-auth-api.zzadp paramzzadp)
  {
    this(zza, zzb);
  }
  
  public final void zza()
  {
    try
    {
      zza.zza();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.b("RemoteException when sending delete account response.", localRemoteException, new Object[0]);
    }
  }
  
  public final void zza(c0 paramc0)
  {
    try
    {
      zza.zza(paramc0);
      return;
    }
    catch (RemoteException paramc0)
    {
      zzb.b("RemoteException when sending verification completed response.", paramc0, new Object[0]);
    }
  }
  
  public void zza(Status paramStatus)
  {
    try
    {
      zza.zza(paramStatus);
      return;
    }
    catch (RemoteException paramStatus)
    {
      zzb.b("RemoteException when sending failure result.", paramStatus, new Object[0]);
    }
  }
  
  public final void zza(Status paramStatus, c0 paramc0)
  {
    try
    {
      zza.zza(paramStatus, paramc0);
      return;
    }
    catch (RemoteException paramStatus)
    {
      zzb.b("RemoteException when sending failure result.", paramStatus, new Object[0]);
    }
  }
  
  public final void zza(zzafw paramzzafw)
  {
    try
    {
      zza.zza(paramzzafw);
      return;
    }
    catch (RemoteException paramzzafw)
    {
      zzb.b("RemoteException when sending create auth uri response.", paramzzafw, new Object[0]);
    }
  }
  
  public final void zza(zzags paramzzags)
  {
    try
    {
      zza.zza(paramzzags);
      return;
    }
    catch (RemoteException paramzzags)
    {
      zzb.b("RemoteException when sending Play Integrity Producer project response.", paramzzags, new Object[0]);
    }
  }
  
  public final void zza(zzagt paramzzagt)
  {
    try
    {
      zza.zza(paramzzagt);
      return;
    }
    catch (RemoteException paramzzagt)
    {
      zzb.b("RemoteException when sending get recaptcha config response.", paramzzagt, new Object[0]);
    }
  }
  
  public final void zza(zzagw paramzzagw)
  {
    try
    {
      zza.zza(paramzzagw);
      return;
    }
    catch (RemoteException paramzzagw)
    {
      zzb.b("RemoteException when sending token result.", paramzzagw, new Object[0]);
    }
  }
  
  public final void zza(zzagw paramzzagw, zzagl paramzzagl)
  {
    try
    {
      zza.zza(paramzzagw, paramzzagl);
      return;
    }
    catch (RemoteException paramzzagw)
    {
      zzb.b("RemoteException when sending get token and account info user response", paramzzagw, new Object[0]);
    }
  }
  
  public final void zza(zzahg paramzzahg)
  {
    try
    {
      zza.zza(paramzzahg);
      return;
    }
    catch (RemoteException paramzzahg)
    {
      zzb.b("RemoteException when sending password reset response.", paramzzahg, new Object[0]);
    }
  }
  
  public final void zza(zzahh paramzzahh)
  {
    try
    {
      zza.zza(paramzzahh);
      return;
    }
    catch (RemoteException paramzzahh)
    {
      zzb.b("RemoteException when sending revoke token response.", paramzzahh, new Object[0]);
    }
  }
  
  public final void zza(zzahs paramzzahs)
  {
    try
    {
      zza.zza(paramzzahs);
      return;
    }
    catch (RemoteException paramzzahs)
    {
      zzb.b("RemoteException when sending start mfa enrollment response.", paramzzahs, new Object[0]);
    }
  }
  
  public final void zza(zzzs paramzzzs)
  {
    try
    {
      zza.zza(paramzzzs);
      return;
    }
    catch (RemoteException paramzzzs)
    {
      zzb.b("RemoteException when sending failure result for mfa", paramzzzs, new Object[0]);
    }
  }
  
  public final void zza(zzzt paramzzzt)
  {
    try
    {
      zza.zza(paramzzzt);
      return;
    }
    catch (RemoteException paramzzzt)
    {
      zzb.b("RemoteException when sending failure result with credential", paramzzzt, new Object[0]);
    }
  }
  
  public final void zza(String paramString)
  {
    try
    {
      zza.zza(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb.b("RemoteException when sending auto retrieval timeout response.", paramString, new Object[0]);
    }
  }
  
  public final void zzb()
  {
    try
    {
      zza.zzb();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.b("RemoteException when sending email verification response.", localRemoteException, new Object[0]);
    }
  }
  
  public void zzb(String paramString)
  {
    try
    {
      zza.zzb(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb.b("RemoteException when sending send verification code response.", paramString, new Object[0]);
    }
  }
  
  public final void zzc()
  {
    try
    {
      zza.zzc();
      return;
    }
    catch (RemoteException localRemoteException)
    {
      zzb.b("RemoteException when setting FirebaseUI Version", localRemoteException, new Object[0]);
    }
  }
  
  public final void zzc(String paramString)
  {
    try
    {
      zza.zzc(paramString);
      return;
    }
    catch (RemoteException paramString)
    {
      zzb.b("RemoteException when sending set account info response.", paramString, new Object[0]);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzadp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */