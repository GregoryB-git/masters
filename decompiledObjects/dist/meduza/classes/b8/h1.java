package b8;

import android.text.TextUtils;
import android.util.Log;
import c8.a1;
import c8.m0;
import c8.y;
import c8.y0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzae;
import com.google.android.gms.internal.firebase_auth_api.zzahk;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import m6.j;
import u7.h;

public final class h1
  implements OnCompleteListener<y0>
{
  public final void onComplete(Task<y0> paramTask)
  {
    Object localObject1;
    Object localObject2;
    if (!paramTask.isSuccessful())
    {
      localObject1 = paramTask.getException();
      if (localObject1 != null) {
        localObject2 = ((Throwable)localObject1).getMessage();
      } else {
        localObject2 = "";
      }
      localObject3 = new StringBuilder("Error while validating application identity: ");
      ((StringBuilder)localObject3).append((String)localObject2);
      Log.e("FirebaseAuth", ((StringBuilder)localObject3).toString());
      if (localObject1 != null)
      {
        localObject2 = y.b;
        int i;
        if ((!(localObject1 instanceof n)) && ((!(localObject1 instanceof l)) || (!a.endsWith("UNAUTHORIZED_DOMAIN")))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          FirebaseAuth.o((h)localObject1, a, b);
          return;
        }
      }
      Log.e("FirebaseAuth", "Proceeding without any application identifier.");
    }
    Object localObject3 = c;
    d0 locald0 = a;
    y0 localy0 = (y0)paramTask.getResult();
    localObject3.getClass();
    long l = b.longValue();
    if ((l >= 0L) && (l <= 120L))
    {
      localObject1 = e;
      j.e((String)localObject1);
      localObject2 = localy0.b();
      String str1 = localy0.a();
      String str2 = localy0.c();
      paramTask = (Task<y0>)localObject2;
      if (zzae.zzc((String)localObject2))
      {
        paramTask = (Task<y0>)localObject2;
        if (((FirebaseAuth)localObject3).p() != null)
        {
          paramTask = (Task<y0>)localObject2;
          if (((FirebaseAuth)localObject3).p().c()) {
            paramTask = "NO_RECAPTCHA";
          }
        }
      }
      boolean bool;
      if (g != null) {
        bool = true;
      } else {
        bool = false;
      }
      zzahk localzzahk = new zzahk((String)localObject1, l, bool, i, k, str2, str1, paramTask, ((FirebaseAuth)localObject3).t());
      localObject1 = ((FirebaseAuth)localObject3).h(c, (String)localObject1);
      localObject2 = localObject1;
      if (TextUtils.isEmpty(localy0.c()))
      {
        paramTask = new a1(str2, str1, paramTask);
        if (j) {
          localObject2 = localObject1;
        } else {
          localObject2 = new k1((FirebaseAuth)localObject3, locald0, paramTask, (f0)localObject1);
        }
      }
      e.zza(a, localzzahk, (f0)localObject2, f, d);
      return;
    }
    throw new IllegalArgumentException("We only support 0-120 seconds for sms-auto-retrieval timeout");
  }
}

/* Location:
 * Qualified Name:     b8.h1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */