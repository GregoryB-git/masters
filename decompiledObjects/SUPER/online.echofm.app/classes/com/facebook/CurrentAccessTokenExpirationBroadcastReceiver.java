package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import x1.B;
import x1.g;
import x1.g.a;

@Metadata
public final class CurrentAccessTokenExpirationBroadcastReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    Intrinsics.checkNotNullParameter(paramContext, "context");
    Intrinsics.checkNotNullParameter(paramIntent, "intent");
    if ((Intrinsics.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", paramIntent.getAction())) && (B.F())) {
      g.f.e().g();
    }
  }
}

/* Location:
 * Qualified Name:     com.facebook.CurrentAccessTokenExpirationBroadcastReceiver
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */