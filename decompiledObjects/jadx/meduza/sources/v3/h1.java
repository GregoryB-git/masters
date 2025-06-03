package v3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h1 extends a {
    public final int f;

    /* renamed from: o, reason: collision with root package name */
    public final int f15401o;

    /* renamed from: p, reason: collision with root package name */
    public final int[] f15402p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f15403q;

    /* renamed from: r, reason: collision with root package name */
    public final r1[] f15404r;

    /* renamed from: s, reason: collision with root package name */
    public final Object[] f15405s;
    public final HashMap<Object, Integer> t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(List list, z4.e0 e0Var) {
        super(false, e0Var);
        int i10 = 0;
        int size = list.size();
        this.f15402p = new int[size];
        this.f15403q = new int[size];
        this.f15404r = new r1[size];
        this.f15405s = new Object[size];
        this.t = new HashMap<>();
        Iterator it = list.iterator();
        int i11 = 0;
        int i12 = 0;
        while (it.hasNext()) {
            t0 t0Var = (t0) it.next();
            this.f15404r[i12] = t0Var.b();
            this.f15403q[i12] = i10;
            this.f15402p[i12] = i11;
            i10 += this.f15404r[i12].o();
            i11 += this.f15404r[i12].h();
            this.f15405s[i12] = t0Var.a();
            this.t.put(this.f15405s[i12], Integer.valueOf(i12));
            i12++;
        }
        this.f = i10;
        this.f15401o = i11;
    }

    @Override // v3.r1
    public final int h() {
        return this.f15401o;
    }

    @Override // v3.r1
    public final int o() {
        return this.f;
    }

    @Override // v3.a
    public final int q(Object obj) {
        Integer num = this.t.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // v3.a
    public final int r(int i10) {
        return v5.e0.e(this.f15402p, i10 + 1, false, false);
    }

    @Override // v3.a
    public final int s(int i10) {
        return v5.e0.e(this.f15403q, i10 + 1, false, false);
    }

    @Override // v3.a
    public final Object t(int i10) {
        return this.f15405s[i10];
    }

    @Override // v3.a
    public final int u(int i10) {
        return this.f15402p[i10];
    }

    @Override // v3.a
    public final int v(int i10) {
        return this.f15403q[i10];
    }

    @Override // v3.a
    public final r1 x(int i10) {
        return this.f15404r[i10];
    }
}
