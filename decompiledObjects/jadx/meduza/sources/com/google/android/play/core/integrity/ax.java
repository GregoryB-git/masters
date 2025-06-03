package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class ax {

    /* renamed from: a, reason: collision with root package name */
    private static aw f2961a;

    public static synchronized aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            if (f2961a == null) {
                u uVar = new u(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                uVar.a(context);
                f2961a = uVar.b();
            }
            awVar = f2961a;
        }
        return awVar;
    }
}
