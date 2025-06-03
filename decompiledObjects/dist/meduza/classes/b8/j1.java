package b8;

import android.text.TextUtils;
import android.util.Log;
import c8.m0;
import c8.y;
import c8.y0;
import com.google.android.gms.internal.firebase_auth_api.zzabq;
import com.google.android.gms.internal.firebase_auth_api.zzae;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import g;
import m6.j;
import u7.h;

public final class j1
  implements OnCompleteListener<y0>
{
  public final void onComplete(Task<y0> paramTask)
  {
    boolean bool1 = paramTask.isSuccessful();
    Object localObject1 = null;
    Object localObject2;
    Object localObject3;
    int i;
    Object localObject4;
    if (!bool1)
    {
      localObject2 = "Error while validating application identity: ";
      localObject3 = paramTask.getException();
      if (localObject3 != null) {
        localObject2 = g.d("Error while validating application identity: ", ((Throwable)localObject3).getMessage());
      }
      Log.e("FirebaseAuth", (String)localObject2);
      if (localObject3 != null)
      {
        localObject2 = y.b;
        if ((!(localObject3 instanceof n)) && ((!(localObject3 instanceof l)) || (!a.endsWith("UNAUTHORIZED_DOMAIN")))) {
          i = 0;
        } else {
          i = 1;
        }
        if (i != 0)
        {
          FirebaseAuth.o((h)localObject3, a, b);
          return;
        }
      }
      Log.e("FirebaseAuth", "Proceeding without any application identifier.");
      localObject3 = null;
      localObject4 = localObject3;
      localObject2 = localObject1;
    }
    else
    {
      localObject3 = ((y0)paramTask.getResult()).c();
      localObject4 = ((y0)paramTask.getResult()).a();
      localObject2 = ((y0)paramTask.getResult()).b();
    }
    long l = a.b.longValue();
    localObject1 = c;
    Object localObject5 = a;
    Object localObject6 = e;
    localObject1 = ((FirebaseAuth)localObject1).h(c, (String)localObject6);
    if (TextUtils.isEmpty((CharSequence)localObject3))
    {
      localObject5 = c;
      localObject6 = a;
      paramTask = (y0)paramTask.getResult();
      localObject5.getClass();
      if (!j)
      {
        paramTask = new k1((FirebaseAuth)localObject5, (d0)localObject6, paramTask, (f0)localObject1);
        break label285;
      }
    }
    paramTask = (Task<y0>)localObject1;
    label285:
    localObject1 = a.h;
    j.i(localObject1);
    localObject1 = (c8.n)localObject1;
    if ((zzae.zzc((String)localObject2)) && (c.p() != null) && (c.p().c())) {
      localObject2 = "NO_RECAPTCHA";
    }
    if (a != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      localObject6 = c.e;
      localObject5 = a.e;
      j.i(localObject5);
      localObject7 = c;
      str = i;
      if (a.g != null) {
        bool1 = true;
      } else {
        bool1 = false;
      }
      bool2 = ((FirebaseAuth)localObject7).t();
      localObject7 = a;
      ((zzabq)localObject6).zza((c8.n)localObject1, (String)localObject5, str, l, bool1, false, (String)localObject3, (String)localObject4, (String)localObject2, bool2, paramTask, d, f);
      return;
    }
    localObject5 = c.e;
    localObject6 = a.i;
    j.i(localObject6);
    Object localObject7 = c;
    String str = i;
    if (a.g != null) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    boolean bool2 = ((FirebaseAuth)localObject7).t();
    localObject7 = a;
    ((zzabq)localObject5).zza((c8.n)localObject1, (h0)localObject6, str, l, bool1, false, (String)localObject3, (String)localObject4, (String)localObject2, bool2, paramTask, d, f);
  }
}

/* Location:
 * Qualified Name:     b8.j1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */