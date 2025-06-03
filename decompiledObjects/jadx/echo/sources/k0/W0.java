package k0;

import d0.AbstractC1170I;
import d0.C1178a;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import x0.AbstractC2135p;

/* loaded from: classes.dex */
public final class W0 extends AbstractC1399a {

    /* renamed from: h, reason: collision with root package name */
    public final int f15667h;

    /* renamed from: i, reason: collision with root package name */
    public final int f15668i;

    /* renamed from: j, reason: collision with root package name */
    public final int[] f15669j;

    /* renamed from: k, reason: collision with root package name */
    public final int[] f15670k;

    /* renamed from: l, reason: collision with root package name */
    public final AbstractC1170I[] f15671l;

    /* renamed from: m, reason: collision with root package name */
    public final Object[] f15672m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f15673n;

    public class a extends AbstractC2135p {

        /* renamed from: f, reason: collision with root package name */
        public final AbstractC1170I.c f15674f;

        public a(AbstractC1170I abstractC1170I) {
            super(abstractC1170I);
            this.f15674f = new AbstractC1170I.c();
        }

        @Override // x0.AbstractC2135p, d0.AbstractC1170I
        public AbstractC1170I.b g(int i7, AbstractC1170I.b bVar, boolean z7) {
            AbstractC1170I.b g7 = super.g(i7, bVar, z7);
            if (super.n(g7.f12399c, this.f15674f).f()) {
                g7.t(bVar.f12397a, bVar.f12398b, bVar.f12399c, bVar.f12400d, bVar.f12401e, C1178a.f12564g, true);
            } else {
                g7.f12402f = true;
            }
            return g7;
        }
    }

    public W0(Collection collection, x0.T t7) {
        this(G(collection), H(collection), t7);
    }

    public static AbstractC1170I[] G(Collection collection) {
        AbstractC1170I[] abstractC1170IArr = new AbstractC1170I[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            abstractC1170IArr[i7] = ((F0) it.next()).b();
            i7++;
        }
        return abstractC1170IArr;
    }

    public static Object[] H(Collection collection) {
        Object[] objArr = new Object[collection.size()];
        Iterator it = collection.iterator();
        int i7 = 0;
        while (it.hasNext()) {
            objArr[i7] = ((F0) it.next()).a();
            i7++;
        }
        return objArr;
    }

    @Override // k0.AbstractC1399a
    public int A(int i7) {
        return this.f15670k[i7];
    }

    @Override // k0.AbstractC1399a
    public AbstractC1170I D(int i7) {
        return this.f15671l[i7];
    }

    public W0 E(x0.T t7) {
        AbstractC1170I[] abstractC1170IArr = new AbstractC1170I[this.f15671l.length];
        int i7 = 0;
        while (true) {
            AbstractC1170I[] abstractC1170IArr2 = this.f15671l;
            if (i7 >= abstractC1170IArr2.length) {
                return new W0(abstractC1170IArr, this.f15672m, t7);
            }
            abstractC1170IArr[i7] = new a(abstractC1170IArr2[i7]);
            i7++;
        }
    }

    public List F() {
        return Arrays.asList(this.f15671l);
    }

    @Override // d0.AbstractC1170I
    public int i() {
        return this.f15668i;
    }

    @Override // d0.AbstractC1170I
    public int p() {
        return this.f15667h;
    }

    @Override // k0.AbstractC1399a
    public int s(Object obj) {
        Integer num = (Integer) this.f15673n.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // k0.AbstractC1399a
    public int t(int i7) {
        return g0.M.g(this.f15669j, i7 + 1, false, false);
    }

    @Override // k0.AbstractC1399a
    public int u(int i7) {
        return g0.M.g(this.f15670k, i7 + 1, false, false);
    }

    @Override // k0.AbstractC1399a
    public Object x(int i7) {
        return this.f15672m[i7];
    }

    @Override // k0.AbstractC1399a
    public int z(int i7) {
        return this.f15669j[i7];
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W0(AbstractC1170I[] abstractC1170IArr, Object[] objArr, x0.T t7) {
        super(false, t7);
        int i7 = 0;
        int length = abstractC1170IArr.length;
        this.f15671l = abstractC1170IArr;
        this.f15669j = new int[length];
        this.f15670k = new int[length];
        this.f15672m = objArr;
        this.f15673n = new HashMap();
        int length2 = abstractC1170IArr.length;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        while (i7 < length2) {
            AbstractC1170I abstractC1170I = abstractC1170IArr[i7];
            this.f15671l[i10] = abstractC1170I;
            this.f15670k[i10] = i8;
            this.f15669j[i10] = i9;
            i8 += abstractC1170I.p();
            i9 += this.f15671l[i10].i();
            this.f15673n.put(objArr[i10], Integer.valueOf(i10));
            i7++;
            i10++;
        }
        this.f15667h = i8;
        this.f15668i = i9;
    }
}
