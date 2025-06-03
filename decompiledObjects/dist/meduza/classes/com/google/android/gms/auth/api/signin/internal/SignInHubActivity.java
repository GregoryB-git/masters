package com.google.android.gms.auth.api.signin.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import b.j;
import b1.t;
import b1.x;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.api.Status;
import d1.b.a;
import d1.b.b;
import d1.b.c;
import h6.s;
import java.util.Set;
import r.i;
import x0.m;

public class SignInHubActivity
  extends m
{
  public static boolean f = false;
  public boolean a = false;
  public SignInConfiguration b;
  public boolean c;
  public int d;
  public Intent e;
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return true;
  }
  
  public final void h()
  {
    Object localObject1 = getSupportLoaderManager();
    Object localObject2 = new s(this);
    localObject1 = (d1.b)localObject1;
    if (!b.e)
    {
      if (Looper.getMainLooper() == Looper.myLooper())
      {
        Object localObject4 = (b.a)b.d.c(0, null);
        if (localObject4 == null)
        {
          try
          {
            b.e = true;
            localObject4 = new h6/e;
            synchronized (k6.e.a)
            {
              ((h6.e)localObject4).<init>(this, (Set)???);
            }
            break label150;
            localObject2 = new java/lang/IllegalArgumentException;
            ??? = new java/lang/StringBuilder;
            ((StringBuilder)???).<init>();
            ((StringBuilder)???).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
            ((StringBuilder)???).append(localObject4);
            ((IllegalArgumentException)localObject2).<init>(((StringBuilder)???).toString());
            throw ((Throwable)localObject2);
            label150:
            ??? = new d1/b$a;
            ((b.a)???).<init>((h6.e)localObject4);
            b.d.d(0, ???);
            b.e = false;
            localObject1 = a;
            localObject2 = new b.b(c, (s)localObject2);
            ((t)???).observe((b1.o)localObject1, (x)localObject2);
            localObject4 = e;
            if (localObject4 != null) {
              ((b.a)???).removeObserver((x)localObject4);
            }
            d = ((b1.o)localObject1);
            e = ((b.b)localObject2);
          }
          finally
          {
            b.e = false;
          }
          localObject3 = finally;
          throw ((Throwable)localObject3);
        }
        localObject1 = a;
        b.b localb = new b.b(c, locals);
        ((t)localObject4).observe((b1.o)localObject1, localb);
        ??? = e;
        if (??? != null) {
          ((b.a)localObject4).removeObserver((x)???);
        }
        d = ((b1.o)localObject1);
        e = localb;
        f = false;
        return;
      }
      throw new IllegalStateException("initLoader must be called on the main thread");
    }
    throw new IllegalStateException("Called while creating a loader");
  }
  
  public final void i(int paramInt)
  {
    Status localStatus = new Status(paramInt, null, null, null);
    Intent localIntent = new Intent();
    localIntent.putExtra("googleSignInStatus", localStatus);
    setResult(0, localIntent);
    finish();
    f = false;
  }
  
  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    if (!a)
    {
      setResult(0);
      if (paramInt1 == 40962) {}
    }
    else
    {
      return;
    }
    if (paramIntent != null)
    {
      Object localObject = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if (localObject != null)
      {
        GoogleSignInAccount localGoogleSignInAccount = b;
        if (localGoogleSignInAccount != null)
        {
          localObject = h6.o.a(this);
          GoogleSignInOptions localGoogleSignInOptions = b.b;
          try
          {
            a.d(localGoogleSignInAccount, localGoogleSignInOptions);
            b = localGoogleSignInAccount;
            c = localGoogleSignInOptions;
            paramIntent.removeExtra("signInAccount");
            paramIntent.putExtra("googleSignInAccount", localGoogleSignInAccount);
            c = true;
            d = paramInt2;
            e = paramIntent;
            h();
            return;
          }
          finally {}
        }
      }
      if (paramIntent.hasExtra("errorCode"))
      {
        paramInt2 = paramIntent.getIntExtra("errorCode", 8);
        paramInt1 = paramInt2;
        if (paramInt2 == 13) {
          paramInt1 = 12501;
        }
        i(paramInt1);
        return;
      }
    }
    i(8);
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    Object localObject = getIntent();
    String str = ((Intent)localObject).getAction();
    str.getClass();
    if ("com.google.android.gms.auth.NO_IMPL".equals(str))
    {
      i(12500);
      return;
    }
    if ((!str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) && (!str.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")))
    {
      Log.e("AuthSignInClient", "Unknown action: ".concat(String.valueOf(((Intent)localObject).getAction())));
      finish();
      return;
    }
    localObject = ((Intent)localObject).getBundleExtra("config");
    localObject.getClass();
    localObject = (SignInConfiguration)((Bundle)localObject).getParcelable("config");
    if (localObject == null)
    {
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
      return;
    }
    b = ((SignInConfiguration)localObject);
    if (paramBundle == null)
    {
      if (f)
      {
        setResult(0);
        i(12502);
        return;
      }
      f = true;
      localObject = new Intent(str);
      if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
        paramBundle = "com.google.android.gms";
      } else {
        paramBundle = getPackageName();
      }
      ((Intent)localObject).setPackage(paramBundle);
      ((Intent)localObject).putExtra("config", b);
      try
      {
        startActivityForResult((Intent)localObject, 40962);
      }
      catch (ActivityNotFoundException paramBundle)
      {
        a = true;
        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
        i(17);
      }
      return;
    }
    boolean bool = paramBundle.getBoolean("signingInGoogleApiClients");
    c = bool;
    if (bool)
    {
      d = paramBundle.getInt("signInResultCode");
      paramBundle = (Intent)paramBundle.getParcelable("signInResultData");
      paramBundle.getClass();
      e = paramBundle;
      h();
    }
  }
  
  public final void onDestroy()
  {
    super.onDestroy();
    f = false;
  }
  
  public final void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", c);
    if (c)
    {
      paramBundle.putInt("signInResultCode", d);
      paramBundle.putParcelable("signInResultData", e);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.SignInHubActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */