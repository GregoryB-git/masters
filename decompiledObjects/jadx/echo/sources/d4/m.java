package d4;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f13312c = new m(C1227b.n(), g.W());

    /* renamed from: d, reason: collision with root package name */
    public static final m f13313d = new m(C1227b.m(), n.f13316l);

    /* renamed from: a, reason: collision with root package name */
    public final C1227b f13314a;

    /* renamed from: b, reason: collision with root package name */
    public final n f13315b;

    public m(C1227b c1227b, n nVar) {
        this.f13314a = c1227b;
        this.f13315b = nVar;
    }

    public static m a() {
        return f13313d;
    }

    public static m b() {
        return f13312c;
    }

    public C1227b c() {
        return this.f13314a;
    }

    public n d() {
        return this.f13315b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f13314a.equals(mVar.f13314a) && this.f13315b.equals(mVar.f13315b);
    }

    public int hashCode() {
        return (this.f13314a.hashCode() * 31) + this.f13315b.hashCode();
    }

    public String toString() {
        return "NamedNode{name=" + this.f13314a + ", node=" + this.f13315b + '}';
    }
}
