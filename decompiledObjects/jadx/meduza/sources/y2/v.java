package y2;

import android.content.Context;
import android.os.PowerManager;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final String f17406a;

    static {
        String f = o2.j.f("WakeLocks");
        ec.i.d(f, "tagWithPrefix(\"WakeLocks\")");
        f17406a = f;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        ec.i.e(context, "context");
        ec.i.e(str, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        ec.i.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String d10 = defpackage.g.d("WorkManager: ", str);
        PowerManager.WakeLock newWakeLock = ((PowerManager) systemService).newWakeLock(1, d10);
        synchronized (w.f17407a) {
            w.f17408b.put(newWakeLock, d10);
        }
        ec.i.d(newWakeLock, "wakeLock");
        return newWakeLock;
    }
}
