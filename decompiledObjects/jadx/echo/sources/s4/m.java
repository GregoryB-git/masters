package s4;

import V2.C0660k;

/* loaded from: classes.dex */
public class m implements p {

    /* renamed from: a, reason: collision with root package name */
    public final C0660k f19307a;

    public m(C0660k c0660k) {
        this.f19307a = c0660k;
    }

    @Override // s4.p
    public boolean a(Exception exc) {
        return false;
    }

    @Override // s4.p
    public boolean b(u4.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f19307a.e(dVar.d());
        return true;
    }
}
