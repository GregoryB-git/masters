package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.g;
import b8.h;
import b8.r;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import m6.j;
import u7.f;

public final class a
  extends i0<g>
{
  public a(FirebaseAuth paramFirebaseAuth, boolean paramBoolean, r paramr, h paramh) {}
  
  public final Task<g> b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      localObject1 = "Email link login/reauth with empty reCAPTCHA token";
    } else {
      localObject1 = "Got reCAPTCHA token for login/reauth with email link";
    }
    Log.i("FirebaseAuth", (String)localObject1);
    if (a)
    {
      Object localObject2 = d;
      localObject1 = e;
      localObject2 = a;
      r localr = b;
      j.i(localr);
      return ((zzabq)localObject1).zzb((f)localObject2, localr, c, paramString, new FirebaseAuth.c(d));
    }
    Object localObject1 = d;
    return e.zza(a, c, paramString, new FirebaseAuth.d((FirebaseAuth)localObject1));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */