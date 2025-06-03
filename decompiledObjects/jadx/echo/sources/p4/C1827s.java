package p4;

import android.content.Context;
import android.util.Log;

/* renamed from: p4.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1827s {

    /* renamed from: c, reason: collision with root package name */
    public static C1827s f18465c;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f18466a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f18467b = null;

    public static synchronized C1827s a() {
        C1827s c1827s;
        synchronized (C1827s.class) {
            try {
                if (f18465c == null) {
                    f18465c = new C1827s();
                }
                c1827s = f18465c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1827s;
    }

    public boolean b(Context context) {
        if (this.f18467b == null) {
            this.f18467b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f18466a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f18467b.booleanValue();
    }

    public boolean c(Context context) {
        if (this.f18466a == null) {
            this.f18466a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f18466a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f18466a.booleanValue();
    }
}
