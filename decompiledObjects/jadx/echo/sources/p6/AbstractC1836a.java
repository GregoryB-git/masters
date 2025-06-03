package p6;

/* renamed from: p6.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1836a extends x0 implements InterfaceC1869q0, X5.d, I {

    /* renamed from: q, reason: collision with root package name */
    public final X5.g f18519q;

    public AbstractC1836a(X5.g gVar, boolean z7, boolean z8) {
        super(z8);
        if (z7) {
            e0((InterfaceC1869q0) gVar.b(InterfaceC1869q0.f18550n));
        }
        this.f18519q = gVar.k(this);
    }

    public void G0(Object obj) {
        F(obj);
    }

    public final void J0(K k7, Object obj, g6.p pVar) {
        k7.e(pVar, obj, this);
    }

    @Override // p6.x0
    public String N() {
        return M.a(this) + " was cancelled";
    }

    @Override // p6.x0, p6.InterfaceC1869q0
    public boolean a() {
        return super.a();
    }

    @Override // p6.x0
    public final void d0(Throwable th) {
        H.a(this.f18519q, th);
    }

    @Override // p6.I
    public X5.g f() {
        return this.f18519q;
    }

    @Override // X5.d
    public final X5.g getContext() {
        return this.f18519q;
    }

    @Override // p6.x0
    public String l0() {
        String b7 = E.b(this.f18519q);
        if (b7 == null) {
            return super.l0();
        }
        return '\"' + b7 + "\":" + super.l0();
    }

    @Override // p6.x0
    public final void q0(Object obj) {
        if (!(obj instanceof C1877z)) {
            I0(obj);
        } else {
            C1877z c1877z = (C1877z) obj;
            H0(c1877z.f18582a, c1877z.a());
        }
    }

    @Override // X5.d
    public final void resumeWith(Object obj) {
        Object j02 = j0(D.d(obj, null, 1, null));
        if (j02 == y0.f18575b) {
            return;
        }
        G0(j02);
    }

    public void I0(Object obj) {
    }

    public void H0(Throwable th, boolean z7) {
    }
}
