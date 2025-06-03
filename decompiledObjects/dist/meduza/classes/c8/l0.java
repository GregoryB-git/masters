package c8;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.firebase_auth_api.zzae;
import com.google.android.gms.internal.firebase_auth_api.zzagt;
import com.google.android.gms.internal.firebase_auth_api.zzv;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.recaptcha.Recaptcha;
import com.google.android.recaptcha.RecaptchaTasksClient;
import java.util.HashMap;
import java.util.List;
import m6.j;

public final class l0
  implements Continuation<zzagt, Task<RecaptchaTasksClient>>
{
  public final Object then(Task arg1)
  {
    if (!???.isSuccessful())
    {
      ??? = ???.getException();
      j.i(???);
      ??? = ???.getMessage();
      j.i(???);
      return Tasks.forException(new k0(???));
    }
    zzagt localzzagt = (zzagt)???.getResult();
    Object localObject2 = localzzagt.zza();
    if (zzae.zzc((String)localObject2)) {
      return Tasks.forException(new k0(f.j("No Recaptcha Enterprise siteKey configured for tenant/project ", a)));
    }
    ??? = zzv.zza('/').zza((CharSequence)localObject2);
    if (???.size() != 4) {
      ??? = null;
    } else {
      ??? = (String)???.get(3);
    }
    if (TextUtils.isEmpty(???)) {
      return Tasks.forException(new Exception(f.j("Invalid siteKey format ", (String)localObject2)));
    }
    if (Log.isLoggable("RecaptchaHandler", 4))
    {
      localObject2 = a;
      localObject3 = new StringBuilder("Successfully obtained site key for tenant ");
      ((StringBuilder)localObject3).append((String)localObject2);
      Log.i("RecaptchaHandler", ((StringBuilder)localObject3).toString());
    }
    Object localObject3 = b;
    localObject2 = f;
    localObject3 = d;
    ((u7.f)localObject3).a();
    localObject3 = (Application)a;
    localObject2.getClass();
    localObject2 = Recaptcha.fetchTaskClient((Application)localObject3, ???);
    localObject3 = b;
    String str = a;
    synchronized (a)
    {
      c = localzzagt;
      b.put(str, localObject2);
      return localObject2;
    }
  }
}

/* Location:
 * Qualified Name:     c8.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */