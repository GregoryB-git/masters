package z4;

import android.util.SparseArray;
import z4.b0;

/* loaded from: classes.dex */
public final class h0<V> {

    /* renamed from: c, reason: collision with root package name */
    public final v5.e<V> f17680c;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<V> f17679b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    public int f17678a = -1;

    public h0(r3.j jVar) {
        this.f17680c = jVar;
    }

    public final void a(int i10, b0.b bVar) {
        if (this.f17678a == -1) {
            x6.b.H(this.f17679b.size() == 0);
            this.f17678a = 0;
        }
        if (this.f17679b.size() > 0) {
            SparseArray<V> sparseArray = this.f17679b;
            int keyAt = sparseArray.keyAt(sparseArray.size() - 1);
            x6.b.q(i10 >= keyAt);
            if (keyAt == i10) {
                v5.e<V> eVar = this.f17680c;
                SparseArray<V> sparseArray2 = this.f17679b;
                eVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f17679b.append(i10, bVar);
    }

    public final V b(int i10) {
        if (this.f17678a == -1) {
            this.f17678a = 0;
        }
        while (true) {
            int i11 = this.f17678a;
            if (i11 <= 0 || i10 >= this.f17679b.keyAt(i11)) {
                break;
            }
            this.f17678a--;
        }
        while (this.f17678a < this.f17679b.size() - 1 && i10 >= this.f17679b.keyAt(this.f17678a + 1)) {
            this.f17678a++;
        }
        return this.f17679b.valueAt(this.f17678a);
    }
}
