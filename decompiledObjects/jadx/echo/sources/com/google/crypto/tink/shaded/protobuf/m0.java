package com.google.crypto.tink.shaded.protobuf;

/* loaded from: classes.dex */
public class m0 extends k0 {
    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public l0 g(Object obj) {
        return ((AbstractC1108x) obj).unknownFields;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(l0 l0Var) {
        return l0Var.d();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(l0 l0Var) {
        return l0Var.e();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public l0 k(l0 l0Var, l0 l0Var2) {
        return l0.c().equals(l0Var2) ? l0Var : l0.c().equals(l0Var) ? l0.j(l0Var, l0Var2) : l0Var.i(l0Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public l0 n() {
        return l0.k();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, l0 l0Var) {
        p(obj, l0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, l0 l0Var) {
        ((AbstractC1108x) obj).unknownFields = l0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public l0 r(l0 l0Var) {
        l0Var.h();
        return l0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(l0 l0Var, r0 r0Var) {
        l0Var.p(r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(l0 l0Var, r0 r0Var) {
        l0Var.r(r0Var);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public void j(Object obj) {
        g(obj).h();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    public boolean q(d0 d0Var) {
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(l0 l0Var, int i7, int i8) {
        l0Var.n(q0.c(i7, 5), Integer.valueOf(i8));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(l0 l0Var, int i7, long j7) {
        l0Var.n(q0.c(i7, 1), Long.valueOf(j7));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(l0 l0Var, int i7, l0 l0Var2) {
        l0Var.n(q0.c(i7, 3), l0Var2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(l0 l0Var, int i7, AbstractC1093h abstractC1093h) {
        l0Var.n(q0.c(i7, 2), abstractC1093h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(l0 l0Var, int i7, long j7) {
        l0Var.n(q0.c(i7, 0), Long.valueOf(j7));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.k0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public l0 f(Object obj) {
        l0 g7 = g(obj);
        if (g7 != l0.c()) {
            return g7;
        }
        l0 k7 = l0.k();
        p(obj, k7);
        return k7;
    }
}
