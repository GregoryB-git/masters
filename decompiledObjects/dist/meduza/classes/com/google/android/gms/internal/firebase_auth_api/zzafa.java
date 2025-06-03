package com.google.android.gms.internal.firebase_auth_api;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.internal.RecaptchaActivity;
import u7.f;
import u7.j;

public final class zzafa
{
  private final FirebaseAuth zza;
  private final Activity zzb;
  
  public zzafa(FirebaseAuth paramFirebaseAuth, Activity paramActivity)
  {
    zza = paramFirebaseAuth;
    zzb = paramActivity;
  }
  
  public final void zza()
  {
    Intent localIntent1 = new Intent("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
    localIntent1.setClass(zzb, RecaptchaActivity.class);
    localIntent1.setPackage(zzb.getPackageName());
    ??? = zza.a;
    ((f)???).a();
    localIntent1.putExtra("com.google.firebase.auth.KEY_API_KEY", c.a);
    Object localObject3 = zza;
    synchronized (j)
    {
      localObject3 = k;
      if (!TextUtils.isEmpty((CharSequence)localObject3))
      {
        localObject3 = zza;
        synchronized (j)
        {
          localObject3 = k;
          localIntent1.putExtra("com.google.firebase.auth.KEY_TENANT_ID", (String)localObject3);
        }
      }
      localIntent2.putExtra("com.google.firebase.auth.internal.CLIENT_VERSION", zzaed.zza().zzb());
      ??? = zza.a;
      ((f)???).a();
      localIntent2.putExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME", b);
      localIntent2.putExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN", zza.B);
      zzb.startActivity(localIntent2);
      return;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.firebase_auth_api.zzafa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */