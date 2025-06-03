package ma;

import java.util.Map;
import ma.l0;

/* loaded from: classes.dex */
public final class o0 implements n0 {
    @Override // ma.n0
    public final m0 a(Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        m0 m0Var2 = (m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.f11056a) {
                m0Var = m0Var.d();
            }
            m0Var.c();
            if (!m0Var2.isEmpty()) {
                m0Var.putAll(m0Var2);
            }
        }
        return m0Var;
    }

    @Override // ma.n0
    public final Object b(Object obj) {
        ((m0) obj).f11056a = false;
        return obj;
    }

    @Override // ma.n0
    public final l0.a<?, ?> c(Object obj) {
        return ((l0) obj).f11030a;
    }

    @Override // ma.n0
    public final m0 d() {
        return m0.f11055b.d();
    }

    @Override // ma.n0
    public final m0 e(Object obj) {
        return (m0) obj;
    }

    @Override // ma.n0
    public final int f(int i10, Object obj, Object obj2) {
        m0 m0Var = (m0) obj;
        l0 l0Var = (l0) obj2;
        int i11 = 0;
        if (!m0Var.isEmpty()) {
            for (Map.Entry entry : m0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                l0Var.getClass();
                int N = k.N(i10);
                int a10 = l0.a(l0Var.f11030a, key, value);
                i11 += k.P(a10) + a10 + N;
            }
        }
        return i11;
    }

    @Override // ma.n0
    public final boolean g(Object obj) {
        return !((m0) obj).f11056a;
    }

    @Override // ma.n0
    public final m0 h(Object obj) {
        return (m0) obj;
    }
}
