/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Float
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package H3;

import E3.f;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class e {
    public final Float a;
    public final boolean b;

    public e(Float f8, boolean bl) {
        this.b = bl;
        this.a = f8;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static e a(Context context) {
        boolean bl = false;
        boolean bl2 = false;
        Object var4_4 = null;
        boolean bl3 = bl2;
        Intent intent = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        bl3 = bl;
        context = var4_4;
        if (intent == null) return new e((Float)context, bl3);
        bl3 = bl2;
        bl3 = bl2 = e.e(intent);
        try {
            context = e.d(intent);
            bl3 = bl2;
            return new e((Float)context, bl3);
        }
        catch (IllegalStateException illegalStateException) {
            f.f().e("An error occurred getting battery state.", (Throwable)illegalStateException);
            context = var4_4;
        }
        return new e((Float)context, bl3);
    }

    public static Float d(Intent intent) {
        int n8 = intent.getIntExtra("level", -1);
        int n9 = intent.getIntExtra("scale", -1);
        if (n8 != -1 && n9 != -1) {
            return Float.valueOf((float)((float)n8 / (float)n9));
        }
        return null;
    }

    public static boolean e(Intent intent) {
        int n8 = intent.getIntExtra("status", -1);
        boolean bl = false;
        if (n8 == -1) {
            return false;
        }
        if (n8 == 2 || n8 == 5) {
            bl = true;
        }
        return bl;
    }

    public Float b() {
        return this.a;
    }

    public int c() {
        Float f8;
        if (this.b && (f8 = this.a) != null) {
            if ((double)f8.floatValue() < 0.99) {
                return 2;
            }
            return 3;
        }
        return 1;
    }
}

