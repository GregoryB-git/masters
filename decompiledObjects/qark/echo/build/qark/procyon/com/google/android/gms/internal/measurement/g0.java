// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package com.google.android.gms.internal.measurement;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.Context;
import android.os.Build$VERSION;

public abstract class g0
{
    public static final int a;
    public static final int b;
    
    static {
        final int sdk_INT = Build$VERSION.SDK_INT;
        a = 67108864;
        int b2;
        if (sdk_INT >= 31) {
            b2 = 33554432;
        }
        else {
            b2 = 0;
        }
        b = b2;
    }
    
    public static PendingIntent a(final Context context, final int n, final Intent intent, final int n2) {
        return PendingIntent.getBroadcast(context, 0, intent, n2);
    }
}
