package com.facebook;

import O1.E;
import O1.P;
import O1.e;
import O1.x;
import Y1.B;
import Y1.B.a;
import Z.a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CustomTabMainActivity
  extends Activity
{
  public static final a q = new a(null);
  public static final String r = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_action");
  public static final String s = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_params");
  public static final String t = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_chromePackage");
  public static final String u = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_url");
  public static final String v = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".extra_targetApp");
  public static final String w = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".action_refresh");
  public static final String x = Intrinsics.i(CustomTabMainActivity.class.getSimpleName(), ".no_activity_exception");
  public boolean o = true;
  public BroadcastReceiver p;
  
  public final void a(int paramInt, Intent paramIntent)
  {
    Object localObject1 = p;
    if (localObject1 != null) {
      a.b(this).e((BroadcastReceiver)localObject1);
    }
    if (paramIntent != null)
    {
      localObject1 = paramIntent.getStringExtra(u);
      if (localObject1 != null) {
        localObject1 = a.a(q, (String)localObject1);
      } else {
        localObject1 = new Bundle();
      }
      Object localObject2 = E.a;
      localObject2 = getIntent();
      Intrinsics.checkNotNullExpressionValue(localObject2, "intent");
      localObject1 = E.m((Intent)localObject2, (Bundle)localObject1, null);
      if (localObject1 == null) {}
    }
    for (paramIntent = (Intent)localObject1;; paramIntent = E.m(paramIntent, null, null))
    {
      setResult(paramInt, paramIntent);
      break;
      paramIntent = E.a;
      paramIntent = getIntent();
      Intrinsics.checkNotNullExpressionValue(paramIntent, "intent");
    }
    finish();
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    String str1 = CustomTabActivity.q;
    if (Intrinsics.a(str1, getIntent().getAction())) {
      setResult(0);
    }
    for (;;)
    {
      finish();
      return;
      if (paramBundle != null) {
        return;
      }
      String str2 = getIntent().getStringExtra(r);
      if (str2 == null) {
        return;
      }
      Bundle localBundle = getIntent().getBundleExtra(s);
      String str3 = getIntent().getStringExtra(t);
      paramBundle = B.p.a(getIntent().getStringExtra(v));
      if (b.a[paramBundle.ordinal()] == 1) {
        paramBundle = new x(str2, localBundle);
      } else {
        paramBundle = new e(str2, localBundle);
      }
      boolean bool = paramBundle.a(this, str3);
      o = false;
      if (bool) {
        break;
      }
      setResult(0, getIntent().putExtra(x, true));
    }
    paramBundle = new c(this);
    p = paramBundle;
    a.b(this).c(paramBundle, new IntentFilter(str1));
  }
  
  public void onNewIntent(Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramIntent, "intent");
    super.onNewIntent(paramIntent);
    if (Intrinsics.a(w, paramIntent.getAction()))
    {
      localIntent = new Intent(CustomTabActivity.r);
      a.b(this).d(localIntent);
    }
    while (Intrinsics.a(CustomTabActivity.q, paramIntent.getAction()))
    {
      Intent localIntent;
      a(-1, paramIntent);
      break;
    }
  }
  
  public void onResume()
  {
    super.onResume();
    if (o) {
      a(0, null);
    }
    o = true;
  }
  
  public static final class a
  {
    public final Bundle b(String paramString)
    {
      paramString = Uri.parse(paramString);
      Object localObject = P.a;
      localObject = P.o0(paramString.getQuery());
      ((Bundle)localObject).putAll(P.o0(paramString.getFragment()));
      return (Bundle)localObject;
    }
  }
  
  public static final class c
    extends BroadcastReceiver
  {
    public c(CustomTabMainActivity paramCustomTabMainActivity) {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramIntent, "intent");
      paramContext = new Intent(a, CustomTabMainActivity.class);
      paramContext.setAction(CustomTabMainActivity.w);
      String str = CustomTabMainActivity.u;
      paramContext.putExtra(str, paramIntent.getStringExtra(str));
      paramContext.addFlags(603979776);
      a.startActivity(paramContext);
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabMainActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */