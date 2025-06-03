package j9;

import ka.d0;

/* loaded from: classes.dex */
public final class m implements g {

    /* renamed from: b, reason: collision with root package name */
    public final i f8693b;

    /* renamed from: c, reason: collision with root package name */
    public int f8694c;

    /* renamed from: d, reason: collision with root package name */
    public q f8695d;

    /* renamed from: e, reason: collision with root package name */
    public q f8696e;
    public n f;

    /* renamed from: g, reason: collision with root package name */
    public int f8697g;

    public m(i iVar) {
        this.f8693b = iVar;
        this.f8696e = q.f8701b;
    }

    public m(i iVar, int i10, q qVar, q qVar2, n nVar, int i11) {
        this.f8693b = iVar;
        this.f8695d = qVar;
        this.f8696e = qVar2;
        this.f8694c = i10;
        this.f8697g = i11;
        this.f = nVar;
    }

    public static m m(i iVar) {
        q qVar = q.f8701b;
        return new m(iVar, 1, qVar, qVar, new n(), 3);
    }

    public static m n(i iVar, q qVar) {
        m mVar = new m(iVar);
        mVar.l(qVar);
        return mVar;
    }

    @Override // j9.g
    public final m a() {
        return new m(this.f8693b, this.f8694c, this.f8695d, this.f8696e, new n(this.f.b()), this.f8697g);
    }

    @Override // j9.g
    public final boolean b() {
        return q0.g.b(this.f8694c, 2);
    }

    @Override // j9.g
    public final boolean c() {
        return q0.g.b(this.f8697g, 2);
    }

    @Override // j9.g
    public final boolean d() {
        return q0.g.b(this.f8697g, 1);
    }

    @Override // j9.g
    public final boolean e() {
        return d() || c();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f8693b.equals(mVar.f8693b) && this.f8695d.equals(mVar.f8695d) && q0.g.b(this.f8694c, mVar.f8694c) && q0.g.b(this.f8697g, mVar.f8697g)) {
            return this.f.equals(mVar.f);
        }
        return false;
    }

    @Override // j9.g
    public final q f() {
        return this.f8696e;
    }

    @Override // j9.g
    public final d0 g(l lVar) {
        return n.d(lVar, this.f.b());
    }

    @Override // j9.g
    public final n getData() {
        return this.f;
    }

    @Override // j9.g
    public final i getKey() {
        return this.f8693b;
    }

    @Override // j9.g
    public final boolean h() {
        return q0.g.b(this.f8694c, 3);
    }

    public final int hashCode() {
        return this.f8693b.hashCode();
    }

    @Override // j9.g
    public final boolean i() {
        return q0.g.b(this.f8694c, 4);
    }

    @Override // j9.g
    public final q j() {
        return this.f8695d;
    }

    public final void k(q qVar, n nVar) {
        this.f8695d = qVar;
        this.f8694c = 2;
        this.f = nVar;
        this.f8697g = 3;
    }

    public final void l(q qVar) {
        this.f8695d = qVar;
        this.f8694c = 3;
        this.f = new n();
        this.f8697g = 3;
    }

    public final String toString() {
        StringBuilder l10 = defpackage.f.l("Document{key=");
        l10.append(this.f8693b);
        l10.append(", version=");
        l10.append(this.f8695d);
        l10.append(", readTime=");
        l10.append(this.f8696e);
        l10.append(", type=");
        l10.append(a0.j.v(this.f8694c));
        l10.append(", documentState=");
        l10.append(defpackage.g.q(this.f8697g));
        l10.append(", value=");
        l10.append(this.f);
        l10.append('}');
        return l10.toString();
    }
}
