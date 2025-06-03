package c8;

import b.a0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzae;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaTasksClient;
import com.google.firebase.auth.FirebaseAuth;
import java.util.HashMap;
import u7.f;

public final class m0
{
  public final Object a = new Object();
  public final HashMap b = new HashMap();
  public com.google.android.gms.internal.firebase-auth-api.zzagt c;
  public f d;
  public FirebaseAuth e;
  public a0 f;
  
  public m0(f paramf, FirebaseAuth paramFirebaseAuth)
  {
    d = paramf;
    e = paramFirebaseAuth;
    f = locala0;
  }
  
  public final Task<RecaptchaTasksClient> a(String arg1, Boolean paramBoolean)
  {
    String str = ???;
    if (zzae.zzc(???)) {
      str = "*";
    }
    if (!paramBoolean.booleanValue()) {
      synchronized (a)
      {
        paramBoolean = (Task)b.get(str);
        if (paramBoolean != null) {
          return paramBoolean;
        }
      }
    }
    ??? = e;
    return e.zza(k, "RECAPTCHA_ENTERPRISE").continueWithTask(new l0(this, str));
  }
  
  public final Task<String> b(String arg1, Boolean paramBoolean, RecaptchaAction paramRecaptchaAction)
  {
    String str = ???;
    if (zzae.zzc(???)) {
      str = "*";
    }
    synchronized (a)
    {
      Task localTask = (Task)b.get(str);
      if (!paramBoolean.booleanValue())
      {
        ??? = localTask;
        if (localTask != null) {}
      }
      else
      {
        ??? = a(str, paramBoolean);
      }
      return ???.continueWithTask(new o0(paramRecaptchaAction));
    }
  }
  
  public final boolean c()
  {
    Object localObject = c;
    if (localObject == null) {
      return false;
    }
    localObject = ((com.google.android.gms.internal.firebase_auth_api.zzagt)localObject).zzb("PHONE_PROVIDER");
    if (localObject == null) {
      return false;
    }
    return ((String)localObject).equals("AUDIT");
  }
}

/* Location:
 * Qualified Name:     c8.m0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */