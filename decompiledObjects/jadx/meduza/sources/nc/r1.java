package nc;

/* loaded from: classes.dex */
public final class r1 extends z1 {

    /* renamed from: d, reason: collision with root package name */
    public final ub.e<rb.h> f11547d;

    public r1(ub.h hVar, dc.p<? super d0, ? super ub.e<? super rb.h>, ? extends Object> pVar) {
        super(hVar, false);
        this.f11547d = p2.m0.u(this, this, pVar);
    }

    @Override // nc.o1
    public final void S() {
        try {
            b.a0.C(p2.m0.P(this.f11547d), rb.h.f13851a, null);
        } catch (Throwable th) {
            resumeWith(rb.f.a(th));
            throw th;
        }
    }
}
