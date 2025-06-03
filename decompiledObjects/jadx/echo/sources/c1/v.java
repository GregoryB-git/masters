package c1;

import F0.InterfaceC0374t;
import F0.M;
import F0.T;
import android.util.SparseArray;
import c1.t;

/* loaded from: classes.dex */
public final class v implements InterfaceC0374t {

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0374t f10053o;

    /* renamed from: p, reason: collision with root package name */
    public final t.a f10054p;

    /* renamed from: q, reason: collision with root package name */
    public final SparseArray f10055q = new SparseArray();

    public v(InterfaceC0374t interfaceC0374t, t.a aVar) {
        this.f10053o = interfaceC0374t;
        this.f10054p = aVar;
    }

    @Override // F0.InterfaceC0374t
    public T a(int i7, int i8) {
        if (i8 != 3) {
            return this.f10053o.a(i7, i8);
        }
        x xVar = (x) this.f10055q.get(i7);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this.f10053o.a(i7, i8), this.f10054p);
        this.f10055q.put(i7, xVar2);
        return xVar2;
    }

    public void b() {
        for (int i7 = 0; i7 < this.f10055q.size(); i7++) {
            ((x) this.f10055q.valueAt(i7)).k();
        }
    }

    @Override // F0.InterfaceC0374t
    public void e(M m7) {
        this.f10053o.e(m7);
    }

    @Override // F0.InterfaceC0374t
    public void j() {
        this.f10053o.j();
    }
}
