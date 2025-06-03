package c8;

import android.app.Activity;
import android.text.TextUtils;
import android.util.Log;
import b1.v;
import b8.n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzadr;
import com.google.android.gms.internal.firebase_auth_api.zzafa;
import com.google.android.gms.internal.firebase_auth_api.zzafm;
import com.google.android.gms.internal.firebase_auth_api.zzags;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.integrity.IntegrityManager;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.firebase.auth.FirebaseAuth;
import g.s;

public final class y
{
  public static final y b = new y();
  public String a;
  
  public static void b(FirebaseAuth paramFirebaseAuth, Activity paramActivity, TaskCompletionSource paramTaskCompletionSource)
  {
    if (paramActivity == null)
    {
      paramTaskCompletionSource.setException(new n());
      return;
    }
    Object localObject = a;
    ((u7.f)localObject).a();
    f0.b(a, paramFirebaseAuth);
    localObject = new TaskCompletionSource();
    if (w.c == null) {
      w.c = new w();
    }
    w localw = w.c;
    int i;
    if (!a)
    {
      localw.b(paramActivity, new a0(localw, paramActivity, (TaskCompletionSource)localObject));
      i = 1;
      a = true;
    }
    else
    {
      i = 0;
    }
    if (i == 0)
    {
      paramFirebaseAuth = Tasks.forException(zzadr.zza(new Status(17057, "reCAPTCHA flow already in progress", null, null)));
    }
    else
    {
      new zzafa(paramFirebaseAuth, paramActivity).zza();
      paramFirebaseAuth = ((TaskCompletionSource)localObject).getTask();
    }
    paramFirebaseAuth.addOnSuccessListener(new v(paramTaskCompletionSource, 0)).addOnFailureListener(new s(paramTaskCompletionSource));
  }
  
  public final Task<y0> a(FirebaseAuth paramFirebaseAuth, String paramString, Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, RecaptchaAction paramRecaptchaAction)
  {
    Object localObject1 = g;
    u0 localu0 = u0.c;
    if ((!zzafm.zza(a)) && (!c))
    {
      boolean bool = d;
      Object localObject2 = new StringBuilder("ForceRecaptchaV2Flow from phoneAuthOptions = ");
      ((StringBuilder)localObject2).append(paramBoolean2);
      ((StringBuilder)localObject2).append(", ForceRecaptchav2Flow from firebaseSettings = ");
      ((StringBuilder)localObject2).append(bool);
      Log.i("y", ((StringBuilder)localObject2).toString());
      if ((!paramBoolean2) && (!d)) {
        paramBoolean2 = false;
      } else {
        paramBoolean2 = true;
      }
      localObject2 = new TaskCompletionSource();
      localObject1 = a;
      localObject1.getClass();
      if (System.currentTimeMillis() - b < 3600000L) {
        localObject1 = a;
      } else {
        localObject1 = null;
      }
      if (localObject1 != null)
      {
        if (((Task)localObject1).isSuccessful()) {
          return Tasks.forResult(new a1((String)((Task)localObject1).getResult(), null, null));
        }
        String str = ((Task)localObject1).getException().getMessage();
        localObject1 = new StringBuilder("Error in previous reCAPTCHAV2 flow: ");
        ((StringBuilder)localObject1).append(str);
        Log.e("y", ((StringBuilder)localObject1).toString());
        Log.e("y", "Continuing with application verification as normal");
      }
      if ((!paramBoolean2) && (!paramBoolean3))
      {
        if (l == null) {
          l = new m0(a, paramFirebaseAuth);
        }
        l.a(k, Boolean.FALSE).continueWithTask(new eb.y(0)).addOnCompleteListener(new c(this, (TaskCompletionSource)localObject2, paramFirebaseAuth, paramRecaptchaAction, paramString, paramActivity, paramBoolean1, localu0));
      }
      else
      {
        c(paramFirebaseAuth, paramString, paramActivity, paramBoolean1, paramBoolean2, localu0, (TaskCompletionSource)localObject2);
      }
      return ((TaskCompletionSource)localObject2).getTask();
    }
    return Tasks.forResult(new a1(null, null, null));
  }
  
  public final void c(FirebaseAuth paramFirebaseAuth, String paramString, Activity paramActivity, boolean paramBoolean1, boolean paramBoolean2, u0 paramu0, TaskCompletionSource<y0> paramTaskCompletionSource)
  {
    if ((paramBoolean1) && (!paramBoolean2))
    {
      Object localObject = a;
      ((u7.f)localObject).a();
      IntegrityManager localIntegrityManager = IntegrityManagerFactory.create(a);
      if (!TextUtils.isEmpty(a)) {
        localObject = Tasks.forResult(new zzags(a));
      } else {
        localObject = e.zza();
      }
      ((Task)localObject).continueWithTask(z, new x0(this, paramString, localIntegrityManager)).addOnCompleteListener(new w0(this, paramTaskCompletionSource, paramFirebaseAuth, paramu0, paramActivity));
      return;
    }
    b(paramFirebaseAuth, paramActivity, paramTaskCompletionSource);
  }
}

/* Location:
 * Qualified Name:     c8.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */