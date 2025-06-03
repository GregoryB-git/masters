package s4;

import V2.C0660k;

/* loaded from: classes.dex */
public class l implements p {

    /* renamed from: a, reason: collision with root package name */
    public final q f19305a;

    /* renamed from: b, reason: collision with root package name */
    public final C0660k f19306b;

    public l(q qVar, C0660k c0660k) {
        this.f19305a = qVar;
        this.f19306b = c0660k;
    }

    @Override // s4.p
    public boolean a(Exception exc) {
        this.f19306b.d(exc);
        return true;
    }

    @Override // s4.p
    public boolean b(u4.d dVar) {
        if (!dVar.k() || this.f19305a.f(dVar)) {
            return false;
        }
        this.f19306b.c(n.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
