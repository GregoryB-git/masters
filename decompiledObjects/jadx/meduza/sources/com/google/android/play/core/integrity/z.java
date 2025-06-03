package com.google.android.play.core.integrity;

import android.content.Context;

/* loaded from: classes.dex */
final class z {

    /* renamed from: a, reason: collision with root package name */
    private static s f3041a;

    public static synchronized s a(Context context) {
        s sVar;
        synchronized (z.class) {
            if (f3041a == null) {
                q qVar = new q(null);
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                qVar.a(context);
                f3041a = qVar.b();
            }
            sVar = f3041a;
        }
        return sVar;
    }
}
