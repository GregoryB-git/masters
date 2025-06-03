package androidx.datastore.preferences.protobuf;

/* loaded from: classes.dex */
public class n0 extends l0 {
    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public m0 g(Object obj) {
        return ((AbstractC0775w) obj).unknownFields;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public int h(m0 m0Var) {
        return m0Var.f();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public int i(m0 m0Var) {
        return m0Var.g();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public m0 k(m0 m0Var, m0 m0Var2) {
        return m0Var2.equals(m0.e()) ? m0Var : m0.k(m0Var, m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public m0 n() {
        return m0.l();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(Object obj, m0 m0Var) {
        p(obj, m0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void p(Object obj, m0 m0Var) {
        ((AbstractC0775w) obj).unknownFields = m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m0 r(m0 m0Var) {
        m0Var.j();
        return m0Var;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public void s(m0 m0Var, s0 s0Var) {
        m0Var.o(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public void t(m0 m0Var, s0 s0Var) {
        m0Var.q(s0Var);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public void j(Object obj) {
        g(obj).j();
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    public boolean q(d0 d0Var) {
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public void a(m0 m0Var, int i7, int i8) {
        m0Var.n(r0.c(i7, 5), Integer.valueOf(i8));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public void b(m0 m0Var, int i7, long j7) {
        m0Var.n(r0.c(i7, 1), Long.valueOf(j7));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public void c(m0 m0Var, int i7, m0 m0Var2) {
        m0Var.n(r0.c(i7, 3), m0Var2);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public void d(m0 m0Var, int i7, AbstractC0760g abstractC0760g) {
        m0Var.n(r0.c(i7, 2), abstractC0760g);
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void e(m0 m0Var, int i7, long j7) {
        m0Var.n(r0.c(i7, 0), Long.valueOf(j7));
    }

    @Override // androidx.datastore.preferences.protobuf.l0
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public m0 f(Object obj) {
        m0 g7 = g(obj);
        if (g7 != m0.e()) {
            return g7;
        }
        m0 l7 = m0.l();
        p(obj, l7);
        return l7;
    }
}
