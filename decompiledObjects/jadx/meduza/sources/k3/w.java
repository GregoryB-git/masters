package k3;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import k3.j;

/* loaded from: classes.dex */
public final class w implements v {

    /* renamed from: e, reason: collision with root package name */
    public static volatile k f8921e;

    /* renamed from: a, reason: collision with root package name */
    public final t3.a f8922a;

    /* renamed from: b, reason: collision with root package name */
    public final t3.a f8923b;

    /* renamed from: c, reason: collision with root package name */
    public final p3.d f8924c;

    /* renamed from: d, reason: collision with root package name */
    public final q3.k f8925d;

    public w(t3.a aVar, t3.a aVar2, p3.d dVar, q3.k kVar, q3.m mVar) {
        this.f8922a = aVar;
        this.f8923b = aVar2;
        this.f8924c = dVar;
        this.f8925d = kVar;
        mVar.f13271a.execute(new b.k(mVar, 8));
    }

    public static w a() {
        k kVar = f8921e;
        if (kVar != null) {
            return kVar.f.get();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static void b(Context context) {
        if (f8921e == null) {
            synchronized (w.class) {
                if (f8921e == null) {
                    context.getClass();
                    f8921e = new k(context);
                }
            }
        }
    }

    public final t c(i3.a aVar) {
        Set singleton;
        if (aVar instanceof l) {
            aVar.getClass();
            singleton = Collections.unmodifiableSet(i3.a.f7401d);
        } else {
            singleton = Collections.singleton(new h3.c("proto"));
        }
        j.a a10 = s.a();
        aVar.getClass();
        a10.b("cct");
        a10.f8900b = aVar.b();
        return new t(singleton, a10.a(), this);
    }
}
