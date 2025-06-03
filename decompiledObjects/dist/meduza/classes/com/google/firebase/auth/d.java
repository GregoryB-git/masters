package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.g;
import b8.h;
import b8.r;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;

public final class d
  extends i0<g>
{
  public d(FirebaseAuth paramFirebaseAuth, r paramr, h paramh) {}
  
  public final Task<g> b(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      localObject = "Linking email account with empty reCAPTCHA token";
    } else {
      localObject = "Got reCAPTCHA token for linking email account";
    }
    Log.i("FirebaseAuth", (String)localObject);
    Object localObject = c;
    return e.zza(a, a, b, paramString, new FirebaseAuth.c((FirebaseAuth)localObject));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */