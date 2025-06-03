package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.g;
import b8.r;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;
import m6.j;
import u7.f;

public final class b
  extends i0<g>
{
  public b(FirebaseAuth paramFirebaseAuth, String paramString1, boolean paramBoolean, r paramr, String paramString2, String paramString3) {}
  
  public final Task<g> b(String paramString)
  {
    Object localObject2;
    if (TextUtils.isEmpty(paramString))
    {
      localObject1 = a;
      localObject2 = new StringBuilder("Logging in as ");
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = " with empty reCAPTCHA token";
    }
    else
    {
      localObject1 = a;
      localObject2 = new StringBuilder("Got reCAPTCHA token for login with email ");
    }
    ((StringBuilder)localObject2).append((String)localObject1);
    Log.i("FirebaseAuth", ((StringBuilder)localObject2).toString());
    if (b)
    {
      localObject2 = f;
      localObject1 = e;
      localObject2 = a;
      r localr = c;
      j.i(localr);
      return ((zzabq)localObject1).zzb((f)localObject2, localr, a, d, e, paramString, new FirebaseAuth.c(f));
    }
    Object localObject1 = f;
    return e.zzb(a, a, d, e, paramString, new FirebaseAuth.d((FirebaseAuth)localObject1));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */