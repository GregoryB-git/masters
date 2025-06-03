// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.facebook;

import kotlin.jvm.internal.Intrinsics;
import android.content.Intent;
import android.content.Context;
import kotlin.Metadata;
import android.content.BroadcastReceiver;

@Metadata
public final class AuthenticationTokenManager$CurrentAuthenticationTokenChangedBroadcastReceiver extends BroadcastReceiver
{
    public void onReceive(final Context context, final Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
    }
}
