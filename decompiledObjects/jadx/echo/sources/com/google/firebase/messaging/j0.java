package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.InterfaceC0654e;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public abstract class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f11788a = TimeUnit.MINUTES.toMillis(1);

    /* renamed from: b, reason: collision with root package name */
    public static final Object f11789b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static U2.a f11790c;

    public static void b(Context context) {
        if (f11790c == null) {
            U2.a aVar = new U2.a(context, 1, "wake:com.google.firebase.iid.WakeLockHolder");
            f11790c = aVar;
            aVar.d(true);
        }
    }

    public static void c(Intent intent) {
        synchronized (f11789b) {
            try {
                if (f11790c != null && d(intent)) {
                    g(intent, false);
                    f11790c.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
    }

    public static void f(Context context, o0 o0Var, final Intent intent) {
        synchronized (f11789b) {
            try {
                b(context);
                boolean d7 = d(intent);
                g(intent, true);
                if (!d7) {
                    f11790c.a(f11788a);
                }
                o0Var.c(intent).b(new InterfaceC0654e() { // from class: com.google.firebase.messaging.i0
                    @Override // V2.InterfaceC0654e
                    public final void a(AbstractC0659j abstractC0659j) {
                        j0.c(intent);
                    }
                });
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void g(Intent intent, boolean z7) {
        intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", z7);
    }

    public static ComponentName h(Context context, Intent intent) {
        synchronized (f11789b) {
            try {
                b(context);
                boolean d7 = d(intent);
                g(intent, true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!d7) {
                    f11790c.a(f11788a);
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
