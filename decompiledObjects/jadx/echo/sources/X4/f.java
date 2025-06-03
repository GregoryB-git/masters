package X4;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: e, reason: collision with root package name */
    public static final f f7273e = new f(g.f7278b, 0, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final int f7274a;

    /* renamed from: b, reason: collision with root package name */
    public final g f7275b;

    /* renamed from: c, reason: collision with root package name */
    public final int f7276c;

    /* renamed from: d, reason: collision with root package name */
    public final int f7277d;

    public f(g gVar, int i7, int i8, int i9) {
        this.f7275b = gVar;
        this.f7274a = i7;
        this.f7276c = i8;
        this.f7277d = i9;
    }

    public f a(int i7) {
        g gVar = this.f7275b;
        int i8 = this.f7274a;
        int i9 = this.f7277d;
        if (i8 == 4 || i8 == 2) {
            int i10 = d.f7266c[i8][0];
            int i11 = 65535 & i10;
            int i12 = i10 >> 16;
            gVar = gVar.a(i11, i12);
            i9 += i12;
            i8 = 0;
        }
        int i13 = this.f7276c;
        f fVar = new f(gVar, i8, i13 + 1, i9 + ((i13 == 0 || i13 == 31) ? 18 : i13 == 62 ? 9 : 8));
        return fVar.f7276c == 2078 ? fVar.b(i7 + 1) : fVar;
    }

    public f b(int i7) {
        int i8 = this.f7276c;
        return i8 == 0 ? this : new f(this.f7275b.b(i7 - i8, i8), this.f7274a, 0, this.f7277d);
    }

    public int c() {
        return this.f7276c;
    }

    public int d() {
        return this.f7277d;
    }

    public int e() {
        return this.f7274a;
    }

    public boolean f(f fVar) {
        int i7;
        int i8 = this.f7277d + (d.f7266c[this.f7274a][fVar.f7274a] >> 16);
        int i9 = fVar.f7276c;
        if (i9 > 0 && ((i7 = this.f7276c) == 0 || i7 > i9)) {
            i8 += 10;
        }
        return i8 <= fVar.f7277d;
    }

    public f g(int i7, int i8) {
        int i9 = this.f7277d;
        g gVar = this.f7275b;
        int i10 = this.f7274a;
        if (i7 != i10) {
            int i11 = d.f7266c[i10][i7];
            int i12 = 65535 & i11;
            int i13 = i11 >> 16;
            gVar = gVar.a(i12, i13);
            i9 += i13;
        }
        int i14 = i7 == 2 ? 4 : 5;
        return new f(gVar.a(i8, i14), i7, 0, i9 + i14);
    }

    public f h(int i7, int i8) {
        g gVar = this.f7275b;
        int i9 = this.f7274a;
        int i10 = i9 == 2 ? 4 : 5;
        return new f(gVar.a(d.f7268e[i9][i7], i10).a(i8, 5), this.f7274a, 0, this.f7277d + i10 + 5);
    }

    public Y4.a i(byte[] bArr) {
        LinkedList linkedList = new LinkedList();
        for (g gVar = b(bArr.length).f7275b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        Y4.a aVar = new Y4.a();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((g) it.next()).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f7265b[this.f7274a], Integer.valueOf(this.f7277d), Integer.valueOf(this.f7276c));
    }
}
