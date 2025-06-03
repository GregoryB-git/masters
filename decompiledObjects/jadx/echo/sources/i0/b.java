package i0;

import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class b implements g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14631a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f14632b = new ArrayList(1);

    /* renamed from: c, reason: collision with root package name */
    public int f14633c;

    /* renamed from: d, reason: collision with root package name */
    public k f14634d;

    public b(boolean z7) {
        this.f14631a = z7;
    }

    @Override // i0.g
    public final void c(y yVar) {
        AbstractC1297a.e(yVar);
        if (this.f14632b.contains(yVar)) {
            return;
        }
        this.f14632b.add(yVar);
        this.f14633c++;
    }

    @Override // i0.g
    public /* synthetic */ Map g() {
        return f.a(this);
    }

    public final void q(int i7) {
        k kVar = (k) M.i(this.f14634d);
        for (int i8 = 0; i8 < this.f14633c; i8++) {
            ((y) this.f14632b.get(i8)).e(this, kVar, this.f14631a, i7);
        }
    }

    public final void r() {
        k kVar = (k) M.i(this.f14634d);
        for (int i7 = 0; i7 < this.f14633c; i7++) {
            ((y) this.f14632b.get(i7)).h(this, kVar, this.f14631a);
        }
        this.f14634d = null;
    }

    public final void s(k kVar) {
        for (int i7 = 0; i7 < this.f14633c; i7++) {
            ((y) this.f14632b.get(i7)).f(this, kVar, this.f14631a);
        }
    }

    public final void t(k kVar) {
        this.f14634d = kVar;
        for (int i7 = 0; i7 < this.f14633c; i7++) {
            ((y) this.f14632b.get(i7)).g(this, kVar, this.f14631a);
        }
    }
}
