package x0;

import X2.AbstractC0703v;
import d0.C1171J;

/* loaded from: classes.dex */
public final class Z {

    /* renamed from: d, reason: collision with root package name */
    public static final Z f20700d = new Z(new C1171J[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f20701e = g0.M.w0(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f20702a;

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC0703v f20703b;

    /* renamed from: c, reason: collision with root package name */
    public int f20704c;

    public Z(C1171J... c1171jArr) {
        this.f20703b = AbstractC0703v.V(c1171jArr);
        this.f20702a = c1171jArr.length;
        f();
    }

    public static /* synthetic */ Integer e(C1171J c1171j) {
        return Integer.valueOf(c1171j.f12440c);
    }

    public C1171J b(int i7) {
        return (C1171J) this.f20703b.get(i7);
    }

    public AbstractC0703v c() {
        return AbstractC0703v.U(X2.E.k(this.f20703b, new W2.g() { // from class: x0.Y
            @Override // W2.g
            public final Object apply(Object obj) {
                Integer e7;
                e7 = Z.e((C1171J) obj);
                return e7;
            }
        }));
    }

    public int d(C1171J c1171j) {
        int indexOf = this.f20703b.indexOf(c1171j);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Z.class != obj.getClass()) {
            return false;
        }
        Z z7 = (Z) obj;
        return this.f20702a == z7.f20702a && this.f20703b.equals(z7.f20703b);
    }

    public final void f() {
        int i7 = 0;
        while (i7 < this.f20703b.size()) {
            int i8 = i7 + 1;
            for (int i9 = i8; i9 < this.f20703b.size(); i9++) {
                if (((C1171J) this.f20703b.get(i7)).equals(this.f20703b.get(i9))) {
                    g0.o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i7 = i8;
        }
    }

    public int hashCode() {
        if (this.f20704c == 0) {
            this.f20704c = this.f20703b.hashCode();
        }
        return this.f20704c;
    }
}
