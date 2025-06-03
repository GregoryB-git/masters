package t2;

import ec.i;
import nc.a0;
import nc.e0;
import nc.m1;
import o2.j;
import ub.h;
import x2.s;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f14431a;

    static {
        String f = j.f("WorkConstraintsTracker");
        i.d(f, "tagWithPrefix(\"WorkConstraintsTracker\")");
        f14431a = f;
    }

    public static final m1 a(e eVar, s sVar, a0 a0Var, d dVar) {
        i.e(eVar, "<this>");
        i.e(a0Var, "dispatcher");
        i.e(dVar, "listener");
        m1 m1Var = new m1(null);
        x6.b.g0(e0.a(h.a.a(a0Var, m1Var)), null, new g(eVar, sVar, dVar, null), 3);
        return m1Var;
    }
}
