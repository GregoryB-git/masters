package r9;

import android.content.Context;
import android.util.Log;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: c, reason: collision with root package name */
    public static j f13830c;

    /* renamed from: a, reason: collision with root package name */
    public Boolean f13831a = null;

    /* renamed from: b, reason: collision with root package name */
    public Boolean f13832b = null;

    public static synchronized j a() {
        j jVar;
        synchronized (j.class) {
            if (f13830c == null) {
                f13830c = new j();
            }
            jVar = f13830c;
        }
        return jVar;
    }

    public final boolean b(Context context) {
        if (this.f13832b == null) {
            this.f13832b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f13831a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13832b.booleanValue();
    }

    public final boolean c(Context context) {
        if (this.f13831a == null) {
            this.f13831a = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f13831a.booleanValue() && Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f13831a.booleanValue();
    }
}
