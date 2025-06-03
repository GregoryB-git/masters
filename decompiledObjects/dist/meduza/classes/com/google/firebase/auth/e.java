package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import b8.g;
import c8.i0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.tasks.Task;

public final class e
  extends i0<g>
{
  public e(FirebaseAuth paramFirebaseAuth, String paramString1, String paramString2) {}
  
  public final Task<g> b(String paramString)
  {
    StringBuilder localStringBuilder;
    if (TextUtils.isEmpty(paramString))
    {
      localObject = a;
      localStringBuilder = new StringBuilder("Creating user with ");
      localStringBuilder.append((String)localObject);
      localObject = " with empty reCAPTCHA token";
    }
    else
    {
      localObject = a;
      localStringBuilder = new StringBuilder("Got reCAPTCHA token for sign up with email ");
    }
    localStringBuilder.append((String)localObject);
    Log.i("FirebaseAuth", localStringBuilder.toString());
    Object localObject = c;
    return e.zza(a, a, b, k, paramString, new FirebaseAuth.d((FirebaseAuth)localObject));
  }
}

/* Location:
 * Qualified Name:     com.google.firebase.auth.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */