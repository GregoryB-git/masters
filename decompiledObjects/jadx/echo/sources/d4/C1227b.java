package d4;

/* renamed from: d4.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1227b implements Comparable {

    /* renamed from: p, reason: collision with root package name */
    public static final C1227b f13269p = new C1227b("[MIN_NAME]");

    /* renamed from: q, reason: collision with root package name */
    public static final C1227b f13270q = new C1227b("[MAX_KEY]");

    /* renamed from: r, reason: collision with root package name */
    public static final C1227b f13271r = new C1227b(".priority");

    /* renamed from: s, reason: collision with root package name */
    public static final C1227b f13272s = new C1227b(".info");

    /* renamed from: o, reason: collision with root package name */
    public final String f13273o;

    /* renamed from: d4.b$b, reason: collision with other inner class name */
    public static class C0191b extends C1227b {

        /* renamed from: t, reason: collision with root package name */
        public final int f13274t;

        public C0191b(String str, int i7) {
            super(str);
            this.f13274t = i7;
        }

        @Override // d4.C1227b, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return super.compareTo((C1227b) obj);
        }

        @Override // d4.C1227b
        public int p() {
            return this.f13274t;
        }

        @Override // d4.C1227b
        public boolean r() {
            return true;
        }

        @Override // d4.C1227b
        public String toString() {
            return "IntegerChildName(\"" + this.f13273o + "\")";
        }
    }

    public C1227b(String str) {
        this.f13273o = str;
    }

    public static C1227b j(String str) {
        Integer k7 = Y3.m.k(str);
        if (k7 != null) {
            return new C0191b(str, k7.intValue());
        }
        if (str.equals(".priority")) {
            return f13271r;
        }
        Y3.m.f(!str.contains("/"));
        return new C1227b(str);
    }

    public static C1227b l() {
        return f13272s;
    }

    public static C1227b m() {
        return f13270q;
    }

    public static C1227b n() {
        return f13269p;
    }

    public static C1227b o() {
        return f13271r;
    }

    public String e() {
        return this.f13273o;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1227b)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return this.f13273o.equals(((C1227b) obj).f13273o);
    }

    @Override // java.lang.Comparable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compareTo(C1227b c1227b) {
        if (this == c1227b) {
            return 0;
        }
        if (this.f13273o.equals("[MIN_NAME]") || c1227b.f13273o.equals("[MAX_KEY]")) {
            return -1;
        }
        if (c1227b.f13273o.equals("[MIN_NAME]") || this.f13273o.equals("[MAX_KEY]")) {
            return 1;
        }
        if (!r()) {
            if (c1227b.r()) {
                return 1;
            }
            return this.f13273o.compareTo(c1227b.f13273o);
        }
        if (!c1227b.r()) {
            return -1;
        }
        int a7 = Y3.m.a(p(), c1227b.p());
        return a7 == 0 ? Y3.m.a(this.f13273o.length(), c1227b.f13273o.length()) : a7;
    }

    public int hashCode() {
        return this.f13273o.hashCode();
    }

    public int p() {
        return 0;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return equals(f13271r);
    }

    public String toString() {
        return "ChildKey(\"" + this.f13273o + "\")";
    }
}
