package com.google.protobuf;

/* loaded from: classes.dex */
public class i0 extends g0 {
    @Override // com.google.protobuf.g0
    public void d(Object obj) {
        a(obj).h();
    }

    @Override // com.google.protobuf.g0
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public h0 a(Object obj) {
        return ((r) obj).unknownFields;
    }

    @Override // com.google.protobuf.g0
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public int b(h0 h0Var) {
        return h0Var.d();
    }

    @Override // com.google.protobuf.g0
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public int c(h0 h0Var) {
        return h0Var.e();
    }

    @Override // com.google.protobuf.g0
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public h0 e(h0 h0Var, h0 h0Var2) {
        return h0.c().equals(h0Var2) ? h0Var : h0.c().equals(h0Var) ? h0.j(h0Var, h0Var2) : h0Var.i(h0Var2);
    }

    @Override // com.google.protobuf.g0
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void f(Object obj, h0 h0Var) {
        ((r) obj).unknownFields = h0Var;
    }

    @Override // com.google.protobuf.g0
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void g(h0 h0Var, n0 n0Var) {
        h0Var.n(n0Var);
    }

    @Override // com.google.protobuf.g0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void h(h0 h0Var, n0 n0Var) {
        h0Var.p(n0Var);
    }
}
