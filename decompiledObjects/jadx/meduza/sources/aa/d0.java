package aa;

import android.content.Context;
import android.util.Log;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: e, reason: collision with root package name */
    public static d0 f275e;

    /* renamed from: a, reason: collision with root package name */
    public String f276a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f277b = null;

    /* renamed from: c, reason: collision with root package name */
    public Boolean f278c = null;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f279d = new ArrayDeque();

    public static synchronized d0 a() {
        d0 d0Var;
        synchronized (d0.class) {
            if (f275e == null) {
                f275e = new d0();
            }
            d0Var = f275e;
        }
        return d0Var;
    }

    public final boolean b(Context context) {
        if (this.f278c == null) {
            this.f278c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f277b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f278c.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f277b == null) {
            this.f277b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f277b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f277b.booleanValue();
    }
}
