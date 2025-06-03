package V3;

import a4.C0747c;
import a4.C0748d;
import a4.InterfaceC0749e;

/* loaded from: classes.dex */
public class D extends AbstractC0669h {

    /* renamed from: d, reason: collision with root package name */
    public final m f6480d;

    /* renamed from: e, reason: collision with root package name */
    public final Q3.s f6481e;

    /* renamed from: f, reason: collision with root package name */
    public final a4.i f6482f;

    public D(m mVar, Q3.s sVar, a4.i iVar) {
        this.f6480d = mVar;
        this.f6481e = sVar;
        this.f6482f = iVar;
    }

    @Override // V3.AbstractC0669h
    public AbstractC0669h a(a4.i iVar) {
        return new D(this.f6480d, this.f6481e, iVar);
    }

    @Override // V3.AbstractC0669h
    public C0748d b(C0747c c0747c, a4.i iVar) {
        return new C0748d(InterfaceC0749e.a.VALUE, this, Q3.k.a(Q3.k.c(this.f6480d, iVar.e()), c0747c.k()), null);
    }

    @Override // V3.AbstractC0669h
    public void c(Q3.c cVar) {
        this.f6481e.a(cVar);
    }

    @Override // V3.AbstractC0669h
    public void d(C0748d c0748d) {
        if (h()) {
            return;
        }
        this.f6481e.b(c0748d.e());
    }

    @Override // V3.AbstractC0669h
    public a4.i e() {
        return this.f6482f;
    }

    public boolean equals(Object obj) {
        if (obj instanceof D) {
            D d7 = (D) obj;
            if (d7.f6481e.equals(this.f6481e) && d7.f6480d.equals(this.f6480d) && d7.f6482f.equals(this.f6482f)) {
                return true;
            }
        }
        return false;
    }

    @Override // V3.AbstractC0669h
    public boolean f(AbstractC0669h abstractC0669h) {
        return (abstractC0669h instanceof D) && ((D) abstractC0669h).f6481e.equals(this.f6481e);
    }

    public int hashCode() {
        return (((this.f6481e.hashCode() * 31) + this.f6480d.hashCode()) * 31) + this.f6482f.hashCode();
    }

    @Override // V3.AbstractC0669h
    public boolean i(InterfaceC0749e.a aVar) {
        return aVar == InterfaceC0749e.a.VALUE;
    }

    public String toString() {
        return "ValueEventRegistration";
    }
}
