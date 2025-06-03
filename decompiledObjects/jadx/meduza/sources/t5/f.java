package t5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f14488a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<l0> f14489b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f14490c;

    /* renamed from: d, reason: collision with root package name */
    public n f14491d;

    public f(boolean z10) {
        this.f14488a = z10;
    }

    @Override // t5.k
    public final void f(l0 l0Var) {
        l0Var.getClass();
        if (this.f14489b.contains(l0Var)) {
            return;
        }
        this.f14489b.add(l0Var);
        this.f14490c++;
    }

    @Override // t5.k
    public Map h() {
        return Collections.emptyMap();
    }

    public final void o(int i10) {
        n nVar = this.f14491d;
        int i11 = v5.e0.f15881a;
        for (int i12 = 0; i12 < this.f14490c; i12++) {
            this.f14489b.get(i12).a(nVar, this.f14488a, i10);
        }
    }

    public final void p() {
        n nVar = this.f14491d;
        int i10 = v5.e0.f15881a;
        for (int i11 = 0; i11 < this.f14490c; i11++) {
            this.f14489b.get(i11).h(nVar, this.f14488a);
        }
        this.f14491d = null;
    }

    public final void q(n nVar) {
        for (int i10 = 0; i10 < this.f14490c; i10++) {
            this.f14489b.get(i10).d();
        }
    }

    public final void r(n nVar) {
        this.f14491d = nVar;
        for (int i10 = 0; i10 < this.f14490c; i10++) {
            this.f14489b.get(i10).i(nVar, this.f14488a);
        }
    }
}
