package g6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import eb.y;
import h6.b;
import h6.l;
import h6.n;
import k6.d.a;
import k6.g;
import k6.o;
import l6.p;
import m6.w;
import p2.m0;

public final class a
  extends k6.d<GoogleSignInOptions>
{
  public static final m0 a = new m0();
  public static int b = 1;
  
  public a(Activity paramActivity, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramActivity, b6.a.a, paramGoogleSignInOptions, new z4.i(1));
  }
  
  public a(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    super(paramContext, b6.a.a, paramGoogleSignInOptions, new d.a(new z4.i(1), Looper.getMainLooper()));
  }
  
  public final Intent a()
  {
    Object localObject = getApplicationContext();
    int i = c();
    int j = i - 1;
    if (i != 0)
    {
      if (j != 2)
      {
        if (j != 3)
        {
          localGoogleSignInOptions = (GoogleSignInOptions)getApiOptions();
          n.a.a("getNoImplementationSignInIntent()", new Object[0]);
          localObject = n.a((Context)localObject, localGoogleSignInOptions);
          ((Intent)localObject).setAction("com.google.android.gms.auth.NO_IMPL");
          return (Intent)localObject;
        }
        return n.a((Context)localObject, (GoogleSignInOptions)getApiOptions());
      }
      GoogleSignInOptions localGoogleSignInOptions = (GoogleSignInOptions)getApiOptions();
      n.a.a("getFallbackSignInIntent()", new Object[0]);
      localObject = n.a((Context)localObject, localGoogleSignInOptions);
      ((Intent)localObject).setAction("com.google.android.gms.auth.APPAUTH_SIGN_IN");
      return (Intent)localObject;
    }
    throw null;
  }
  
  public final Task<Void> b()
  {
    Object localObject1 = asGoogleApiClient();
    Object localObject2 = getApplicationContext();
    int i;
    if (c() == 3) {
      i = 1;
    } else {
      i = 0;
    }
    n.a.a("Revoking access", new Object[0]);
    Object localObject3 = b.a((Context)localObject2).e("refreshToken");
    n.b((Context)localObject2);
    if (i != 0)
    {
      if (localObject3 == null)
      {
        localObject1 = h6.d.c;
        localObject3 = new Status(4, null, null, null);
        m6.j.a("Status code must not be SUCCESS", ((Status)localObject3).D() ^ true);
        localObject1 = new o((Status)localObject3);
        ((BasePendingResult)localObject1).setResult((k6.j)localObject3);
      }
      else
      {
        localObject1 = new h6.d((String)localObject3);
        new Thread((Runnable)localObject1).start();
        localObject1 = b;
      }
    }
    else {
      localObject1 = ((k6.e)localObject1).b(new l((k6.e)localObject1));
    }
    localObject3 = new y();
    localObject2 = new TaskCompletionSource();
    ((BasePendingResult)localObject1).addStatusListener(new w((g)localObject1, (TaskCompletionSource)localObject2, (m6.i)localObject3));
    return ((TaskCompletionSource)localObject2).getTask();
  }
  
  public final int c()
  {
    try
    {
      int i = b;
      int j = i;
      if (i == 1)
      {
        Context localContext = getApplicationContext();
        j6.e locale = j6.e.d;
        j = locale.c(localContext, 12451000);
        if (j == 0)
        {
          b = 4;
          j = 4;
        }
        else if ((locale.a(localContext, null, j) == null) && (DynamiteModule.a(localContext, "com.google.android.gms.auth.api.fallback") != 0))
        {
          b = 3;
          j = 3;
        }
        else
        {
          b = 2;
          j = 2;
        }
      }
      return j;
    }
    finally {}
  }
  
  public final Task<Void> signOut()
  {
    Object localObject1 = asGoogleApiClient();
    Object localObject2 = getApplicationContext();
    int i;
    if (c() == 3) {
      i = 1;
    } else {
      i = 0;
    }
    n.a.a("Signing out", new Object[0]);
    n.b((Context)localObject2);
    if (i != 0)
    {
      localObject2 = Status.e;
      m6.j.j(localObject2, "Result must not be null");
      localObject1 = new p((k6.e)localObject1);
      ((BasePendingResult)localObject1).setResult((k6.j)localObject2);
    }
    else
    {
      localObject1 = ((k6.e)localObject1).b(new h6.j((k6.e)localObject1));
    }
    y localy = new y();
    localObject2 = new TaskCompletionSource();
    ((BasePendingResult)localObject1).addStatusListener(new w((g)localObject1, (TaskCompletionSource)localObject2, localy));
    return ((TaskCompletionSource)localObject2).getTask();
  }
}

/* Location:
 * Qualified Name:     g6.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */