package com.facebook;

import Z.a;
import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata
public final class CustomTabActivity
  extends Activity
{
  public static final a p = new a(null);
  public static final String q = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_customTabRedirect");
  public static final String r = Intrinsics.i(CustomTabActivity.class.getSimpleName(), ".action_destroy");
  public BroadcastReceiver o;
  
  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 == 0)
    {
      paramIntent = new Intent(q);
      paramIntent.putExtra(CustomTabMainActivity.u, getIntent().getDataString());
      a.b(this).d(paramIntent);
      paramIntent = new b(this);
      a.b(this).c(paramIntent, new IntentFilter(r));
      o = paramIntent;
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    paramBundle = new Intent(this, CustomTabMainActivity.class);
    paramBundle.setAction(q);
    paramBundle.putExtra(CustomTabMainActivity.u, getIntent().getDataString());
    paramBundle.addFlags(603979776);
    startActivityForResult(paramBundle, 2);
  }
  
  public void onDestroy()
  {
    BroadcastReceiver localBroadcastReceiver = o;
    if (localBroadcastReceiver != null) {
      a.b(this).e(localBroadcastReceiver);
    }
    super.onDestroy();
  }
  
  public static final class a {}
  
  public static final class b
    extends BroadcastReceiver
  {
    public b(CustomTabActivity paramCustomTabActivity) {}
    
    public void onReceive(Context paramContext, Intent paramIntent)
    {
      Intrinsics.checkNotNullParameter(paramContext, "context");
      Intrinsics.checkNotNullParameter(paramIntent, "intent");
      a.finish();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.CustomTabActivity
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */