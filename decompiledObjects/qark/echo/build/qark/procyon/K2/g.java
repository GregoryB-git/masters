// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package K2;

import android.content.Intent;
import android.content.IntentFilter;
import android.content.BroadcastReceiver;
import android.content.Context;
import x.a;

public abstract class g extends a
{
    public static Intent l(final Context context, final BroadcastReceiver broadcastReceiver, final IntentFilter intentFilter) {
        if (K2.e.a()) {
            int n;
            if (!K2.e.a()) {
                n = 0;
            }
            else {
                n = 2;
            }
            return K2.f.a(context, broadcastReceiver, intentFilter, n);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter);
    }
}
