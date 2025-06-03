package k1;

import c1.k;
import f0.C1280a;
import g0.AbstractC1297a;
import g0.M;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* renamed from: k1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1459j implements k {

    /* renamed from: o, reason: collision with root package name */
    public final List f16131o;

    /* renamed from: p, reason: collision with root package name */
    public final long[] f16132p;

    /* renamed from: q, reason: collision with root package name */
    public final long[] f16133q;

    public C1459j(List list) {
        this.f16131o = Collections.unmodifiableList(new ArrayList(list));
        this.f16132p = new long[list.size() * 2];
        for (int i7 = 0; i7 < list.size(); i7++) {
            C1453d c1453d = (C1453d) list.get(i7);
            int i8 = i7 * 2;
            long[] jArr = this.f16132p;
            jArr[i8] = c1453d.f16102b;
            jArr[i8 + 1] = c1453d.f16103c;
        }
        long[] jArr2 = this.f16132p;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f16133q = copyOf;
        Arrays.sort(copyOf);
    }

    public static /* synthetic */ int b(C1453d c1453d, C1453d c1453d2) {
        return Long.compare(c1453d.f16102b, c1453d2.f16102b);
    }

    @Override // c1.k
    public int c(long j7) {
        int d7 = M.d(this.f16133q, j7, false, false);
        if (d7 < this.f16133q.length) {
            return d7;
        }
        return -1;
    }

    @Override // c1.k
    public long e(int i7) {
        AbstractC1297a.a(i7 >= 0);
        AbstractC1297a.a(i7 < this.f16133q.length);
        return this.f16133q[i7];
    }

    @Override // c1.k
    public List h(long j7) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < this.f16131o.size(); i7++) {
            long[] jArr = this.f16132p;
            int i8 = i7 * 2;
            if (jArr[i8] <= j7 && j7 < jArr[i8 + 1]) {
                C1453d c1453d = (C1453d) this.f16131o.get(i7);
                C1280a c1280a = c1453d.f16101a;
                if (c1280a.f14086e == -3.4028235E38f) {
                    arrayList2.add(c1453d);
                } else {
                    arrayList.add(c1280a);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: k1.i
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int b7;
                b7 = C1459j.b((C1453d) obj, (C1453d) obj2);
                return b7;
            }
        });
        for (int i9 = 0; i9 < arrayList2.size(); i9++) {
            arrayList.add(((C1453d) arrayList2.get(i9)).f16101a.a().h((-1) - i9, 1).a());
        }
        return arrayList;
    }

    @Override // c1.k
    public int j() {
        return this.f16133q.length;
    }
}
