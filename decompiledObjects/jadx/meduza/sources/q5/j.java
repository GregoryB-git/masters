package q5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import v5.e0;

/* loaded from: classes.dex */
public final class j implements h5.g {

    /* renamed from: a, reason: collision with root package name */
    public final List<e> f13329a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f13330b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f13331c;

    public j(ArrayList arrayList) {
        this.f13329a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f13330b = new long[arrayList.size() * 2];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            e eVar = (e) arrayList.get(i10);
            int i11 = i10 * 2;
            long[] jArr = this.f13330b;
            jArr[i11] = eVar.f13300b;
            jArr[i11 + 1] = eVar.f13301c;
        }
        long[] jArr2 = this.f13330b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f13331c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // h5.g
    public final int f(long j10) {
        int b10 = e0.b(this.f13331c, j10, false);
        if (b10 < this.f13331c.length) {
            return b10;
        }
        return -1;
    }

    @Override // h5.g
    public final long g(int i10) {
        x6.b.q(i10 >= 0);
        x6.b.q(i10 < this.f13331c.length);
        return this.f13331c[i10];
    }

    @Override // h5.g
    public final List<h5.a> h(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f13329a.size(); i10++) {
            long[] jArr = this.f13330b;
            int i11 = i10 * 2;
            if (jArr[i11] <= j10 && j10 < jArr[i11 + 1]) {
                e eVar = this.f13329a.get(i10);
                h5.a aVar = eVar.f13299a;
                if (aVar.f7099e == -3.4028235E38f) {
                    arrayList2.add(eVar);
                } else {
                    arrayList.add(aVar);
                }
            }
        }
        Collections.sort(arrayList2, new i(0));
        for (int i12 = 0; i12 < arrayList2.size(); i12++) {
            h5.a aVar2 = ((e) arrayList2.get(i12)).f13299a;
            aVar2.getClass();
            arrayList.add(new h5.a(aVar2.f7095a, aVar2.f7096b, aVar2.f7097c, aVar2.f7098d, (-1) - i12, 1, aVar2.f7100o, aVar2.f7101p, aVar2.f7102q, aVar2.f7106v, aVar2.f7107w, aVar2.f7103r, aVar2.f7104s, aVar2.t, aVar2.f7105u, aVar2.f7108x, aVar2.f7109y));
        }
        return arrayList;
    }

    @Override // h5.g
    public final int i() {
        return this.f13331c.length;
    }
}
