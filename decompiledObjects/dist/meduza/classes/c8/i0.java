package c8;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import g.s;
import z5.j;

public abstract class i0<T>
{
  public final Task a(FirebaseAuth paramFirebaseAuth, String paramString, RecaptchaAction paramRecaptchaAction)
  {
    s locals = new s(this, 5);
    m0 localm0 = paramFirebaseAuth.p();
    if (localm0 != null) {
      synchronized (a)
      {
        com.google.android.gms.internal.firebase-auth-api.zzagt localzzagt = c;
        int i;
        if ((localzzagt != null) && (localzzagt.zzc("EMAIL_PASSWORD_PROVIDER"))) {
          i = 1;
        } else {
          i = 0;
        }
        if (i != 0)
        {
          paramFirebaseAuth = localm0.b(paramString, Boolean.FALSE, paramRecaptchaAction);
          paramString = new j0(locals, paramRecaptchaAction, localm0, paramString);
          return paramFirebaseAuth.continueWithTask(locals).continueWithTask(paramString);
        }
      }
    }
    return b(null).continueWithTask(new j(paramRecaptchaAction, paramFirebaseAuth, paramString, locals));
  }
  
  public abstract Task<T> b(String paramString);
}

/* Location:
 * Qualified Name:     c8.i0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */