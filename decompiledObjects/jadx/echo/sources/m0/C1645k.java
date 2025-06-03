package m0;

/* renamed from: m0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1645k {

    /* renamed from: d, reason: collision with root package name */
    public static final C1645k f17572d = new b().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f17573a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f17574b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f17575c;

    /* renamed from: m0.k$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public boolean f17576a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f17577b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f17578c;

        public C1645k d() {
            if (this.f17576a || !(this.f17577b || this.f17578c)) {
                return new C1645k(this);
            }
            throw new IllegalStateException("Secondary offload attribute fields are true but primary isFormatSupported is false");
        }

        public b e(boolean z7) {
            this.f17576a = z7;
            return this;
        }

        public b f(boolean z7) {
            this.f17577b = z7;
            return this;
        }

        public b g(boolean z7) {
            this.f17578c = z7;
            return this;
        }
    }

    public C1645k(b bVar) {
        this.f17573a = bVar.f17576a;
        this.f17574b = bVar.f17577b;
        this.f17575c = bVar.f17578c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1645k.class != obj.getClass()) {
            return false;
        }
        C1645k c1645k = (C1645k) obj;
        return this.f17573a == c1645k.f17573a && this.f17574b == c1645k.f17574b && this.f17575c == c1645k.f17575c;
    }

    public int hashCode() {
        return ((this.f17573a ? 1 : 0) << 2) + ((this.f17574b ? 1 : 0) << 1) + (this.f17575c ? 1 : 0);
    }
}
