package Z4;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final a f7877a;

    /* renamed from: b, reason: collision with root package name */
    public final List f7878b;

    public c(a aVar) {
        this.f7877a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f7878b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }

    public final b a(int i7) {
        if (i7 >= this.f7878b.size()) {
            List list = this.f7878b;
            b bVar = (b) list.get(list.size() - 1);
            for (int size = this.f7878b.size(); size <= i7; size++) {
                a aVar = this.f7877a;
                bVar = bVar.g(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f7878b.add(bVar);
            }
        }
        return (b) this.f7878b.get(i7);
    }

    public void b(int[] iArr, int i7) {
        if (i7 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i7;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b a7 = a(i7);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] d7 = new b(this.f7877a, iArr2).h(i7, 1).b(a7)[1].d();
        int length2 = i7 - d7.length;
        for (int i8 = 0; i8 < length2; i8++) {
            iArr[length + i8] = 0;
        }
        System.arraycopy(d7, 0, iArr, length + length2, d7.length);
    }
}
