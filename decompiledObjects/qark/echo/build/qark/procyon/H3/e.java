// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H3;

import android.content.Intent;
import E3.f;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.content.Context;

public class e
{
    public final Float a;
    public final boolean b;
    
    public e(final Float a, final boolean b) {
        this.b = b;
        this.a = a;
    }
    
    public static e a(final Context context) {
        final boolean b = false;
        final boolean b2 = false;
        final Float n = null;
        boolean e = b2;
        Float d;
        try {
            final Intent registerReceiver = context.registerReceiver((BroadcastReceiver)null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            e = b;
            d = n;
            if (registerReceiver != null) {
                e = b2;
                e = e(registerReceiver);
                d = d(registerReceiver);
                e = e;
            }
        }
        catch (IllegalStateException ex) {
            f.f().e("An error occurred getting battery state.", ex);
            d = n;
        }
        return new e(d, e);
    }
    
    public static Float d(final Intent intent) {
        final int intExtra = intent.getIntExtra("level", -1);
        final int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra != -1 && intExtra2 != -1) {
            return intExtra / (float)intExtra2;
        }
        return null;
    }
    
    public static boolean e(final Intent intent) {
        final int intExtra = intent.getIntExtra("status", -1);
        boolean b = false;
        if (intExtra == -1) {
            return false;
        }
        if (intExtra == 2 || intExtra == 5) {
            b = true;
        }
        return b;
    }
    
    public Float b() {
        return this.a;
    }
    
    public int c() {
        if (this.b) {
            final Float a = this.a;
            if (a != null) {
                if (a < 0.99) {
                    return 2;
                }
                return 3;
            }
        }
        return 1;
    }
}
