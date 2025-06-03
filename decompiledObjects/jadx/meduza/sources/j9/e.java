package j9;

import j9.e;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ma.a0;
import ma.h;

/* loaded from: classes.dex */
public abstract class e<B extends e<B>> implements Comparable<B> {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f8677a;

    public e(List<String> list) {
        this.f8677a = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && compareTo((e) obj) == 0;
    }

    public final B f(B b10) {
        ArrayList arrayList = new ArrayList(this.f8677a);
        arrayList.addAll(b10.f8677a);
        return l(arrayList);
    }

    public final B g(String str) {
        ArrayList arrayList = new ArrayList(this.f8677a);
        arrayList.add(str);
        return l(arrayList);
    }

    public abstract String h();

    public final int hashCode() {
        return this.f8677a.hashCode() + ((getClass().hashCode() + 37) * 37);
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final int compareTo(B b10) {
        int q10 = q();
        int q11 = b10.q();
        for (int i10 = 0; i10 < q10 && i10 < q11; i10++) {
            String n2 = n(i10);
            String n10 = b10.n(i10);
            int i11 = 1;
            boolean z10 = n2.startsWith("__id") && n2.endsWith("__");
            boolean z11 = n10.startsWith("__id") && n10.endsWith("__");
            if (z10 && !z11) {
                i11 = -1;
            } else if (z10 || !z11) {
                if (z10 && z11) {
                    i11 = Long.compare(Long.parseLong(n2.substring(4, n2.length() - 2)), Long.parseLong(n10.substring(4, n10.length() - 2)));
                } else {
                    r3.j jVar = n9.o.f11373a;
                    h.C0164h c0164h = ma.h.f10961b;
                    Charset charset = a0.f10909a;
                    i11 = n9.o.c(new h.C0164h(n2.getBytes(charset)), new h.C0164h(n10.getBytes(charset)));
                }
            }
            if (i11 != 0) {
                return i11;
            }
        }
        return n9.o.d(q10, q11);
    }

    public abstract B l(List<String> list);

    public final String m() {
        return this.f8677a.get(q() - 1);
    }

    public final String n(int i10) {
        return this.f8677a.get(i10);
    }

    public final boolean o() {
        return q() == 0;
    }

    public final boolean p(B b10) {
        if (q() > b10.q()) {
            return false;
        }
        for (int i10 = 0; i10 < q(); i10++) {
            if (!n(i10).equals(b10.n(i10))) {
                return false;
            }
        }
        return true;
    }

    public final int q() {
        return this.f8677a.size();
    }

    public final e r() {
        int q10 = q();
        x6.b.Z("Can't call popFirst with count > length() (%d > %d)", q10 >= 5, 5, Integer.valueOf(q10));
        return new o(this.f8677a.subList(5, q10));
    }

    public final B s() {
        return l(this.f8677a.subList(0, q() - 1));
    }

    public final String toString() {
        return h();
    }
}
