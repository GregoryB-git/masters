package x6;

import android.content.Context;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public static final d f17199b = new d();

    /* renamed from: a, reason: collision with root package name */
    public c f17200a = null;

    public static c a(Context context) {
        c cVar;
        d dVar = f17199b;
        synchronized (dVar) {
            if (dVar.f17200a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                dVar.f17200a = new c(context);
            }
            cVar = dVar.f17200a;
        }
        return cVar;
    }
}
