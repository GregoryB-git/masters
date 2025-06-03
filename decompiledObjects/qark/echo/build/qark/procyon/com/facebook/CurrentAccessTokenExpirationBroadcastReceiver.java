// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook;

import x1.g;
import x1.B;
import kotlin.jvm.internal.Intrinsics;
import android.content.Intent;
import android.content.Context;
import kotlin.Metadata;
import android.content.BroadcastReceiver;

@Metadata
public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.a("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED", intent.getAction()) && B.F()) {
            g.f.e().g();
        }
    }
}
