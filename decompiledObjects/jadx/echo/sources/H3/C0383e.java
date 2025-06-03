package H3;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* renamed from: H3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0383e {

    /* renamed from: a, reason: collision with root package name */
    public final Float f2255a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2256b;

    public C0383e(Float f7, boolean z7) {
        this.f2256b = z7;
        this.f2255a = f7;
    }

    public static C0383e a(Context context) {
        boolean z7 = false;
        Float f7 = null;
        try {
            Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (registerReceiver != null) {
                z7 = e(registerReceiver);
                f7 = d(registerReceiver);
            }
        } catch (IllegalStateException e7) {
            E3.f.f().e("An error occurred getting battery state.", e7);
        }
        return new C0383e(f7, z7);
    }

    public static Float d(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    public static boolean e(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float b() {
        return this.f2255a;
    }

    public int c() {
        Float f7;
        if (!this.f2256b || (f7 = this.f2255a) == null) {
            return 1;
        }
        return ((double) f7.floatValue()) < 0.99d ? 2 : 3;
    }
}
