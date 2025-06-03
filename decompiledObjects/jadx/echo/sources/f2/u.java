package f2;

import android.content.Context;
import c2.C0819b;
import java.util.Collections;
import java.util.Set;
import l2.InterfaceC1602e;
import p2.InterfaceC1791a;

/* loaded from: classes.dex */
public class u implements t {

    /* renamed from: e, reason: collision with root package name */
    public static volatile v f14227e;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC1791a f14228a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1791a f14229b;

    /* renamed from: c, reason: collision with root package name */
    public final InterfaceC1602e f14230c;

    /* renamed from: d, reason: collision with root package name */
    public final m2.r f14231d;

    public u(InterfaceC1791a interfaceC1791a, InterfaceC1791a interfaceC1791a2, InterfaceC1602e interfaceC1602e, m2.r rVar, m2.v vVar) {
        this.f14228a = interfaceC1791a;
        this.f14229b = interfaceC1791a2;
        this.f14230c = interfaceC1602e;
        this.f14231d = rVar;
        vVar.c();
    }

    public static u c() {
        v vVar = f14227e;
        if (vVar != null) {
            return vVar.b();
        }
        throw new IllegalStateException("Not initialized!");
    }

    public static Set d(f fVar) {
        return fVar instanceof g ? Collections.unmodifiableSet(((g) fVar).a()) : Collections.singleton(C0819b.b("proto"));
    }

    public static void f(Context context) {
        if (f14227e == null) {
            synchronized (u.class) {
                try {
                    if (f14227e == null) {
                        f14227e = e.c().b(context).a();
                    }
                } finally {
                }
            }
        }
    }

    @Override // f2.t
    public void a(o oVar, c2.h hVar) {
        this.f14230c.a(oVar.f().f(oVar.c().c()), b(oVar), hVar);
    }

    public final i b(o oVar) {
        return i.a().i(this.f14228a.a()).k(this.f14229b.a()).j(oVar.g()).h(new h(oVar.b(), oVar.d())).g(oVar.c().a()).d();
    }

    public m2.r e() {
        return this.f14231d;
    }

    public c2.g g(f fVar) {
        return new q(d(fVar), p.a().b(fVar.d()).c(fVar.r()).a(), this);
    }
}
