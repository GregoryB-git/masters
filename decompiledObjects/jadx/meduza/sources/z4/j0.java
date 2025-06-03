package z4;

/* loaded from: classes.dex */
public final class j0 implements v3.g {

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f17689d = new j0(new i0[0]);

    /* renamed from: e, reason: collision with root package name */
    public static final String f17690e = v5.e0.E(0);

    /* renamed from: a, reason: collision with root package name */
    public final int f17691a;

    /* renamed from: b, reason: collision with root package name */
    public final o7.l0 f17692b;

    /* renamed from: c, reason: collision with root package name */
    public int f17693c;

    static {
        new e0.e(14);
    }

    public j0(i0... i0VarArr) {
        this.f17692b = o7.t.q(i0VarArr);
        this.f17691a = i0VarArr.length;
        int i10 = 0;
        while (i10 < this.f17692b.f12011d) {
            int i11 = i10 + 1;
            int i12 = i11;
            while (true) {
                o7.l0 l0Var = this.f17692b;
                if (i12 < l0Var.f12011d) {
                    if (((i0) l0Var.get(i10)).equals(this.f17692b.get(i12))) {
                        v5.m.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i12++;
                }
            }
            i10 = i11;
        }
    }

    public final i0 a(int i10) {
        return (i0) this.f17692b.get(i10);
    }

    public final int b(i0 i0Var) {
        int indexOf = this.f17692b.indexOf(i0Var);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j0.class != obj.getClass()) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return this.f17691a == j0Var.f17691a && this.f17692b.equals(j0Var.f17692b);
    }

    public final int hashCode() {
        if (this.f17693c == 0) {
            this.f17693c = this.f17692b.hashCode();
        }
        return this.f17693c;
    }
}
