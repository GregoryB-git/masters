package b8;

import android.text.TextUtils;
import android.util.Log;
import c8.m0;
import c8.y0;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.firebase.auth.FirebaseAuth;
import u7.h;

public final class k1
  extends f0
{
  public k1(FirebaseAuth paramFirebaseAuth, d0 paramd0, y0 paramy0, f0 paramf0) {}
  
  public final void onCodeAutoRetrievalTimeOut(String paramString)
  {
    c.onCodeAutoRetrievalTimeOut(paramString);
  }
  
  public final void onCodeSent(String paramString, e0 parame0)
  {
    c.onCodeSent(paramString, parame0);
  }
  
  public final void onVerificationCompleted(c0 paramc0)
  {
    c.onVerificationCompleted(paramc0);
  }
  
  public final void onVerificationFailed(h paramh)
  {
    if (zzadr.zza(paramh))
    {
      paramh = a;
      j = true;
      paramh = e;
      localObject1 = new StringBuilder("Re-triggering phone verification with Recaptcha flow forced for phone number ");
      ((StringBuilder)localObject1).append(paramh);
      Log.d("FirebaseAuth", ((StringBuilder)localObject1).toString());
      FirebaseAuth.l(a);
      return;
    }
    if (!TextUtils.isEmpty(b.b()))
    {
      if ((zzadr.zzb(paramh)) && (d.p().c()) && (TextUtils.isEmpty(b.a())))
      {
        paramh = a;
        k = true;
        localObject1 = e;
        paramh = new StringBuilder("Re-triggering phone verification with non-reCAPTCHA Enterprise flow for phone number ");
        paramh.append((String)localObject1);
        Log.d("FirebaseAuth", paramh.toString());
        FirebaseAuth.l(a);
        return;
      }
      localObject1 = a.e;
      localObject2 = paramh.getMessage();
      localObject3 = new StringBuilder("Invoking original failure callbacks after reCAPTCHA Enterprise + phone verification failure for ");
      ((StringBuilder)localObject3).append((String)localObject1);
      ((StringBuilder)localObject3).append(", error - ");
      ((StringBuilder)localObject3).append((String)localObject2);
      Log.d("FirebaseAuth", ((StringBuilder)localObject3).toString());
      c.onVerificationFailed(paramh);
      return;
    }
    Object localObject3 = a.e;
    Object localObject1 = paramh.getMessage();
    Object localObject2 = new StringBuilder("Invoking original failure callbacks after phone verification failure for ");
    ((StringBuilder)localObject2).append((String)localObject3);
    ((StringBuilder)localObject2).append(", error - ");
    ((StringBuilder)localObject2).append((String)localObject1);
    Log.d("FirebaseAuth", ((StringBuilder)localObject2).toString());
    c.onVerificationFailed(paramh);
  }
}

/* Location:
 * Qualified Name:     b8.k1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */