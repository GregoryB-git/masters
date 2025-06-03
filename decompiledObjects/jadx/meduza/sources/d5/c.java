package d5;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import v5.e0;

/* loaded from: classes.dex */
public final class c implements y4.a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final long f3451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3452b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3453c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3454d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3455e;
    public final long f;

    /* renamed from: g, reason: collision with root package name */
    public final long f3456g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3457h;

    /* renamed from: i, reason: collision with root package name */
    public final n f3458i;

    /* renamed from: j, reason: collision with root package name */
    public final l f3459j;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f3460k;

    /* renamed from: l, reason: collision with root package name */
    public final h f3461l;

    /* renamed from: m, reason: collision with root package name */
    public final List<g> f3462m;

    public c(long j10, long j11, long j12, boolean z10, long j13, long j14, long j15, long j16, h hVar, n nVar, l lVar, Uri uri, ArrayList arrayList) {
        this.f3451a = j10;
        this.f3452b = j11;
        this.f3453c = j12;
        this.f3454d = z10;
        this.f3455e = j13;
        this.f = j14;
        this.f3456g = j15;
        this.f3457h = j16;
        this.f3461l = hVar;
        this.f3458i = nVar;
        this.f3460k = uri;
        this.f3459j = lVar;
        this.f3462m = arrayList;
    }

    @Override // y4.a
    public final c a(List list) {
        c cVar = this;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new y4.c());
        ArrayList arrayList = new ArrayList();
        long j10 = 0;
        int i10 = 0;
        while (i10 < c()) {
            if (((y4.c) linkedList.peek()).f17428a != i10) {
                long d10 = cVar.d(i10);
                if (d10 != -9223372036854775807L) {
                    j10 += d10;
                }
            } else {
                g b10 = cVar.b(i10);
                List<a> list2 = b10.f3485c;
                y4.c cVar2 = (y4.c) linkedList.poll();
                int i11 = cVar2.f17428a;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i12 = cVar2.f17429b;
                    a aVar = list2.get(i12);
                    List<j> list3 = aVar.f3444c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(cVar2.f17430c));
                        cVar2 = (y4.c) linkedList.poll();
                        if (cVar2.f17428a != i11) {
                            break;
                        }
                    } while (cVar2.f17429b == i12);
                    List<a> list4 = list2;
                    arrayList2.add(new a(aVar.f3442a, aVar.f3443b, arrayList3, aVar.f3445d, aVar.f3446e, aVar.f));
                    if (cVar2.f17428a != i11) {
                        break;
                    }
                    list2 = list4;
                }
                linkedList.addFirst(cVar2);
                arrayList.add(new g(b10.f3483a, b10.f3484b - j10, arrayList2, b10.f3486d));
            }
            i10++;
            cVar = this;
        }
        long j11 = cVar.f3452b;
        return new c(cVar.f3451a, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, cVar.f3453c, cVar.f3454d, cVar.f3455e, cVar.f, cVar.f3456g, cVar.f3457h, cVar.f3461l, cVar.f3458i, cVar.f3459j, cVar.f3460k, arrayList);
    }

    public final g b(int i10) {
        return this.f3462m.get(i10);
    }

    public final int c() {
        return this.f3462m.size();
    }

    public final long d(int i10) {
        if (i10 != this.f3462m.size() - 1) {
            return this.f3462m.get(i10 + 1).f3484b - this.f3462m.get(i10).f3484b;
        }
        long j10 = this.f3452b;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - this.f3462m.get(i10).f3484b;
    }

    public final long e(int i10) {
        return e0.I(d(i10));
    }
}
