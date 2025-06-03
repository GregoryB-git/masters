package s0;

import java.util.Map;
import s0.h0;

/* loaded from: classes.dex */
public final class k0 implements j0 {
    @Override // s0.j0
    public final i0 a(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.f14018a) {
                i0Var = i0Var.d();
            }
            i0Var.c();
            if (!i0Var2.isEmpty()) {
                i0Var.putAll(i0Var2);
            }
        }
        return i0Var;
    }

    @Override // s0.j0
    public final Object b(Object obj) {
        ((i0) obj).f14018a = false;
        return obj;
    }

    @Override // s0.j0
    public final h0.a<?, ?> c(Object obj) {
        return ((h0) obj).f14006a;
    }

    @Override // s0.j0
    public final i0 d() {
        return i0.f14017b.d();
    }

    @Override // s0.j0
    public final i0 e(Object obj) {
        return (i0) obj;
    }

    @Override // s0.j0
    public final int f(int i10, Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        h0 h0Var = (h0) obj2;
        int i11 = 0;
        if (!i0Var.isEmpty()) {
            for (Map.Entry entry : i0Var.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                h0Var.getClass();
                int N = j.N(i10);
                int a10 = h0.a(h0Var.f14006a, key, value);
                i11 += j.P(a10) + a10 + N;
            }
        }
        return i11;
    }

    @Override // s0.j0
    public final boolean g(Object obj) {
        return !((i0) obj).f14018a;
    }

    @Override // s0.j0
    public final i0 h(Object obj) {
        return (i0) obj;
    }
}
