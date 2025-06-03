package com.google.firebase.messaging;

import V2.AbstractC0659j;
import V2.InterfaceC0651b;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.google.firebase.messaging.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1124n {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f11797c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static o0 f11798d;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11799a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11800b = new r1.m();

    public C1124n(Context context) {
        this.f11799a = context;
    }

    public static AbstractC0659j e(Context context, Intent intent, boolean z7) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        o0 f7 = f(context, "com.google.firebase.MESSAGING_EVENT");
        if (!z7) {
            return f7.c(intent).g(new r1.m(), new InterfaceC0651b() { // from class: com.google.firebase.messaging.m
                @Override // V2.InterfaceC0651b
                public final Object a(AbstractC0659j abstractC0659j) {
                    Integer g7;
                    g7 = C1124n.g(abstractC0659j);
                    return g7;
                }
            });
        }
        if (Y.b().e(context)) {
            j0.f(context, f7, intent);
        } else {
            f7.c(intent);
        }
        return V2.m.e(-1);
    }

    public static o0 f(Context context, String str) {
        o0 o0Var;
        synchronized (f11797c) {
            try {
                if (f11798d == null) {
                    f11798d = new o0(context, str);
                }
                o0Var = f11798d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return o0Var;
    }

    public static /* synthetic */ Integer g(AbstractC0659j abstractC0659j) {
        return -1;
    }

    public static /* synthetic */ Integer h(Context context, Intent intent) {
        return Integer.valueOf(Y.b().g(context, intent));
    }

    public static /* synthetic */ Integer i(AbstractC0659j abstractC0659j) {
        return 403;
    }

    public static /* synthetic */ AbstractC0659j j(Context context, Intent intent, boolean z7, AbstractC0659j abstractC0659j) {
        return (E2.l.h() && ((Integer) abstractC0659j.j()).intValue() == 402) ? e(context, intent, z7).g(new r1.m(), new InterfaceC0651b() { // from class: com.google.firebase.messaging.l
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j2) {
                Integer i7;
                i7 = C1124n.i(abstractC0659j2);
                return i7;
            }
        }) : abstractC0659j;
    }

    public AbstractC0659j k(Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        return l(this.f11799a, intent);
    }

    public AbstractC0659j l(final Context context, final Intent intent) {
        boolean z7 = E2.l.h() && context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z8 = (intent.getFlags() & 268435456) != 0;
        return (!z7 || z8) ? V2.m.c(this.f11800b, new Callable() { // from class: com.google.firebase.messaging.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Integer h7;
                h7 = C1124n.h(context, intent);
                return h7;
            }
        }).h(this.f11800b, new InterfaceC0651b() { // from class: com.google.firebase.messaging.k
            @Override // V2.InterfaceC0651b
            public final Object a(AbstractC0659j abstractC0659j) {
                AbstractC0659j j7;
                j7 = C1124n.j(context, intent, z8, abstractC0659j);
                return j7;
            }
        }) : e(context, intent, z8);
    }
}
