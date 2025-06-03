package m5;

import h5.g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import v5.e0;

/* loaded from: classes.dex */
public final class d implements g {

    /* renamed from: a, reason: collision with root package name */
    public final List<List<h5.a>> f10238a;

    /* renamed from: b, reason: collision with root package name */
    public final List<Long> f10239b;

    public d(ArrayList arrayList, ArrayList arrayList2) {
        this.f10238a = arrayList;
        this.f10239b = arrayList2;
    }

    @Override // h5.g
    public final int f(long j10) {
        int i10;
        List<Long> list = this.f10239b;
        Long valueOf = Long.valueOf(j10);
        int i11 = e0.f15881a;
        int binarySearch = Collections.binarySearch(list, valueOf);
        if (binarySearch < 0) {
            i10 = ~binarySearch;
        } else {
            int size = list.size();
            do {
                binarySearch++;
                if (binarySearch >= size) {
                    break;
                }
            } while (list.get(binarySearch).compareTo(valueOf) == 0);
            i10 = binarySearch;
        }
        if (i10 < this.f10239b.size()) {
            return i10;
        }
        return -1;
    }

    @Override // h5.g
    public final long g(int i10) {
        x6.b.q(i10 >= 0);
        x6.b.q(i10 < this.f10239b.size());
        return this.f10239b.get(i10).longValue();
    }

    @Override // h5.g
    public final List<h5.a> h(long j10) {
        int c10 = e0.c(this.f10239b, Long.valueOf(j10), false);
        return c10 == -1 ? Collections.emptyList() : this.f10238a.get(c10);
    }

    @Override // h5.g
    public final int i() {
        return this.f10239b.size();
    }
}
