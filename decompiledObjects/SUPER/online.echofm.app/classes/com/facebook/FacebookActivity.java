package com.facebook;

import M1.b;
import M1.c;
import O1.E;
import O1.P;
import O1.i;
import W1.a.a;
import Y1.x;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.fragment.app.n;
import androidx.fragment.app.v;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.o;

@Metadata
public class FacebookActivity
  extends e
{
  public static final a E = new a(null);
  public static final String F = FacebookActivity.class.getName();
  public Fragment D;
  
  public void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
    if (T1.a.d(this)) {
      return;
    }
    try
    {
      Intrinsics.checkNotNullParameter(paramString, "prefix");
      Intrinsics.checkNotNullParameter(paramPrintWriter, "writer");
      W1.a.a.a();
      if (Intrinsics.a(null, Boolean.TRUE)) {
        return;
      }
      super.dump(paramString, paramFileDescriptor, paramPrintWriter, paramArrayOfString);
      return;
    }
    finally
    {
      T1.a.b(paramString, this);
    }
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    Intrinsics.checkNotNullParameter(paramConfiguration, "newConfig");
    super.onConfigurationChanged(paramConfiguration);
    Fragment localFragment = D;
    if (localFragment != null) {
      localFragment.onConfigurationChanged(paramConfiguration);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (!B.F())
    {
      Object localObject = P.a;
      P.j0(F, "Facebook SDK not initialized. Make sure you call sdkInitialize inside your Application's onCreate method.");
      localObject = getApplicationContext();
      Intrinsics.checkNotNullExpressionValue(localObject, "applicationContext");
      B.M((Context)localObject);
    }
    setContentView(c.a);
    if (Intrinsics.a("PassThrough", paramBundle.getAction()))
    {
      x();
      return;
    }
    D = w();
  }
  
  public final Fragment v()
  {
    return D;
  }
  
  public Fragment w()
  {
    Intent localIntent = getIntent();
    n localn = n();
    Intrinsics.checkNotNullExpressionValue(localn, "supportFragmentManager");
    Fragment localFragment = localn.h0("SingleFragment");
    Object localObject = localFragment;
    if (localFragment == null)
    {
      if (Intrinsics.a("FacebookDialogFragment", localIntent.getAction()))
      {
        localObject = new i();
        ((Fragment)localObject).D1(true);
        ((d)localObject).T1(localn, "SingleFragment");
      }
      for (;;)
      {
        break;
        localObject = new x();
        ((Fragment)localObject).D1(true);
        localn.m().b(b.c, (Fragment)localObject, "SingleFragment").f();
      }
    }
    return (Fragment)localObject;
  }
  
  public final void x()
  {
    Object localObject1 = getIntent();
    Object localObject2 = E.a;
    Intrinsics.checkNotNullExpressionValue(localObject1, "requestIntent");
    localObject1 = E.q(E.u((Intent)localObject1));
    localObject2 = getIntent();
    Intrinsics.checkNotNullExpressionValue(localObject2, "intent");
    setResult(0, E.m((Intent)localObject2, null, (o)localObject1));
    finish();
  }
  
  public static final class a {}
}

/* Location:
 * Qualified Name:     com.facebook.FacebookActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */