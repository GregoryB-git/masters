package e7;

import android.content.Context;
import android.content.Intent;
import e7.o5;

/* loaded from: classes.dex */
public final class m5<T extends Context & o5> {

    /* renamed from: a, reason: collision with root package name */
    public final T f4496a;

    public m5(T t) {
        m6.j.i(t);
        this.f4496a = t;
    }

    public final void a(Intent intent) {
        if (intent == null) {
            b().f4060o.b("onRebind called with null intent");
        } else {
            b().f4067w.c("onRebind called. action", intent.getAction());
        }
    }

    public final a1 b() {
        return j2.a(this.f4496a, null, null).zzj();
    }

    public final void c(Intent intent) {
        if (intent == null) {
            b().f4060o.b("onUnbind called with null intent");
        } else {
            b().f4067w.c("onUnbind called for intent. action", intent.getAction());
        }
    }
}
